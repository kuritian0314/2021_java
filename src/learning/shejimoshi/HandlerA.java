package learning.shejimoshi;

/**
 * @author curry
 * @package learning.shejimoshi
 * @date 2022/4/9 2:11
 * @Version V1.0
 */
class HandlerA implements Handler {
    private Handler handler;

    @Override
    public void handleRequest(String request) {
        if (request.equals("30")) {
            System.out.println("HandlerA handle request");
        }else {
            handler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(Handler next) {
        this.handler = next;
    }
}
