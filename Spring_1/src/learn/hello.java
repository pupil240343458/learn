package learn;

import java.util.*;

/**
 * Created by pupil on 2016/3/28.
 */
public class hello {

    private String string;
    private String aaa;
    private boolean man;
    private String[]books;
    private List<Integer> number;
    private Set<String> games;
    private String wife;
    private Properties info;
    private Map<Integer,Integer> hashMap;

//    测试p，c命名空间注入
    private int number1;
    private int number2;

    public hello(int number2) {
        this.number2 = number2;
    }
    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public Map<Integer, Integer> getHashMap() {
        return hashMap;
    }

    public void setHashMap(Map<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }


    public List<Integer> getNumber() {
        return number;
    }

    public void setNumber(List<Integer> number) {
        this.number = number;
    }


    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public boolean isMan() {
        return man;
    }

    public hello(String string, String aaa) {
        this.string = string;
        this.aaa = aaa;
    }

    public void getString(){
//        System.out.print(aaa+" "+string+" "+isMan()+" "+getNumber()+" "+getWife()+" "+getGames()+" "+getInfo()+" "+hashMap);
//        for (int i = 0; i < getBooks().length; i++) {
//            System.out.print(getBooks()[i]+" ");
//        }
        System.out.println();
        System.out.println(number1);
        System.out.println(number2);
    }
}
