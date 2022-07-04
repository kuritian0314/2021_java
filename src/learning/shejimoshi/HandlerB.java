package learning.shejimoshi;

/**
 * @author curry
 * @package learning.shejimoshi
 * @date 2022/4/9 2:14
 * @Version V1.0
 */
public class HandlerB implements Handler {
    private Handler handler;

    @Override
    public void handleRequest(String request) {
        if (request.equals("60")) {
            System.out.println("HandlerB handle request");
        }else {
            handler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(Handler next) {
        this.handler = next;
    }
}

