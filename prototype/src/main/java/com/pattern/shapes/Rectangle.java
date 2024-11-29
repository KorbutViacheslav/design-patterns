package com.pattern.shapes;

public class Rectangle extends Shape {

  public int width;
  public int height;

  public Rectangle() {
  }

  public Rectangle(Rectangle target) {
    super(target);
    if (target != null) {
      this.width = target.width;
      this.height = target.height;
    }
  }

  @Override
  public Shape clone() {
    return new Rectangle(this);
  }

  @Override
  public final boolean equals(Object object2) {
    if (!(object2 instanceof Rectangle) || !super.equals(object2)) {
      return false;
    }
    Rectangle rectangle2 = (Rectangle) object2;
    return rectangle2.width == width && rectangle2.height == height;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + width;
    result = 31 * result + height;
    return result;
  }
}
