package angle_responsibility;

/*
              角色2.2：具体处理者 ：具体处理者是实现处理者接口的类的实例
                              具体处理者通过调用处理者接口规定的方法，处理用户的请求
                              即在接到用户的请求后，处理者将调用接口规定的方法，在执行该方法的过程中
                              如果发现能处理用户的请求，就处理有关数据
                              否则就反馈无法处理的信息给用户，然后将用户的请求传递给自己的后继对象
*/

public class Diamond270DrawFivePrizes implements Handler {
    private Handler handler;      //存放当前处理者后继的Handler接口变量

    public void handleRequest(int number) {
        if (number == 270) {               //270钻石抽五次
            String random, random1, random2, random3, random4 = "";
            String[] doc = {"白起", "夏侯惇", "甄姬", "金币288", "小喇叭5", "铭文碎片1600", "铭文碎片400", "铭文碎片100", "铭文碎片25", "爱心气球（3日）", "亲密玫瑰", "钻石48", "龙域领主体验卡"};
            int index = (int) (Math.random() * doc.length);      //随机选取其五输出
            random = doc[index];
            System.out.print(random + "、");
            int index1 = (int) (Math.random() * doc.length);
            random1 = doc[index1];
            System.out.print(random1 + "、");
            int index2 = (int) (Math.random() * doc.length);
            random2 = doc[index2];
            System.out.print(random2 + "、");
            int index3 = (int) (Math.random() * doc.length);
            random3 = doc[index3];
            System.out.print(random3 + "、");
            int index4 = (int) (Math.random() * doc.length);
            random4 = doc[index4];
            System.out.println(random4);
        } else
            handler.handleRequest(number);      //将请求传递给下一个处理者
    }

    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }

}