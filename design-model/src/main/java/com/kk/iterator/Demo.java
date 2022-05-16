package com.kk.iterator;

/**
 * @author wangjunkang
 */
public class Demo {
    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0] = "zhangsan";
        arr[1] = "lisi";
        arr[2] = "wanghjunkang";
        arr[3] = "houcuiyan";
        arr[4] = "guodegang";

        MyList<String> stringMyList = new MyList<>(arr);
        BasicIterator<String> iterator = stringMyList.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
