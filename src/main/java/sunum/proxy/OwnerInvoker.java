package sunum.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvoker implements InvocationHandler {

    PlayerInt player;

    public OwnerInvoker(PlayerInt player) {
        this.player = player;
    }

    @Override
    public Object invoke(Object proxy,
                         Method method,
                         Object[] args) throws Throwable {

        if(method.getName().equals("setScore"))
            throw new IllegalAccessException("You cannot access this method!");
        else
            return method.invoke(player,args);
    }
}
