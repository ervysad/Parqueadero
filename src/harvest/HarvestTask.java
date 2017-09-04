package harvest;

import becker.robots.*;

/** A program to harvest a field of things 5 columns wide and 6 rows high.
 *
 *  @author Byron Weber Becker */
public class HarvestTask
{
	public static void main (String[] args)
	{
                int placa = 0;
                City stLouis = new City("Field.txt");
		stLouis.showThingCounts(true);
                Robot mark = new Robot(stLouis,0, 7, Direction.WEST, placa);
                		
		mark.move ();
        	mark.move ();
	}
}

