package src.main.java;

public class MyTest7{
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        System.out.println(clazz.getClassLoader());

        Class<?> clazz2 = Class.forName("src.main.java.C");
        System.out.println(clazz2.getClassLoader());
    }
}

class C {

}