package kaptainwutax.seedcrackerX;

<<<<<<< HEAD
import com.mojang.logging.LogUtils;
=======
>>>>>>> origin/revert-83-forge
import kaptainwutax.seedcrackerX.api.SeedCrackerAPI;
import kaptainwutax.seedcrackerX.config.Config;
import kaptainwutax.seedcrackerX.cracker.storage.DataStorage;
import kaptainwutax.seedcrackerX.finder.FinderQueue;
<<<<<<< HEAD
import kaptainwutax.seedcrackerX.init.ClientCommands;
import kaptainwutax.seedcrackerX.util.Database;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
=======
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
>>>>>>> origin/revert-83-forge

import java.util.ArrayList;

public class SeedCracker implements ModInitializer {
<<<<<<< HEAD
    public static final Logger LOGGER = LogUtils.getLogger();
=======

>>>>>>> origin/revert-83-forge
    public static final ArrayList<SeedCrackerAPI> entrypoints = new ArrayList<>();
    private static SeedCracker INSTANCE;
    private final DataStorage dataStorage = new DataStorage();

    public static SeedCracker get() {
        return INSTANCE;
    }

    @Override
    public void onInitialize() {
        INSTANCE = this;
        Config.load();
        Features.init(Config.get().getVersion());
        FabricLoader.getInstance().getEntrypointContainers("seedcrackerx", SeedCrackerAPI.class).forEach(entrypoint ->
                entrypoints.add(entrypoint.getEntrypoint()));
<<<<<<< HEAD

        FinderQueue.registerEvents();

        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> ClientCommands.registerCommands(dispatcher));

        Database.fetchSeeds();
=======
>>>>>>> origin/revert-83-forge
    }

    public DataStorage getDataStorage() {
        return this.dataStorage;
    }

    public void reset() {
        SeedCracker.get().getDataStorage().clear();
        FinderQueue.get().finderControl.deleteFinders();
    }
}
