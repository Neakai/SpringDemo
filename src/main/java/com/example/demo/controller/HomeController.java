package com.example.demo.controller;

import com.example.demo.dto.AuthDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController implements HomeAPI {

    @Override
    public ModelAndView ss(Integer numero, String param1, String param2) {
        ModelAndView mAV = new ModelAndView("index2");

        mAV.addObject("numero", numero);
        mAV.addObject("x", param1);
        mAV.addObject("y", param2);

        return mAV;
    }

    @Override
    public ModelAndView handleAuthentication() {
        return new ModelAndView("login");
    }

    @Override
    public String handleAuthentication(AuthDTO authDTO) {
        System.out.println();
        // Manejamos toda la authentication
        // token pair JWT
        //
        return "login";
    }

}
