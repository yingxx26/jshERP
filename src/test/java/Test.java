import com.singleton.enumSingleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String args[]){
//测试枚举单例
        enumSingleton instance = enumSingleton.getInstance();

        System.out.println("111"+instance.hashCode());

        enumSingleton instance1 =  enumSingleton.getInstance();
        System.out.println("111"+instance1.hashCode());

    }
}
