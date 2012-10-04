package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelPiloswine extends ModelBase
{
  //fields
    ModelRenderer snout;
    ModelRenderer furlayer1;
    ModelRenderer furlayer2;
    ModelRenderer furlayer3;
    ModelRenderer furlayer4;
    ModelRenderer ear1;
    ModelRenderer ear2;
    ModelRenderer eyefur1;
    ModelRenderer eyefur2;
    ModelRenderer furlayer6;
    ModelRenderer furlayer5;
    ModelRenderer furlayer7;
    ModelRenderer tusk1part1;
    ModelRenderer tusk1part2;
    ModelRenderer tusk2part1;
    ModelRenderer tusk2part2;
    ModelRenderer tuskpoint1;
    ModelRenderer tuskpoint2;
    ModelRenderer FootFL;
    ModelRenderer foot1;
    ModelRenderer toenail1A;
    ModelRenderer toenail1B;
    ModelRenderer FootFR;
    ModelRenderer foot2;
    ModelRenderer toenail2A;
    ModelRenderer toenail2B;
    ModelRenderer FootBL;
    ModelRenderer foot3;
    ModelRenderer toenail3A;
    ModelRenderer toenail3B;
    ModelRenderer FootBR;
    ModelRenderer foot4;
    ModelRenderer toenail4A;
    ModelRenderer toenail4B;
  
  public ModelPiloswine()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      snout = new ModelRenderer(this, 19, 0);
      snout.addBox(0F, 0F, 0F, 5, 3, 4);
      snout.setRotationPoint(-2.5F, 20F, -9F);
      snout.setTextureSize(256, 128);
      snout.mirror = true;
      setRotation(snout, 0F, 0F, 0F);
      furlayer1 = new ModelRenderer(this, 0, 14);
      furlayer1.addBox(0F, 0F, 0F, 16, 21, 16);
      furlayer1.setRotationPoint(-8F, 2.8F, -8F);
      furlayer1.setTextureSize(256, 128);
      furlayer1.mirror = true;
      setRotation(furlayer1, 0F, 0F, 0F);
      furlayer2 = new ModelRenderer(this, 66, 14);
      furlayer2.addBox(0F, 0F, 0F, 14, 20, 14);
      furlayer2.setRotationPoint(-7F, 2F, -7F);
      furlayer2.setTextureSize(256, 128);
      furlayer2.mirror = true;
      setRotation(furlayer2, 0F, 0F, 0F);
      furlayer3 = new ModelRenderer(this, 125, 14);
      furlayer3.addBox(0F, 0F, 0F, 12, 21, 12);
      furlayer3.setRotationPoint(-6F, 1F, -6F);
      furlayer3.setTextureSize(256, 128);
      furlayer3.mirror = true;
      setRotation(furlayer3, 0F, 0F, 0F);
      furlayer4 = new ModelRenderer(this, 66, 51);
      furlayer4.addBox(0F, 0F, 0F, 10, 21, 9);
      furlayer4.setRotationPoint(-5F, 0F, -3.5F);
      furlayer4.setTextureSize(256, 128);
      furlayer4.mirror = true;
      setRotation(furlayer4, 0F, 0F, 0F);
      ear1 = new ModelRenderer(this, 0, 54);
      ear1.addBox(0F, 2F, 0F, 3, 12, 5);
      ear1.setRotationPoint(5F, 6F, -3F);
      ear1.setTextureSize(256, 128);
      ear1.mirror = true;
      setRotation(ear1, 0F, 0F, -0.1464424F);
      ear2 = new ModelRenderer(this, 0, 54);
      ear2.addBox(0F, 2F, 0F, 3, 12, 5);
      ear2.setRotationPoint(-8F, 6F, -3F);
      ear2.setTextureSize(256, 128);
      ear2.mirror = true;
      setRotation(ear2, 0F, 0F, 0.1464506F);
      eyefur1 = new ModelRenderer(this, 0, 74);
      eyefur1.addBox(0F, 0F, 0F, 6, 9, 3);
      eyefur1.setRotationPoint(1F, 10.5F, -8F);
      eyefur1.setTextureSize(256, 128);
      eyefur1.mirror = true;
      setRotation(eyefur1, -0.1047198F, 0F, -0.0698132F);
      eyefur2 = new ModelRenderer(this, 0, 74);
      eyefur2.addBox(0F, 0F, 0F, 6, 9, 3);
      eyefur2.setRotationPoint(-7F, 10F, -8F);
      eyefur2.setTextureSize(256, 128);
      eyefur2.mirror = true;
      setRotation(eyefur2, -0.1047198F, 0F, 0.0698132F);
      furlayer6 = new ModelRenderer(this, 21, 53);
      furlayer6.addBox(0F, 0F, 0F, 1, 3, 16);
      furlayer6.setRotationPoint(7F, 21F, -8F);
      furlayer6.setTextureSize(256, 128);
      furlayer6.mirror = true;
      setRotation(furlayer6, 0F, 0F, -0.2792527F);
      furlayer5 = new ModelRenderer(this, 21, 53);
      furlayer5.addBox(0F, 0F, 0F, 1, 3, 16);
      furlayer5.setRotationPoint(-8F, 20.7F, -8F);
      furlayer5.setTextureSize(256, 128);
      furlayer5.mirror = true;
      setRotation(furlayer5, 0F, 0F, 0.2792527F);
      furlayer7 = new ModelRenderer(this, 21, 53);
      furlayer7.addBox(0F, -1F, -1F, 1, 3, 16);
      furlayer7.setRotationPoint(-8F, 20.7F, 8F);
      furlayer7.setTextureSize(256, 128);
      furlayer7.mirror = true;
      setRotation(furlayer7, 0F, 1.570796F, 0.2792527F);
      tusk1part1 = new ModelRenderer(this, 45, 0);
      tusk1part1.addBox(0F, 0F, 0F, 2, 2, 7);
      tusk1part1.setRotationPoint(-7F, 21F, -12F);
      tusk1part1.setTextureSize(256, 128);
      tusk1part1.mirror = true;
      setRotation(tusk1part1, 0F, 0F, 0F);
      tusk1part2 = new ModelRenderer(this, 65, 0);
      tusk1part2.addBox(0F, 0F, 0F, 5, 2, 2);
      tusk1part2.setRotationPoint(-6F, 21F, -12F);
      tusk1part2.setTextureSize(256, 128);
      tusk1part2.mirror = true;
      setRotation(tusk1part2, 0F, 0F, 0F);
      tusk2part1 = new ModelRenderer(this, 45, 0);
      tusk2part1.addBox(0F, 0F, 0F, 2, 2, 7);
      tusk2part1.setRotationPoint(5F, 21F, -12F);
      tusk2part1.setTextureSize(256, 128);
      tusk2part1.mirror = true;
      setRotation(tusk2part1, 0F, 0F, 0F);
      tusk2part2 = new ModelRenderer(this, 65, 0);
      tusk2part2.addBox(0F, 0F, 0F, 5, 2, 2);
      tusk2part2.setRotationPoint(1F, 21F, -12F);
      tusk2part2.setTextureSize(256, 128);
      tusk2part2.mirror = true;
      setRotation(tusk2part2, 0F, 0F, 0F);
      tuskpoint1 = new ModelRenderer(this, 39, 0);
      tuskpoint1.addBox(0F, 0F, 0F, 1, 1, 1);
      tuskpoint1.setRotationPoint(0.4F, 21.5F, -11.5F);
      tuskpoint1.setTextureSize(256, 128);
      tuskpoint1.mirror = true;
      setRotation(tuskpoint1, 0F, 0F, 0F);
      tuskpoint2 = new ModelRenderer(this, 39, 0);
      tuskpoint2.addBox(0F, 0F, 0F, 1, 1, 1);
      tuskpoint2.setRotationPoint(-1.4F, 21.5F, -11.5F);
      tuskpoint2.setTextureSize(256, 128);
      tuskpoint2.mirror = true;
      setRotation(tuskpoint2, 0F, 0F, 0F);
    FootFL = new ModelRenderer(this, "FootFL");
    FootFL.setRotationPoint(5F, 23F, -5F);
    setRotation(FootFL, 0F, 0F, 0F);
    FootFL.mirror = true;
      foot2 = new ModelRenderer(this, 0, 0);
      foot2.addBox(0F, 0F, 0F, 4, 3, 4);
      foot2.setRotationPoint(-2F, -2F, -2F);
      foot2.setTextureSize(256, 128);
      foot2.mirror = true;
      setRotation(foot2, 0F, 0F, 0F);
      toenail2A = new ModelRenderer(this, 39, 0);
      toenail2A.addBox(0F, 0F, 0F, 1, 1, 1);
      toenail2A.setRotationPoint(-3F, 0F, -2.8F);
      toenail2A.setTextureSize(256, 128);
      toenail2A.mirror = true;
      setRotation(toenail2A, 0F, 0F, 0F);
      toenail2B = new ModelRenderer(this, 39, 0);
      toenail2B.addBox(0F, 0F, 0F, 1, 1, 1);
      toenail2B.setRotationPoint(1F, 0F, -2.8F);
      toenail2B.setTextureSize(256, 128);
      toenail2B.mirror = true;
      setRotation(toenail2B, 0F, 0F, 0F);
      
      FootFL.addChild(foot2);
      FootFL.addChild(toenail2A);
      FootFL.addChild(toenail2B);
       
    FootFR = new ModelRenderer(this, "FootFR");
    FootFR.setRotationPoint(-5F, 23F, -5F);
    setRotation(FootFR, 0F, 0F, 0F);
    FootFR.mirror = true;
      toenail1A = new ModelRenderer(this, 39, 0);
      toenail1A.addBox(0F, 0F, 0F, 1, 1, 1);
      toenail1A.setRotationPoint(-2F, 0F, -2.8F);
      toenail1A.setTextureSize(256, 128);
      toenail1A.mirror = true;
      setRotation(toenail1A, 0F, 0F, 0F);
      toenail1B = new ModelRenderer(this, 39, 0);
      toenail1B.addBox(0F, 0F, 0F, 1, 1, 1);
      toenail1B.setRotationPoint(1F, 0F, -2.8F);
      toenail1B.setTextureSize(256, 128);
      toenail1B.mirror = true;
      setRotation(toenail1B, 0F, 0F, 0F);
      foot1 = new ModelRenderer(this, 0, 0);
      foot1.addBox(0F, 0F, 0F, 4, 3, 4);
      foot1.setRotationPoint(-2F, -2F, -2F);
      foot1.setTextureSize(256, 128);
      foot1.mirror = true;
      setRotation(foot1, 0F, 0F, 0F);
      
      FootFR.addChild(foot1);
      FootFR.addChild(toenail1A);
      FootFR.addChild(toenail1B);
      
    FootBL = new ModelRenderer(this, "FootBL");
    FootBL.setRotationPoint(5F, 23F, 5F);
    setRotation(FootBL, 0F, 0F, 0F);
    FootBL.mirror = true;
      foot3 = new ModelRenderer(this, 0, 0);
      foot3.addBox(0F, 0F, 0F, 4, 3, 4);
      foot3.setRotationPoint(-2F, -2F, -2F);
      foot3.setTextureSize(256, 128);
      foot3.mirror = true;
      setRotation(foot3, 0F, 0F, 0F);
      toenail3A = new ModelRenderer(this, 39, 0);
      toenail3A.addBox(0F, 0F, 0F, 1, 1, 1);
      toenail3A.setRotationPoint(-2F, 0F, -3F);
      toenail3A.setTextureSize(256, 128);
      toenail3A.mirror = true;
      setRotation(toenail3A, 0F, 0F, 0F);
      toenail3B = new ModelRenderer(this, 39, 0);
      toenail3B.addBox(0F, 0F, 0F, 1, 1, 1);
      toenail3B.setRotationPoint(1F, 0F, -3F);
      toenail3B.setTextureSize(256, 128);
      toenail3B.mirror = true;
      setRotation(toenail3B, 0F, 0F, 0F);
      
      FootBL.addChild(foot3);
      FootBL.addChild(toenail3A);
      FootBL.addChild(toenail3B);
      
    FootBR = new ModelRenderer(this, "FootBR");
    FootBR.setRotationPoint(-5F, 23F, 5F);
    setRotation(FootBR, 0F, 0F, 0F);
    FootBR.mirror = true;
      foot4 = new ModelRenderer(this, 0, 0);
      foot4.addBox(0F, 0F, 0F, 4, 3, 4);
      foot4.setRotationPoint(-2F, -2F, -2F);
      foot4.setTextureSize(256, 128);
      foot4.mirror = true;
      setRotation(foot4, 0F, 0F, 0F);
      toenail4A = new ModelRenderer(this, 39, 0);
      toenail4A.addBox(0F, 0F, 0F, 1, 1, 1);
      toenail4A.setRotationPoint(1F, 0F, -3F);
      toenail4A.setTextureSize(256, 128);
      toenail4A.mirror = true;
      setRotation(toenail4A, 0F, 0F, 0F);
      toenail4B = new ModelRenderer(this, 39, 0);
      toenail4B.addBox(0F, 0F, 0F, 1, 1, 1);
      toenail4B.setRotationPoint(-2F, 0F, -3F);
      toenail4B.setTextureSize(256, 128);
      toenail4B.mirror = true;
      setRotation(toenail4B, 0F, 0F, 0F);
      
      FootBR.addChild(foot4);
      FootBR.addChild(toenail4A);
      FootBR.addChild(toenail4B);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    snout.render(f5);
    furlayer1.render(f5);
    furlayer2.render(f5);
    furlayer3.render(f5);
    furlayer4.render(f5);
    ear1.render(f5);
    ear2.render(f5);
    eyefur1.render(f5);
    eyefur2.render(f5);
    furlayer6.render(f5);
    furlayer5.render(f5);
    furlayer6.render(f5);
    tusk1part1.render(f5);
    tusk1part2.render(f5);
    tusk2part1.render(f5);
    tusk2part2.render(f5);
    tuskpoint1.render(f5);
    tuskpoint2.render(f5);
    FootFL.render(f5);
    FootFR.render(f5);
    FootBL.render(f5);
    FootBR.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
