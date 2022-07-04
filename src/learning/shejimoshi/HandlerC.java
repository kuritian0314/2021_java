package learning.shejimoshi;

/**
 * @author curry
 * @package learning.shejimoshi
 * @date 2022/4/9 2:25
 * @Version V1.0
 */
public class HandlerC implements Handler {
    private Handler handler;

    @Override
    public void handleRequest(String request) {
        if (request.equals("90")) {
            System.out.println("HandlerC handle request");
        } else {
            handler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(Handler next) {
        this.handler = next;
    }
}
