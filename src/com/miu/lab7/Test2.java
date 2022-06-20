package com.miu.lab7;

class Test2 {
    static int i = 1;
    void outerMethod(){
        InnerClass in = new InnerClass();
        System.out.println("Outer method"+in.j);
        in.innerMethod();
    }


    //Inner class
    static class InnerClass{
        int j = 2;

        void innerMethod(){
            System.out.println("Inner Method"+i);
            //outerMethod();
        }

    }


    //Main method
    public static void main(String[] args) {
        Test2 outerClass = new Test2();
        //InnerClass in3 = new Test2().new InnerClass();
        //Test2.InnerClass in2 = outerClass.new InnerClass();
        InnerClass in3 = new Test2.InnerClass();
        Test2.InnerClass in2 = new InnerClass();
        InnerClass in4 = new InnerClass();
        in2.innerMethod();
        in3.innerMethod();
        in4.innerMethod();
        B b = new B();
         B.C c = b.new C();
         c.methodC();
    }
}

class B{
    class C{
        void methodC(){
            System.out.println("From C inner class");
        }
    }
}

