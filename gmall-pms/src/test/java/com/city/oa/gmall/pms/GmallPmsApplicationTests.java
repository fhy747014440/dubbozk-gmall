package com.city.oa.gmall.pms;

import com.city.oa.gmall.pms.entity.Brand;
import com.city.oa.gmall.pms.entity.Product;
import com.city.oa.gmall.pms.service.BrandService;
import com.city.oa.gmall.pms.service.ProductService;
import groovy.util.logging.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        /*Product byId = productService.getById(1);
        System.out.println(byId.getName());*/
        //测试增删改在主库 查在从库
       /* Brand brand = new Brand();
        brand.setName("哈哈哈");*/
        Brand byId = brandService.getById(53);
        System.out.println("保存成功...."+byId.getName());


    }

}
