package learning.shejimoshi;

public interface Handler {
    void handleRequest(String request);

    void setNextHandler(Handler next);
}
