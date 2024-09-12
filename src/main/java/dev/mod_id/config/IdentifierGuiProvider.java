package dev.mod_id.config;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import me.shedaniel.autoconfig.gui.registry.api.GuiProvider;
import me.shedaniel.autoconfig.gui.registry.api.GuiRegistryAccess;
import me.shedaniel.autoconfig.util.Utils;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class IdentifierGuiProvider implements GuiProvider {

  @SuppressWarnings("rawtypes")
  @Override
  public List<AbstractConfigListEntry> get(String i13n, Field field, Object config, Object defaults, GuiRegistryAccess registry) {
    return Collections.singletonList(ConfigEntryBuilder
        .create()
        .startStrField(Text.translatable(i13n), Utils.<Identifier>getUnsafely(field, config).toString())
        .setDefaultValue(() -> Utils.<Identifier>getUnsafely(field, defaults).toString())
        .setSaveConsumer(newValue -> Utils.setUnsafely(field, config, Identifier.of(newValue)))
        .build());
  }
}
