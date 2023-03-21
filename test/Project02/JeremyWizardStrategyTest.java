package Project02;

import org.junit.jupiter.api.Test;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class JeremyWizardStrategyTest
{
        @Test
        public void testToSeeIfOtherNationWillTakeDamage()
        {
            JeremyWizardStrategy jeremyWizardStrategy = new JeremyWizardStrategy();
            People Dan = new JeremyWizard("Idiot", "0", 100, jeremyWizardStrategy);
            People Bob = new JeremyWizard("Minion", "1", 99, jeremyWizardStrategy);

            assertEquals(96, jeremyWizardStrategy.strategy(Dan, Bob));

            People Jeremy = new JeremyWizard("Jeremy", "2", 100, jeremyWizardStrategy);

            assertEquals(94, jeremyWizardStrategy.strategy(Dan, Jeremy));
        }

        @Test
        public void testIfWizardWillRunAway()
        {
            JeremyWizardStrategy jeremyWizardStrategy = new JeremyWizardStrategy();
            People Dan = new JeremyWizard("Minion", "0", 100, jeremyWizardStrategy);
            People Bob = new JeremyWizard("Minion", "1", 100, jeremyWizardStrategy);

            assertEquals(100, jeremyWizardStrategy.strategy(Dan, Bob));
        }

        @Test
        public void testIfWizardWillHealAnotherFriend()
        {
            JeremyWizardStrategy jeremyWizardStrategy = new JeremyWizardStrategy();
            People Dan = new JeremyWizard("Idiot", "0", 90, jeremyWizardStrategy);
            People Bob = new JeremyWizard("Idiot", "0", 10, jeremyWizardStrategy);

            assertEquals(81, jeremyWizardStrategy.strategy(Dan, Bob));
        }

}
