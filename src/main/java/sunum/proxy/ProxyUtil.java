package sunum.proxy;

import java.lang.reflect.Proxy;

public class ProxyUtil {
    static PlayerInt getProxyInstance(PlayerInt player) {

        return (PlayerInt) Proxy.newProxyInstance(
                player.getClass().getClassLoader(),
                player.getClass().getInterfaces(),
                new OwnerInvoker(player)
        );
    }
}
