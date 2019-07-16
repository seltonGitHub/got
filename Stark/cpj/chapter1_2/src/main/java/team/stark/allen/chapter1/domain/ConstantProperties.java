package team.stark.allen.chapter1.domain;

import org.springframework.beans.factory.annotation.Value;

public class ConstantProperties {
    @Value("group")
    private String group;
    @Value("creater")
    private String creater;
    @Value("message")
    private String message;
}
