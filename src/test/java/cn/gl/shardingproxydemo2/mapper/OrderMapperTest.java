package cn.gl.shardingproxydemo2.mapper;

import cn.gl.shardingproxydemo2.entity.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;
import java.util.List;

@SpringBootTest
public class OrderMapperTest {
    
    @Autowired
    private OrderMapper orderMapper;
    
    @Test
    public void testCreateTableIfNotExists() throws SQLException {
        orderMapper.createTableIfNotExists();
    }
    
    @Test
    public void testDropTable() throws SQLException {
        orderMapper.dropTable();
    }

    @Test
    public void testOrderMapper() throws SQLException {
        orderMapper.createTableIfNotExists();
        Order o1 = new Order(1, 1, "N");
        Order o2 = new Order(2, 2, "N");
        Order o3 = new Order(3, 3, "N");
        orderMapper.insert(o1);
        orderMapper.insert(o2);
        orderMapper.insert(o3);
        List<Order> orderList = orderMapper.selectAll();
        
        System.out.println(orderList);
        Order orderIdx1 = orderList.get(1);
        orderMapper.delete(orderIdx1.getOrderId());
        List<Order> orders = orderMapper.selectAll();
        System.out.println(orders);
        
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        List<Order> orders = orderMapper.selectAll();
        System.out.println(orders);
    }
}
