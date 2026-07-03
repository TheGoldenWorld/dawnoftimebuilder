package org.dawnoftime.dawnoftime.client.gui;

import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.SmeltingRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import org.dawnoftime.dawnoftime.menu.StoneOvenMenu;

public class StoneOvenScreen extends AbstractFurnaceScreen<StoneOvenMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/gui/container/furnace.png");

    public StoneOvenScreen(StoneOvenMenu menu, Inventory inventory, Component title) {
        super(menu, new SmeltingRecipeBookComponent(), inventory, title, TEXTURE);
    }
}
