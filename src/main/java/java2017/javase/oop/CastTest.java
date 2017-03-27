package java2017.javase.oop;

import com.sun.jmx.snmp.internal.SnmpOutgoingRequest;
import com.sun.org.apache.xerces.internal.impl.dv.xs.YearDV;

/**
 * Created by 李朋 on
 * 2017/3/27 0027 下午 1:58.
 */
public class CastTest {
    public static void main(String[] args) {
        int x=1;
        int y=2;
        //String s1=?;
        Integer integer=new Integer(x);
        String s1=integer.toString();
        System.out.println(s1);
        //b
        String s2=String.valueOf(x);
        System.out.println(s2);
        //c
        String s3=""+x+y;


        //String s2="123";
        //int y=?;
        //System.out.println(y);
    }
}
