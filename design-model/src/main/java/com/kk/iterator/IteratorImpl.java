package com.kk.iterator;

/**
 * @author wangjunkang
 */
public class IteratorImpl<T> implements BasicIterator{

    private Object[] element;

    private Integer size;

    private Integer index;

    public IteratorImpl(Object[] element) {
        this.element = element;
        this.size = element.length;
        this.index = -1;
    }

    @Override
    public Boolean hasNext() {
        if (size>index+1) {
            index++;
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        return (T) element[index];
    }
}
