package unknowndomaingame.developmentkit;

import nullengine.event.Listener;
import nullengine.event.game.GameStartEvent;
import nullengine.mod.annotation.AutoListen;

@AutoListen
public class MyListener {

    @Listener
    public void onReady(GameStartEvent.Post event) {
        System.out.println("Hello UDEngine");
    }
}
