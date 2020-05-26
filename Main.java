class Main {

public static int rnd(int min, int max)
{
	max -= min;
	return (int) (Math.random() * ++max) + min;
}

  public static void main(String[] args) {

    int[][] mas = new int[10][10];
    final int minr = -50; // Минимальное число для диапазона
  	final int maxr = 50; // Максимальное число для диапазона

    for (int i = 0; i<10; i++)
    {
      for (int j = 0; j<10; j++)
      {
        mas[i][j] = rnd(minr, maxr);
        System.out.print(mas[i][j] + " | ");
      }
      System.out.println("");
    }

    int max1 = mas[0][0];
    int max2 = mas[0][9];
    for (int i = 0; i<10; i++)
    {
      if (mas[i][i]>max1) max1 = mas[i][i];
    }

    for (int i = 0; i<10; i++)
    {
      if (mas[i][9-i]>max2) max2 = mas[i][9-i];
    }

    System.out.println("max1 = " + max1 + " max2 = " + max2);
    int sum = 0;
    for (int i = 0; i<10;i++)
    {
      for (int j = 0; j<10;j++)
      {
        sum +=mas[j][i];
      }
       System.out.println("sum" + i + " = " + sum);
       sum = 0;
    }

  }
}