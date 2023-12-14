public class Retangulo extends Forma {
  private int altura;
  private int base;

  public Retangulo(int altura, int base) {
    setAltura(altura);
    setBase(base);
  }

  public int getAltura() {
    return altura;
  }

  public int getBase() {
    return base;
  }

  public float getPerimetro() {
    return (base + altura) * 2;
  }

  public float getArea() {
    return base * altura;
  }

  public float getDiagonal() {
    return (float) Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public void setBase(int base) {
    this.base = base;
  }
}
