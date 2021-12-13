package cn.chinaclear.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@EnableAutoConfiguration
@Controller
public class MyBasicController {

    @RequestMapping("/test1")
    @ResponseBody
    public String basicMethod(){
        return "this is first api";
    }

}
