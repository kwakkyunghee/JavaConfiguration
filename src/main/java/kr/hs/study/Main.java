package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("주소 : "+obj1);


        ctx.close();

        System.out.println("===============================================================================");
        //Java
        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        TestBean1 obj2 = ctx2.getBean("java1", TestBean1.class);
        System.out.println(obj2);

//        TestBean2 obj3 = ctx2.getBean("java2", TestBean2.class);
////        System.out.println(obj3);
//        obj3.pr_Method();

        TestBean2 obj4 = ctx2.getBean("a", TestBean2.class);
//        obj4.pr_Method();
        System.out.println(obj4);
        TestBean2 obj6 = ctx2.getBean("a", TestBean2.class);
        System.out.println(obj6);

        TestBean3 obj5 = ctx2.getBean("java3", TestBean3.class);
        obj5.pr_method2();

        TestBean4 obj7 = ctx2. getBean("java4", TestBean4.class);
        obj7.init();
        obj7.destory();


        ctx2.close();


    }
}