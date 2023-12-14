public class Quadrado extends Retangulo {

  public Quadrado(int lado) {
    super(lado, lado);

  }

  public int getlado() {
    return getBase();
  }

  public void setlado(int lado) {
    setAltura(lado);
    setBase(lado);
  }

}
