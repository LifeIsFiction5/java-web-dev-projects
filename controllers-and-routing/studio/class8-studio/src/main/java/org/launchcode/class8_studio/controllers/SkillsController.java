package org.launchcode.class8_studio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String skillTracker() {
        String html = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is a list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>C++</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

        return html;
    }

    @GetMapping ("form")
    @ResponseBody
    public String skillForm() {
        String form = "<html>" +
                "<body>" +
                "<form method = 'post' action = '/submitform'>" +
                "<input type='text' name='name'>" +
                " <label for='languages1'>My favorite Language:</label>\n" +
                "\n" +
                "<select name='languages1' id='languages1'>\n" +
                "<option value='Java'>Java</option>\n" +
                "<option value='JavaScript'>JavaScript</option>\n" +
                "<option value='C++'>C++</option>\n" +
                "</select>\n" +
                "\n" +
                " <label for='languages2'>My second favorite Language:</label>\n" +
                "\n" +
                "<select name='languages2'id='languages2'>\n" +
                "<option value='JavaScript'>JavaScript</option>\n" +
                "<option value='C++'>C++</option>\n" +
                "<option value='Java'>Java</option>\n" +
                "</select> \n" +
                "\n" +
                "<label for='languages3'>My third favorite Language:</label>\n" +
                "\n" +
                "<select name='languages3' id='languages3'>\n" +
                "<option value='C++'>C++</option>\n" +
                "<option value='JavaScript'>JavaScript</option>\n" +
                "<option value='Java'>Java</option>\n" +
                "</select>\n" +
                "<input type='submit'>" +
                "</form>" +
                "</body>" +
                "</html>";

        return form;
    }

    @PostMapping("/submitform")
    @ResponseBody
    public String processForm(
            @RequestParam String name,
            @RequestParam String languages1,
            @RequestParam String languages2,
            @RequestParam String languages3) {

        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + languages1 + "</li>" +
                "<li>" + languages2 + "</li>" +
                "<li>" + languages3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

    }
}