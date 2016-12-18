package hbi.core.exam.dto;

import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by LSM on 2016/12/15.
 */
@Table(name="hap_org_companys")
public class MyCompany extends BaseDTO {
    @Id
    @Column(name="COMPANY_ID")
    private Integer companyId;

    @Column(name="COMPANY_NUMBER")
    private String companyNumber;

    @Column(name="COMPANY_NAME")
    private String companyName;

    @Column(name="ENABLED_FLAG")
    private String enabledFlag;

    public MyCompany() {
    }

    public MyCompany(Integer companyId, String companyNumber, String companyName, String enabledFlag) {
        this.companyId = companyId;
        this.companyNumber = companyNumber;
        this.companyName = companyName;
        this.enabledFlag = enabledFlag;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }
}
