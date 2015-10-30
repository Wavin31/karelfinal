import kareltherobot.*;
/**
 * driver class HunterDriver - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class HunterDriver implements Directions
{
    public static void main(String[] args)
    {
        World.reset();
        World.setDelay(1);
        World.readWorld("treasureWorld.kwld");
        World.setTrace(true);
        World.setVisible(true);
        TreasureHunter shay1= new TreasureHunter(2, 2, North, 0);
        shay1.work();
    }
}
