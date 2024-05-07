public class Player extends Entity{
    private String nama;
    public String getNama() {
        return nama;
    }
    public Player(int level, int hp, String nama){
        super(level, hp);
        this.nama = nama;
    }
    public void entityInfo(){
        System.out.println("# PLAYER DENGAN NAMA : " + nama + ", DAN LEVEL : " + getLevel());
    }

    public void interact(Merchant merchant){
        if(getHp() > 0){
            if(merchant.getHp() > 0){
                System.out.println("Mechant : ");
                System.out.println("Barang yang tersedia hari ini");
                for (int i = 0; i < merchant.getList_item().size(); i++){
                    System.out.println("# " + merchant.getList_item().get(i));
                }
            }else {
                System.out.println("# TIDAK BISA DIBELI MERCHANT NGAMBEK");
            }
        }else {
            System.out.println("# PLAYER SUDAH MATI");
        }


    }
    public void attack(Merchant merchant){
        if(getHp() > 0){
            if(merchant.getHp() > 0){
                merchant.minHp(10);
                System.out.println("merchant : hey heyy, ngapain nyerang");
                cekMati(merchant);
            }
        }else {
            System.out.println("# PLAYER SUDAH MATI");
        }
    }
    public void attack(Zombie zombie){
        if(getHp() > 0){
            if(zombie.getHp() > 0){
                zombie.minHp(10);
                System.out.println("zombie : GRAAA!");
                cekMati(zombie);
            }
        }else {
            System.out.println("# PLAYER SUDAH MATI");
        }
    }
}
