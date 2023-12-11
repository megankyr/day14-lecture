package com.ssf.day14lecture.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssf.day14lecture.model.FormData;

@Controller
@RequestMapping("/rsvp")
public class RSVPController {
    
    @GetMapping
    public String getRSVP(@RequestParam String name,
    @RequestParam String phoneno,
    @RequestParam int pax,
    @RequestParam(name = "vegan", required = false) boolean vegan,
    @RequestParam String comments,
    Model model){

        System.out.println(name + phoneno + pax + vegan + comments);
        model.addAttribute("name", name);

        return "thankyou";
        
    }

    @PostMapping
    public ModelAndView postRSVP(@ModelAttribute FormData formData){
        String name = formData.getName().trim().toLowerCase();
        String phoneno = formData.getPhoneno();
        int pax = formData.getPax();
        boolean vegan = formData.isVegan();
        String comments = formData.getComments();
        System.out.println(name + phoneno + pax + vegan + comments);

        ModelAndView mav = new ModelAndView();
        if (!"fred".equals(name)){
            mav.setViewName("whoareyou");
            mav.setStatus(HttpStatus.BAD_REQUEST);
        } else {
            mav.setViewName("thankyou");
            mav.setStatus(HttpStatus.CREATED);
        }
        mav.addObject("name", name);
        return mav;
    }



}
