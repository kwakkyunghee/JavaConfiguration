package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

//이 파일은 객체를 만들어달라고 스프링에게 요청하는 파일
@Configuration
public class BeanConfigClass {
    @Bean
    //메소드 이름이 객체 이름 java1 / TestBean1 클래스
    public TestBean1 java1(){
        TestBean1 t = new TestBean1();
        return t;
    }
    @Bean(name="a") //@Bean에 name을 부여하면 객체는 java2에서 a로 바뀐다. 그러면 java2는 사라진다.
    @Scope("prototype")
    public TestBean2 java2(){
//        TestBean2 t1 = new TestBean2();
//        return t1;
        return new TestBean2();
    }

    @Bean
    @Lazy
    public TestBean3 java3(){
        TestBean3 t2 = new TestBean3();
        return t2;
    }


    @Bean
    public TestBean4 java4(){
        TestBean4 t3 = new TestBean4();
        return t3;
    }

}
