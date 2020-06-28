package cn.yangwanhao.writtenexamination;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 题目：从一副牌中随机抽取五张牌，判断是否为同花顺(连续的同花色五张)
 * 题目只要求描述思路，这里顺带用代码实现一下
 *
 * @author 杨万浩
 * @since 2020/6/27 17:22
 */
public class FlushTest {

    private static final String SPADE = "黑桃";
    private static final String HEART = "红桃";
    private static final String CLUB = "梅花";
    private static final String DIAMOND = "方块";
    private static final String JOKER = "大小王";

    private static final String[] TYPES = new String[] {
        SPADE, HEART, CLUB, DIAMOND
    };

    private static final int PAPER_NUM = 5;

    public static void main(String[] args) throws InterruptedException {
        /*
         * 题目要求：从54张牌中随机抽取五张,判断是否为同花顺，其中大小王可以当做任意牌
         * 同花顺：点数连续的五张同花色的牌(五张，点数连续，同花色)
         */
        // 随机抽取的方法在下面注释掉了，使用Random实现，太过随缘(成功率太低)，这里使用几组数据模拟
        // 这里使用11代表J 12代表Q 13代表K 14代表小王 15代表大王 大小王的type为“王”

        // 准备数据

        // 第一组数据 不通过 花色不同
        /*List<PaperCard> testList1 = new ArrayList<>(PAPER_NUM);
        testList1.add(new PaperCard(1, SPADE));
        testList1.add(new PaperCard(2, SPADE));
        testList1.add(new PaperCard(3, CLUB));
        testList1.add(new PaperCard(4, SPADE));
        testList1.add(new PaperCard(15, JOKER));
        // 第二组数据 通过 有一个小王
        List<PaperCard> testList2 = new ArrayList<>(PAPER_NUM);
        testList2.add(new PaperCard(8, HEART));
        testList2.add(new PaperCard(9, HEART));
        testList2.add(new PaperCard(11, HEART));
        testList2.add(new PaperCard(12, HEART));
        testList2.add(new PaperCard(14, JOKER));
        // 第三组数据 不通过 有一个大王但是中间差值为2
        List<PaperCard> testList3 = new ArrayList<>(PAPER_NUM);
        testList3.add(new PaperCard(3, DIAMOND));
        testList3.add(new PaperCard(4, DIAMOND));
        testList3.add(new PaperCard(7, DIAMOND));
        testList3.add(new PaperCard(8, DIAMOND));
        testList3.add(new PaperCard(15, JOKER));
        // 第四组数据 通过 中间差值为2 但是有两个王
        List<PaperCard> testList4 = new ArrayList<>(PAPER_NUM);
        testList4.add(new PaperCard(4, HEART));
        testList4.add(new PaperCard(14, JOKER));
        testList4.add(new PaperCard(6, HEART));
        testList4.add(new PaperCard(15, JOKER));
        testList4.add(new PaperCard(8, HEART));

        // 执行测试
        System.out.println(isFlush(testList1));
        System.out.println(isFlush(testList2));
        System.out.println(isFlush(testList3));
        System.out.println(isFlush(testList4));*/

        /*
         * 下边是模拟抽取五张牌的代码 但是这个太随缘了 成功率太低 所以手动使用集合来测试
         */
        boolean flag = true;
        int executeCount = 0;
        do {
            executeCount++;
            List<PaperCard> paperCards = getPaperCards();
            System.out.println(paperCards);
            Boolean flush = isFlush(paperCards);
            System.out.println(flush);
            if (flush) {
                flag = false;
            }
            // 为防止生成的随机数太过相近，让线程休眠一下
            Thread.sleep(50);
        } while (flag);
        System.out.println("总执行次数：" + executeCount);
    }

    private static List<PaperCard> getPaperCards() {
        Random random = new Random();
        List<PaperCard> paperCardList = new ArrayList<>(PAPER_NUM);
        do {
            PaperCard paperCard = new PaperCard();
            // 随机产生点数
            int num = random.nextInt(15) + 1;
            // 14 15 只能产生一次(按理说其他点数也只能产生4次 但是这里就不处理了)
            if (num == 14 || num ==15) {
                if (paperCardList.contains(num)) {
                    continue;
                }
                paperCard.num = num;
                paperCard.type = JOKER;
            } else {
                // 随机产生花色
                int type = random.nextInt(4);
                paperCard.num = num;
                paperCard.type = TYPES[type];
            }
            paperCardList.add(paperCard);
            // 凑够五张牌后返回
        } while (paperCardList.size() < 5);
        return paperCardList;
    }

    private static Boolean isFlush(List<PaperCard> paperCardList) {
        /*
         * 思路：
         * ①五张牌按照点数去重并排序，去重后不等于5则false
         * ②判断五张牌的花色是否相同，去重后不等于1则false
         */

        // 这里使用两个TreeSet来分别存储五张牌的点数和花色(TreeSet天然不重复且自然有序)
        // 点数使用TreeSet来创建是为了在下边使用TreeSet的first()和last()方法，这是TreeSet独有的
        TreeSet<Integer> numSet = new TreeSet<>();
        Set<String> typeSet = new TreeSet<>();
        for (PaperCard p : paperCardList) {
            numSet.add(p.num);
            typeSet.add(p.type);
        }
        // 因为点数必然都不相同 所以如果不是五张牌就false
        if (numSet.size() != PAPER_NUM) {
            return false;
        }
        // 花色这里JOKER可以当做任意花色 所以需要多判断一个条件
        if (typeSet.size() != 1 && !(typeSet.size() == 2 && typeSet.contains(JOKER))) {
            return false;
        }
        // 经过上边两重判断 此时五张牌必然点数不同且花色相同 接下来就是判断点数是否连续
        // 首先移除大小王
        numSet.remove(14);
        numSet.remove(15);
        // 获取剩余的TreeSet的最大值和最小值
        int difference = numSet.last() - numSet.first();
        // 三种情况是通过的
        // 没有王 集合长度是5,差值应该为4 eg:4,5,6,7,8      5,6,7,8,9       9,10,11,12,13
        // 一个王 集合长度是4,差值应该为4或者3 eg:4,5,7,8 & 14     1,2,3,4 & 14
        // 两个王 集合长度是3,差值应该为4或者2 eg:1,3,5 & 14 &15     1,2,3 & 14 & 15
        if (numSet.size() == 5 && difference == 4) {
            return true;
        }
        if (numSet.size() == 4 && (difference == 4 || difference == 3)) {
            return true;
        }
        if (numSet.size() == 3 && (difference == 4 || difference == 2)) {
            return true;
        }
        return false;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    static class PaperCard {
        /**
         * 点数
         */
        private Integer num;
        /**
         * 花色
         */
        private String type;

        @Override
        public String toString() {
            return "("
                + num + "," + type
                + ")";
        }
    }

}
