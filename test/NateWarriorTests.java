import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NateTests
{
    @Test
    public void testNateWarriorStrategyAgainstSameNationWarrior()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWarrior("Nate", "0", 100, nateWarriorStrategy);
        People Josh = new NateWarrior("Nate", "0", 100, nateWarriorStrategy);

        assertEquals(100, nateWarriorStrategy.strategy(Franq, Josh));

        People FranqTookDamage = new NateWarrior("Nate", "0", 50, nateWarriorStrategy);
        People JoshTookDamage = new NateWarrior("Nate", "0", 50, nateWarriorStrategy);

        assertEquals(50, nateWarriorStrategy.strategy(FranqTookDamage, JoshTookDamage));

        assertEquals(100, nateWarriorStrategy.strategy(Josh, FranqTookDamage));
    }

    @Test
    public void testNateWarriorStrategyNationNotEqualAndLifePoints100()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWarrior("Nate", "0", 100, nateWarriorStrategy);
        People Gunther = new NateWarrior("Bux", "0", 100, nateWarriorStrategy);

        assertEquals(95, nateWarriorStrategy.strategy(Franq, Gunther));
    }

    @Test
    public void testNateWarriorStrategyNationNotEqualAndLifePointsGreaterThanOpponent()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWarrior("Nate", "0", 76, nateWarriorStrategy);
        People Gunther = new NateWarrior("Bux", "0", 45, nateWarriorStrategy);

        assertEquals(45, nateWarriorStrategy.strategy(Franq, Gunther));
    }

    @Test
    public void testNateWarriorStrategyNationNotEqualAndLifePointsEqual()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWarrior("Nate", "0", 60, nateWarriorStrategy);
        People Gunther = new NateWarrior("Bux", "0", 60, nateWarriorStrategy);

        assertEquals(60, nateWarriorStrategy.strategy(Franq, Gunther));
    }

    @Test
    public void testNateWarriorStrategyNationNotEqualAndLifePointsLessThanOpponent()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        People Franq = new NateWarrior("Nate", "0", 67, nateWarriorStrategy);
        People Gunther = new NateWarrior("Bux", "0", 70, nateWarriorStrategy);

        assertEquals(60, nateWarriorStrategy.strategy(Franq, Gunther));
    }

    @Test
    public void testNateWarriorStrategyNationEqualAndAWizardIsEncountered()
    {
        NateWarriorStrategy nateWarriorStrategy = new NateWarriorStrategy();
        NateWizardStrategy nateWizardStrategy = new NateWizardStrategy();
        People Franq = new NateWarrior("Nate", "0", 67, nateWarriorStrategy);
        People Gunther = new NateWizard("Nate", "0", 70, nateWizardStrategy);

        assertEquals(74, nateWarriorStrategy.strategy(Franq, Gunther));
        assertEquals(63, nateWarriorStrategy.strategy(Gunther, Franq));
    }
}
