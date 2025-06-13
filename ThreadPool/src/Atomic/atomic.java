package Atomic;

public class atomic {
    public static void main(String[] args) {
/*| 方法                              | 作用                        | 举例                  |
  | ------------------------------- | ------------------------- | ------------------- |
 | `get()`                         | 获取当前值                     | `int v = ai.get();` |
| `set(x)`                        | 设置新值                      | `ai.set(5);`        |
| `getAndIncrement()`             | 先返回再 +1                   | `返回5，下次是6`          |
| `incrementAndGet()`             | 先 +1 再返回                  | `返回6`               |
| `getAndAdd(n)`                  | 返回当前值，再加 n                | `ai.getAndAdd(10)`  |
| `compareAndSet(expect, update)` | 如果当前值是 expect，就更新为 update | 乐观锁核心               |
| `getAndDecrement()`             | 先返回再 -1                  | `返回5，下次是4`          |
| `decrementAndGet()`             | 先 -1 再返回                 | `返回4`               |
 */


        System.out.println("AtomicInteger");
/*| 类名                   | 用途              | 替代        |
| -------------------- | --------------- | --------- |
| `AtomicInteger`      | 线程安全的 int       | `int`     |
| `AtomicLong`         | 线程安全的 long      | `long`    |
| `AtomicBoolean`      | 线程安全的 boolean   | `boolean` |
| `AtomicReference<T>` | 线程安全的对象引用       | `Object`  |
| `AtomicIntegerArray` | 线程安全的 int[] 数组 | `int[]`   |

 */

    }
}
