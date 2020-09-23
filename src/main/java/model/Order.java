package model;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-08-18
 * Time:0:47
 * 一万年太久，只争朝夕，加油
 */
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

// 通过这个 Order 来表示一个完整的订单.
// 包括订单中都有哪些菜
// Order 类对应到两张表: order_user + order_dish
public class Order {
    private int orderId;
    private int userId;
    private Timestamp time;
    private int isDone;
    private List<Dish> dishes;  // 一个订单中包含了很多菜

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public int getIsDone() {
        return isDone;
    }

    public void setIsDone(int isDone) {
        this.isDone = isDone;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
