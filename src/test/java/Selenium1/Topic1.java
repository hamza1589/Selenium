package Selenium1;

public class Topic1 extends TestBase{
    public static void main(String[] args) {
        serchBar();

    }
    public static void serchBar(){
        setUpDriver("chrome");
        sleepFor(5);
        closeDriver();




    }
}
