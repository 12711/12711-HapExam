package hbi.core.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.exam.dto.OrderHeaders;
import hbi.core.exam.mapper.OrderHeaderMapper;
import hbi.core.exam.service.OrderHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LSM on 2016/12/18.
 */
@Service
public class OrderHeaderImpl extends BaseServiceImpl<OrderHeaders> implements OrderHeaderService {
  @Autowired
    OrderHeaderMapper orderHeaderMapper;

    @Override
    @Transactional(
            propagation = Propagation.SUPPORTS
    )
    public OrderHeaders queryByHeaderNum(IRequest iRequest, OrderHeaders orderHeaders,int pagesize,int page) {
        return orderHeaderMapper.queryByOrderNum(orderHeaders);
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public void insertHeader(OrderHeaders orderHeaders) {
        orderHeaderMapper.insertOrderHeader(orderHeaders);
    }
}
