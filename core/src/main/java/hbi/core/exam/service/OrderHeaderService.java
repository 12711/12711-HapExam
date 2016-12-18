package hbi.core.exam.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hbi.core.exam.dto.OrderHeaders;

/**
 * Created by LSM on 2016/12/15.
 */
public interface OrderHeaderService extends IBaseService<OrderHeaders>,ProxySelf<OrderHeaderService>{

    /*通过订单头编号查询*/
    public OrderHeaders queryByHeaderNum(IRequest iRequest, OrderHeaders orderHeaders,int pagesize,int page);

    public void insertHeader(OrderHeaders orderHeaders);

}
