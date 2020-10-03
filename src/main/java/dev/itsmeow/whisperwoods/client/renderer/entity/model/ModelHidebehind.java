package dev.itsmeow.whisperwoods.client.renderer.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import dev.itsmeow.whisperwoods.entity.EntityHidebehind;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.vector.Vector3d;

/**
 * hidebehind - cybercat5555 Created using Tabula 7.0.1
 */
public class ModelHidebehind extends EntityModel<EntityHidebehind> {
    public ModelRenderer chest;
    public ModelRenderer stomach;
    public ModelRenderer neck00;
    public ModelRenderer lArm01;
    public ModelRenderer rArm01;
    public ModelRenderer chestFur;
    public ModelRenderer chestFurLower;
    public ModelRenderer hips;
    public ModelRenderer lLeg01;
    public ModelRenderer rLeg01;
    public ModelRenderer tail00;
    public ModelRenderer crothFur;
    public ModelRenderer lLeg02;
    public ModelRenderer lLeg01Fur;
    public ModelRenderer lLeg03;
    public ModelRenderer lLeg02Fur;
    public ModelRenderer lLeg02FurMid;
    public ModelRenderer lPaw;
    public ModelRenderer lToe00;
    public ModelRenderer lToe01;
    public ModelRenderer lToe02;
    public ModelRenderer rLeg02;
    public ModelRenderer rLeg01Fur;
    public ModelRenderer rLeg03;
    public ModelRenderer rLeg02Fur;
    public ModelRenderer rLeg02FurMid;
    public ModelRenderer rPaw;
    public ModelRenderer rToe00;
    public ModelRenderer rToe01;
    public ModelRenderer rToe02;
    public ModelRenderer tail01;
    public ModelRenderer neck01;
    public ModelRenderer head;
    public ModelRenderer lowerJawOpen;
    public ModelRenderer lowerJawClosed;
    public ModelRenderer lEar;
    public ModelRenderer rEar;
    public ModelRenderer lArm02;
    public ModelRenderer lClaw00;
    public ModelRenderer lClaw01;
    public ModelRenderer lClaw02;
    public ModelRenderer lArmFur;
    public ModelRenderer rArm02;
    public ModelRenderer rClaw00;
    public ModelRenderer rClaw01;
    public ModelRenderer rClaw02;
    public ModelRenderer rArmFur;
    private double yTranslate = 0D;
    private float alpha = 1F;

