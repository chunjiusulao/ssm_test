package com.itjm.test;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 靳明
 * @Description: 测试
 * @date 2020/5/14  19:14
 */
public class NewTest {
    
    /*
     * 功能描述: <br>
     * 〈计算一个人出生多少天〉
     * @Param: []
     * @Return: void
     * @Author: 靳明
     * @Date: 2020/6/7 14:44
     */
    /*@Test
    public  void  test(String str) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//转换格式
        Date date=new Date();//现在时间
        Long todayTime=date.getTime();//现在时间转换成毫秒
        String myBirthday="1998-11-30 12:20:56";//出生日期
        Date bDate=sdf.parse(myBirthday);//出生日期字符串转换成Date格式
        Long bTime=bDate.getTime();//出生日期转换成毫秒
        Long gTime=todayTime-bTime;//现在时间-出生时间
        int gDay= (int) (gTime/1000/3600/24);//将毫秒转换为天数
        System.out.println(gDay);
    }*/


    /*
     * 功能描述: <br>
     * 〈calendar类的使用〉
     * @Param: []
     * @Return: void
     * @Author: 靳明
     * @Date: 2020/6/7 14:56
     */
    /*public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        //获取年份
        int year=c.get(Calendar.YEAR);
        System.out.println(year);

        //设置年为9999
        c.set(Calendar.YEAR,9999);
        //增加两年
        c.add(Calendar.YEAR,2);
        //减少三个月
        c.add(Calendar.MONTH,-3);
        System.out.println(c);

        //把日历对象转换为日期对象
        Date d = c.getTime();
        System.out.println(d);

    }*/

    /*
     * 功能描述: <br>
     * 〈System类的使用〉
     * @Param: []
     * @Return: void
     * @Author: 靳明
     * @Date: 2020/6/7 15:45
     */

   /* public static void main(String[] args) {

        //验证for循环打印数字1-9999所需要的时间
        //程序执行前获取一次毫秒值
        //返回以毫秒为单位的当前时间
        long l = System.currentTimeMillis();
        //执行for循环
        for (int i = 0; i <= 9999 ; i++) {
            System.out.println(i);
        }
        long e=System.currentTimeMillis();
        System.out.println("程序共耗时:"+(e-l)+"毫秒");

        *//*public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int Length):将数组中指定的数据拷贝到另一个数组中
        参数：
            src:源数组
            srcPos:源数组中的起始位置
            dest:目标数组
            destPos:目标数组中的起始位置
            Length:要复制的数组元素数量
        *//*
       int[] a={1,2,3,4,5};
       int[] b={6,7,8,9,10};
        System.arraycopy(a,0,b,0,3);
        System.out.println(b);
    }*/


    /*
     * 功能描述: <br>
     * 〈斗地主案例〉
     * @Param: []
     * @Return: void
     * @Author: 靳明
     * @Date: 2020/6/8 18:05
     */
    /*@Test
    public void douDiZhuTest(){
        //创建扑克类型
        String[] color= new String[]{"红桃", "梅花", "方片", "黑桃"};
        //创建扑克数字
        String[] number={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        //创建整副扑克的list
        List<String> paiList=new ArrayList<>();
        //list添加上大小鬼
        paiList.add("大鬼");
        paiList.add("小鬼");
        //list循环添加上剩余扑克
        for (int a=0;a<color.length;a++){
            for (int i = 0; i <number.length ; i++) {
                paiList.add(color[a]+number[i]);
            }
        }
        //打乱扑克顺序
        Collections.shuffle(paiList);
        //给三个人发牌，剩余最后三张当作底牌
        List<String> oneList=new ArrayList<>();
        List<String> twoList=new ArrayList<>();
        List<String> threeList=new ArrayList<>();
        List<String> otherList=new ArrayList<>();
        for (int i=0;i<paiList.size();i++){
            if (i==paiList.size()-4){
                otherList.addAll(paiList.subList(i,paiList.size()-1));
                break;
            }
            if (i%3==0){
                oneList.add(paiList.get(i));
            }
            if (i%3==1){
                twoList.add(paiList.get(i));
            }
            if (i%3==2){
                threeList.add(paiList.get(i));
            }
        }
        for (String s : oneList) {
            System.out.println("第一个人的牌:"+s);
        }
        for (String s : twoList) {
            System.out.println("第二个人的牌:"+s);
        }
        for (String s : threeList) {
            System.out.println("第三个人的牌:"+s);
        }
        for (String s : otherList) {
            System.out.println("剩余的牌:"+s);
        }


    }
*/
/*
    @Test
    public void hashCodeTest(){
        *//*String one=new String("a");
        Integer two=new Integer(97);
        int i1 = two.hashCode();
        int i = one.hashCode();
        System.out.println(i);
        System.out.println(i1);*//*

        String a="重地";
        char[] b=new char[a.length()];
        b=a.toCharArray();
        for (char c : b) {
            System.out.println((int) c);
        }
    }*/


