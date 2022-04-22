package com.coolrexx.beesechurger.common.registry;

import com.coolrexx.beesechurger.Beesechurger;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BeesechurgerItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Beesechurger.MOD_ID);

    public static final RegistryObject<Item> BEESECHURGER = ITEMS.register("beesechurger", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(16).food(new FoodProperties.Builder().nutrition(8).saturationMod(10.2F).effect(new MobEffectInstance(BeesechurgerEffects.BEESECHURGERS_BLESSING.get(), 6000, 0), 1.0F).alwaysEat().build())));
}
