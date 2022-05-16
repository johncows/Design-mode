package com.kk.iterator;

/**
 * @author wangjunkang
 */
public class MyList<T> {

    private Object[] element;

    public MyList(Object[] element) {
        this.element = element;
    }

    public Object[] getElement() {
        return element;
    }

    public  BasicIterator<T> getIterator(){
        IteratorImpl<T> tIterator = new IteratorImpl<>(element);
        return tIterator;
    }

}
