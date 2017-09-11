package com.wayblink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;

@Controller
public class GoController {
     
    @RequestMapping(value = "/go")
    public String go() {
        return "/go";
    }
    
//    @RequestMapping("/go")
//    public ModelAndView go() throws Exception {
//     // TODO Auto-generated method stub
////     List<CabinetHeadExtend> cabinetList =cabinetService.findCabinetHeadList(null);
//
//        ModelAndView modelAndView = new ModelAndView();
//
////        modelAndView.addObject("cabinetList",cabinetList );
//        modelAndView.setViewName("/go");
//        return modelAndView;
//     }
}
