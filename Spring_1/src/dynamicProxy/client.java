package dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * Created by pupil on 2016/4/1.
 */
public class client {
    public static void main(String[] args) {
        interGoods goods=new goods();
        interGoods proxy= (interGoods) Proxy.newProxyInstance(goods.getClass().getClassLoader(),goods.getClass().getInterfaces(),new invocation(goods));
        proxy.setWay();
    }
}
