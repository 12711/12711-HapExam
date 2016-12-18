package hbi.core.exam.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hbi.core.exam.dto.OrderLines;

import java.util.List;

/**
 * Created by LSM on 2016/12/15.
 */
public interface OrderLineService extends IBaseService<OrderLines>, ProxySelf<OrderLineService> {
    public List<OrderLines> queryAll(IRequest iRequest, OrderLines orderLinese,int pagesize,int page);

    public void insertOrderLine(OrderLines orderLines);
}
