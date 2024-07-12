import entity.Result;

import java.util.Arrays;

public class ConsoleRunner {
    public static void main(String[] args) {


      //  int key = 123; // <-- args

       // String text = "Привет!"; // <-- args
        //String result = "....."; // <-- args
         Application application = new Application();
         Result result =application.run(args);
        System.out.println(result);
    }
}