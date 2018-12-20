package example;

/**
 * Created by shenwd on 2017/2/6.
 */
public class Books {
    String title;
    String author;

}

class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        //创建Books对象
        myBooks[0] = new Books();
        myBooks[2] = new Books();
        //对象的属性
        myBooks[0].title = "the grapes of java";
//        myBooks[1].title = "the java gatsby";
        myBooks[2].title = "the java cookbook";
        myBooks[0].author = "bob";
//        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x < 3) {
            System.out.println(myBooks[x].title);
            System.out.println("by");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
