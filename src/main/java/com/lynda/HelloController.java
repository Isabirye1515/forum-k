package com.lynda;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public ResponseEntity<String> getHome(){
        return ResponseEntity.ok("hello");
        
    }
    
}
