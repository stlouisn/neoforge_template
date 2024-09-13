package dev.mod_id;

import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
@Mod(Constants.MOD_ID)
public final class ModName {

  public static final Logger LOGGER = LoggerFactory.getLogger(ModConstants.MOD_ID);

  public ModName(ModContainer container) {
    container.registerConfig(Type.COMMON, ConfigHandler.configSpec);
  }
}
