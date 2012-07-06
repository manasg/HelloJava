package just.testing;

import java.io.FileInputStream;
import java.util.Properties;

public class Hello {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Need path to properties file as first arg!");
            System.exit(1);
        }
        
        System.out.println("");
        System.out.println("Lets pretend to do a lot & I like semi colons");

        Properties props = new Properties();
        FileInputStream in = new FileInputStream(args[0]);
        props.load(in);

        System.out.println(props.getProperty("msg"));
        System.out.println("");
    }

}
