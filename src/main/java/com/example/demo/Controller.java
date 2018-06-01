package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@org.springframework.stereotype.Controller
public class Controller {
@Autowired
private CandidateModel candidateModel;


    @RequestMapping(path = "/candidate/list", method = RequestMethod.GET)
    public String listAll(Model model) {
        model.addAttribute("pagination", candidateModel.findAll());

        return "candidate_list";
    }
}
