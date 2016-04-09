package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by pupil on 2016/4/5.
 */
//@Component("bean") 相当于在xml中给这个类的id=bean，如果不加参数（如下），默认name为类名第一个字母小写
@Component
//@Scope("prototype") 作用域为每次在同一个ioc容器中调用这个类都会new一个这个类，如果不加参数（如下），默认为singleton，就是一个ioc容器里只有一个
@Scope
public class BeanAnnotation {
//    给需要自动装配的变量加上注解,表示在配置的时候会自动匹配完成初始化，参数表示如果匹配不到合适的类型，不会抛出异常（默认值就是false），这种注解可以加在变量上，set方法上，构造器方法上，但是构造器方法只能有一个required值为true，spring提倡用@Required注解
    @Autowired
    private data s;

//    list会自动寻找类型是number的类，并在加载ioc容器时自动匹配·
    @Autowired
    private List<number> list;

//    map会自动寻找类型是number的类,string是类的名字，这里设置为String类型，并在加载ioc容器时自动匹配，这里并没有order顺序，因为map强调的是key，value，不强调顺序
    @Autowired
    private Map<String,number> map;

//    这里如果只用@Autowired会有两个number类型的class，用@Qualifier可以缩小范围
    @Autowired
    @Qualifier("two")
    private number n;
    public void say(String string){
        System.out.println("BeanAnnotation.say:"+string);
    }
    public void getS(String string){
        System.out.println(s.getData(string));
    }
    public void getList(){
        System.out.println("list");
        if(list.size()!=0){
            for(number name:list){
                System.out.println(name.getClass().getName());
            }
        }
    }
    public void getMap(){
        System.out.println("map");
        if(map.size()!=0){
            for(Map.Entry<String,number> name:map.entrySet()){
                System.out.println(name.getKey()+"   "+name.getValue().getClass().getName());
            }
        }
    }
    public void getN(){
        if(n!=null)
        System.out.println(n.getClass().getName());
    }
}
