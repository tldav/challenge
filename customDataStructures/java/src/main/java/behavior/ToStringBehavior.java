package behavior;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ToStringBehavior {
    private static ToStringBehavior toStringBehavior;
    private final Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().disableHtmlEscaping().create();
    
    public static ToStringBehavior getInstance() {
        if (toStringBehavior == null) {
            return new ToStringBehavior();
        }
        return toStringBehavior;
    }
    
    public void print(Object objectToPrint) {
        if (objectToPrint != null) {
            System.out.print(objectToPrint.getClass().getSimpleName() + ": ");
        }
        System.out.println(this.gson.toJson(objectToPrint));
    }
    
    public void print(Object... objectList) {
        for (Object object : objectList) {
            this.print(object);
        }
    }
}
