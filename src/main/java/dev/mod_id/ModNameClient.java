package dev.mod_id;

import dev.mod_id.utils.Constants;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@SuppressWarnings("unused")
@Mod(value = Constants.MOD_ID, dist = Dist.CLIENT)
public final class ModNameClient {

  public ModNameClient(ModContainer container) {
    container.registerExtensionPoint(IConfigScreenFactory.class, (mc, parent) -> new ConfigurationScreen(container, parent));
  }
}
