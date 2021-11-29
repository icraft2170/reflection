package me.hyeonho;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Book> bookClass = Book.class;
        // bookClass.newInstance() (Deprecated)

        Constructor<Book> constructor = bookClass.getConstructor(null);
        Book book = constructor.newInstance();

        System.out.println(book);

        // Static Field 값 가져오기
        Field a = Book.class.getDeclaredField("a");
        System.out.println(a.get(null));

        // Static Field 값 바꾸기
        a.set(null,"AAAA");
        System.out.println(a.get(null));


        Field b = Book.class.getDeclaredField("b");
        // private 생성자 접근 가능하게 set
        b.setAccessible(true);
        System.out.println(b.get(book));
        b.set(book,"BBBB");
        System.out.println(b.get(book));

        // private Method 사용
        Method c = Book.class.getDeclaredMethod("c");
        c.setAccessible(true);
        c.invoke(book);

        // public method 사용 ( 파라미터가 있는 )
        Method d = Book.class.getDeclaredMethod("sum", int.class, int.class);
        int sum = (int)d.invoke(book, 1, 2);
        System.out.println(sum);

    }
}
