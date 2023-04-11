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
    People me = new MarieWarrior("Minions","1",35,warriorPeacefulStrategy);
    People other = new MarieWarrior("Minions", "1", 40,warriorPeacefulStrategy);
    assertEquals(65, warriorPeacefulStrategy.strategy(me,other));
}
}
