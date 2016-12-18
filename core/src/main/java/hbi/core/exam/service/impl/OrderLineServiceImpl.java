package hbi.core.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.exam.dto.OrderLines;
import hbi.core.exam.mapper.OrderLineMapper;
import hbi.core.exam.service.OrderLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LSM on 2016/12/15.
 */
@Service
public class OrderLineServiceImpl extends BaseServiceImpl<OrderLines> implements OrderLineService {
   @Autowired
    OrderLineMapper orderLineMapper;

    @Transactional(
            propagation = Propagation.SUPPORTS
    )
    @Override
    public List<OrderLines> queryAll(IRequest iRequest, OrderLines orderLinese,int pagesize,int page) {
        PageHelper.startPage(page,pagesize);
        return orderLineMapper.queryAllLines( orderLinese);
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public void insertOrderLine(OrderLines orderLines) {
        orderLineMapper.insertlines(orderLines);
    }
}
