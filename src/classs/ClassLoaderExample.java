package classs;

import java.io.*;

class CustomClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            String fileName = name.replace('.', '/') + ".class";
            System.out.println("Trying to load file: " + fileName);

            FileInputStream fis = new FileInputStream(fileName);
            byte[] bytes = fis.readAllBytes();
            fis.close();

            return defineClass(name, bytes, 0, bytes.length);
        } catch (IOException e) {
            throw new ClassNotFoundException(name, e);
        }
    }
}

public class ClassLoaderExample {
    public static void main(String[] args) {
        System.out.println("ClassLoader of this class: " + ClassLoaderExample.class.getClassLoader());
        System.out.println("ClassLoader of String class: " + String.class.getClassLoader());

        try {
            CustomClassLoader loader = new CustomClassLoader();
            Class<?> clazz = loader.loadClass("other.Hello"); // <- updated

            Object obj = clazz.getDeclaredConstructor().newInstance();
            clazz.getMethod("sayHello").invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
