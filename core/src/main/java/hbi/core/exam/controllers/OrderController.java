package hbi.core.exam.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.exam.dto.OrderHeaders;
import hbi.core.exam.dto.OrderLines;
import hbi.core.exam.service.OrderHeaderService;
import hbi.core.exam.service.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LSM on 2016/12/15.
 */
@Controller
public class OrderController extends BaseController{
    @Autowired
    OrderLineService orderLineService;
    @Autowired
    OrderHeaderService orderHeaderService;
    @RequestMapping(value="/order/all",method = RequestMethod.POST)
    @ResponseBody
    public ResponseData queryOrderAll(OrderLines orderLinese,HttpServletRequest request,@RequestParam(name= "", defaultValue = DEFAULT_PAGE) int page,
                                      @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize){
        IRequest iRequest = createRequestContext(request);
         return new ResponseData(orderLineService.queryAll(iRequest,orderLinese,pagesize,page));
    }
    @RequestMapping(value="/queryHeader/all",method = RequestMethod.POST)
    @ResponseBody
    public ResponseData querOderHeader(OrderHeaders orderHeaders,HttpServletRequest request,@RequestParam(name= "", defaultValue = DEFAULT_PAGE) int page,
                                       @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize){
            IRequest iRequest=createRequestContext(request);
        OrderHeaders orderHeaders1=orderHeaderService.queryByHeaderNum(iRequest, orderHeaders, pagesize, page);
        List<OrderHeaders> header=new ArrayList<>();

        System.out.print(orderHeaders.getOrderNumber()+"uuuuuuu="+orderHeaders1);
        header.add(orderHeaders1);
        return new ResponseData(header);
    }

}
