package com.soundoflight.lumium;

import com.soundoflight.items.itemenderingot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Soundoflight on 16.12.2015.
 */

@Mod(modid= lumium.MODID, version = lumium.VERSION)
public class lumium {
    public static final String MODID = "lumium";
    public static final String VERSION = "1.0";
    public static Item enderingot =  new itemenderingot();

            @Mod.EventHandler
            public void preInit (FMLPreInitializationEvent event) {
                System.out.println("Lumium init started. Load Crafting");
                ItemStack stacksnow = new ItemStack(Blocks.snow);
                ItemStack stackIron = new ItemStack(Blocks.iron_block);
                GameRegistry.addShapelessRecipe(stackIron, stacksnow);

            }
            @Mod.EventHandler
            public void init (FMLInitializationEvent event ) {
                System.out.println("Loading Items");

                GameRegistry.registerItem(enderingot, "enderingot");
                Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(enderingot, 0, new ModelResourceLocation("lumium" + ":enderingot", "inventory"));

            }
            @Mod.EventHandler
            public void postinit (FMLPostInitializationEvent event ) {
                System.out.println("Lumium init done");

            }




}
