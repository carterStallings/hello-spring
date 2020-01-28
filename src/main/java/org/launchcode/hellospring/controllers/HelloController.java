package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello Spring!";
//    }

    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye Spring!";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    public String helloWithQueryParam(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name, Model model){
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("hello-names")
    public String hellonames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("JavaScript");
        model.addAttribute("names", names);
        return "hello-list";
    }

//    @GetMapping("langForm")
//        public static String createMessage() {
//            return "<html>" +
//                    "<body>" +
//                    "<form action='english' method='post'>" +
//                    "<input type='text' name='name'>" +
//                    "<select name='language' id='language select'>" +
//                    "<option value='english'> English</option>" +
//                    "<option value='german'> German</option>" +
//                    "<option value='spanish'> Spanish</option>" +
//                    "<option value='italian'> Italian</option>" +
//                    "<option value='french'> French</option>" +
//                    "<input type='submit' value='Greet me!'>" +
//                    "</select>" +
//                    "</form>" +
//                    "</body>" +
//                    "</html>";
//    }


}
