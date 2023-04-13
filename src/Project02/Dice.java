package Project02;

import java.util.Date;
import java.util.Random;

public class Dice
{
    int dieFaces = 0;

    Random random = new Random(System.currentTimeMillis());

    int die = random.nextInt(dieFaces) + 2;

    public void setDie(int dieFace)
    {
        this.dieFaces = dieFace;
    }
    public int getDie()
    {
        return dieFaces;
    }

    public void rollDie()
    // every roll should come up with a number between 1 and 10
    // die should have faces greater than 2
    {
        die = (int) (Math.random() * 10) + 1;
    }
}
// class with an abituary number of  faces of die
// have a rol dice method
// call said class in the roll method
// have it call based on the  number 