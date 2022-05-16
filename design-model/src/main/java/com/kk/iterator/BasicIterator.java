package com.kk.iterator;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author wangjunkang
 */
public interface BasicIterator<T> {
    Boolean hasNext();
    T next();
}
