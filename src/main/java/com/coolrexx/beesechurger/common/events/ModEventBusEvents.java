package com.coolrexx.beesechurger.common.events;

import com.coolrexx.beesechurger.Beesechurger;
import com.coolrexx.beesechurger.common.events.loot.BeesechurgerLootModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Beesechurger.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(
                new BeesechurgerLootModifier.Serializer().setRegistryName
                        (new ResourceLocation(Beesechurger.MOD_ID,"beesechurger_desert_pyramid"))
        );
    }
}