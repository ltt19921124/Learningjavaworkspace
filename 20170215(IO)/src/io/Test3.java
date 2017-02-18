package io;

 class Test3 {
    public static void change(int a){
        a=50;
    }
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        change(a);
        System.out.println(a);
    }
}