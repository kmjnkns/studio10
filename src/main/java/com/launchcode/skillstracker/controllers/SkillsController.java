package com.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping ("text")
    public String skillsTracker() {
        return
                "<html>" +
                        "<h1>" +
                        "Skills Tracker" +
                        "</h1>" +
                        "<h2>" +
                        "We have a few skills we would like to learn. Here is the list!" +
                        "</h2>" +
                        "<body>" +
                        "<ol>1. Java</ol>" +
                        "<ol>2. JavaScript</ol>" +
                        "<ol>3. Python</ol>" +
                        "</body>" +
                        "</html>";
    }
    @GetMapping ("form")
    @ResponseBody
    public String formData() {
        return
         "<html>" +
                "<body>" +
                "<form method = 'post' action = '/form'>" +
                "<br><label>Name<br><input type = 'text' name = 'name' /></label>" +
                "<br><label>My Favorite language:<br> <name = 'Fav:' /></label><select name='language1' id='language1'><br>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                 "<br><label>My Second Favorite language:<br> <name = 'Fav:' /></label><select name='language2' id='language2'><br>" +
                 "<option value='java'>Java</option>" +
                 "<option value='javascript'>JavaScript</option>" +
                 "<option value='python'>Python</option>" +
                 "</select>" +
                 "<br><label>My Third Favorite language:<br> <name = 'Fav:' /></label><select name='language3' id='language3'><br>" +
                 "<option value='java'>Java</option>" +
                 "<option value='javascript'>JavaScript</option>" +
                 "<option value='python'>Python</option>" +
                 "</select>" +
                "<br><input type = 'submit' value = 'Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }
    @PostMapping ("form")
    public String formOutput(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3) {
return
        "<html>" +
                "<h1>" +
                "Hello" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>" +
                "</html>";
    }
}
