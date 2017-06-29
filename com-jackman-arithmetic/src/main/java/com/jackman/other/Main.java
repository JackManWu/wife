package com.jackman.other;


import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by JackManWu on 2016/10/31.
 */
public class Main {

    private static class TaskThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread begin......");
            Main.sleep(1000);
            System.out.println("task 1 ok......");
            Main.sleep(1000);
            System.out.println("task 2 ok......");
            Main.sleep(1000);
            System.out.println("task 3 ok......");
            System.exit(0);
            Main.sleep(1000);
            System.out.println("task 4 ok......");
            Main.sleep(1000);
            System.out.println("task 5 ok......");

            System.out.println("Thread end");
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void addShutdownHook(final Thread checkThread) {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.out.println("收到关闭信号，hook启动，开始检测线程状态。。。。");
                for (int i = 0; i < 100; i++) {
                    if (checkThread.getState() == State.TERMINATED) {
                        System.out.println("检测到线程执行完毕，退出hook。");
                        return;
                    }
                    System.out.println("检测第" + i + "次，未执行完毕");
                    Main.sleep(1000);
                }
                System.out.println("检测超时，放弃等待，退出hook，此时线程会被强制关闭");
            }
        });
    }

    public static void main(String[] args) throws Exception {
       /* Account account = (Account) Proxy.newProxyInstance(Account.class.getClassLoader(), new Class[]{Account.class}, new SecurityProxyInvocationHandler(new AccountImpl()));
        account.operation();

        FruitInfoUtil.getFruitInfo(Apple.class);

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        System.out.println("初始化：" + DateTime.now().toString("yyyy-MM-dd hh:mm:ss"));
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                DateTime date = DateTime.now();
                System.out.println(date.toString("yyyy-MM-dd hh:mm:ss"));
            }
        }, 1000, 5000, TimeUnit.MILLISECONDS);

        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        OperatingSystemMXBean systemMXBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        ThreadMXBean threadMXBean = (ThreadMXBean) ManagementFactory.getThreadMXBean();
        System.out.println(systemMXBean.getFreePhysicalMemorySize() / 1024);
        System.out.println(systemMXBean.getTotalPhysicalMemorySize() / 1024);
        System.out.println(System.getProperty("os.name"));

        ExecutorService pool = Executors.newFixedThreadPool(10);
        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(pool);
        completionService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 21;
            }
        });

        System.out.println(completionService.take().get());
        Field[] fields = RedApple.class.getSuperclass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }

        RedApple apple = new RedApple();
        Field[] fields1 = RedApple.class.getDeclaredFields();
        for (int i = 0; i < fields1.length; i++) {
            fields1[i].setAccessible(true);
        }
        for (int i = 0; i < fields1.length; i++) {
            String o = (String) fields1[i].get(apple);
            System.out.println(o);
        }*/

        /*RedApple a1 = new RedApple(DateTime.now());
        RedApple a2 = new RedApple(DateTime.now().plusDays(1));
        RedApple a3 = new RedApple(DateTime.now().minusDays(1));
        RedApple a4 = new RedApple(DateTime.now().minusHours(1));
        List<RedApple> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

        Collections.sort(list, new RedAppleComparator());
        for (RedApple apple : list) {
            System.out.println(apple.getDateTime().toString("yyyy-MM-dd hh:mm:ss"));
        }*/

        /*final TaskThread taskThread = new TaskThread();
        addShutdownHook(taskThread);
        taskThread.start();*/

       /* String value = "2,1,4,6";
        List<Integer> list = Lists.transform(Splitter.on(",").splitToList(value), new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });

        for (Integer i : list) {
            System.out.println(i);
        }

        String s = Joiner.on("@_@").join("hello", Joiner.on(",").join(list));
        System.out.println(s);

        System.out.println(getString("data is %s,%s", "buzhidao", "aiyouhe"));

        System.out.println(transform(new Throwable("hello")));
        System.out.println(Runtime.getRuntime().availableProcessors());

        BlockingQueue<Runnable> workQueue = new LinkedBlockingDeque<>();
        workQueue.add(new Thread1());
        Thread1 thread1 = (Thread1) workQueue.take();
        new Thread(thread1).start();

        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;
            foo('D');
        }*/

       SecurityManager securityManager = System.getSecurityManager();
        if(securityManager==null){
            System.out.println("SecurityManager not been established..");
        }
    }

    static boolean foo(char c) {
        System.out.println(c);
        return true;
    }

    public static String getString(final String message, final Object... args) {
        return String.format(message, args);
    }

    public static String transform(final Throwable cause) {
        StringWriter stringWriter = new StringWriter();
        try (PrintWriter writer = new PrintWriter(stringWriter)) {
            cause.printStackTrace(writer);
        }
        return stringWriter.toString();
    }

    public static class Thread1 implements Runnable {

        @Override
        public void run() {
            System.out.println("hello,thread1");
        }
    }
}
