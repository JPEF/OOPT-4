public class Mainclass {

    public static void main(String[] args) {
        WeaponBehavior sword = new SwordBehavior();
        WeaponBehavior axe = new AxeBehavior();
        WeaponBehavior club = new ClubBehavior();
        WeaponBehavior knife = new KnifeBehavior();
        Queen q = new Queen(knife);
        q.fight();
        Knight knight = new Knight(sword);
        knight.fight();
        King king = new King(axe);
        king.fight();
        Troll t = new Troll(club);
        t.fight();
        t.setWeapon(axe);
        t.fight();
    }
}
