package net.lukas.betterpotatoes.item;

import net.lukas.betterpotatoes.BetterPotatoes;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterPotatoes.MOD_ID);

    public static final RegistryObject<Item> SPEED_POTATO = ITEMS.register("speed_potato",
            () -> new Item(new Item.Properties().food(ModFoods.SPEED_POTATO)));

    public static final RegistryObject<Item> GOLDEN_POTATO = ITEMS.register("golden_potato",
            () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_POTATO)));

    public static final RegistryObject<Item> STRENGTH_POTATO = ITEMS.register("strength_potato",
            () -> new Item(new Item.Properties().food(ModFoods.STRENGTH_POTATO)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}