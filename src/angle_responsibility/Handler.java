package angle_responsibility;

/*
            角色1：处理者 :是一个接口，负责规定具体处理者处理用户请求的方法以及具体处理者设置后继对象的方法
*/

public interface Handler {
    public abstract void handleRequest(int number);   //具体处理用户请求60钻石抽一次还是270钻石抽五次

    public abstract void setNextHandler(Handler handler);

}
