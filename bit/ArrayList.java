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

    private void ensureCapacity(int minCapacity){
        int minExpand = (elementData.length !=0) ? 0 : DEFAULT_CAPACITY;
        if(minCapacity > minExpand){
            ensureCapacityInternal(minCapacity);
        }

    }

    private void ensureCapacityInternal(int minCapacity){
        ensureExplicitCapacity(calculateCapacity(elementData,minCapacity));
    }

    private void ensureExplicitCapacity(int minCapacity){
        if(minCapacity > elementData.length){
            grow(minCapacity);
        }
    }

    private static int calculateCapacity(Object[] elementData,int minCapacity){
        if(elementData == DEFAULT_CAPACITY__ELEMENTDATA){
            return Math.max(elementData.length,minCapacity);
        }
        return minCapacity;
    }

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    private void grow(int minCapacity){
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if(minCapacity - newCapacity > 0){
            newCapacity = minCapacity;
        }
        if(newCapacity - MAX_ARRAY_SIZE > 0){
            newCapacity = hugeCapacity(minCapacity);
        }
        elementData = Arrays.copyOf(elementData,newCapacity);

    }

    private static int hugeCapacity(int minCapacity){
        if(minCapacity < 0){
            throw new OutOfMemoryError();
        }
        return (minCapacity > MAX_ARRAY_SIZE)? Integer.MAX_VALUE : MAX_ARRAY_SIZE;
    }

    private void rangeCheckForAdd(int index){
        if(index < 0 || index > size){
            throw new ArrayIndexOutOfBoundsException("Illegal index :"+ index);
        }

    }

    /**
     * 增
     * @param e the element to be added
     */
    public boolean add(E e){
        ensureCapacity(size + 1);
        elementData[size++] = e;
        return true;

    }

    public void add(int index ,E e){
        rangeIndexCheck(index);
        ensureCapacity(size+1);
        System.arraycopy(elementData,index,elementData,index+1,size -index);
        elementData[index] = e;
        size++;

    }

    public boolean addAll(int index,Collection<? extends E> c){
        rangeCheckForAdd(index);
        Object[] a = c.toArray();
        int numNew = a.length;
        ensureCapacityInternal(size + numNew);
        int numMoved = size -index;
        if(numMoved > 0){
            System.arraycopy(elementData,index,elementData,index + numNew,numMoved);
        }
        System.arraycopy(a,0,elementData,index,numNew);
        size = size +numNew;
        return  numNew != 0;

    }

    public boolean addAll(Collection<? extends  E> c){
        Object[] a = c.toArray();
        int numNew = a.length;
        int newCapacity = size + numNew;
        ensureCapacityInternal(newCapacity);
        System.arraycopy(a,0,elementData,size,numNew);
        size = size + numNew;
        return numNew != 0;
    }
    //there's no need to check if the index is negative,ArrayIndexOutOfBoundsException will be thrown
    //when array access is to be used.
    private void rangeIndexCheck(int index){
        if(index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /**
     * 删
     */

    public void clear(){
        for(int i = 0;i < size;i++){
            elementData[i] = null;
        }
        size = 0;
    }

    public void remove(int index){
        rangeIndexCheck(index);
        int numMoved = size - index -1;
        System.arraycopy(elementData,index + 1,elementData,index ,numMoved);
        elementData[--size] = null;
    }

    public boolean remove(Object o){
        if(o == null){
            for(int i = 0;i <= size;i++){
                if(elementData[i] == null){
                    fastMove(i);
                    return true;
                }
            }
        }
        if(o != null){
            for(int i = 0;i <= size;i++){
                if(o.equals(elementData[i])){
                    fastMove(i);
                    return true;
                }
            }
        }
        return false;
    }

    private void fastMove(int index){
        int numMoved = size -index - 1;
        System.arraycopy(elementData,index + 1,elementData,index ,numMoved);
        elementData[--size] = null;

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
        if(o == null){
            for(int i = 0;i < size;i++){
                if(elementData[i] == null){
                    return true;
                }
            }
        }
        if(o != null){
            for(int i = 0;i < size;i++){
                if(elementData[i].equals(o)){
                    return true;
                }
            }
        }
        return false;
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

        return (size == 0);
    }

    public int size(){
        return size;
    }







}
