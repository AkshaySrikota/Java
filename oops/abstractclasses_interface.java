public class abstractclasses_interface {
  public static void main(String args[]){    Queen q1=new Queen();
    Rook r1=new Rook();
    King k1=new King();
    q1.moves();
    r1.moves();
    k1.moves();
  }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
public void moves(){
    System.out.println("All 4 directions");
}
} 
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("All Horizontal and Vertical directions");
    }
    } 
    class King implements ChessPlayer{
        public void moves(){
            System.out.println("One step in all 4 directions");
        }
        } 