    /*
     * 功能描述: <br>
     * 〈遍历map集合〉
     * @Param: []
     * @Return: void
     * @Author: 靳明
     * @Date: 2020/6/10 11:28
     */
    /*@Test
    public void mapValueTest(){
        Map<String,String> map=new HashMap<>();
        map.put("aaa","bbb");
        map.put("ccc","ddd");
        map.put("eee","fff");
        //不使用entry方法遍历
        //将map中的key存入set集合中
        Set<String> set=map.keySet();
        //调用set的迭代器方法遍历
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s+"="+map.get(s));
        }
        System.out.println("===================================");
        //直接遍历set集合
        for (String s : set) {
            System.out.println(s+"="+map.get(s));
        }

        System.out.println("===================================");
        for (String s : map.keySet()) {
            System.out.println(s+"="+map.get(s));
        }

        //使用entry方法遍历
        Set<Map.Entry<String,String>> aset=map.entrySet();
        for (Map.Entry<String, String> stringStringEntry : aset) {
            String key=stringStringEntry.getKey();
            String value=stringStringEntry.getValue();
            System.out.println("key的值:"+key+",value的值:"+value);
        }
    }*/


    /*
     * 功能描述: <br>
     * 〈遍历一个字符串单个字符出现的次数〉
     * @Param: []
     * @Return: void
     * @Author: 靳明
     * @Date: 2020/6/10 13:53
     */
    /*@Test
    public void stringNumTest(){

        String str="dashfkldjglknvlknmdalfjrjewprk";//定义一个字符串
        char[] chars=str.toCharArray();//将字符串变为字符数组
        Map<Character,Integer> map=new HashMap<>();//定义一个hashMap集合
        for (char c : chars) {//循环字符数组
            if (map.containsKey(c)){//如果map中的key含有该字符
                map.put(c,map.get(c)+1);//map的value加1
            }else {
                map.put(c,1);//否则map的value设置为1
            }
        }
        *//*
        Set<Map.Entry<Character, Integer>> set=map.entrySet();//将map集合的映射关系放进set集合
        for (Map.Entry<Character, Integer> characterIntegerEntry : set) {//循环遍历set集合
            System.out.println(characterIntegerEntry.getKey()+"出现"+characterIntegerEntry.getValue()+"次");
        }*//*
        for (Character character : map.keySet()) {
            System.out.println(character+"出现"+map.get(character)+"次");
        }
    }*/


    /*
     * 功能描述: <br>
     * 〈能排序的斗地主，并且选出地主〉
     * @Param: []
     * @Return: void
     * @Author: 靳明
     * @Date: 2020/6/10 18:08
     */
    @Test
    public void douDiZhuNewTest(){
        List<String> identity=List.of("地主","农民");
        //定义扑克
        List<String> color=List.of("♠","♥","♣","♦");
        List<String> number=List.of("2","3","4","5","6","7","8","9","10","J","Q","K","A");
        List<String> special=List.of("大鬼","小鬼");
        //组成一幅完整扑克牌
        Map<Integer,String> poker=new HashMap<>();
        List<Integer> suoyin=new ArrayList<>();
        int i=0;
        for (String n : number) {
            for (String c : color) {
                poker.put(i,n+c);
                suoyin.add(i);
                i++;
            }
        }
        poker.put(++i,"小鬼");
        suoyin.add(i);
        poker.put(++i,"大鬼");
        suoyin.add(i);

        //打乱顺序
        Collections.shuffle(suoyin);

        List<Integer> one=new ArrayList<>();
        List<Integer> two=new ArrayList<>();
        List<Integer> three=new ArrayList<>();
        List<Integer> other=new ArrayList<>();

        //给每个用户发牌
        for (int j = 0; j < suoyin.size(); j++) {
            if (j>suoyin.size()-4){
                other.add(suoyin.get(j));
            }
            if (j%3==0){
                one.add(suoyin.get(j));
            }
            if (j%3==1){
                two.add(suoyin.get(j));
            }
            if (j%3==2){
                three.add(suoyin.get(j));
            }
        }
        one.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        Collections.sort(two,(Integer::compareTo));//上面写法的包装方法

        three.sort((Integer o1,Integer o2)->{return o1-o2;});//第一种写法通过lambda表达式写出

        Collections.sort(other,(Integer::compareTo));

        for (Integer o : one) {
            System.out.println("第一个人"+poker.get(o));
        }
        for (Integer t : two) {
            System.out.println("第二个人"+poker.get(t));
        }
        for (Integer th : three) {
            System.out.println("第三个人"+poker.get(th));
        }
        for (Integer ot : other) {
            System.out.println("底牌"+poker.get(ot));
        }

        System.out.println("第一个人"+one.size()+"牌");
        System.out.println("第二个人"+two.size()+"牌");
        System.out.println("第三个人"+three.size()+"牌");


        //------------------------------------------------------------------------------------------------------
        //利用随机数选择地主，地主会获得底牌
        Random random=new Random();
        int identityNum= (int) Math.random();
        switch (identityNum%3){
            case 0:one.addAll(other);Collections.sort(one,(Integer::compareTo));break;
            case 1:two.addAll(other);Collections.sort(two,(Integer::compareTo));break;
            case 2:three.addAll(other);Collections.sort(three,(Integer::compareTo));break;
        }

        for (Integer o : one) {
            System.out.println("第一个人"+poker.get(o));
        }
        for (Integer t : two) {
            System.out.println("第二个人"+poker.get(t));
        }
        for (Integer th : three) {
            System.out.println("第三个人"+poker.get(th));
        }

        System.out.println("第一个人"+one.size()+"牌");
        System.out.println("第二个人"+two.size()+"牌");
        System.out.println("第三个人"+three.size()+"牌");


    }
}
