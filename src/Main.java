public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealht(500);
        boss.setDamege(30);
        boss.setBossBarier("Алмазная бронь");
        System.out.println("Жизнь Босса: " + boss.getHealht());
        System.out.println("Урон Босса: " + boss.getDamege());
        System.out.println("Тип защиты Босса: " + boss.getBossBarier());
    }
}
