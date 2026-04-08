public class Player extends Evento {
    private static int x=2;
  private static int y=2;
  public Player(char icono) {
    super(icono);
  }
  public static int getX() {
    return x;
  }
  public static int getY() {
    return y;
  }

@Override
public  char getIcono(){

    return 'J';
}
public static void setX(int x) {
    Player.x = x;
}
public static void setY(int y) {
    Player.y = y;
}





}
