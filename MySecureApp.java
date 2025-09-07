@SpringBootApplication
public class MySecureApp {

    public static void main(String[] args) {
        startApplication(args);
    }

    private static void startApplication(String[] args) 
{
        SpringApplication.run(MySecureApp.class, args);
    }
}
