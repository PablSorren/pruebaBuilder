package builder;

public class CakeBuilder {

  private int sugar;

  private int eggs;

  private int milk;

  private int flour;

  private String color = "no color yet";

  private Boolean isCooked = false;


  public void setSugar(int sugar) {
    this.sugar = sugar;
  }

  public void setEggs(int eggs) {
    this.eggs = eggs;
  }

  public void setMilk(int milk) {
    this.milk = milk;
  }

  public void setFlour(int flour) {
    this.flour = flour;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setCooked(Boolean cooked) {
    isCooked = cooked;
  }

  public Cake build() {
    Cake cake = new Cake();
    cake.setColor(this.color);
    cake.setEggs(this.eggs);
    cake.setFlour(this.flour);
    cake.setMilk(this.milk);
    cake.setSugar(this.sugar);
    cake.cookCake();

    return cake;
  }

}
