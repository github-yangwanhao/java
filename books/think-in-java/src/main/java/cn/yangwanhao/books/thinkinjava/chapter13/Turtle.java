package cn.yangwanhao.books.thinkinjava.chapter13;

import java.io.PrintStream;
import java.util.Formatter;

import lombok.AllArgsConstructor;

/**
 * string formatter
 *
 * @author yangwh@yunrong.cn
 * @version V3.0
 * @since 2020/11/18 16:55
 */
@AllArgsConstructor
public class Turtle {

    private String name;

    private Formatter f;

    public void move(int x, int y) {
        f.format("%s The turtle now is at (%d, %d)\n", name, x, y);
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.out;
        Turtle turtle1 = new Turtle("Turtle1", new Formatter(outAlias));
        Turtle turtle2 = new Turtle("Turtle2", new Formatter(System.err));
        turtle1.move(0, 0);
        turtle2.move(1, 1);
    }
}
