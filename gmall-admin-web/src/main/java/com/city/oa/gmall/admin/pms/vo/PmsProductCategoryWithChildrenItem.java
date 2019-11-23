package com.city.oa.gmall.admin.pms.vo;


import com.city.oa.gmall.pms.entity.ProductCategory;
import lombok.Data;

import java.util.List;

/**
 */
@Data
public class PmsProductCategoryWithChildrenItem extends ProductCategory {
    private List<ProductCategory> children;

}
