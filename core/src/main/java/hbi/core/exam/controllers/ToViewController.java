package hbi.core.exam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by LSM on 2016/12/15.
 * 跳转到视图
 */
@Controller
public class ToViewController {
    @RequestMapping(value="/to/ordersum",method = RequestMethod.GET)
    public String toOrderSumm(){
        System.out.print("-----------------laile");
        return "ordersummary";
    }
    @RequestMapping(value="/to/ordersum1",method = RequestMethod.GET)
    public String toOrderSumm1(){
        System.out.print("-----------------laile");
        return "ordersummaryTest";
    }

    @RequestMapping(value="/edit",method = RequestMethod.GET)
    public String toOrderSumm2(){
        System.out.print("-----------------laile");
        return "orderRditor";
    }
}
