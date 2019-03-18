import com.ruoyi.common.utils.spring.SpringUtils;
import com.ruoyi.system.service.ISysUserService;
import org.apache.commons.lang3.time.FastDateFormat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by Administrator on 2019/3/4.
 */
public class StringToDate {

    @Autowired
    private ISysUserService iSysUserService = SpringUtils.getBean(ISysUserService.class);

    @Test
    public void test(){
        try {

            iSysUserService.selectUserById(1L);
            FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy-MM-dd hh:mm:ss.SSS");
            Date date = dateFormat.parse("2019-03-04 10:36:41.28");
            Long time =date.getTime();
            System.out.println(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
