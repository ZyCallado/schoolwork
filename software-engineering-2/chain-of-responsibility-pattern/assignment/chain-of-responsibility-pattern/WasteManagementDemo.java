public class WasteManagementDemo {
    public static void main(String[] args) {
        System.out.println("=== Waste Management System Demo ===\n");
        
        // Create the container chain
        ContainerChain chain = new ContainerChain();
        
        // Test 1: Liquid waste
        System.out.println("Test 1: Collecting liquid waste (50 units)");
        Waste liquidWaste = new Waste("liquid", 50);
        chain.collectWaste(liquidWaste);
        System.out.println();
        
        // Test 2: Solid waste
        System.out.println("Test 2: Collecting solid waste (75 units)");
        Waste solidWaste = new Waste("solid", 75);
        chain.collectWaste(solidWaste);
        System.out.println();
        
        // Test 3: Organic waste
        System.out.println("Test 3: Collecting organic waste (60 units)");
        Waste organicWaste = new Waste("organic", 60);
        chain.collectWaste(organicWaste);
        System.out.println();
        
        // Test 4: Recyclable waste
        System.out.println("Test 4: Collecting recyclable waste (40 units)");
        Waste recyclableWaste = new Waste("recyclable", 40);
        chain.collectWaste(recyclableWaste);
        System.out.println();
        
        // Test 5: Hazardous waste
        System.out.println("Test 5: Collecting hazardous waste (100 units)");
        Waste hazardousWaste = new Waste("hazardous", 100);
        chain.collectWaste(hazardousWaste);
        System.out.println();
        
        // Test 6: Overflow scenario (triggers disposal)
        System.out.println("Test 6: Collecting more liquid waste (120 units) - exceeds capacity");
        Waste largeWaste = new Waste("liquid", 120);
        chain.collectWaste(largeWaste);
        System.out.println();
        
        System.out.println("=== Demo Complete ===");
    }
}