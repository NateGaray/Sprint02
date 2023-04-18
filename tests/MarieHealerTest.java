import Project02.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MarieHealerTest {
    @Test
    public void testHealerStrategy(){
        MarieHealerStrategy strategy = new MarieHealerStrategy();
        People me = new MarieWarrior("Minions","1",55,strategy);
        People other = new MarieWizard("Minions", "1",65,strategy);
        People healer = new MarieHealer("Minions","1",PeopleType.warrior,65,strategy);


    }

}
