package dev.mod_id;

import dev.mod_id.config.ConfigHandler;
import dev.mod_id.utils.ModConstants;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
@Mod(ModConstants.MOD_ID)
public final class ModName {

  public static final Logger LOGGER = LoggerFactory.getLogger(ModConstants.MOD_ID);

  public ModName(ModContainer container) {
    container.registerConfig(Type.COMMON, ConfigHandler.configSpec);
  }
}
