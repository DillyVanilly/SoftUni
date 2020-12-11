import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroesOfCodeAndLogicVII {
    static class Heroes {
        String name;
        int hitPoint;
        int manePoint;

        public Heroes(String name, int hp, int mp) {
            this.name = name;
            this.hitPoint = Math.min(hp, 100);
            this.manePoint = Math.min(mp, 200);
        }

        public int getHitPoint() {
            return hitPoint;
        }

        public void setHitPoint(int hitPoint) {
            this.hitPoint = hitPoint;
        }

        public int getManePoint() {
            return manePoint;
        }

        public void setManePoint(int manePoint) {
            this.manePoint = manePoint;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Heroes> heroesMap = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int hp = Integer.parseInt(input[1]);
            int mp = Integer.parseInt(input[2]);
            Heroes hero = new Heroes(name, hp, mp);
            heroesMap.put(name, hero);
        }

        String commands = scanner.nextLine();
        while (!commands.equals("End")) {
            String[] tokens = commands.split(" - ");
            String command = tokens[0];
            String heroName = tokens[1];

            switch (command) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(tokens[2]);
                    String spellName = tokens[3];
                    if (heroesMap.get(heroName).getManePoint() >= mpNeeded) {
                        int pointsLeft = heroesMap.get(heroName).getManePoint() - mpNeeded;
                        System.out.println(heroName + " has successfully cast " + spellName
                                + " and now has " + pointsLeft + " MP!");
                        heroesMap.get(heroName).setManePoint(pointsLeft);
                    } else {
                        System.out.println(heroName + " does not have enough MP to cast " + spellName + "!");
                    }
                    break;

                case "TakeDamage":
                    int damage = Integer.parseInt(tokens[2]);
                    String attacker = tokens[3];
                    int pointsLeft = heroesMap.get(heroName).getHitPoint() - damage;
                    if (pointsLeft > 0) {
                        System.out.println(heroName + " was hit for " + damage + " HP by " + attacker
                                + " and now has " + pointsLeft + " HP left!");
                        heroesMap.get(heroName).setHitPoint(pointsLeft);
                    } else {
                        System.out.println(heroName + " has been killed by " + attacker + "!");
                        heroesMap.remove(heroName);
                    }
                    break;

                case "Recharge":
                    int mpAmount = Integer.parseInt(tokens[2]);
                    int currentMP = heroesMap.get(heroName).getManePoint();
                    int res = mpAmount;
                    if (currentMP + mpAmount >= 200) {
                        heroesMap.get(heroName).setManePoint(200);
                        res = 200 - currentMP;
                    }else {
                        heroesMap.get(heroName).setManePoint(currentMP + mpAmount);
                    }
                    System.out.println(heroName + " recharged for " + res + " MP!");
                    break;

                case "Heal":
                    int hpAmount = Integer.parseInt(tokens[2]);
                    int currentHP = heroesMap.get(heroName).getHitPoint();
                    int rest = hpAmount;
                    if (currentHP + hpAmount >= 100) {
                        heroesMap.get(heroName).setHitPoint(100);
                        rest = 100 - currentHP;
                    }else {
                        heroesMap.get(heroName).setHitPoint(currentHP + hpAmount);
                    }
                    System.out.println(heroName + " healed for " + rest + " HP!");
                    break;
            }
            commands = scanner.nextLine();
        }
        heroesMap.values().stream()
                .sorted((a, b) -> Integer.compare(b.getHitPoint(), a.getHitPoint()))
                .forEach(h ->
                        System.out.printf("%s%n  HP: %d%n  MP: %s%n",
                                h.getName(), h.getHitPoint(), h.getManePoint()));
    }
}