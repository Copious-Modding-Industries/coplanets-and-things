package copious;
import arc.util.*;
import mindustry.mod.*;
import copious.content.*;
import copious.content.planets.*;
public class CopiousPlanets extends Mod {

    public CopiousPlanets(){
    }

    @Override
    public void loadContent(){
        CPlanets.load();
        CBlocks.load();
        Log.info("Finished loading");
    }

}