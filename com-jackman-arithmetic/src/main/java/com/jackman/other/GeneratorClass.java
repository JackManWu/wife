package com.jackman.other;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by JackManWu on 2016/11/8.
 */
public class GeneratorClass {
    public static void main(String[] args) throws Exception {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(Opcodes.V1_5, Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT + Opcodes.ACC_INTERFACE,
                "com/asm3/Comparable", null, "java/lang/Object", new String[]{"com/asm3/Mesurable"});

        cw.visitField(Opcodes.ACC_PUBLIC+ Opcodes.ACC_FINAL+Opcodes.ACC_STATIC,"LESS","I",null,new Integer(-1)).visitEnd();
        cw.visitMethod(Opcodes.ACC_PUBLIC+Opcodes.ACC_ABSTRACT,"compareTo","(Ljava/lang/Object;)I",null,null).visitEnd();
        cw.visitEnd();

        byte[] data = cw.toByteArray();
        File file = new File("E://Comparable.class");
        FileOutputStream stream = new FileOutputStream(file);
        stream.write(data);
        stream.close();
    }
}
