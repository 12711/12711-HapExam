package hbi.core.exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.exam.dto.OrderLines;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by LSM on 2016/12/15.
 */
public interface OrderLineMapper extends Mapper<OrderLines>{
    public List<OrderLines> queryAllLines(OrderLines orderLines);

    /*用于级联查询实现订单头跟订单行的一对多关系*/
    public List<OrderLines> queryByOrderHeader(@Param("headerId")Integer headerId);

    /*插入新的订单*/
    public void insertlines(OrderLines orderLines);
}
