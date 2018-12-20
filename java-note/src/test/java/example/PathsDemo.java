package example;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Shen on 2017/6/23.
 */
public class PathsDemo {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/shen/workspace/webserver");
        System.out.println(path.resolve("case.json"));
    }
}
