package io.jhoffmann.spring.oauth2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("test")
    public ResponseEntity<?> getTest() {
        return ResponseEntity.ok(new TestResponse());
    }

    class TestResponse {
        String message = "it works";

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
