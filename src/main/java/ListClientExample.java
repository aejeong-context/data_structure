import java.util.ArrayList;
import java.util.List;

public class ListClientExample {
  private List list;

  public ListClientExample() {
    this.list = new ArrayList();
  }

  private List getList(){
    return list;
  }

  public static void main(String[] args) {
    ListClientExample listClient = new ListClientExample();
    String list= listClient.getList().getClass().getName();


    System.out.println(list);
  }
}
