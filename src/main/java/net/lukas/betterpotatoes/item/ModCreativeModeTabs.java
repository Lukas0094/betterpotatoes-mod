package net.lukas.betterpotatoes.item;

import net.lukas.betterpotatoes.BetterPotatoes;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BetterPotatoes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab BETTERPOTATOES_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        BETTERPOTATOES_TAB = event.registerCreativeModeTab(new ResourceLocation(BetterPotatoes.MOD_ID, "betterpotatoes_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.SPEED_POTATO.get()))
                        .title(Component.translatable("creativemodetab.betterpotatoes_tab")));
    }
}
