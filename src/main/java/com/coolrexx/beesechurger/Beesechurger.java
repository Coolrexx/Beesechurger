package com.coolrexx.beesechurger;

import com.coolrexx.beesechurger.common.registry.BeesechurgerItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Beesechurger.MOD_ID)
public class Beesechurger {
    public static final String MOD_ID = "beesechurger";

    public Beesechurger(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BeesechurgerItems.ITEMS.register(bus);
    }
}
