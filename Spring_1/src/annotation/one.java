package annotation;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by pupil on 2016/4/8.
 */
//这里添加order注解，会给list输出的时候添加顺序
@Order(2)
@Component
public class one implements number {
}
