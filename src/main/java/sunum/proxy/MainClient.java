package sunum.proxy;

public class MainClient {
    public static void main(String[] args) {
        MainClient client = new MainClient();
        client.test();
    }

    void test() {
        PlayerInt robert = new Player("Robert", "Male", 0);
        PlayerInt proxyRobert = ProxyUtil.getProxyInstance(robert);
        System.out.println(proxyRobert.getGender());

        proxyRobert.setScore(20);
        proxyRobert.getScore();
    }
}
