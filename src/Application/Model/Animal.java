package Application.Model;

import java.util.HashMap;
import java.util.Map;


public class Animal {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //VARIABLES
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private final Integer ID;
    private final Integer TYPE;
    private Map<Integer, Integer> foodNeeded = new HashMap<>();
    private boolean assigned = false;
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //CLASS
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Animal(Integer ID, Integer TYPE) {
        this.ID = ID;
        this.TYPE = TYPE;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //GETTERS AND SETTERS
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int getID() {
        return ID;
    }
    public int getTYPE() {
        return TYPE;
    }
    public Map<Integer, Integer> getFoodNeeded() {
        return foodNeeded;
    }
    public void setFoodNeeded(Map<Integer, Integer> foodNeeded) {
        this.foodNeeded = foodNeeded;
    }
    public boolean isAssigned() {
        return assigned;
    }
    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

}
