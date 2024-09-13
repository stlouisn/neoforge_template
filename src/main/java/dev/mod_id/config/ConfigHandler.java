package dev.mod_id.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import net.neoforged.neoforge.common.ModConfigSpec.ConfigValue;

public final class ConfigHandler {

  public static final ModConfigSpec configSpec;

  public static ConfigValue<Integer> variableName1, variableName2;

  static {

    ModConfigSpec.Builder builder = new ModConfigSpec.Builder();

    variableName1 = builder
        .defineInRange("variableName1", 50, 0, 100);

    variableName2 = builder
        .define("variableName2", 1);

    configSpec = builder.build();

  }
}
