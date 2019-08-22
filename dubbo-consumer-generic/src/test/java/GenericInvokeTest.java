import org.apache.dubbo.rpc.service.GenericService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author gaoxugang
 * @data 2019/8/22 0022 22:00
 * @description dubbo范化调用
 */

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext-consumer-generic.xml")
public class GenericInvokeTest {

    @Autowired
    GenericService genericService;

    @Test
    public void testInvoke() {
        Object result = genericService.$invoke("queryUserVoById", new String[]{"java.lang.String"}, new Object[]{"1234"});
        System.out.println(result.toString());
    }

}
