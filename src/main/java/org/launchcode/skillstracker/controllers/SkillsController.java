package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping()
    public String programmingLanguages(){
        return "<html>" +
                "<h1>" + "Skills Tracker" + "</h1>" +
                "<h2>" + "Possible languages:" + "</h2>" +
                "<ol>" +
                "<li>" + "Java" + "</li>" +
                "<li>" + "Javascript" + "</li>" +
                "<li>" + "HTML/CSS" + "</li>" +
                "</ol>" +
                "</html>";
    }


    @GetMapping("form")
    public String faveLanguagesForm() {
        return "<html>" +
                "<body>" +
                "<form action='form' method='post'>" +
                "<h3>" + "Name:" + "</h3>" +
                "<input type='text' name='name'>" +
                "<h3>" + "My favorite language:" + "</h3>" +
                "<select name='fave'>" +
                "<option value = 'Java'>Java</option>'" +
                "<option value = 'Javascript'>Javascript</option>'" +
                "<option value = 'HTML/CSS'>HTML/CSS</option>'" +
                "</select>" +
                "<h3>" + "My second favorite language:" + "</h3>" +
                "<select name='secondFave'>" +
                "<option value = 'Java'>Java</option>'" +
                "<option value = 'Javascript'>Javascript</option>'" +
                "<option value = 'HTML/CSS'>HTML/CSS</option>'" +
                "</select>" +
                "<h3>" + "My third favorite language:" + "</h3>" +
                "<select name='thirdFave'>" +
                "<option value = 'Java'>Java</option>'" +
                "<option value = 'Javascript'>Javascript</option>'" +
                "<option value = 'HTML/CSS'>HTML/CSS</option>'" +
                "</select>" + "<br>" + "<br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

       @PostMapping("form")
       public String faveLanguages(@RequestParam String name, @RequestParam String fave, @RequestParam String secondFave, @RequestParam String thirdFave) {
            return "<html>" +
                    "<h1>" + name + "</h1>" +
                    "<ol>" +
                    "<li>" + fave + "</li>" +
                    "<li>" + secondFave + "</li>" +
                    "<li>" + thirdFave + "</li>" +
                    "</ol>" +
                    "</html>";
       }


}
