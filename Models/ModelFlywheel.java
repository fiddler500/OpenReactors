/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 01/09/2014 9:56:56 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ReactorCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelFlywheel extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape3;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape2b;
	LODModelPart Shape2c;
	LODModelPart Shape2d;
	LODModelPart Shape2e;
	LODModelPart Shape2f;
	LODModelPart Shape2g;
	LODModelPart Shape2h;
	LODModelPart Shape2i;
	LODModelPart Shape2j;
	LODModelPart Shape2k;
	LODModelPart Shape2l;
	LODModelPart Shape2m;
	LODModelPart Shape2n;
	LODModelPart Shape2o;
	LODModelPart Shape2p;
	LODModelPart Shape3a;
	LODModelPart Shape3b;
	LODModelPart Shape3c;
	LODModelPart Shape3d;
	LODModelPart Shape3e;
	LODModelPart Shape3f;
	LODModelPart Shape3g;
	LODModelPart Shape3h;
	LODModelPart Shape3i;
	LODModelPart Shape3j;
	LODModelPart Shape3k;
	LODModelPart Shape3l;
	LODModelPart Shape3m;
	LODModelPart Shape3n;
	LODModelPart Shape3o;
	LODModelPart Shape3p;
	LODModelPart Shape4;
	LODModelPart Shape4a;
	LODModelPart Shape4b;
	LODModelPart Shape4c;
	LODModelPart Shape4d;
	LODModelPart Shape4e;
	LODModelPart Shape4f;
	LODModelPart Shape4g;
	LODModelPart Shape4h;
	LODModelPart Shape4i;
	LODModelPart Shape4j;
	LODModelPart Shape4k;
	LODModelPart Shape4l;
	LODModelPart Shape4m;
	LODModelPart Shape4n;
	LODModelPart Shape4o;
	LODModelPart Shape4p;

	public ModelFlywheel()
	{
		textureWidth = 256;
		textureHeight = 256;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(-2F, -2F, -8.5F, 4, 4, 17);
		Shape1.setRotationPoint(0F, 15F, 0F);
		Shape1.setTextureSize(256, 256);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0.7853982F);
		Shape1a = new LODModelPart(this, 0, 0);
		Shape1a.addBox(-2F, -2F, -8.5F, 4, 4, 17);
		Shape1a.setRotationPoint(0F, 15F, 0F);
		Shape1a.setTextureSize(256, 256);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 120, 100);
		Shape3.addBox(-15F, 24F, -7F, 30, 6, 10);
		Shape3.setRotationPoint(0F, 15F, 2F);
		Shape3.setTextureSize(256, 256);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 96, 49);
		Shape2.addBox(-10F, 16F, -7F, 20, 4, 14);
		Shape2.setRotationPoint(0F, 15F, 0F);
		Shape2.setTextureSize(256, 256);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 166, 22);
		Shape2a.addBox(16F, -10F, -7F, 4, 20, 14);
		Shape2a.setRotationPoint(0F, 15F, 0F);
		Shape2a.setTextureSize(256, 256);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new LODModelPart(this, 96, 22);
		Shape2b.addBox(10F, 16F, -7F, 4, 2, 14);
		Shape2b.setRotationPoint(0F, 15F, 0F);
		Shape2b.setTextureSize(256, 256);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape2c = new LODModelPart(this, 166, 22);
		Shape2c.addBox(-20F, -10F, -7F, 4, 20, 14);
		Shape2c.setRotationPoint(0F, 15F, 0F);
		Shape2c.setTextureSize(256, 256);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 0F);
		Shape2d = new LODModelPart(this, 96, 22);
		Shape2d.addBox(-6F, 20F, -7F, 12, 2, 14);
		Shape2d.setRotationPoint(0F, 15F, 0F);
		Shape2d.setTextureSize(256, 256);
		Shape2d.mirror = true;
		this.setRotation(Shape2d, 0F, 0F, 0F);
		Shape2e = new LODModelPart(this, 96, 22);
		Shape2e.addBox(-14F, 16F, -7F, 4, 2, 14);
		Shape2e.setRotationPoint(0F, 15F, 0F);
		Shape2e.setTextureSize(256, 256);
		Shape2e.mirror = true;
		this.setRotation(Shape2e, 0F, 0F, 0F);
		Shape2f = new LODModelPart(this, 96, 22);
		Shape2f.addBox(16F, -14F, -7F, 2, 4, 14);
		Shape2f.setRotationPoint(0F, 15F, 0F);
		Shape2f.setTextureSize(256, 256);
		Shape2f.mirror = true;
		this.setRotation(Shape2f, 0F, 0F, 0F);
		Shape2g = new LODModelPart(this, 96, 22);
		Shape2g.addBox(10F, -18F, -7F, 4, 2, 14);
		Shape2g.setRotationPoint(0F, 15F, 0F);
		Shape2g.setTextureSize(256, 256);
		Shape2g.mirror = true;
		this.setRotation(Shape2g, 0F, 0F, 0F);
		Shape2h = new LODModelPart(this, 96, 22);
		Shape2h.addBox(-14F, -18F, -7F, 4, 2, 14);
		Shape2h.setRotationPoint(0F, 15F, 0F);
		Shape2h.setTextureSize(256, 256);
		Shape2h.mirror = true;
		this.setRotation(Shape2h, 0F, 0F, 0F);
		Shape2i = new LODModelPart(this, 96, 22);
		Shape2i.addBox(16F, 10F, -7F, 2, 4, 14);
		Shape2i.setRotationPoint(0F, 15F, 0F);
		Shape2i.setTextureSize(256, 256);
		Shape2i.mirror = true;
		this.setRotation(Shape2i, 0F, 0F, 0F);
		Shape2j = new LODModelPart(this, 96, 22);
		Shape2j.addBox(-18F, -14F, -7F, 2, 4, 14);
		Shape2j.setRotationPoint(0F, 15F, 0F);
		Shape2j.setTextureSize(256, 256);
		Shape2j.mirror = true;
		this.setRotation(Shape2j, 0F, 0F, 0F);
		Shape2k = new LODModelPart(this, 96, 22);
		Shape2k.addBox(-18F, 10F, -7F, 2, 4, 14);
		Shape2k.setRotationPoint(0F, 15F, 0F);
		Shape2k.setTextureSize(256, 256);
		Shape2k.mirror = true;
		this.setRotation(Shape2k, 0F, 0F, 0F);
		Shape2l = new LODModelPart(this, 96, 49);
		Shape2l.addBox(-10F, -20F, -7F, 20, 4, 14);
		Shape2l.setRotationPoint(0F, 15F, 0F);
		Shape2l.setTextureSize(256, 256);
		Shape2l.mirror = true;
		this.setRotation(Shape2l, 0F, 0F, 0F);
		Shape2m = new LODModelPart(this, 96, 22);
		Shape2m.addBox(20F, -6F, -7F, 2, 12, 14);
		Shape2m.setRotationPoint(0F, 15F, 0F);
		Shape2m.setTextureSize(256, 256);
		Shape2m.mirror = true;
		this.setRotation(Shape2m, 0F, 0F, 0F);
		Shape2n = new LODModelPart(this, 96, 22);
		Shape2n.addBox(-6F, -22F, -7F, 12, 2, 14);
		Shape2n.setRotationPoint(0F, 15F, 0F);
		Shape2n.setTextureSize(256, 256);
		Shape2n.mirror = true;
		this.setRotation(Shape2n, 0F, 0F, 0F);
		Shape2o = new LODModelPart(this, 96, 22);
		Shape2o.addBox(-22F, -6F, -7F, 2, 12, 14);
		Shape2o.setRotationPoint(0F, 15F, 0F);
		Shape2o.setTextureSize(256, 256);
		Shape2o.mirror = true;
		this.setRotation(Shape2o, 0F, 0F, 0F);
		Shape2p = new LODModelPart(this, 0, 22);
		Shape2p.addBox(-16F, -16F, -7F, 32, 32, 14);
		Shape2p.setRotationPoint(0F, 15F, 0F);
		Shape2p.setTextureSize(256, 256);
		Shape2p.mirror = true;
		this.setRotation(Shape2p, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 203, 70);
		Shape3a.addBox(24F, -15F, -7F, 6, 30, 10);
		Shape3a.setRotationPoint(0F, 15F, 2F);
		Shape3a.setTextureSize(256, 256);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape3b = new LODModelPart(this, 120, 70);
		Shape3b.addBox(15F, 24F, -7F, 6, 3, 10);
		Shape3b.setRotationPoint(0F, 15F, 2F);
		Shape3b.setTextureSize(256, 256);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, 0F);
		Shape3c = new LODModelPart(this, 203, 70);
		Shape3c.addBox(-30F, -15F, -7F, 6, 30, 10);
		Shape3c.setRotationPoint(0F, 15F, 2F);
		Shape3c.setTextureSize(256, 256);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 0F, 0F);
		Shape3d = new LODModelPart(this, 120, 70);
		Shape3d.addBox(-9F, 30F, -7F, 18, 3, 10);
		Shape3d.setRotationPoint(0F, 15F, 2F);
		Shape3d.setTextureSize(256, 256);
		Shape3d.mirror = true;
		this.setRotation(Shape3d, 0F, 0F, 0F);
		Shape3e = new LODModelPart(this, 120, 70);
		Shape3e.addBox(-21F, 24F, -7F, 6, 3, 10);
		Shape3e.setRotationPoint(0F, 15F, 2F);
		Shape3e.setTextureSize(256, 256);
		Shape3e.mirror = true;
		this.setRotation(Shape3e, 0F, 0F, 0F);
		Shape3f = new LODModelPart(this, 120, 70);
		Shape3f.addBox(24F, 15F, -7F, 3, 6, 10);
		Shape3f.setRotationPoint(0F, 15F, 2F);
		Shape3f.setTextureSize(256, 256);
		Shape3f.mirror = true;
		this.setRotation(Shape3f, 0F, 0F, 0F);
		Shape3g = new LODModelPart(this, 120, 70);
		Shape3g.addBox(15F, -27F, -7F, 6, 3, 10);
		Shape3g.setRotationPoint(0F, 15F, 2F);
		Shape3g.setTextureSize(256, 256);
		Shape3g.mirror = true;
		this.setRotation(Shape3g, 0F, 0F, 0F);
		Shape3h = new LODModelPart(this, 120, 70);
		Shape3h.addBox(-21F, -27F, -7F, 6, 3, 10);
		Shape3h.setRotationPoint(0F, 15F, 2F);
		Shape3h.setTextureSize(256, 256);
		Shape3h.mirror = true;
		this.setRotation(Shape3h, 0F, 0F, 0F);
		Shape3i = new LODModelPart(this, 120, 70);
		Shape3i.addBox(-27F, 15F, -7F, 3, 6, 10);
		Shape3i.setRotationPoint(0F, 15F, 2F);
		Shape3i.setTextureSize(256, 256);
		Shape3i.mirror = true;
		this.setRotation(Shape3i, 0F, 0F, 0F);
		Shape3j = new LODModelPart(this, 120, 70);
		Shape3j.addBox(24F, -21F, -7F, 3, 6, 10);
		Shape3j.setRotationPoint(0F, 15F, 2F);
		Shape3j.setTextureSize(256, 256);
		Shape3j.mirror = true;
		this.setRotation(Shape3j, 0F, 0F, 0F);
		Shape3k = new LODModelPart(this, 120, 70);
		Shape3k.addBox(-27F, -21F, -7F, 3, 6, 10);
		Shape3k.setRotationPoint(0F, 15F, 2F);
		Shape3k.setTextureSize(256, 256);
		Shape3k.mirror = true;
		this.setRotation(Shape3k, 0F, 0F, 0F);
		Shape3l = new LODModelPart(this, 120, 100);
		Shape3l.addBox(-15F, -30F, -7F, 30, 6, 10);
		Shape3l.setRotationPoint(0F, 15F, 2F);
		Shape3l.setTextureSize(256, 256);
		Shape3l.mirror = true;
		this.setRotation(Shape3l, 0F, 0F, 0F);
		Shape3m = new LODModelPart(this, 120, 70);
		Shape3m.addBox(30F, -9F, -7F, 3, 18, 10);
		Shape3m.setRotationPoint(0F, 15F, 2F);
		Shape3m.setTextureSize(256, 256);
		Shape3m.mirror = true;
		this.setRotation(Shape3m, 0F, 0F, 0F);
		Shape3n = new LODModelPart(this, 120, 70);
		Shape3n.addBox(-9F, -33F, -7F, 18, 3, 10);
		Shape3n.setRotationPoint(0F, 15F, 2F);
		Shape3n.setTextureSize(256, 256);
		Shape3n.mirror = true;
		this.setRotation(Shape3n, 0F, 0F, 0F);
		Shape3o = new LODModelPart(this, 120, 70);
		Shape3o.addBox(-33F, -9F, -7F, 3, 18, 10);
		Shape3o.setRotationPoint(0F, 15F, 2F);
		Shape3o.setTextureSize(256, 256);
		Shape3o.mirror = true;
		this.setRotation(Shape3o, 0F, 0F, 0F);
		Shape3p = new LODModelPart(this, 0, 70);
		Shape3p.addBox(-24F, -24F, -7F, 48, 48, 10);
		Shape3p.setRotationPoint(0F, 15F, 2F);
		Shape3p.setTextureSize(256, 256);
		Shape3p.mirror = true;
		this.setRotation(Shape3p, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 0, 211);
		Shape4.addBox(-22F, 36F, -7F, 44, 9, 6);
		Shape4.setRotationPoint(0F, 15F, 4F);
		Shape4.setTextureSize(256, 256);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new LODModelPart(this, 0, 131);
		Shape4a.addBox(-36F, -36F, -7F, 72, 72, 6);
		Shape4a.setRotationPoint(0F, 15F, 4F);
		Shape4a.setTextureSize(256, 256);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape4b = new LODModelPart(this, 160, 167);
		Shape4b.addBox(36F, -22F, -7F, 9, 44, 6);
		Shape4b.setRotationPoint(0F, 15F, 4F);
		Shape4b.setTextureSize(256, 256);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0F);
		Shape4c = new LODModelPart(this, 160, 131);
		Shape4c.addBox(22F, 36F, -7F, 9, 5, 6);
		Shape4c.setRotationPoint(0F, 15F, 4F);
		Shape4c.setTextureSize(256, 256);
		Shape4c.mirror = true;
		this.setRotation(Shape4c, 0F, 0F, 0F);
		Shape4d = new LODModelPart(this, 160, 167);
		Shape4d.addBox(-45F, -22F, -7F, 9, 44, 6);
		Shape4d.setRotationPoint(0F, 15F, 4F);
		Shape4d.setTextureSize(256, 256);
		Shape4d.mirror = true;
		this.setRotation(Shape4d, 0F, 0F, 0F);
		Shape4e = new LODModelPart(this, 160, 131);
		Shape4e.addBox(-14F, 45F, -3F, 28, 3, 6);
		Shape4e.setRotationPoint(0F, 15F, 0F);
		Shape4e.setTextureSize(256, 256);
		Shape4e.mirror = true;
		this.setRotation(Shape4e, 0F, 0F, 0F);
		Shape4f = new LODModelPart(this, 160, 131);
		Shape4f.addBox(-31F, 36F, -7F, 9, 5, 6);
		Shape4f.setRotationPoint(0F, 15F, 4F);
		Shape4f.setTextureSize(256, 256);
		Shape4f.mirror = true;
		this.setRotation(Shape4f, 0F, 0F, 0F);
		Shape4g = new LODModelPart(this, 160, 131);
		Shape4g.addBox(22F, -41F, -7F, 9, 5, 6);
		Shape4g.setRotationPoint(0F, 15F, 4F);
		Shape4g.setTextureSize(256, 256);
		Shape4g.mirror = true;
		this.setRotation(Shape4g, 0F, 0F, 0F);
		Shape4h = new LODModelPart(this, 160, 131);
		Shape4h.addBox(36F, -31F, -7F, 5, 9, 6);
		Shape4h.setRotationPoint(0F, 15F, 4F);
		Shape4h.setTextureSize(256, 256);
		Shape4h.mirror = true;
		this.setRotation(Shape4h, 0F, 0F, 0F);
		Shape4i = new LODModelPart(this, 160, 131);
		Shape4i.addBox(-31F, -41F, -7F, 9, 5, 6);
		Shape4i.setRotationPoint(0F, 15F, 4F);
		Shape4i.setTextureSize(256, 256);
		Shape4i.mirror = true;
		this.setRotation(Shape4i, 0F, 0F, 0F);
		Shape4j = new LODModelPart(this, 160, 131);
		Shape4j.addBox(36F, 22F, -7F, 5, 9, 6);
		Shape4j.setRotationPoint(0F, 15F, 4F);
		Shape4j.setTextureSize(256, 256);
		Shape4j.mirror = true;
		this.setRotation(Shape4j, 0F, 0F, 0F);
		Shape4k = new LODModelPart(this, 160, 131);
		Shape4k.addBox(-41F, -31F, -7F, 5, 9, 6);
		Shape4k.setRotationPoint(0F, 15F, 4F);
		Shape4k.setTextureSize(256, 256);
		Shape4k.mirror = true;
		this.setRotation(Shape4k, 0F, 0F, 0F);
		Shape4l = new LODModelPart(this, 160, 131);
		Shape4l.addBox(-41F, 22F, -7F, 5, 9, 6);
		Shape4l.setRotationPoint(0F, 15F, 4F);
		Shape4l.setTextureSize(256, 256);
		Shape4l.mirror = true;
		this.setRotation(Shape4l, 0F, 0F, 0F);
		Shape4m = new LODModelPart(this, 0, 211);
		Shape4m.addBox(-22F, -45F, -7F, 44, 9, 6);
		Shape4m.setRotationPoint(0F, 15F, 4F);
		Shape4m.setTextureSize(256, 256);
		Shape4m.mirror = true;
		this.setRotation(Shape4m, 0F, 0F, 0F);
		Shape4n = new LODModelPart(this, 160, 131);
		Shape4n.addBox(45F, -14F, -3F, 3, 28, 6);
		Shape4n.setRotationPoint(0F, 15F, 0F);
		Shape4n.setTextureSize(256, 256);
		Shape4n.mirror = true;
		this.setRotation(Shape4n, 0F, 0F, 0F);
		Shape4o = new LODModelPart(this, 160, 131);
		Shape4o.addBox(-14F, -48F, -3F, 28, 3, 6);
		Shape4o.setRotationPoint(0F, 15F, 0F);
		Shape4o.setTextureSize(256, 256);
		Shape4o.mirror = true;
		this.setRotation(Shape4o, 0F, 0F, 0F);
		Shape4p = new LODModelPart(this, 160, 131);
		Shape4p.addBox(-48F, -14F, -3F, 3, 28, 6);
		Shape4p.setRotationPoint(0F, 15F, 0F);
		Shape4p.setTextureSize(256, 256);
		Shape4p.mirror = true;
		this.setRotation(Shape4p, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		GL11.glPushMatrix();
		double d = 0.9375;
		GL11.glTranslated(0, d, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -d, 0);
		double dx = -0.0625;
		GL11.glTranslated(0, 0, dx);
		double s = 1.25;
		GL11.glScaled(1, 1, s);
		Shape1.render(te, f5);
		Shape1a.render(te, f5);

		GL11.glPushMatrix();
		double sc = 2;
		double dz = 0.25;
		GL11.glTranslated(0, -d, dz);
		GL11.glScaled(sc, sc, 0.35);
		this.renderCenter(te);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		sc = 2;
		dz = -0.25;
		GL11.glTranslated(0, -d, dz);
		GL11.glScaled(sc, sc, 0.35);
		this.renderCenter(te);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		sc = 1.75;
		GL11.glTranslated(0, -0.6875, 0);
		GL11.glScaled(sc, sc, 0.35);
		this.renderCenter(te);
		GL11.glPopMatrix();
		/*
		GL11.glPushMatrix();
		double sc = 1.25;
		GL11.glTranslated(0, -0.25, 0);
		GL11.glScaled(sc, sc, 0.8);
		this.renderCenter(te);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		sc = 1.5;
		GL11.glTranslated(0, -0.5, 0);
		GL11.glScaled(sc, sc, 0.6);
		this.renderCenter(te);
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		sc = 2;
		GL11.glTranslated(0, -d, 0);
		GL11.glScaled(sc, sc, 0.4);
		this.renderCenter(te);
		GL11.glPopMatrix();*/

		/*
		Shape3.render(te, f5);
		Shape3a.render(te, f5);
		Shape3b.render(te, f5);
		Shape3c.render(te, f5);
		Shape3d.render(te, f5);
		Shape3e.render(te, f5);
		Shape3f.render(te, f5);
		Shape3g.render(te, f5);
		Shape3h.render(te, f5);
		Shape3i.render(te, f5);
		Shape3j.render(te, f5);
		Shape3k.render(te, f5);
		Shape3l.render(te, f5);
		Shape3m.render(te, f5);
		Shape3n.render(te, f5);
		Shape3o.render(te, f5);
		Shape3p.render(te, f5);
		Shape4.render(te, f5);
		Shape4a.render(te, f5);
		Shape4b.render(te, f5);
		Shape4c.render(te, f5);
		Shape4d.render(te, f5);
		Shape4e.render(te, f5);
		Shape4f.render(te, f5);
		Shape4g.render(te, f5);
		Shape4h.render(te, f5);
		Shape4i.render(te, f5);
		Shape4j.render(te, f5);
		Shape4k.render(te, f5);
		Shape4l.render(te, f5);
		Shape4m.render(te, f5);
		Shape4n.render(te, f5);
		Shape4o.render(te, f5);
		Shape4p.render(te, f5);
		 */
		GL11.glPopMatrix();
	}

	private void renderCenter(TileEntity te) {
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape2b.render(te, f5);
		Shape2c.render(te, f5);
		Shape2d.render(te, f5);
		Shape2e.render(te, f5);
		Shape2f.render(te, f5);
		Shape2g.render(te, f5);
		Shape2h.render(te, f5);
		Shape2i.render(te, f5);
		Shape2j.render(te, f5);
		Shape2k.render(te, f5);
		Shape2l.render(te, f5);
		Shape2m.render(te, f5);
		Shape2n.render(te, f5);
		Shape2o.render(te, f5);
		Shape2p.render(te, f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
