public class Main {
    public static void main(String[] args) {
        createHeroes();
        for (Hero heroes : createHeroes()) {
            System.out.println("жизнь героя: " + heroes.getHealth() + " Урон героя: " + heroes.getDamage() + " Тип защиты героя " + heroes.getSuperPower());
        }

        Boss boss = new Boss();
        boss.setHealht(500);
        boss.setDamege(30);
        boss.setBossBarier("Алмазная бронь");
        System.out.println("Жизнь Босса: " + boss.getHealht());
        System.out.println("Урон Босса: " + boss.getDamege());
        System.out.println("Тип защиты Босса: " + boss.getBossBarier());
    }

    public static Hero[] createHeroes() {
        Hero subZero = new Hero(1000, 10000, "freeze the enemy");
        Hero scorpion = new Hero(1000, 15000);
        Hero raiden = new Hero(500, 1000, "lightning");
        return new Hero[]{subZero, scorpion, raiden};
    }
}