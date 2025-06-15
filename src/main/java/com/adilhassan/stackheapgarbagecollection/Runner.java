package com.adilhassan.stackheapgarbagecollection;

public class Runner {

//    demo how stacks and stack frames work and show the state of variables on stack frames
//    public static void main(String[] args) {
//        m1();
//    }
//
//    public static void m1() {
//        int i = 10;
//        Person p1 = new Person("Adil", 35);
//        m2();
//    }
//
//    public static void m2() {
//        int j = 20;
//    }


//    demo how garbage collection works and show objects on the heap
    public static void main(String[] args) throws InterruptedException {
        Person adil = new Person("Adil", 20);
        Person hassan = new Person("Hassan");
        Person ali = new Person("Ali", 29);
        m1();
        ali = null;
        System.gc();
        System.out.println(adil);
    }
//
    public static void m1() {
        Person amir = new Person("Amir", 33);
        System.out.println(amir);
    }


//    demo how stacks are created
//    public static void main(String[] args) throws InterruptedException {
//        int i = 10;
//        Job job = new Job();
//        ThreadGroup threadGroup = new ThreadGroup("jobThreadGroup");
//        Thread thread = new Thread(threadGroup, job);
//        thread.setName("jobThread");
//        thread.start();
//        System.out.println("main method ends");
//    }
}
