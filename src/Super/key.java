package Super;

public class key {
    public static void main(String[] args) {
        baseclass b1 = new baseclass("Chrome",true);
        System.out.println(b1.getBrowser());
        //System.out.println(b1.closebrowser());
    }
}
class baseclass{
    private String browser;
    public baseclass(String browser, boolean b) {
        this.browser = browser;
    }

    public baseclass(String browser) {
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isadmin) {
        if (isadmin) {
            this.browser = browser;
        } else {
            System.out.println("Change browser not allowed");
        }
    }
        void openBrowser(){
            System.out.println("opening browser");
        }
        void openBrowser (String browsername){
            System.out.println("open browser-->" + browsername);
        }
        void closebrowser(){System.out.println("close browser");
        }
        class Testcase1 extends baseclass{
            public void tc(){

            }
        public Testcase1(String browser){
                super(browser);
            super.openBrowser();
            super.closebrowser();
            this.tc();

        }

        }

    }