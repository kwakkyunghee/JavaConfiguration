package kr.hs.study.beans;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBean2 {
    //생성자
    public TestBean2(){
        System.out.println("TestBean2의 생성자");
    }
    //메소드
    public void pr_Method(){
        System.out.println("TestBean2의 pr_Method");
    }
}
