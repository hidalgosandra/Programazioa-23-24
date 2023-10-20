public class CylinderComputation {
  public static void main(String[] args) {
    double radius, height, surfaceArea, baseArea, volume;
    final double PI = 3.14;
    radius = 3.5;
    height = 5;
    baseArea = PI * radius;
    volume = PI * (radius * radius) * height;
    surfaceArea = (PI + PI) * radius * height + (PI + PI) * (radius * radius);
    System.out.print("The surface area is ");
    System.out.println(surfaceArea);
    System.out.print("The base area is ");
    System.out.println(baseArea);
    System.out.print("The volume is ");
    System.out.println(volume);

  }
}