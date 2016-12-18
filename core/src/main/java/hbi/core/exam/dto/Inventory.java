package hbi.core.exam.dto;

import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by LSM on 2016/12/15.
 */
@Table(name="hap_inv_inventory_items")
public class Inventory extends BaseDTO {
    @Id
    @Column(name="INVENTORY_ITEM_ID")
    private Integer inventoryItemId;//物料id
    @Column(name="ITEM_CODE")
    private String itemCode;//物料编码
    @Column(name="ITEM_UOM")
    private String itemUom;//物料单位
    @Column(name="ITEM_DESCRIPTION")
    private String itemDescription;//物料描述
    @Column(name="ORDER_FLAG")
    private String orderFlag;//是否能用于销售
    @Column(name="START_ACTIVE_DATE")
    private String startActiveDate;//生效时间
    @Column(name="END_ACTIVE_DATE")
    private String endActiveDate;//生效结束时间
    @Column(name="ENABLED_FLAG")
    private String enabledFlag;//是否启用标识



    public Inventory(Integer inventoryItemId, String itemCode, String itemUom, String itemDescription, String orderFlag, String startActiveDate, String endActiveDate, String enabledFlag) {
        this.inventoryItemId = inventoryItemId;
        this.itemCode = itemCode;
        this.itemUom = itemUom;
        this.itemDescription = itemDescription;
        this.orderFlag = orderFlag;
        this.startActiveDate = startActiveDate;
        this.endActiveDate = endActiveDate;
        this.enabledFlag = enabledFlag;

    }

    public Inventory() {
    }

    public Integer getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Integer inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemUom() {
        return itemUom;
    }

    public void setItemUom(String itemUom) {
        this.itemUom = itemUom;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(String orderFlag) {
        this.orderFlag = orderFlag;
    }

    public String getStartActiveDate() {
        return startActiveDate;
    }

    public void setStartActiveDate(String startActiveDate) {
        this.startActiveDate = startActiveDate;
    }

    public String getEndActiveDate() {
        return endActiveDate;
    }

    public void setEndActiveDate(String endActiveDate) {
        this.endActiveDate = endActiveDate;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

}
