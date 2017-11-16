package cn.univyz.bfyweb.service;

import cn.univyz.bfyweb.helper.DatabaseHelper;
import cn.univyz.bfyweb.model.Customer;
import cn.univyz.bfyweb.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;


/**
 * 提供客户数据服务
 */
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList(){
               String sql ="SELECT * FROM customer";
               return DatabaseHelper.queryEntityList(Customer.class,sql);
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id){
        String sql = "SELECT * FROM customer WHERE id="+id;
        return DatabaseHelper.queryEntity(Customer.class,sql);
    }
    /**
     * 创建客户
     */
    public boolean createCustomer(Map<String,Object> fieldMap){
        return  DatabaseHelper.insertEntity(Customer.class,fieldMap);
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){

        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }
    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id){

        return DatabaseHelper.deleteEntity(Customer.class, id);
    }



}
