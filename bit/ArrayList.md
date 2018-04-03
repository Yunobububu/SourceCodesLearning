# ArrayList 
## Methods:  
### 增
- add(E element)
- add(int index,E element)
- addAll(Collection<? extends E> c)
- addAll(int index,Collection><? extends E> c)//
### 删
- clear()
- remove()
- remove(int index)
- remove(Object o)
- removeRange(int fromIndex,int toIndex)//
- batchRemove(Object o)
### 改
- set(E e,int index)
### 查
- get(int index)
- contains(Object o)
- indexOf(Object o)//
- isEmpty()//


### transient: 
-  用来阻止实例中用此关键字声明的变量的持久化；当对象被反序列化时，
这样的实例变量值不会被持久化和恢复。[https://blog.csdn.net/u013207877/article/details/52572975]
### unchecked:   
 
### serialize：

### ArrayList初始容量
- [https://blog.csdn.net/jdsjlzx/article/details/52675726]

### modCount:  
迭代器在遍历时做线程检查,继承自AbstractList中`protected transient int modCount = 0;`

<p>

      *This field is used by the iterator and list iterator implementation  
      * returned by the {@code iterator} and {@code listIterator} methods.
      * If the value of this field changes unexpectedly, the iterator (or list
      * iterator) will throw a {@code ConcurrentModificationException} in
      * response to the {@code next}, {@code remove}, {@code previous},
      * {@code set} or {@code add} operations.  This provides
      * <i>fail-fast</i> behavior, rather than non-deterministic behavior in
      *the face of concurrent modification during iteration.
</p>

[www.zhihu.com/question/24086463?sort=created]

