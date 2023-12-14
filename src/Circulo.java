public class Circulo extends Forma {
  private int raio;

  public Circulo(int raio) {
    this.setRaio(raio);
  }

  public float getArea() {
    return (float) 3.14 * (float) Math.pow(raio, 2);
  }

  public float getPerimetro() {
    return (float) ((float) 2 * 3.14) * raio;
  }

  public int getRaio() {
    return raio;
  }

  public void setRaio(int raio) {
    this.raio = raio;
  }

}
