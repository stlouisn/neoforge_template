package dev.mod_id.config;

import dev.mod_id.Constants;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry.BoundedDiscrete;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Category;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.CollapsibleObject;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.Tooltip;

@Config(name = Constants.MOD_ID)
public class ModConfigData implements ConfigData {

  @Category("Category")
  @Tooltip
  public boolean booleanVar = true;

  @Category("Category")
  @Tooltip
  @CollapsibleObject
  public FadeConfig pitchFade = new FadeConfig();

  public static class FadeConfig {

    public boolean enabled = true;

    @Tooltip
    @BoundedDiscrete(min = 0, max = 90)
    public int startAngle = 30;

    @Tooltip
    @BoundedDiscrete(min = 0, max = 90)
    public int endAngle = 50;
    
  }

}
