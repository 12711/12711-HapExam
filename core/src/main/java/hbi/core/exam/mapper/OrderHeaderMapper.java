package hbi.core.exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.exam.dto.OrderHeaders;

import java.util.List;

/**
 * Created by LSM on 2016/12/15.
 */
public interface OrderHeaderMapper extends Mapper<OrderHeaders> {
    public List<OrderHeaders> queryAllHeaders();

    /*通过订单编号查询订单头*/
    public OrderHeaders queryByOrderNum(OrderHeaders orderHeaders);

    /*插入订单头*/
    public void insertOrderHeader(OrderHeaders orderHeader);

}
