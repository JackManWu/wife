package com.jackman.other;

import javax.tools.*;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Arrays;

/**
 * Created by JackManWu on 2016/11/8.
 */
public class CompilerTest {
    public static void main(String[] args) {
//        String source = "public class Main2 { public static void main(String[] args) {System.out.println(\"Hello World!\");} }";
        String className = "CalculatorMain";
        String methodName = "calculate";
        String source = "public class " + className
                + " { public static double " + methodName + "() { return " + 23.0 + "; } }";
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        StringSourceJavaObject sourceJavaObject = new CompilerTest.StringSourceJavaObject("CalculatorMain", source);
        Iterable<? extends JavaFileObject> fileObjects = Arrays.asList(sourceJavaObject);
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, null, null, fileObjects);
        boolean result = task.call();
        if (result) {
            System.out.println("编译成功");
            ClassLoader loader = CompilerTest.class.getClassLoader();
            try {
                Class<?> clazz = loader.loadClass(className);
                Method method = clazz.getMethod(methodName, new Class<?>[]{});
                Object value = method.invoke(null,new Object[]{});
                System.out.println("打印："+value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static class StringSourceJavaObject extends SimpleJavaFileObject {
        private String content = null;

        public StringSourceJavaObject(String name, String content) {
            super(URI.create("string:///" + name.replace(".", "/") + Kind.SOURCE.extension), Kind.SOURCE);
            this.content = content;
        }

        public CharSequence getCharContent(boolean ignoreEncodingErrors) {
            return content;
        }
    }
}
