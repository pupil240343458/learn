package annotation;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * Created by pupil on 2016/4/9.
 */
@Service
public class JsrService {
//    会进行DI
    @Resource
    private jsrDAO jsrDAO;
//    会进行DI
    @Resource
    public void setJsrDAO(annotation.jsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }

    public void save(){
        jsrDAO.save();
    }
}
