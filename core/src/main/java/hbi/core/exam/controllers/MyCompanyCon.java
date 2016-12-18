package hbi.core.exam.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.exam.service.MyCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by LSM on 2016/12/15.
 */
@Controller
public class MyCompanyCon extends BaseController{
    @Autowired
    MyCompanyService myCompanyService;

    @RequestMapping(value="/company/all",method = RequestMethod.GET)
    @ResponseBody
    public ResponseData queryAllCom(HttpServletRequest request){
        IRequest iRequest=createRequestContext(request);
        return new ResponseData(myCompanyService.selectAll(iRequest));
    }
}
