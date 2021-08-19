package com.jnk1124.userservice.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
public class Greeting {

    @Value("${greeting.message}")
    private String message;

}
