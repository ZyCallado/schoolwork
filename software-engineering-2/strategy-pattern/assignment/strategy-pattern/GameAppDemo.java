public class GameAppDemo {
    public static void main(String[] args) {
        Character knight = new Character(new SwingSword(), new Shield());
        knight.attack();
        knight.defend();
        knight.setDefenseStrategy(new Dodge());
        knight.defend();
        knight.setDefenseStrategy(new CreateMagic());
        knight.defend();

        System.out.println();

        Character wizard = new Character(new CastSpell(), new CreateMagic());
        wizard.attack();
        wizard.defend();

        System.out.println();

        Character archer = new Character(new ShootArrow(), new Dodge());
        archer.attack();
        archer.defend();
    }
}
