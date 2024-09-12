package dev.mod_id;

import dev.mod_id.config.ModConfig;
import dev.mod_id.config.ModConfigData;
import me.shedaniel.autoconfig.AutoConfig;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
@Mod(Constants.MOD_ID)
public final class ModName {

  public static final Logger LOGGER = LoggerFactory.getLogger(Constants.MOD_ID);

  public ModName(IEventBus modBus) {
    modBus.addListener(this::commonSetup);
    ModLoadingContext.get().registerExtensionPoint(IConfigScreenFactory.class, () -> (client, parent) -> AutoConfig.getConfigScreen(ModConfigData.class, parent).get());
  }

  private void commonSetup(FMLCommonSetupEvent event) {
    event.enqueueWork(ModConfig::init);
  }
}
