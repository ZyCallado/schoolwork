import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallsTextOffer {
    private static final Map<String, String> unliCallTextMap = new HashMap<>();

    static {
        unliCallTextMap.put("Smart", " no free calls or texts, and you will be charged per use.");
        unliCallTextMap.put("Globe", "unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.");
        unliCallTextMap.put("Ditto", "unlimited calls and texts to all networks within the country.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        String offer = unliCallTextMap.getOrDefault(telcoName, "No unlimited calls and texts information available");
        return telcoName + " offers " + offer;
    }
}