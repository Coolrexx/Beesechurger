package com.coolrexx.beesechurger.common.registry;

import com.coolrexx.beesechurger.Beesechurger;
import com.coolrexx.beesechurger.common.effects.BeesechurgersBlessing;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BeesechurgerEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Beesechurger.MOD_ID);

    public static final RegistryObject<MobEffect> BEESECHURGERS_BLESSING = MOB_EFFECTS.register("beesechurgers_blessing", () -> new BeesechurgersBlessing(MobEffectCategory.BENEFICIAL, 13458603));
//.addAttributeModifier(Attributes.MAX_HEALTH, 4.0D, AttributeModifier.Operation.ADDITION)
}
