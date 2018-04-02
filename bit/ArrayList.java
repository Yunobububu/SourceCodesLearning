package com.lvjinke.bit;

import java.util.Arrays;
import java.util.Collection;

public class ArrayList<E> {

    transient Object[] elementData;


    private static final int DEFAULT_CAPACITY = 10;

    private boolean flag;

    private int size;

    private  static final Object[] EMPTY_ELELMENTDATA = {};

    private static final Object[] DEFAULT_CAPACITY__ELEMENTDATA= {};

    public ArrayList(){
        this.elementData = DEFAULT_CAPACITY__ELEMENTDATA;
    }

    public ArrayList(int initicalCapactiy){
        if(initicalCapactiy > 0){
            this.elementData = new Object[initicalCapactiy];
        } else if(initicalCapactiy == 0){
            this.elementData = EMPTY_ELELMENTDATA;
        } else{
            throw new IllegalArgumentException("IllegalArgument:" + initicalCapactiy);
        }
    }

    public ArrayList(Collection<? extends E> c){
        elementData = c.toArray();
        if((elementData.length) != 0){
            if(elementData.getClass() != Object[].class){
                elementData = Arrays.copyOf(elementData,size,Object[].class);

            }
        } else{

        }

    }

    /**
     * 增
     * @param elementData the element to be added
     */
    public boolean add(E elementData){

        return flag;

    }

    public void add(int index ,E elementData){

    }

    public void addAll(int index,Collection<? extends E> c){

    }

    public void addAll(Collection<? extends  E> c){

    }

    /**
     * 删
     */

    public void clear(){

    }

    public void remove(int index){

    }

    public void remove(Object o){

    }

    public void batchRemove(Object o){

    }

    public void removeRange(int fromIndex,int toIndex){

    }

    /**
     * 改
     */
    public void set(int index,E elementData){

    }

    /**
     * 查
     */

    public boolean contains(Object o){

        return true;
    }

    //public E get(int index){
    //
    //  return 0;
    //}

    public boolean indexOf(Object o){

        return true;
    }

    public int lastIndexOf(Object o){

        return 0;
    }

    public boolean isEmpty(){

        return flag;
    }

    public int size(){
        return size;
    }







}
