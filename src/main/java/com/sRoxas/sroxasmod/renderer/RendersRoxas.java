package com.sRoxas.sroxasmod.renderer;

import com.sRoxas.sroxasmod.entity.EntitysRoxas;
import com.sRoxas.sroxasmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RendersRoxas extends RenderLiving
{
    private static final ResourceLocation sRoxasTextures = new ResourceLocation(Reference.MOD_ID + ":models/sRoxas.png");
    private static final String __OBFID = "CL_00000984";

    public RendersRoxas(ModelBase p_i1253_1_, float p_i1253_2_)
    {
        super(p_i1253_1_, p_i1253_2_);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntitysRoxas p_110775_1_)
    {
        return sRoxasTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntitysRoxas)p_110775_1_);
    }
}