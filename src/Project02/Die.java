package Project02;

import java.util.Random;

public class Die
{
    int dieFaces = 0;

    Random random = new Random(System.currentTimeMillis());

    int die;

    public void setDie(int dieFace)
    {
        this.dieFaces = dieFace + 2;
    }
    public int getDie()
    {
        return dieFaces;
    }

    public void rollDie()
    // every roll should come up with a number between 1 and 10
    // die should have faces greater than 2
    {
        die = random.nextInt(dieFaces);
    }
}
// class with an arbitrary number of  faces of die
// have a rol dice method
// call said class in the roll method
// have it call based on the  number 