package just.testing;

import java.io.FileInputStream;
import java.util.Properties;

public class Hello {

	public static void main(String[] args) throws Exception {
		System.out.println("Lets pretend to do a lot & I like semi colons");
        
        Properties props = new Properties();
        FileInputStream in = new FileInputStream("some.properties");
        props.load(in);

        System.out.println(props.getProperty("msg"));   
	}

}
