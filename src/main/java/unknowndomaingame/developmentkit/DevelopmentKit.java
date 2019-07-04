package unknowndomaingame.developmentkit;

import com.google.inject.Inject;
import com.google.inject.Injector;
import nullengine.event.Listener;
import nullengine.event.mod.ModLifecycleEvent;
import nullengine.mod.InstallationType;
import nullengine.mod.ModContainer;
import nullengine.mod.annotation.Mod;


@Mod(id = "developmentkit",
        version = "0.1.0-alpha",
        installationType = InstallationType.CLIENT_ONLY)
public class DevelopmentKit {

    @Inject
    public static DevelopmentKit instance;

    @Inject
    public static ModContainer mod;

    @Inject
    public static Injector injector;

    @Listener
    public void onInit(ModLifecycleEvent.Initialization event) {
        mod.getLogger().info("Hello World");
    }

}
