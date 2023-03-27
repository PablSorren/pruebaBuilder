package builder;

public class Cake {

  private int sugar;

  private int eggs;

  private int milk;

  private int flour;

  private String color;

  private Boolean isCooked;

  public Cake() {}

  private Cake(int sugar, int eggs, int milk, int flour, String color, Boolean isCooked) {
    this.sugar = sugar;
    this.eggs = eggs;
    this.milk = milk;
    this.flour = flour;
    this.color = color;
    this.isCooked = isCooked;
  }

  public Cake setSugar(int sugar) {
    this.sugar = sugar;
    return this;
  }

  public Cake setEggs(int eggs) {
    this.eggs = eggs; return this;
  }

  public Cake setMilk(int milk) {
    this.milk = milk; return this;
  }

  public Cake setFlour(int flour) {
    this.flour = flour; return this;
  }

  public Cake setColor(String color) {
    this.color = color; return this;
  }

  public Cake cookCake(){
    this.isCooked = true; return this;
  }



  @Override
  public String toString() {
    return String.format("builder.Cake made with " +
        "\n -sugar : %d gr " +
        "\n -eggs : %d " +
        "\n -milk : %d ml " +
        "\n flour : %d gr" +
        "\n color : %s " +
        "\n cooked : %s", sugar, eggs, milk, flour, color, isCooked);
  }

  public static insideBuilder builder() {
    return new insideBuilder();
  }
  protected static class insideBuilder {

     private int sugar;

     private int eggs;

     private int milk;

     private int flour;

     private String color = "no color yet";

     private Boolean isCooked = false;

     private insideBuilder(){}

    public insideBuilder setSugar(int sugar) {
      this.sugar = sugar;
      return this;
    }

    public insideBuilder setEggs(int eggs) {
      this.eggs = eggs;  return this;
    }

    public insideBuilder setMilk(int milk) {
      this.milk = milk;  return this;
    }

    public insideBuilder setFlour(int flour) {
      this.flour = flour;  return this;
    }

    public insideBuilder setColor(String color) {
      this.color = color;  return this;
    }

    public insideBuilder setCooked(Boolean cooked) {
      isCooked = cooked;  return this;
    }

    public Cake build() {
      return new Cake(sugar, eggs, milk, flour, color, isCooked);
    }
  }

}
