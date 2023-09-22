package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping()
    @ResponseBody
    public String languages(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Languages</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String formInfo(){
        return "<html>" +
                "<body>" +
                "<form action='form' method='post'>" +
                "<label for='name'>What is your name?</label>" +
                "<input type='text' name='name'><br />" +
                "<label for='languages'>Which is your favorite language?</label><br />" +
                "<select name='lang1' id='languages'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                    "<br /><label for='languages'>Which is your second favorite language?</label><br />" +
                    "<select name='lang2' id='languages'>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='Python'>Python</option>" +
                    "</select>" +
                        "<br /><label for='languages'>Which is your least favorite language?</label><br />" +
                        "<select name='lang3' id='languages'>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                        "</select><br />" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String formReturn(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3){
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<h2>Your language preferences in order:</h2>" +
                "<ol>" +
                "<li>" + lang1 + "</li>" +
                "<li>" + lang2 + "</li>" +
                "<li>" + lang3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}

/*
"<form action='form'>" +
                "<label for='name'>What is your name?</label>" +
                "<input type='text' name='name'><br />" +
                "<label for='languages'>Which is your favorite language?</label><br />" +
                "<select name='languages' id='languages'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br /><label for='languages'>Which is your second favorite language?</label><br />" +
                "<select name='languages' id='languages'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br /><label for='languages'>Which is your least favorite language?</label><br />" +
                "<select name='languages' id='languages'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br />" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
 */