package com.example.tryslm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class AreaController {
    @RequestMapping("/area") //, produces=MediaType.TEXT_PLAIN_VALUE)
    //public int sum(@RequestParam int a, @RequestParam int b){
    public String area() {

        //  return a + b;
        return "info über Api";
    }
}



