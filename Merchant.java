import java.util.ArrayList;

public class Merchant extends Entity{
    private ArrayList<String> list_item;
    public ArrayList<String> getList_item() {
        return list_item;
    }
    public Merchant(int level, int hp, ArrayList list_item){
        super(level, hp);
        this.list_item = list_item;
    }
    public void entityInfo(){
        System.out.println("# MERCHANT DENGAN LEVEL : " + getLevel());
    }
}
