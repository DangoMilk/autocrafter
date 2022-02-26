package com.dangomilk.autocrafter.registry;

import com.dangomilk.autocrafter.Autocrafter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

  public static final Item DANGO_MILK = new Item(new Item.Settings().group(ItemGroup.FOOD));

  public static void registerItems() {
    Registry.register(Registry.ITEM, new Identifier(Autocrafter.MOD_ID, "dango_milk"), DANGO_MILK);
  }
}
