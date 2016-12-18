package hbi.core.exam.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.exam.dto.MyCompany;
import hbi.core.exam.mapper.MyCompanyMapper;
import hbi.core.exam.service.MyCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by LSM on 2016/12/15.
 */
@Service
public class MyCompanyServiceImpl extends BaseServiceImpl<MyCompany> implements MyCompanyService {
     @Autowired
    MyCompanyMapper myCompanyMapper;
}
