import java.util.Scanner;

public class FortheGloryofKiang
{
  Scanner kb = new Scanner(System.in); 
  private static Piece[][] kiangArray = new Piece [4][16];
  private int turn = 1;
  String symbol1 = "|XX|"; //makes 3 ints to be placemakers for the games for 3 players
  String symbol2 = "|##|";
  private boolean hasWon = false;
  public int num1cube = 0;
  public int num2cube = 0;
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
  public void replacePiece (int turn, int answer)
  {
    for(int row = 0; row < kiangArray.length; row++)
    {
      for(int column = 0; column < kiangArray[row].length; column++)
      {
        if (kiangArray[row][column].getValue() == answer)
        {
          if (turn == 1)
          {
            kiangArray[row][column].setName("|XX|");
            num1cube = kiangArray[row][column].getCube();
          }
          else if (turn == 2)
          {
            kiangArray[row][column].setName("|##|");
            num2cube = kiangArray[row][column].getCube();
          }
          else System.out.println("did I just get an error? :( hope I'm not rectified #communism");
        }
      }
    }
  }
  public void playGame()
  {
    display(kiangArray);
    if (turn > 2) turn = 1;
    if (turn==1)
    {
      kiangplayer1();
    }
    else if (turn==2)
    {
      kiangplayer2();
    }
  }
  public void kiangplayer1()
  {
    while (hasWon == false)
    {
      System.out.println("Player " + turn + ", enter the number you wish to fill.");
      int answer = kb.nextInt();
      String symbol = symbol1;
      if (check(answer) == true)
      {
        replacePiece(turn, answer);
        turn++;
        didsomeonewin(symbol);
        playGame();
      }
      else
      {
        turn ++;
        playGame();
      }
    }
    System.out.println("Someone has won!");
  }
  
  
  public void kiangplayer2()
  {
    while (hasWon == false)
    {
      System.out.println("Player " + turn + ", enter the number you wish to fill.");
      int answer = kb.nextInt();
      String symbol = symbol2;
      if (check(answer) == true)
      {
        replacePiece(turn, answer);
        turn++;
        didsomeonewin(symbol);
        playGame();
      }
      else
      {
        turn ++;
        playGame();;
      }
    }
    System.out.println("Someone has won!");
  }
  public boolean check(int answer)
  {
    for(int row = 0; row < kiangArray.length; row++)
    {
      for(int column = 0; column < kiangArray[row].length; column++)
      {
        if (kiangArray[row][column].getValue() == answer)
        {
          return true;
        }
      }
    }
    return false;
  }
  public void didsomeonewin(String symbol)
  {
    if (kiangArray[0][0].getName().equals(symbol) && 
        kiangArray[0][1].getName().equals(symbol) && 
        kiangArray[0][2].getName().equals(symbol) && 
        kiangArray[0][3].getName().equals(symbol)) //checks 1-4
    {
      hasWon = true;
    }
    else if (kiangArray[1][0].getName().equals(symbol) && 
             kiangArray[1][1].getName().equals(symbol) && 
             kiangArray[1][2].getName().equals(symbol) && 
             kiangArray[1][3].getName().equals(symbol)) //checks 5-8
    {
      hasWon = true;
    }
    else if (kiangArray[2][0].getName().equals(symbol) &&
             kiangArray[2][1].getName().equals(symbol) &&
             kiangArray[2][2].getName().equals(symbol) &&
             kiangArray[2][3].getName().equals(symbol)) //checks 9-12
    {
      hasWon = true;
    }
    else if (kiangArray[3][0].getName().equals(symbol) &&
             kiangArray[3][1].getName().equals(symbol) &&
             kiangArray[3][2].getName().equals(symbol) &&
             kiangArray[3][3].getName().equals(symbol)) //checks 13-16
    {
      hasWon = true;
    }
    else if (kiangArray[0][4].getName().equals(symbol) &&
             kiangArray[0][5].getName().equals(symbol) &&
             kiangArray[0][6].getName().equals(symbol) &&
             kiangArray[0][7].getName().equals(symbol)) //checks 17-20
    {
      hasWon = true;
    }
    else if (kiangArray[1][4].getName().equals(symbol) &&
             kiangArray[1][5].getName().equals(symbol) &&
             kiangArray[1][6].getName().equals(symbol) &&
             kiangArray[1][7].getName().equals(symbol)) //checks 21-24
      
    {
      hasWon = true;
    }
    else if (kiangArray[2][4].getName().equals(symbol) &&
             kiangArray[2][5].getName().equals(symbol) &&
             kiangArray[2][6].getName().equals(symbol) &&
             kiangArray[2][7].getName().equals(symbol)) //checks 25-28
      
    {
      hasWon = true;
    }
    else if (kiangArray[3][4].getName().equals(symbol) &&
             kiangArray[3][5].getName().equals(symbol) &&
             kiangArray[3][6].getName().equals(symbol) &&
             kiangArray[3][7].getName().equals(symbol)) //checks 29-32
    {
      hasWon = true;
    }
    else if (kiangArray[0][8].getName().equals(symbol) &&
             kiangArray[0][9].getName().equals(symbol) &&
             kiangArray[0][10].getName().equals(symbol) &&
             kiangArray[0][11].getName().equals(symbol)) //checks 33-36
    {
      hasWon = true;
    }
    else if (kiangArray[1][8].getName().equals(symbol) &&
             kiangArray[1][9].getName().equals(symbol) &&
             kiangArray[1][10].getName().equals(symbol) &&
             kiangArray[1][11].getName().equals(symbol)) //checks 37-40
    {
      hasWon = true;
    }
    else if (kiangArray[2][8].getName().equals(symbol) &&
             kiangArray[2][9].getName().equals(symbol) &&
             kiangArray[2][10].getName().equals(symbol) &&
             kiangArray[3][11].getName().equals(symbol)) //checks 41-44
    {
      hasWon = true;
    }
    else if (kiangArray[3][8].getName().equals(symbol) &&
             kiangArray[3][9].getName().equals(symbol) &&
             kiangArray[3][10].getName().equals(symbol) &&
             kiangArray[0][11].getName().equals(symbol)) //checks 45-48
    {
      hasWon = true;
    }
    else if (kiangArray[0][12].getName().equals(symbol) &&
             kiangArray[0][13].getName().equals(symbol) &&
             kiangArray[0][14].getName().equals(symbol) &&
             kiangArray[0][15].getName().equals(symbol)) //checks 49-52
    {
      hasWon = true;
    }
    else if (kiangArray[1][12].getName().equals(symbol) &&
             kiangArray[1][13].getName().equals(symbol) &&
             kiangArray[1][14].getName().equals(symbol) &&
             kiangArray[1][15].getName().equals(symbol)) //checks 53-56
    {
      hasWon = true;
    }
    else if (kiangArray[2][12].getName().equals(symbol) &&
             kiangArray[2][13].getName().equals(symbol) &&
             kiangArray[2][14].getName().equals(symbol) &&
             kiangArray[2][15].getName().equals(symbol)) //checks 57-60
    {
      hasWon = true;
    }
    else if (kiangArray[3][12].getName().equals(symbol) &&
             kiangArray[3][13].getName().equals(symbol) &&
             kiangArray[3][14].getName().equals(symbol) &&
             kiangArray[3][15].getName().equals(symbol)) //checks 61-64
    {
      hasWon = true;
    }
    else if (kiangArray[0][0].getName().equals(symbol) &&
             kiangArray[1][0].getName().equals(symbol) &&
             kiangArray[2][0].getName().equals(symbol) &&
             kiangArray[3][0].getName().equals(symbol)) //checks 1st column down
    {
      hasWon = true;
    }
    else if (kiangArray[0][1].getName().equals(symbol) &&
             kiangArray[1][1].getName().equals(symbol) &&
             kiangArray[2][1].getName().equals(symbol) &&
             kiangArray[3][1].getName().equals(symbol)) //checks 2nd column down
    {
      hasWon = true;
    }
    else if (kiangArray[0][2].getName().equals(symbol) &&
             kiangArray[1][2].getName().equals(symbol) &&
             kiangArray[2][2].getName().equals(symbol) &&
             kiangArray[3][2].getName().equals(symbol)) //checks 3rd column down
    {
      hasWon = true;
    }
    else if (kiangArray[0][3].getName().equals(symbol) &&
             kiangArray[1][3].getName().equals(symbol) &&
             kiangArray[2][3].getName().equals(symbol) &&
             kiangArray[3][3].getName().equals(symbol)) //checks 4th column
    {
      hasWon = true;
    }
    else if (kiangArray[0][4].getName().equals(symbol) &&
             kiangArray[1][4].getName().equals(symbol) &&
             kiangArray[2][4].getName().equals(symbol) &&
             kiangArray[3][4].getName().equals(symbol)) //checks 5th column
    {
      hasWon = true;
    }
    else if (kiangArray[0][5].getName().equals(symbol) &&
             kiangArray[1][5].getName().equals(symbol) &&
             kiangArray[2][5].getName().equals(symbol) &&
             kiangArray[3][5].getName().equals(symbol)) //checks 6th column
    {
      hasWon = true;
    }
    else if (kiangArray[0][6].getName().equals(symbol) &&
             kiangArray[1][6].getName().equals(symbol) &&
             kiangArray[2][6].getName().equals(symbol) &&
             kiangArray[3][6].getName().equals(symbol)) //checks 7th column
    {
      hasWon = true;
    }
    else if (kiangArray[0][7].getName().equals(symbol) &&
             kiangArray[1][7].getName().equals(symbol) &&
             kiangArray[2][7].getName().equals(symbol) &&
             kiangArray[3][7].getName().equals(symbol)) //checks 8th column
    {
      hasWon = true;
    }
    else if (kiangArray[0][8].getName().equals(symbol) &&
             kiangArray[1][8].getName().equals(symbol) &&
             kiangArray[2][8].getName().equals(symbol) &&
             kiangArray[3][8].getName().equals(symbol)) //checks 9th column
    {
      hasWon = true;
    }
    else if (kiangArray[0][9].getName().equals(symbol) &&
             kiangArray[1][9].getName().equals(symbol) &&
             kiangArray[2][9].getName().equals(symbol) &&
             kiangArray[3][9].getName().equals(symbol)) //checks 10th column
    {
      hasWon = true;
    }
    else if (kiangArray[0][10].getName().equals(symbol) &&
             kiangArray[1][10].getName().equals(symbol) &&
             kiangArray[2][10].getName().equals(symbol) &&
             kiangArray[3][10].getName().equals(symbol)) //checks 11th column
    {
      hasWon = true;
    }
    else if (kiangArray[0][11].getName().equals(symbol) &&
             kiangArray[1][11].getName().equals(symbol) &&
             kiangArray[2][11].getName().equals(symbol) &&
             kiangArray[3][11].getName().equals(symbol)) //checks 12th column
    {
      hasWon = true;
    }
    else if (kiangArray[0][12].getName().equals(symbol) &&
             kiangArray[1][12].getName().equals(symbol) &&
             kiangArray[2][12].getName().equals(symbol) &&
             kiangArray[3][12].getName().equals(symbol)) //checks 13th column
    {
      hasWon = true;
    }
    else if (kiangArray[0][13].getName().equals(symbol) &&
             kiangArray[1][13].getName().equals(symbol) &&
             kiangArray[2][13].getName().equals(symbol) &&
             kiangArray[3][13].getName().equals(symbol)) //checks 14th column
    {
      hasWon = true;
    }
    else if (kiangArray[0][14].getName().equals(symbol) &&
             kiangArray[1][14].getName().equals(symbol) &&
             kiangArray[2][14].getName().equals(symbol) &&
             kiangArray[3][14].getName().equals(symbol)) //checks 15th column
    {
      hasWon = true;
    }
    else if (kiangArray[0][15].getName().equals(symbol) &&
             kiangArray[1][15].getName().equals(symbol) &&
             kiangArray[2][15].getName().equals(symbol) &&
             kiangArray[3][15].getName().equals(symbol)) //checks 16th column
    {
      hasWon = true;
    }
    else if (kiangArray[0][0].getName().equals(symbol) &&
             kiangArray[1][1].getName().equals(symbol) &&
             kiangArray[2][2].getName().equals(symbol) &&
             kiangArray[3][3].getName().equals(symbol)) //diagonal from 1-16
    {
      hasWon = true;
    }
    else if (kiangArray[0][3].getName().equals(symbol) &&
             kiangArray[1][2].getName().equals(symbol) &&
             kiangArray[2][1].getName().equals(symbol) &&
             kiangArray[3][0].getName().equals(symbol)) //diagonal from 4-13
    {
      hasWon = true;
    }
    else if (kiangArray[0][4].getName().equals(symbol) &&
             kiangArray[1][5].getName().equals(symbol) &&
             kiangArray[2][6].getName().equals(symbol) &&
             kiangArray[3][7].getName().equals(symbol)) //diagonal from 17-32
    {
      hasWon = true;
    }
    else if (kiangArray[0][7].getName().equals(symbol) &&
             kiangArray[1][6].getName().equals(symbol) &&
             kiangArray[2][5].getName().equals(symbol) &&
             kiangArray[3][4].getName().equals(symbol)) //diagonal from 20-29
    {
      hasWon = true;
    }
    else if (kiangArray[0][8].getName().equals(symbol) &&
             kiangArray[1][9].getName().equals(symbol) &&
             kiangArray[2][10].getName().equals(symbol) &&
             kiangArray[3][11].getName().equals(symbol)) //diagonal from 33-48
    {
      hasWon = true;
    }
    else if (kiangArray[0][11].getName().equals(symbol) &&
             kiangArray[1][10].getName().equals(symbol) &&
             kiangArray[2][9].getName().equals(symbol) &&
             kiangArray[3][8].getName().equals(symbol)) //diagonal from 36-45
    {
      hasWon = true;
    }
    else if (kiangArray[0][12].getName().equals(symbol) &&
             kiangArray[1][13].getName().equals(symbol) &&
             kiangArray[2][14].getName().equals(symbol) &&
             kiangArray[3][15].getName().equals(symbol)) //diagonal from 49-64
    {
      hasWon = true;
    }
    else if (kiangArray[0][15].getName().equals(symbol) &&
             kiangArray[1][14].getName().equals(symbol) &&
             kiangArray[2][13].getName().equals(symbol) &&
             kiangArray[3][12].getName().equals(symbol)) //diagonal from 52-61
    {
      hasWon = true;
    }
    else if (kiangArray[0][0].getName().equals(symbol) &&
             kiangArray[0][4].getName().equals(symbol) &&
             kiangArray[0][8].getName().equals(symbol) &&
             kiangArray[0][12].getName().equals(symbol)) //checks 1st 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[0][1].getName().equals(symbol) &&
             kiangArray[0][5].getName().equals(symbol) &&
             kiangArray[0][9].getName().equals(symbol) &&
             kiangArray[0][13].getName().equals(symbol)) //checks 2nd 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[0][2].getName().equals(symbol) &&
             kiangArray[0][6].getName().equals(symbol) &&
             kiangArray[0][10].getName().equals(symbol) &&
             kiangArray[0][14].getName().equals(symbol)) //checks 3rd 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[0][3].getName().equals(symbol) &&
             kiangArray[0][7].getName().equals(symbol) &&
             kiangArray[0][11].getName().equals(symbol) &&
             kiangArray[0][15].getName().equals(symbol)) //checks 4th 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[1][0].getName().equals(symbol) &&
             kiangArray[1][4].getName().equals(symbol) &&
             kiangArray[1][8].getName().equals(symbol) &&
             kiangArray[1][12].getName().equals(symbol)) //checks 5th 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[1][1].getName().equals(symbol) &&
             kiangArray[1][5].getName().equals(symbol) &&
             kiangArray[1][9].getName().equals(symbol) &&
             kiangArray[1][13].getName().equals(symbol)) //checks 6th 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[1][2].getName().equals(symbol) &&
             kiangArray[1][6].getName().equals(symbol) &&
             kiangArray[1][10].getName().equals(symbol) &&
             kiangArray[1][14].getName().equals(symbol)) //checks 7th 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[1][3].getName().equals(symbol) &&
             kiangArray[1][7].getName().equals(symbol) &&
             kiangArray[1][11].getName().equals(symbol) &&
             kiangArray[1][15].getName().equals(symbol)) //checks 8th 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[2][0].getName().equals(symbol) &&
             kiangArray[2][4].getName().equals(symbol) &&
             kiangArray[2][8].getName().equals(symbol) &&
             kiangArray[2][12].getName().equals(symbol)) //checks 9th 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[2][1].getName().equals(symbol) &&
             kiangArray[2][5].getName().equals(symbol) &&
             kiangArray[2][9].getName().equals(symbol) &&
             kiangArray[2][13].getName().equals(symbol)) //checks 10th 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[2][2].getName().equals(symbol) &&
             kiangArray[2][6].getName().equals(symbol) &&
             kiangArray[2][10].getName().equals(symbol) &&
             kiangArray[2][14].getName().equals(symbol)) //checks 11th 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[2][3].getName().equals(symbol) &&
             kiangArray[2][7].getName().equals(symbol) &&
             kiangArray[2][11].getName().equals(symbol) &&
             kiangArray[2][15].getName().equals(symbol)) //checks 12th 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[3][0].getName().equals(symbol) &&
             kiangArray[3][4].getName().equals(symbol) &&
             kiangArray[3][8].getName().equals(symbol) &&
             kiangArray[3][12].getName().equals(symbol)) //checks 13th 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[3][1].getName().equals(symbol) &&
             kiangArray[3][5].getName().equals(symbol) &&
             kiangArray[3][9].getName().equals(symbol) &&
             kiangArray[3][13].getName().equals(symbol)) //checks 14th 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[3][2].getName().equals(symbol) &&
             kiangArray[3][6].getName().equals(symbol) &&
             kiangArray[3][10].getName().equals(symbol) &&
             kiangArray[3][14].getName().equals(symbol)) //checks 15th 3d column down
    {
      hasWon = true;
    }
    else if (kiangArray[3][3].getName().equals(symbol) &&
             kiangArray[3][7].getName().equals(symbol) &&
             kiangArray[3][11].getName().equals(symbol) &&
             kiangArray[3][15].getName().equals(symbol)) //checks 16th 3d column down
    {
      hasWon = true;
    }
    
    
    
    else if (kiangArray[0][0].getName().equals(symbol) &&
             kiangArray[1][4].getName().equals(symbol) &&
             kiangArray[2][8].getName().equals(symbol) &&
             kiangArray[3][12].getName().equals(symbol)) //checks 1st side diagonal (1-61)
    {
      hasWon = true;
    }
    else if (kiangArray[0][1].getName().equals(symbol) &&
             kiangArray[1][5].getName().equals(symbol) &&
             kiangArray[2][9].getName().equals(symbol) &&
             kiangArray[3][13].getName().equals(symbol)) //checks 2nd side diagonal (2-62)
    {
      hasWon = true;
    }
    else if (kiangArray[0][2].getName().equals(symbol) &&
             kiangArray[1][6].getName().equals(symbol) &&
             kiangArray[2][10].getName().equals(symbol) &&
             kiangArray[3][14].getName().equals(symbol)) //checks 3rd side diagonal (3-63)
    {
      hasWon = true;
    }
    else if (kiangArray[0][3].getName().equals(symbol) &&
             kiangArray[1][7].getName().equals(symbol) &&
             kiangArray[2][11].getName().equals(symbol) &&
             kiangArray[3][15].getName().equals(symbol)) //checks 4th side diagonal (4-64)
    {
      hasWon = true;
    }
    else if (kiangArray[3][0].getName().equals(symbol) &&
             kiangArray[2][4].getName().equals(symbol) &&
             kiangArray[1][8].getName().equals(symbol) &&
             kiangArray[0][12].getName().equals(symbol)) //checks 1st opposite direction diagional (13-49)
    {
      hasWon = true;
    }
    else if (kiangArray[3][1].getName().equals(symbol) &&
             kiangArray[2][5].getName().equals(symbol) &&
             kiangArray[1][9].getName().equals(symbol) &&
             kiangArray[0][13].getName().equals(symbol)) //checks 2nd opposite direction diagional (14-50)
    {
      hasWon = true;
    }
    else if (kiangArray[3][2].getName().equals(symbol) &&
             kiangArray[2][6].getName().equals(symbol) &&
             kiangArray[1][10].getName().equals(symbol) &&
             kiangArray[0][14].getName().equals(symbol)) //checks 3rd opposite direction diagional (15-51)
    {
      hasWon = true;
    }
    else if (kiangArray[3][3].getName().equals(symbol) &&
             kiangArray[2][7].getName().equals(symbol) &&
             kiangArray[1][11].getName().equals(symbol) &&
             kiangArray[0][15].getName().equals(symbol)) //checks 4th opposite direction diagional (16-52)
    {
      hasWon = true;
    }
    
    
    else if (kiangArray[0][0].getName().equals(symbol) &&
             kiangArray[0][5].getName().equals(symbol) &&
             kiangArray[0][10].getName().equals(symbol) &&
             kiangArray[0][15].getName().equals(symbol)) //checks 1st 3d other diagonal (1-52)
    {
      hasWon = true;
    }
    
    else if (kiangArray[1][0].getName().equals(symbol) &&
             kiangArray[1][5].getName().equals(symbol) &&
             kiangArray[1][10].getName().equals(symbol) &&
             kiangArray[1][15].getName().equals(symbol)) //checks 2nd 3d other diagonal (5-56)
    {
      hasWon = true;
    }
    else if (kiangArray[2][0].getName().equals(symbol) &&
             kiangArray[2][5].getName().equals(symbol) &&
             kiangArray[2][10].getName().equals(symbol) &&
             kiangArray[2][15].getName().equals(symbol)) //checks 3rd 3d other diagonal (9-60)
    {
      hasWon = true;
    }
    else if (kiangArray[3][0].getName().equals(symbol) &&
             kiangArray[3][5].getName().equals(symbol) &&
             kiangArray[3][10].getName().equals(symbol) &&
             kiangArray[3][15].getName().equals(symbol)) //checks 4th 3d other diagonal (13-64)
    {
      hasWon = true;
    }
    
    else if (kiangArray[0][3].getName().equals(symbol) &&
             kiangArray[0][6].getName().equals(symbol) &&
             kiangArray[0][9].getName().equals(symbol) &&
             kiangArray[0][12].getName().equals(symbol)) //checks 1st 3d other diagonal (4-49)
    {
      hasWon = true;
    }
    
    else if (kiangArray[1][3].getName().equals(symbol) &&
             kiangArray[1][6].getName().equals(symbol) &&
             kiangArray[1][9].getName().equals(symbol) &&
             kiangArray[1][12].getName().equals(symbol)) //checks 2nd 3d other diagonal (8-53)
    {
      hasWon = true;
    }
    else if (kiangArray[2][3].getName().equals(symbol) &&
             kiangArray[2][6].getName().equals(symbol) &&
             kiangArray[2][9].getName().equals(symbol) &&
             kiangArray[2][12].getName().equals(symbol)) //checks 3rd 3d other diagonal (12-57)
    {
      hasWon = true;
    }
    else if (kiangArray[3][3].getName().equals(symbol) &&
             kiangArray[3][6].getName().equals(symbol) &&
             kiangArray[3][9].getName().equals(symbol) &&
             kiangArray[3][12].getName().equals(symbol)) //checks 4th 3d other diagonal (16-61)
    {
      hasWon = true;
    } //72 ways to win?
    else if (kiangArray[0][0].getName().equals(symbol) &&
             kiangArray[1][5].getName().equals(symbol) &&
             kiangArray[2][10].getName().equals(symbol) &&
             kiangArray[3][15].getName().equals(symbol)) //checks the diagonal that spans the length of the cube (1-64)
    {
      hasWon = true;
    }
    else if (kiangArray[0][3].getName().equals(symbol) &&
             kiangArray[1][6].getName().equals(symbol) &&
             kiangArray[2][9].getName().equals(symbol) &&
             kiangArray[3][12].getName().equals(symbol)) //checks the other diagonal that spans the length of the cube (4-61)
    {
      hasWon = true;
    }
  }
}