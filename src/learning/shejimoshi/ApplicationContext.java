package learning.shejimoshi;

/**
 * @author curry
 * @package learning.shejimoshi
 * @date 2022/4/9 2:28
 * @Version V1.0
 */
public class ApplicationContext {
    private Handler handlerA, handlerB, handlerC;

    public void createChain() {
        handlerA = new HandlerA();
        handlerB = new HandlerB();
        handlerC = new HandlerC();

        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);
    }

    public void handleRequest(String request) {
        handlerA.handleRequest(request);
    }



}
