public class Interfaces {

  public static void main(String[] args) {
    Store s = new Store();

    Customer c1 = new Customer("Yassine");
    Customer c2 = new Customer("Jhon");

    s.register(c1);
    s.register(c2);

    s.inviteSale();

  }

  static interface IMember {
    void callback();
  }

  static class Customer implements IMember {
    String name;

    Customer(String name) {
      this.name = name;
    }

    public void callback() {
      System.out.println("I will visit " + name);
    }
  }

  static class Store {
    IMember members[] = new IMember[100];
    int count = 0;

    void register(IMember mem) {
      this.members[count++] = mem;
    }

    void inviteSale() {
      for (int i = 0; i < count; i++) {
        this.members[i].callback();
      }
    }
  }
}