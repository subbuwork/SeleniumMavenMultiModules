package coreutils;

import org.apache.log4j.Logger;
import java.util.Properties;

public class ReadPoperties {
    Logger logger = Logger.getLogger(ReadPoperties.class);
    Properties props;

    public ReadPoperties(){

        props = new Properties();

        try{
            props.load(this.getClass().getClassLoader().getResourceAsStream("./base.properties"));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public String getValue(String key){
        logger.info("Inside"+logger.getClass().getName()+":getvalue() method::"+key);
        String value = null;
        value =props.getProperty(key);
        logger.info("Value::"+value);
        return value;
    }

 /*   public static void main(String args[]){
        ReadPoperties props = new ReadPoperties();
        props.getValue("gc");
    }*/
}
