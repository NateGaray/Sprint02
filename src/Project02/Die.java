package Project02;

import java.util.Random;

public class Die
{
    int dieFaces = 0;

    Random random = new Random(System.currentTimeMillis());

    int die;

    public void setDie(int dieFace)
    {
        this.dieFaces = dieFace;
    }
    public int getDie()
    {
        return dieFaces;
    }

    public void rollDie()
    // die should have faces greater than 2
    {
        die = random.nextInt(dieFaces);
    }
}
// class with an arbitrary number of  faces of die
// have a rol dice method
// call said class in the roll method
// have it call based on the  number 