package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String skillTracker() {
        return "<html>" +
                    "<body>" +
                        "<h1> Skills Tracker </h1>" +
                            "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                                "<ol>" +
                                    "<li>JavaScript</li>" +
                                    "<li>Java</li>" +
                                    "<li>Python</li>" +
                                "</ol>" +
                    "</body>" +
                "</html>";
    }

//    @RequestMapping(value = "form", method = {RequestMethod.GET, RequestMethod.POST})
    @GetMapping("form")
    public String languageForm(@RequestParam(required = false) String name, @RequestParam(required = false) String languageOne, @RequestParam(required = false) String languageTwo, @RequestParam(required = false) String languageThree) {
        return "<html>" +
                    "<body>" +
                        "<form method='post' action='chosen'>" +
                            "<label>Name: </label>" +
                            "<br/>" +
                                "<input type='text' name='name'/>" +
                            "<br/>" +
                            "<br/>" +
                            "<label>My favorite language: </label>" +
                            "<br/>" +
                                "<select name='languageOne'>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select>" +
                                "<br/>" +
                                "<br/>" +
                            "<label>My second favorite language: </label>" +
                            "<br/>" +
                                "<select name='languageTwo'>" +
                                    "<option value='JavaScript'>JavaScript</option>"+
                                    "<option value='Java'>Java</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select>" +
                                "<br/>" +
                                "<br/>" +
                            "<label>My third favorite language is: </label>" +
                            "<br/>" +
                                "<select name='languageThree'>" +
                                    "<option value='JavaScript'> JavaScript</option>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select>" +
                                "<br/>" +
                                "<br/>" +
                            "<input type='submit' value='Submit!'/>" +
                        "</form>";
    }

    @PostMapping("chosen")
    public String theChosen(@RequestParam String name, @RequestParam String languageOne, @RequestParam String languageTwo, @RequestParam String languageThree) {
        return "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                            "<table style='width:50%'>" +
                                "<tr>" +
                                    "<th>First Choice</th>" +
                                    "<th>Second Choice</th>" +
                                    "<th>Third Choice</th>" +
                                "</tr>" +
                                "<tr>" +
                                    "<td>" + languageOne + "</td>" +
                                    "<td>" + languageTwo + "</td>" +
                                    "<td>" + languageThree + "</td>" +
                                "</tr>" +
                            "</table>" +
                "</body>" +
                "</html>";





    }
}
