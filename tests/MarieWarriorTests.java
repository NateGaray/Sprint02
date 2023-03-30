import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MarieWarriorTests {
    @Test
    public void testMyWarriorIsAlwaysOnGuardOtherIsNotWarrior(){
        MarieWarriorStrategy marieWarriorStrategy = new MarieWarriorStrategy();
        People people = new MarieWarrior("Minions", "3",100,marieWarriorStrategy);
        People other = new MarieWizard("Idiots", "2", 99, marieWarriorStrategy);

        assertEquals(78,marieWarriorStrategy.strategy(people, other));
    }

    @Test
    public  void testMyWarriorOtherWizardHasLessPoints(){
        MarieWarriorStrategy marieWarriorStrategy = new MarieWarriorStrategy();
        People mePeople = new MarieWarrior("Idiots", "2", 100,marieWarriorStrategy);
        People other = new MarieWizard("Minions", "1", 98, marieWarriorStrategy);
        assertEquals(77,marieWarriorStrategy.strategy(mePeople,other));
    }

    @Test
    public void testOtherWarriorAlsoAndPointsLessThanMeWarrior(){
        MarieWarriorStrategy marieWarriorStrategy = new MarieWarriorStrategy();
        People meWarrior = new MarieWarrior("Idiots","2",98,marieWarriorStrategy);
        People otherWarrior = new MarieWarrior("Minions", "3", 97,marieWarriorStrategy);
        assertEquals(72,marieWarriorStrategy.strategy(meWarrior,otherWarrior));
    }

    @Test
    public void testOtherWarriorAlsoButPointsEqualToMeWarrior(){
        MarieWarriorStrategy marieWarriorStrategy = new MarieWarriorStrategy();
        People meWarrior = new MarieWarrior("Idiots","2",55,marieWarriorStrategy);
        People otherWarrior = new MarieWarrior("Minions", "3",55,marieWarriorStrategy);
        assertEquals(25,marieWarriorStrategy.strategy(meWarrior,otherWarrior));
    }

    @Test
    public void testIfBothWarriorButOtherPointsGreaterThanMe(){
        MarieWarriorStrategy marieWarriorStrategy = new MarieWarriorStrategy();
        People meWarrior = new MarieWarrior("Idiots", "2", 56,marieWarriorStrategy);
        People otherWarrior = new MarieWarrior("Minions", "3", 65, marieWarriorStrategy);
        assertEquals(46, marieWarriorStrategy.strategy(meWarrior,otherWarrior));
    }

    @Test
    public void testIfMeWizardAndOtherWarrior(){
        MarieWarriorStrategy marieWarriorStrategy = new MarieWarriorStrategy();
        People meWizard = new MarieWizard("Idiots", "2",56,marieWarriorStrategy);
        People otherWarrior = new MarieWarrior("Minions", "3",65,marieWarriorStrategy);
        assertEquals(36,marieWarriorStrategy.strategy(meWizard,otherWarrior));
    }
}
