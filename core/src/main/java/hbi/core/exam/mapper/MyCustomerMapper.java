package hbi.core.exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.exam.dto.MyCustomer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by LSM on 2016/12/15.
 */
public interface MyCustomerMapper extends Mapper<MyCustomer> {
    public List<MyCustomer> queryAllCus(@Param("companyId") Integer companyId);
}
