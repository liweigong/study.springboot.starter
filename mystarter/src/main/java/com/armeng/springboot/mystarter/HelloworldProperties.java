package com.armeng.springboot.mystarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xiaoming.kang
 * @date 2019/09/12.
 */
@ConfigurationProperties(prefix = "helloworld")
public class HelloworldProperties {
    public static final String DEFAULT_WORDS = "world";

    private String words = DEFAULT_WORDS;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
}