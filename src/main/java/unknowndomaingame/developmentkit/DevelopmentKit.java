package unknowndomaingame.developmentkit;

import unknowndomain.engine.event.Listener;
import unknowndomain.engine.event.game.GameEvent;
import unknowndomain.engine.mod.Mod;

@Mod("developmentkit:1.0.0")
public class DevelopmentKit {

    @Listener
    public void onReady(GameEvent.Ready event) {
        System.out.println("Hello UDEngine");
    }
}
