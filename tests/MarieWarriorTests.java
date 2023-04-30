import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MarieWarriorTests {
@Test
    public void testWarriorStrategy1(){
    MarieWarriorStrategy warriorStrategy = new MarieWarriorStrategy();
    People me = new MarieWarrior("Minions", "2",100,warriorStrategy);
    People other = new MarieWarrior("Idiots","1",35,warriorStrategy);
    assertEquals(8,warriorStrategy.strategy(me, other));
}

@Test
    public void testWarriorStrategy2(){
    MarieWarriorStrategy warriorStrategy = new MarieWarriorStrategy();
    People me = new MarieWarrior("Minions","2",35,warriorStrategy);
    People other = new MarieWarrior("Idiots", "1", 100,warriorStrategy);
    assertEquals(50,warriorStrategy.strategy(me, other));
}

@Test
    public void testWarriorPeacefulOtherMorePoints(){
    MarieWarriorStrategy warriorPeacefulStrategy = new MarieWarriorStrategy();
    People me = new MarieWarrior("Idiots","2",35,warriorPeacefulStrategy);
    People other = new MarieWarrior("Minions", "1", 40,warriorPeacefulStrategy);
    assertEquals(20, warriorPeacefulStrategy.strategy(me,other));
}

@Test
    public void testOffensiveStrategy()
{
    MarieOffensiveStrategy offensiveStrategy = new MarieOffensiveStrategy();
    People me = new MarieWizard("Idiots","2",55, offensiveStrategy);
    People other = new MarieWarrior("Minons","1",100, offensiveStrategy);
    assertEquals(40,offensiveStrategy.strategy(me,other));
}

@Test
    public void testArtifactStrategy()
{
    MarieArtifactStrategy artifactStrategy = new MarieArtifactStrategy();
    People me = new MarieWarrior("Idiots","2",55,artifactStrategy);
    People other = new MarieWarrior("Minons","1",100,artifactStrategy);
    assertEquals(100,artifactStrategy.strategy(me,other));
}
}

