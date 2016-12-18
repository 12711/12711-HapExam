package hbi.core.exam.dto;

import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;


/**
 * Created by LSM on 2016/12/15.
 */
@Table(name = "hap_om_order_headers")
public class OrderHeaders extends BaseDTO {
    @Id
    @Column(name = "HEADER_ID")
    private Integer headerId;//'订单头ID'
    @Column(name = "ORDER_NUMBER")
    private String orderNumber;//'订单编号'
    @Column(name = "COMPANY_ID")
    private Integer companyId;//公司id
    @Column(name = "ORDER_DATE")
    private String orderDate;//下单时间
    @Column(name = "ORDER_STATUS")
    private String orderStatus;//订单状态
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;//客户id

    @Transient
    private String companyName;

    @Transient
    private String customerName;

    @Transient
    private Long sum;

    @Transient
    List<OrderLines> orderLines;

    public OrderHeaders(Integer headerId, String orderNumber, Integer companyId, String order_date, String orderStatus, Integer customerId, String companyName, String customerName, Long sum, List<OrderLines> orderLines) {
        this.headerId = headerId;
        this.orderNumber = orderNumber;
        this.companyId = companyId;
        this.orderDate = order_date;
        this.orderStatus = orderStatus;
        this.customerId = customerId;
        this.companyName = companyName;
        this.customerName = customerName;
        this.sum = sum;
        this.orderLines = orderLines;
    }

    public List<OrderLines> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLines> orderLines) {
        this.orderLines = orderLines;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public OrderHeaders() {
    }

    public Integer getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Integer headerId) {
        this.headerId = headerId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String order_date) {
        this.orderDate = order_date;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }
}

