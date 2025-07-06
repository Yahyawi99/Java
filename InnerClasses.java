public class InnerClasses {
  public static void main(String agrs[]) {
    Outer o = new Outer();
    o.outerDisplay();

    Outer.Inner i = new Outer().new Inner();
  }
}

class Outer {
  int x = 10;

  class Inner {
    int y = 20;

    void innerDisplay() {
      System.out.println(x);
      System.out.println(y);
    }
  }

  void outerDisplay() {
    Inner i = new Inner();
    i.innerDisplay();
    System.out.println(i.y);
  }
}
