package pertemuan8.soal2;

public class Zombie extends Entity{
    enum type{
        MEELE,
        RANGED
    }
    private type types;

    public Zombie(int level, int hp, type types){
        super(level, hp);
        this.types = types;
    }
    public void entityInfo(){
        System.out.println("# ZOMBIE DENGAN TIPE : " + types + ", DAN LEVEL : " + getLevel());
    }

    public void attack(Player player){
        if(getHp() > 0){
            switch (types){
            case MEELE :
                if(player.getHp() > 0){
                    player.minHp(20);
                    System.out.println("player : UGHH");
                    cekMati(player);
                }else{
                    cekMati(player);
                }
            case RANGED :
                if(player.getHp() > 0){
                    player.minHp(15);
                    System.out.println("player : UGHH");
                    cekMati(player);
                }else{
                    cekMati(player);
                }
        }
        }else{
            System.out.println("# ZOMBIE SUDAH MATI");
        }
    }
}
