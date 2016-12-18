package hbi.core.exam.dto;

import com.hand.hap.system.dto.BaseDTO;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * Created by LSM on 2016/12/15.
 */
@Table(name = "hap_om_order_lines")
public class OrderLines extends BaseDTO {
    @Id
    @Column(name = "LINE_ID")
    private Integer lineId;
    @Column(name = "HEADER_ID")
    private Integer headerId;
    @Column(name = "LINE_NUMBER")
    private Integer lineNumber;//行号
    @Column(name = "INVENTORY_ITEM_ID")
    private Integer inventoryItemId;//产品id
    @Column(name = "ORDERD_QUANTITY")
    private Integer orderdQuantity;//订单数
    @Column(name = "ORDER_QUANTITY_UOM")
    private String orderQuantityUom;//产品单位
    @Column(name = "UNIT_SELLING_PRICE")
    private Integer unitSellingPrice;//销售价格
    @Column(name = "DESCRIPTION")
    private String description;//描述
    @Column(name = "COMPANY_ID")
    private Integer companyId;//公司id

    @Transient
    private Integer customerId;
    @Transient
    private String companyName;

    @Transient
    private String customerName;

    @Transient
    private String rderDate;

    @Transient
    private String orderStatus;

    @Transient
    private String orderMoney;

    @Transient
    private String orderNum;

    @Transient
    private String itemCode;

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public OrderLines() {
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public OrderLines(Integer lineId, Integer headerId, Integer lineNumber, Integer inventoryItemId, Integer orderdQuantity, String orderQuantityUom, Integer unitSellingPrice, String description, Integer companyId, Integer customerId, String companyName, String customerName, String rderDate, String orderStatus, String orderMoney, String orderNum, String itemCode) {
        this.lineId = lineId;
        this.headerId = headerId;
        this.lineNumber = lineNumber;
        this.inventoryItemId = inventoryItemId;
        this.orderdQuantity = orderdQuantity;
        this.orderQuantityUom = orderQuantityUom;
        this.unitSellingPrice = unitSellingPrice;
        this.description = description;
        this.companyId = companyId;
        this.customerId = customerId;
        this.companyName = companyName;
        this.customerName = customerName;
        this.rderDate = rderDate;
        this.orderStatus = orderStatus;
        this.orderMoney = orderMoney;
        this.orderNum = orderNum;
        this.itemCode = itemCode;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getRderDate() {
        return rderDate;
    }

    public void setRderDate(String rderDate) {
        this.rderDate = rderDate;
    }


    public String getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(String orderMoney) {
        this.orderMoney = orderMoney;
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

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public Integer getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Integer headerId) {
        this.headerId = headerId;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Integer getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Integer inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Integer getOrderdQuantity() {
        return orderdQuantity;
    }

    public void setOrderdQuantity(Integer orderdQuantity) {
        this.orderdQuantity = orderdQuantity;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public void setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
    }

    public Integer getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public void setUnitSellingPrice(Integer unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}
