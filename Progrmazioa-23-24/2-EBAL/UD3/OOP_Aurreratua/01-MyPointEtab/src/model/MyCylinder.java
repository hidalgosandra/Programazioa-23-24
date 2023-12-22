package model;

public class MyCylinder extends MyCircle {
   private double height;

   public MyCylinder() {
      super();
      this.height = 1.0;
   }

   public MyCylinder(double height) {
      super();
      this.height = height;
   }

   public MyCylinder(double height, double radius) {
      super(radius, null);
      this.height = height;
   }

   public MyCylinder(double height, double radius, String color) {
      super(radius, color);
      this.height = height;
   }

   public double getHeight() {
      return this.height;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   public double getVolume() {
      return getArea() * height;
   }

   @Override
   public double getArea() {
      return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
   }

   @Override
   public String toString() {
      return "This is a Cylinder";
   }
}
