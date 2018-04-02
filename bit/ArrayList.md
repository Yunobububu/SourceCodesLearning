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

