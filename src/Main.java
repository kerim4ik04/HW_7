public class Main {
    public static void main(String[] args) {
        Hero hero [] = {new Medic(), new Magic(), new Varrior()};
        for (int i = 0; i < hero.length; i++) {
            hero[i].applySuperAbility();

        }

    }
}