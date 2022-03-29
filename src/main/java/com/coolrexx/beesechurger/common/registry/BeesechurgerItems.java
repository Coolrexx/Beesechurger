package com.coolrexx.beesechurger.common.registry;

import com.coolrexx.beesechurger.Beesechurger;
import net.minecraft.client.Minecraft;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BeesechurgerItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Beesechurger.MOD_ID);

    public static final RegistryObject<Item> BEESECHURGER = ITEMS.register("beesechurger", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(16).food(BeesechurgerFoods.BEESECHURGER)));
}
