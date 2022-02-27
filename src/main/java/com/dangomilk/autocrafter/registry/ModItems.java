package com.dangomilk.autocrafter.registry;

import com.dangomilk.autocrafter.Autocrafter;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

  public static final FoodComponent DANGO_MILK_COMPONENT = new FoodComponent.Builder().alwaysEdible()
      .hunger(6).snack()
      .saturationModifier(2.4f)
      .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 3), 1.0f)
      .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200, 1000), 1.0f)
      .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 1000), 1.0f)
      .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 20), 1.0f)
      .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200, 1000), 1.0f)
      .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 3), 1.0f)
      .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1200, 20), 1.0f)
      .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1200, 10), 1.0f)
      .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 1000), 1.0f)
      .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 1000), 1.0f)
      .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200, 20), 1.0f).build();

  public static final Item DANGO_MILK = new DangoMilk(
      new Item.Settings().group(ItemGroup.FOOD).food(DANGO_MILK_COMPONENT));

  public static void registerItems() {
    Registry.register(Registry.ITEM, new Identifier(Autocrafter.MOD_ID, "dango_milk"), DANGO_MILK);
  }


}
