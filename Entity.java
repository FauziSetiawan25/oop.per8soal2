package pertemuan8.soal2;

public class Entity {
    private int level;

    private int hp;
    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }
    public void minHp(int hps) {
        this.hp = hp - hps;
    }

    public Entity(int level, int hp){
        this.level = level;
        this.hp = hp;
    }
    public void cekMati(Player player){
        if(player.getHp() <= 0){
            System.out.println("# YOU DIE, GAME OVER");
        }
    }
    public void cekMati(Merchant merchant){
        if(merchant.getHp() <= 0){
            System.out.println("Merchant : Dah lah males jualan");
        }
    }
    public void cekMati(Zombie zombie){
        if(zombie.getHp() <= 0){
            System.out.println("# ZOMBIE MATI");
        }
    }
}
