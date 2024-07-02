package class0520;
class Tree{
    private String color;

    public void setTree(String color){
        this.color = color;

    }
}
class AppleTree extends Tree{
    @Override
    public void setTree(String color){
        super.setTree(color);

        System.out.println(color + "색상으로 설정했습니다.");
    }
}
public class Test05201 {
    public static void main(String[] args) {
        AppleTree s = new AppleTree();
        s.setTree("노란색");
    }
}
