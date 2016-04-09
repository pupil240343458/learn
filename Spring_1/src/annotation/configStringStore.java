package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by pupil on 2016/4/8.
 */
@Configuration
public class configStringStore {
//    通常configuration注解与bean注解连用，相当于在xml定义一个store类型的类stringStore，name是stringStore，而且调用这个注解后，会自动执行这个方法
    @Bean(name="stringStore")
//    默认scope值是singleton
    @Scope(value = "")
    public store stringSore(){
        return new stringStore();
    }
}
