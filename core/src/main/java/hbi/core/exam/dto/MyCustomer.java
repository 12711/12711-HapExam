package hbi.core.exam.dto;

import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by LSM on 2016/12/15.
 */
@Table(name = "hap_ar_customers")
public class MyCustomer extends BaseDTO {
    @Id
    @Column(name="CUSTOMER_ID")
    private Integer customerId;//客户id
    @Column(name="CUSTOMER_NUMBER")
    private String customerNum;//客户编号
    @Column(name="CUSTOMER_NAME")
    private String customerName;//客户名字
    @Column(name="COMPANY_ID")
    private Integer companyId;//公司名
    @Column(name="ENABLED_FLAG")
    private String enabledFlag;//启用标识



    public MyCustomer(Integer customerId, String customerNum, String customerName, Integer companyId, String enabledFlag) {
        this.customerId = customerId;
        this.customerNum = customerNum;
        this.customerName = customerName;
        this.companyId = companyId;
        this.enabledFlag = enabledFlag;


    }

    public MyCustomer() {
    }


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }


}