    public ModelHidebehind() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.rArmFur = new ModelRenderer(this, 78, 75);
        this.rArmFur.setRotationPoint(0.0F, 8.2F, -1.2F);
        this.rArmFur.addBox(-2.01F, -7.5F, 0.5F, 4, 15, 7, 0.0F);
        this.setRotateAngle(rArmFur, -0.3490658503988659F, 0.0F, 0.0F);
        this.rArm01 = new ModelRenderer(this, 90, 0);
        this.rArm01.mirror = true;
        this.rArm01.setRotationPoint(-7.5F, -9.4F, 0.5F);
        this.rArm01.addBox(-2.0F, -1.5F, -2.5F, 4, 17, 4, 0.0F);
        this.setRotateAngle(rArm01, -0.08726646259971647F, 0.0F, 0.12217304763960307F);
        this.rToe00 = new ModelRenderer(this, 0, 116);
        this.rToe00.mirror = true;
        this.rToe00.setRotationPoint(-1.4F, 0.0F, -2.5F);
        this.rToe00.addBox(-0.5F, -0.9F, -4.5F, 1, 3, 5, 0.0F);
        this.setRotateAngle(rToe00, 0.17453292519943295F, 0.13962634015954636F, 0.0F);
        this.lClaw02 = new ModelRenderer(this, 0, 0);
        this.lClaw02.setRotationPoint(0.6F, 19.8F, 1.5F);
        this.lClaw02.addBox(-1.1F, -1.5F, -0.5F, 3, 7, 1, 0.0F);
        this.setRotateAngle(lClaw02, 0.10471975511965977F, 0.0F, 0.22689280275926282F);
        this.chestFur = new ModelRenderer(this, 81, 42);
        this.chestFur.setRotationPoint(0.0F, -7.8F, -0.4F);
        this.chestFur.addBox(-7.0F, 0.0F, -4.5F, 14, 18, 9, 0.0F);
        this.setRotateAngle(chestFur, -0.45378560551852565F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 41, 15);
        this.head.setRotationPoint(0.0F, -6.4F, -0.1F);
        this.head.addBox(-5.5F, -6.5F, -7.1F, 11, 16, 10, 0.0F);
        this.setRotateAngle(head, -0.41887902047863906F, 0.0F, 0.0F);
        this.rClaw01 = new ModelRenderer(this, 0, 0);
        this.rClaw01.mirror = true;
        this.rClaw01.setRotationPoint(-0.6F, 19.8F, 0.0F);
        this.rClaw01.addBox(-1.8F, -1.5F, -0.5F, 3, 7, 1, 0.0F);
        this.setRotateAngle(rClaw01, 0.0F, 0.0F, -0.22689280275926282F);
        this.rLeg03 = new ModelRenderer(this, 0, 94);
        this.rLeg03.mirror = true;
        this.rLeg03.setRotationPoint(0.0F, -0.3F, 14.3F);
        this.rLeg03.addBox(-2.0F, -0.9F, -1.5F, 4, 9, 3, 0.0F);
        this.setRotateAngle(rLeg03, 0.6981317007977318F, 0.0F, 0.0F);
        this.lArm01 = new ModelRenderer(this, 90, 0);
        this.lArm01.setRotationPoint(7.5F, -9.4F, 0.5F);
        this.lArm01.addBox(-2.0F, -1.5F, -2.5F, 4, 18, 4, 0.0F);
        this.setRotateAngle(lArm01, -0.08726646259971647F, 0.0F, -0.12217304763960307F);
        this.lArmFur = new ModelRenderer(this, 78, 75);
        this.lArmFur.setRotationPoint(0.0F, 8.2F, -1.2F);
        this.lArmFur.addBox(-1.9F, -7.5F, 0.5F, 4, 15, 7, 0.0F);
        this.setRotateAngle(lArmFur, -0.3490658503988659F, 0.0F, 0.0F);
        this.rLeg01 = new ModelRenderer(this, 0, 62);
        this.rLeg01.mirror = true;
        this.rLeg01.setRotationPoint(-5.5F, 2.0F, -0.4F);
        this.rLeg01.addBox(-2.5F, -1.5F, -2.5F, 5, 24, 7, 0.0F);
        this.setRotateAngle(rLeg01, -0.6108652381980153F, 0.13962634015954636F, 0.0F);
        this.lClaw00 = new ModelRenderer(this, 0, 0);
        this.lClaw00.setRotationPoint(0.6F, 19.8F, -1.5F);
        this.lClaw00.addBox(-1.1F, -1.5F, -0.5F, 3, 7, 1, 0.0F);
        this.setRotateAngle(lClaw00, -0.10471975511965977F, 0.0F, 0.22689280275926282F);
        this.lToe00 = new ModelRenderer(this, 0, 116);
        this.lToe00.setRotationPoint(1.4F, 0.0F, -2.5F);
        this.lToe00.addBox(-0.5F, -0.9F, -4.5F, 1, 3, 5, 0.0F);
        this.setRotateAngle(lToe00, 0.17453292519943295F, -0.13962634015954636F, 0.0F);
        this.lToe01 = new ModelRenderer(this, 0, 116);
        this.lToe01.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.lToe01.addBox(-0.5F, -0.9F, -4.5F, 1, 3, 5, 0.0F);
        this.setRotateAngle(lToe01, 0.17453292519943295F, 0.0F, 0.0F);
        this.lPaw = new ModelRenderer(this, 14, 116);
        this.lPaw.setRotationPoint(0.0F, 7.2F, 0.0F);
        this.lPaw.addBox(-2.5F, 0.0F, -3.5F, 5, 2, 5, 0.0F);
        this.setRotateAngle(lPaw, 0.22689280275926282F, 0.0F, 0.0F);
        this.rPaw = new ModelRenderer(this, 14, 116);
        this.rPaw.mirror = true;
        this.rPaw.setRotationPoint(0.0F, 7.2F, 0.0F);
        this.rPaw.addBox(-2.5F, 0.0F, -3.5F, 5, 2, 5, 0.0F);
        this.setRotateAngle(rPaw, 0.22689280275926282F, 0.0F, 0.0F);
        this.hips = new ModelRenderer(this, 0, 47);
        this.hips.setRotationPoint(0.0F, 14.9F, 0.0F);
        this.hips.addBox(-6.0F, 0.0F, -3.0F, 12, 6, 7, 0.0F);
        this.setRotateAngle(hips, -0.2617993877991494F, 0.0F, 0.0F);
        this.rLeg01Fur = new ModelRenderer(this, 44, 73);
        this.rLeg01Fur.mirror = true;
        this.rLeg01Fur.setRotationPoint(0.0F, 7.5F, -1.5F);
        this.rLeg01Fur.addBox(-2.51F, -9.0F, 0.0F, 5, 14, 10, 0.0F);
        this.setRotateAngle(rLeg01Fur, -0.7853981633974483F, 0.0F, 0.0F);
        this.neck00 = new ModelRenderer(this, 46, 0);
        this.neck00.setRotationPoint(0.0F, -8.8F, 0.8F);
        this.neck00.addBox(-4.0F, -8.0F, -3.5F, 8, 8, 7, 0.0F);
        this.setRotateAngle(neck00, 0.3141592653589793F, 0.0F, 0.0F);
        this.lLeg01 = new ModelRenderer(this, 0, 62);
        this.lLeg01.setRotationPoint(5.5F, 2.0F, -0.4F);
        this.lLeg01.addBox(-2.5F, -1.5F, -2.5F, 5, 24, 7, 0.0F);
        this.setRotateAngle(lLeg01, -0.6108652381980153F, -0.13962634015954636F, 0.0F);
        this.neck01 = new ModelRenderer(this, 46, 0);
        this.neck01.setRotationPoint(0.0F, -6.8F, 0.0F);
        this.neck01.addBox(-4.0F, -8.0F, -3.5F, 8, 8, 7, 0.0F);
        this.setRotateAngle(neck01, -0.3141592653589793F, 0.0F, 0.0F);
        this.rLeg02Fur = new ModelRenderer(this, 45, 98);
        this.rLeg02Fur.mirror = true;
        this.rLeg02Fur.setRotationPoint(0.0F, -0.7F, 1.9F);
        this.rLeg02Fur.addBox(-2.01F, 0.0F, -5.5F, 4, 8, 9, 0.0F);
        this.setRotateAngle(rLeg02Fur, 0.7853981633974483F, 0.0F, 0.0F);
        this.rLeg02 = new ModelRenderer(this, 0, 94);
        this.rLeg02.mirror = true;
        this.rLeg02.setRotationPoint(0.0F, 20.0F, 1.1F);
        this.rLeg02.addBox(-2.0F, -2.5F, 0.0F, 4, 5, 15, 0.0F);
        this.setRotateAngle(rLeg02, -0.3141592653589793F, 0.0F, 0.0F);
        this.chestFurLower = new ModelRenderer(this, 82, 42);
        this.chestFurLower.setRotationPoint(0.0F, 1.3F, 0.6F);
        this.chestFurLower.addBox(-6.0F, 0.0F, -4.5F, 12, 18, 9, 0.0F);
        this.setRotateAngle(chestFurLower, -0.45378560551852565F, 0.0F, 0.0F);
        this.rLeg02FurMid = new ModelRenderer(this, 74, 91);
        this.rLeg02FurMid.mirror = true;
        this.rLeg02FurMid.setRotationPoint(-0.0F, 0.6F, 3.4F);
        this.rLeg02FurMid.addBox(0.0F, 0.0F, -5.5F, 0, 8, 16, 0.0F);
        this.setRotateAngle(rLeg02FurMid, 0.3490658503988659F, 0.0F, 0.0F);
        this.rEar = new ModelRenderer(this, 75, 16);
        this.rEar.mirror = true;
        this.rEar.setRotationPoint(-4.2F, -5.3F, 0.0F);
        this.rEar.addBox(-5.0F, -2.0F, -1.5F, 5, 3, 2, 0.0F);
        this.setRotateAngle(rEar, 0.3490658503988659F, -0.3490658503988659F, 1.2217304763960306F);
        this.rClaw02 = new ModelRenderer(this, 0, 0);
        this.rClaw02.mirror = true;
        this.rClaw02.setRotationPoint(-0.6F, 19.8F, 1.5F);
        this.rClaw02.addBox(-1.8F, -1.5F, -0.5F, 3, 7, 1, 0.0F);
        this.setRotateAngle(rClaw02, 0.10471975511965977F, 0.0F, -0.22689280275926282F);
        this.chest = new ModelRenderer(this, 0, 0);
        this.chest.setRotationPoint(0.0F, -31.5F, 0.0F);
        this.chest.addBox(-7.0F, -10.0F, -4.5F, 14, 13, 9, 0.0F);
        this.setRotateAngle(chest, 0.45378560551852565F, 0.0F, 0.0F);
        this.lLeg02Fur = new ModelRenderer(this, 45, 98);
        this.lLeg02Fur.setRotationPoint(0.0F, -0.7F, 1.9F);
        this.lLeg02Fur.addBox(-1.99F, 0.0F, -5.5F, 4, 8, 9, 0.0F);
        this.setRotateAngle(lLeg02Fur, 0.7853981633974483F, 0.0F, 0.0F);
        this.rArm02 = new ModelRenderer(this, 90, 0);
        this.rArm02.mirror = true;
        this.rArm02.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.rArm02.addBox(-1.9F, 0.0F, -2.0F, 4, 20, 4, 0.0F);
        this.setRotateAngle(rArm02, -0.5235987755982988F, 0.0F, 0.0F);
        this.tail00 = new ModelRenderer(this, 25, 69);
        this.tail00.setRotationPoint(0.0F, 2.7F, 3.1F);
        this.tail00.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 3, 0.0F);
        this.setRotateAngle(tail00, 0.12217304763960307F, 0.0F, 0.0F);
        this.tail01 = new ModelRenderer(this, 25, 77);
        this.tail01.setRotationPoint(0.0F, 0.3F, 2.1F);
        this.tail01.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(tail01, 0.3141592653589793F, 0.0F, 0.0F);
        this.lEar = new ModelRenderer(this, 75, 16);
        this.lEar.setRotationPoint(4.2F, -5.3F, 0.0F);
        this.lEar.addBox(0.0F, -2.0F, -1.2F, 5, 3, 2, 0.0F);
        this.setRotateAngle(lEar, 0.3490658503988659F, 0.3490658503988659F, -1.2217304763960306F);
        this.stomach = new ModelRenderer(this, 0, 23);
        this.stomach.setRotationPoint(0.0F, 2.3F, 0.6F);
        this.stomach.addBox(-5.0F, 0.0F, -3.0F, 10, 16, 6, 0.0F);
        this.setRotateAngle(stomach, -0.18203784098300857F, 0.0F, 0.0F);
        this.lLeg01Fur = new ModelRenderer(this, 44, 71);
        this.lLeg01Fur.setRotationPoint(0.0F, 7.5F, -1.5F);
        this.lLeg01Fur.addBox(-2.49F, -9.0F, 0.0F, 5, 14, 10, 0.0F);
        this.setRotateAngle(lLeg01Fur, -0.7853981633974483F, 0.0F, 0.0F);
        this.lClaw01 = new ModelRenderer(this, 0, 0);
        this.lClaw01.setRotationPoint(0.6F, 19.8F, 0.0F);
        this.lClaw01.addBox(-1.1F, -1.5F, -0.5F, 3, 7, 1, 0.0F);
        this.setRotateAngle(lClaw01, 0.0F, 0.0F, 0.22689280275926282F);
        this.rToe02 = new ModelRenderer(this, 0, 116);
        this.rToe02.mirror = true;
        this.rToe02.setRotationPoint(1.4F, 0.0F, -2.5F);
        this.rToe02.addBox(-0.5F, -0.9F, -4.5F, 1, 3, 5, 0.0F);
        this.setRotateAngle(rToe02, 0.17453292519943295F, -0.13962634015954636F, 0.0F);
        this.lowerJawOpen = new ModelRenderer(this, 38, 41);
        this.lowerJawOpen.setRotationPoint(0.0F, 1.7F, -4.5F);
        this.lowerJawOpen.addBox(-5.0F, -1.9F, -8.4F, 10, 4, 9, 0.0F);
        this.setRotateAngle(lowerJawOpen, 0.785398F, 0.0F, 0.0F);
        this.lLeg03 = new ModelRenderer(this, 0, 94);
        this.lLeg03.setRotationPoint(0.0F, -0.3F, 14.3F);
        this.lLeg03.addBox(-2.0F, -0.9F, -1.5F, 4, 9, 3, 0.0F);
        this.setRotateAngle(lLeg03, 0.6981317007977318F, 0.0F, 0.0F);
        this.lLeg02FurMid = new ModelRenderer(this, 74, 91);
        this.lLeg02FurMid.setRotationPoint(-0.0F, 0.6F, 3.4F);
        this.lLeg02FurMid.addBox(0.0F, 0.0F, -5.5F, 0, 8, 16, 0.0F);
        this.setRotateAngle(lLeg02FurMid, 0.3490658503988659F, 0.0F, 0.0F);
        this.rClaw00 = new ModelRenderer(this, 0, 0);
        this.rClaw00.mirror = true;
        this.rClaw00.setRotationPoint(-0.6F, 19.8F, -1.5F);
        this.rClaw00.addBox(-1.8F, -1.5F, -0.5F, 3, 7, 1, 0.0F);
        this.setRotateAngle(rClaw00, -0.10471975511965977F, 0.0F, -0.22689280275926282F);
        this.lToe02 = new ModelRenderer(this, 0, 116);
        this.lToe02.setRotationPoint(-1.4F, 0.0F, -2.5F);
        this.lToe02.addBox(-0.5F, -0.9F, -4.5F, 1, 3, 5, 0.0F);
        this.setRotateAngle(lToe02, 0.17453292519943295F, 0.13962634015954636F, 0.0F);
        this.lArm02 = new ModelRenderer(this, 90, 0);
        this.lArm02.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.lArm02.addBox(-2.0F, 0.0F, -2.0F, 4, 20, 4, 0.0F);
        this.setRotateAngle(lArm02, -0.5235987755982988F, 0.0F, 0.0F);
        this.lLeg02 = new ModelRenderer(this, 0, 94);
        this.lLeg02.setRotationPoint(0.0F, 20.0F, 1.3F);
        this.lLeg02.addBox(-2.0F, -2.5F, 0.0F, 4, 5, 15, 0.0F);
        this.setRotateAngle(lLeg02, -0.3141592653589793F, 0.0F, 0.0F);
        this.lowerJawClosed = new ModelRenderer(this, 38, 55);
        this.lowerJawClosed.setRotationPoint(0.0F, 3.4F, -4.5F);
        this.lowerJawClosed.addBox(-5.0F, -3.0F, -2.4F, 10, 4, 9, 0.0F);
        this.crothFur = new ModelRenderer(this, 88, 43);
        this.crothFur.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.crothFur.addBox(-5.0F, 0.0F, -4.5F, 10, 18, 7, 0.0F);
        this.rToe01 = new ModelRenderer(this, 0, 116);
        this.rToe01.mirror = true;
        this.rToe01.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.rToe01.addBox(-0.5F, -0.9F, -4.5F, 1, 3, 5, 0.0F);
        this.setRotateAngle(rToe01, 0.17453292519943295F, 0.0F, 0.0F);
        this.rArm02.addChild(this.rArmFur);
        this.chest.addChild(this.rArm01);
        this.rPaw.addChild(this.rToe00);
        this.lArm02.addChild(this.lClaw02);
        this.chest.addChild(this.chestFur);
        this.neck01.addChild(this.head);
        this.rArm02.addChild(this.rClaw01);
        this.rLeg02.addChild(this.rLeg03);
        this.chest.addChild(this.lArm01);
        this.lArm02.addChild(this.lArmFur);
        this.hips.addChild(this.rLeg01);
        this.lArm02.addChild(this.lClaw00);
        this.lPaw.addChild(this.lToe00);
        this.lPaw.addChild(this.lToe01);
        this.lLeg03.addChild(this.lPaw);
        this.rLeg03.addChild(this.rPaw);
        this.stomach.addChild(this.hips);
        this.rLeg01.addChild(this.rLeg01Fur);
        this.chest.addChild(this.neck00);
        this.hips.addChild(this.lLeg01);
        this.neck00.addChild(this.neck01);
        this.rLeg02.addChild(this.rLeg02Fur);
        this.rLeg01.addChild(this.rLeg02);
        this.chest.addChild(this.chestFurLower);
        this.rLeg02.addChild(this.rLeg02FurMid);
        this.head.addChild(this.rEar);
        this.rArm02.addChild(this.rClaw02);
        this.lLeg02.addChild(this.lLeg02Fur);
        this.rArm01.addChild(this.rArm02);
        this.hips.addChild(this.tail00);
        this.tail00.addChild(this.tail01);
        this.head.addChild(this.lEar);
        this.chest.addChild(this.stomach);
        this.lLeg01.addChild(this.lLeg01Fur);
        this.lArm02.addChild(this.lClaw01);
        this.rPaw.addChild(this.rToe02);
        this.head.addChild(this.lowerJawOpen);
        this.lLeg02.addChild(this.lLeg03);
        this.lLeg02.addChild(this.lLeg02FurMid);
        this.rArm02.addChild(this.rClaw00);
        this.lPaw.addChild(this.lToe02);
        this.lArm01.addChild(this.lArm02);
        this.lLeg01.addChild(this.lLeg02);
        this.head.addChild(this.lowerJawClosed);
        this.hips.addChild(this.crothFur);
        this.rPaw.addChild(this.rToe01);
    }

    @Override
    public void render(MatrixStack stack, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        
        stack.push();
        {
            stack.translate(0D, yTranslate, 0D);
            this.chest.render(stack, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha * this.alpha);
        }
        stack.pop();
    }

    @Override
    public void setRotationAngles(EntityHidebehind entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.lowerJawOpen.showModel = entity.getOpen();
        this.alpha = entity.getHiding() ? 0.5F : 1F;
        if(entity.attackSequenceTicks() > 0 && entity.getAttackTarget() != null) {
            LivingEntity target = entity.getAttackTarget();
            Vector3d targetEyes = target.getEyePosition(1F);
            Vector3d entityEyes = entity.getEyePosition(1F);
            this.head.rotateAngleY = 0;
            this.head.rotateAngleX = 0;
            this.yTranslate = entityEyes.subtract(targetEyes).getY();
        } else {
            this.yTranslate = 0F;
            this.head.rotateAngleY = (float) Math.toRadians(netHeadYaw);
            this.head.rotateAngleX = (float) Math.toRadians(headPitch);
        }
        this.lLeg01.rotateAngleX = (float) Math.cos(0.6F * limbSwing) * limbSwingAmount * 0.7F - 0.6108652381980153F;
        this.rLeg01.rotateAngleX = (float) Math.cos(0.6F * limbSwing + (float) Math.PI) * limbSwingAmount * 0.7F - 0.6108652381980153F;
    }

    public void setRotateAngle(ModelRenderer ModelRenderer, float x, float y, float z) {
        ModelRenderer.rotateAngleX = x;
        ModelRenderer.rotateAngleY = y;
        ModelRenderer.rotateAngleZ = z;
    }
}
