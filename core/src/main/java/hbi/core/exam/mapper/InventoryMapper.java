package hbi.core.exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.exam.dto.Inventory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by LSM on 2016/12/15.
 */
public interface InventoryMapper extends Mapper<Inventory> {
      public List<Inventory> queryAllInv(Inventory Inventory);
}
