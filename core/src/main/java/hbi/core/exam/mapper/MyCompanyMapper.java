package hbi.core.exam.mapper;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.mybatis.common.Mapper;
import com.hand.hap.system.service.IBaseService;
import hbi.core.exam.dto.MyCompany;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by LSM on 2016/12/15.
 */
public interface MyCompanyMapper extends Mapper<MyCompany> {

    public List<MyCompany> queryAllCom(@Param("companyNumber") String companyNumber,@Param("companyName") String companyName );

}
