package org.store.online.categories.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/refresh")
@Setter
@Getter
@RefreshScope
public class RefreshActuatorController {
    @Value("${app.testProp}")
    private String testProp;

    @GetMapping
    public String getTestProp() {
        return this.testProp;
    }
}
