public class Piece
{
  private String name;
  private int value;
  private int cube;
  
  public Piece(String newName, int newValue, int newCube)
  {
    name = newName;
    value = newValue;
    cube = newCube;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getValue()
  {
    return value;
  }
  public int getCube()
  {
    return cube;
  }
  
  public void setName(String str)
  {
    name = str;
  }
  
}