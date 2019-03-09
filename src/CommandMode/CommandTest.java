package CommandMode;

/**
 * @Author: jow
 * @Date: 2019/3/9 21:41
 * @Description
 * @Version 1.0
 * 将请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；队请求排队或记录请求日志，以及支持可撤销的操作
 * 执行命令者-厨师  命令组合执行命令者-饭菜
 * 接收和取消命令者 通知执行命令者-服务员
 */
public class CommandTest {
    public void test(){
        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        Fish fish = new Fish(chef);
        Noodle noodle = new Noodle(chef);
        Roast roast = new Roast(chef);

        waiter.setOrder(roast);
        waiter.setOrder(noodle);
        waiter.setOrder(roast);
        waiter.setOrder(fish);
        waiter.removeOrder(roast);
        waiter.notifyChef();
    }
}
