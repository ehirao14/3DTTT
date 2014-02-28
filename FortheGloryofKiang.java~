import java.util.Scanner;

public class FortheGloryofKiang
{
  Scanner kb = new Scanner(System.in); 
  private static Piece[][] kiangArray = new Piece [4][16];
  {
    kiangArray[0][0] = new Piece ("|01|", 1, 16);
    kiangArray[0][1] = new Piece ("|02|", 2, 3);
    kiangArray[0][2] = new Piece ("|03|", 3, 2);
    kiangArray[0][3] = new Piece ("|04|", 4, 13);
    kiangArray[1][0] = new Piece ("|05|", 5, 5);
    kiangArray[1][1] = new Piece ("|06|", 6, 10);
    kiangArray[1][2] = new Piece ("|07|", 7, 11);
    kiangArray[1][3] = new Piece ("|08|", 8, 8);
    kiangArray[2][0] = new Piece ("|09|", 9, 9);
    kiangArray[2][1] = new Piece ("|10|", 10, 6);
    kiangArray[2][2] = new Piece ("|11|", 11, 7);
    kiangArray[2][3] = new Piece ("|12|", 12, 12);
    kiangArray[3][0] = new Piece ("|13|", 13, 4);
    kiangArray[3][1] = new Piece ("|14|", 14, 15);
    kiangArray[3][2] = new Piece ("|15|", 15, 14);
    kiangArray[3][3] = new Piece ("|16|", 16, 1);
    kiangArray[0][4] = new Piece ("|17|", 17, 44);
    kiangArray[0][5] = new Piece ("|18|", 18, 55);
    kiangArray[0][6] = new Piece ("|19|", 19, -26);
    kiangArray[0][7] = new Piece ("|20|", 20, -39);
    kiangArray[1][4] = new Piece ("|21|", 21, 36);
    kiangArray[1][5] = new Piece ("|22|", 22, -17);
    kiangArray[1][6] = new Piece ("|23|", 23, 22);
    kiangArray[1][7] = new Piece ("|24|", 24, -7);
    kiangArray[2][4] = new Piece ("|25|", 25, -35);
    kiangArray[2][5] = new Piece ("|26|", 26, -30);
    kiangArray[2][6] = new Piece ("|27|", 27, 51);
    kiangArray[2][7] = new Piece ("|28|", 28, 48);
    kiangArray[3][4] = new Piece ("|29|", 29, -11);
    kiangArray[3][5] = new Piece ("|30|", 30, 26);
    kiangArray[3][6] = new Piece ("|31|", 31, -13);
    kiangArray[3][7] = new Piece ("|32|", 32, 32);
    kiangArray[0][8] = new Piece ("|33|", 33, -51);
    kiangArray[0][9] = new Piece ("|34|", 34, -14);
    kiangArray[0][10] = new Piece ("|35|", 35, 27);
    kiangArray[0][11] = new Piece ("|36|", 36, 72);
    kiangArray[1][8] = new Piece ("|37|", 37, 24);
    kiangArray[1][9] = new Piece ("|38|", 38, 75);
    kiangArray[1][10] = new Piece ("|39|", 39, -46);
    kiangArray[1][11] = new Piece ("|40|", 40, -19);
    kiangArray[2][8] = new Piece ("|41|", 41, 76);
    kiangArray[2][9] = new Piece ("|42|", 42, 23);
    kiangArray[2][10] = new Piece ("|43|", 43, -18);
    kiangArray[2][11] = new Piece ("|44|", 44, -47);
    kiangArray[3][8] = new Piece ("|45|", 45, -15);
    kiangArray[3][9] = new Piece ("|46|", 46, -50);
    kiangArray[3][10] = new Piece ("|47|", 47, 71);
    kiangArray[3][11] = new Piece ("|48|", 48, 28);
    kiangArray[0][12] = new Piece ("|49|", 49, 25);
    kiangArray[0][13] = new Piece ("|50|", 50, -10);
    kiangArray[0][14] = new Piece ("|51|", 51, 31);
    kiangArray[0][15] = new Piece ("|52|", 52, -12);
    kiangArray[1][12] = new Piece ("|53|", 53, -31);
    kiangArray[1][13] = new Piece ("|54|", 54, -34);
    kiangArray[1][14] = new Piece ("|55|", 55, 47);
    kiangArray[1][15] = new Piece ("|56|", 56, 52);
    kiangArray[2][12] = new Piece ("|57|", 57, -16);
    kiangArray[2][13] = new Piece ("|58|", 58, 35);
    kiangArray[2][14] = new Piece ("|59|", 59, -6);
    kiangArray[2][15] = new Piece ("|60|", 60, 21);
    kiangArray[3][12] = new Piece ("|61|", 61, 56);
    kiangArray[3][13] = new Piece ("|62|", 62, 43);
    kiangArray[3][14] = new Piece ("|63|", 63, -38);
    kiangArray[3][15] = new Piece ("|64|", 64, -27);
  }
  
  public void play()
  {
    String symbol1 = "X"; //makes 3 ints to be placemakers for the games for 3 players
    String symbol2 = "O";
    String symbol3 = "+";
    
    boolean gameOver = false;
    int current; //makes sure that only one player can make a move
    int turns = 0; //takes note of turns so that the program knows who will go next
    display(kiangArray);
    
    while (gameOver == false)
    {
      playGame();
    }
    System.out.println("Game over.");
    
  }
  public void display(Piece[][] array)
  {
    System.out.println("Tic-Tac-Toe game");
    for(int row = 0; row < array.length; row++) //goes through the row after making columns
    {
      for(int column = 0; column < array[row].length; column++){
        System.out.print(kiangArray[row][column].getName()); // will print down 3 before changing rows
        if(column%4-3==0) //jesus this took a lot of guessing
        {
          System.out.print("       "); //makes 3 separate plots to make a 2d rendering of the 3d game
        }
      }
      System.out.println("");// print new line so we can start a new column
    }
  }
  
  public void player1()
  {
    System.out.println("Enter the number you wish to fill.");
    int num1 = kb.nextInt(); 
    check();
    if (check==true)
    {
      replace1();
    }
    else player1();
  }
  public void player2()
  {
    System.out.println("Enter the number you wish to fill.");
    int num2 = kb.nextInt();
    check();
    if (check==true)
    {
      replace2();
    }
    else player2();
  }
  public void player3()
  {
    System.out.println("Enter the number you wish to fill.");
    int num3 = kb.nextInt();
    check();
    if (check==true)
    {
      replace3();
    }
    else player3();
  }
  public boolean check()
  {
    
  }
  public void replace1()
  {
  }
  public void replace2
  {
  }
  public void replace3()
  {
  }
  public void playGame()
  {
    display(kiangArray);
    int turns;
    turns=turns+1;
    if (turns%3==0)
    {
      player1();
    }
    else if (turns%3==1)
    {
      player2();
    }
    else player3();
  }
}
