import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Main extends HttpServlet {
    public static  void f1(){
        System.out.println("one");
        System.out.println("two1");
        System.out.println("three3");
        System.out.println("我爱中国");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        //TODO
    }

    @Override
    protected long getLastModified(HttpServletRequest req) {
        return super.getLastModified(req);
    }

    @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doHead(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    public static void f2(){
        for(char c=0;c<128;c++){
            if(Character.isLowerCase(c)){
                System.out.println("value"+(int)c +"character:"+c);
            }
        }
        f1();
    }

    public static void main(String[] args) {
        f1();
        f2();
    }

}
