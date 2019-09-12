package com.armeng.springboot.mystarter;

/**
 * @author xiaoming.kang
 * @date 2019/09/12.
 */
public class HelloworldService {

    private String words;

    private String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String sayHello() {
        return "hello, " + words;
    }

}
