package September.Ex_23092024_Switch;

public class Lab_076 {
    public static void main(String[] args) {
        //Real Time Example
        //Web Automation
        //I will ask the user for the browser choice
        //chrome ==> execute in chrome
        //firefox --> execute in firefox
        //edge --> execute in edge

        String browser = "Opera";
        switch (browser) {
            case "Chrome":
                System.out.println("Starting the Chrome Browser");
                //Further code to start Chrome Browser
                // Webdriver driver = new Chrome(); //Selenium Code
                break;
            case "Firefox":
                System.out.println("Starting the Firefox Browser");
                //Further code to start Chrome Browser
                // Webdriver driver = new Chrome(); //Selenium Code
                break;
            case "Edge":
                System.out.println("Execute the code in Edge");
                break;
            default:
                System.out.println("Don't know which browser this is");
                break;


        }
    }
}
