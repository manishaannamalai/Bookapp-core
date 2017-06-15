package com.manisha.testorderDAO;

import java.time.LocalDate;
import java.util.List;

import com.manisha.order.Order;
import com.manisha.orderDAO.OrderDAO;
import com.manisha.userdao.UserDAO;

public class TestOrderDAO {
	
		public static void main(String[] args) throws Exception {
			 LocalDate date=LocalDate.parse("2017-12-04");
 
	        Order order = new Order();
	        order.setUserId(2);
	        order.setBookId(2);
	        order.setStatus("delivered");
	        order.setQuantity(2);
	        order.setOrderDate(date);
	 
	        OrderDAO orderDAO = new OrderDAO();
	        //orderDAO.login();
	        List<Order> orderList=orderDAO.login();
	        for(Order o:orderList){
				System.out.println(o);
			}
	        //System.out.println(order);
	        
	        
	        

}
}
