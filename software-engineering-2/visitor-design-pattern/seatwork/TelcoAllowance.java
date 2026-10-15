import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {
    private static final Map<String, String> allowanceMap = new HashMap<>();

    static {
        allowanceMap.put("Smart", "15GB of data");
        allowanceMap.put("Globe", "10GB of data");
        allowanceMap.put("Ditto", "8GB of data");
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        String allowance = allowanceMap.getOrDefault(telcoName, "No data allowance information available");
        return telcoName + " offers " + allowance + " for P" + money + " per month.";
    }
}