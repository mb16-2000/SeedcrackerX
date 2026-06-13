package kaptainwutax.seedcrackerX.config;


<<<<<<< HEAD
// import com.terraformersmc.modmenu.api.ConfigScreenFactory;
// import com.terraformersmc.modmenu.api.ModMenuApi;
=======
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
>>>>>>> origin/revert-83-forge
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;


@Environment(EnvType.CLIENT)
<<<<<<< HEAD
public class ScModMenuEntry /*implements ModMenuApi*/ {
    ConfigScreen configscreen = new ConfigScreen();

//    @Override
//    public ConfigScreenFactory<?> getModConfigScreenFactory() {
//        return configscreen::getConfigScreenByCloth;
//    }
=======
public class ScModMenuEntry implements ModMenuApi {
    ConfigScreen configscreen = new ConfigScreen();

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return configscreen::getConfigScreenByCloth;
    }
>>>>>>> origin/revert-83-forge
}
