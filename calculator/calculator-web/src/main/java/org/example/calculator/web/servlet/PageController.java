package org.example.calculator.web.servlet;

import org.example.calculator.CalculatorAPI;
import org.example.calculator.web.impl.CalculatorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    CalculatorAPI calculator;
    CalculatorImpl cI = new CalculatorImpl();


    @Autowired
    public PageController(CalculatorAPI calculator) {
        this.calculator = calculator;
    }
    //private org.example.calculator.web.srv.ServiceClass ServiceClass;

    /*@GetMapping("/calculator")
    String getPage() {
        return "page";
    }*/
    @RequestMapping("/calculator")
    public String getCalculatorPage(Model model) {
        model.addAttribute("cI", cI);
        return "page";
    }

    @RequestMapping(value="/calculator", params="add", method = RequestMethod.POST)
    public String add(@ModelAttribute("cI") CalculatorImpl cI, Model model ){
        model.addAttribute("result", cI.add(cI.getLeftOperand(), cI.getRightOperand()));
        return "page";
    }

    @RequestMapping(value="/calculator", params="subtract", method = RequestMethod.POST)
    public String sub(@ModelAttribute("cI") CalculatorImpl cI, Model model ){
        model.addAttribute("result", cI.substract(cI.getLeftOperand(), cI.getRightOperand()));
        return "page";
    }

    @RequestMapping(value="/calculator", params="multiply", method = RequestMethod.POST)
    public String mult(@ModelAttribute("cI") CalculatorImpl cI, Model model ){
        model.addAttribute("result", cI.multiply(cI.getLeftOperand(), cI.getRightOperand()));
        return "page";
    }

    @RequestMapping(value="/calculator", params="divide", method = RequestMethod.POST)
    public String div(@ModelAttribute("cI") CalculatorImpl cI, Model model ){
        model.addAttribute("result", cI.divide(cI.getLeftOperand(), cI.getRightOperand()));
        return "page";
    }

}
