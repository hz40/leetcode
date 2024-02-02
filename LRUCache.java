import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述: LRU缓存
 *
 * @author hezhan
 * @date 2024/1/10 13:47
 */
public class LRUCache {

    private Integer capacity;

    private final Map<Integer, Cache> cacheMap = new HashMap<>();

    private final Cache head;

    private final Cache tail;


    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Cache(-1, -1,null, null);
        tail = new Cache(-1, -1,null, null);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        /**
         * 1.有这个值的情况下,删除当前双向链表断开，数据断开处，再左右他重新连上，数据插入到顶部，数据连在head的后一个，返回最后的值
         * 2.没有值的情况下，返回null；
         */
        Cache cache = cacheMap.get(key);
        if(cache == null){
            return  -1;
        }
        moveHead(cache);
        return cache.value;
    }

    public void put(int key, int value) {
        /**
         * 1.有这个值的情况下，更新一下value就ok
         * 2.没有这个值的情况下，先查询一个cacheMap的容量是否大于等于capacity，如果小于就是直接putmap和切插入链表头，大于等于了就进行双链表尾部数据和map清除，然后putmap和切插入链表头
         */
        Cache cache = cacheMap.get(key);
        if(cache == null){
            if (cacheMap.size()>= capacity){
              Cache cache1 = removeTail();
              cacheMap.remove(cache1.key);

            }
            Cache cache1 =  new Cache(key,value,null,null);
            addHead(cache1);
            cacheMap.put(key,cache1);
        }else {
            cache.value = value;
            moveHead(cache);
        }
    }
    //三种方法
    /**
     * 1.增加到头部
     * 2.删除节点
     * 3.移动到头部   1.删除节点 2.增加到头部
     * 4.删除尾部
     */
    /**
     * 增加到头部
     *
     * @param cache
     * @return
     */
    private Cache addHead(Cache cache) {
        cache.next = head.next;
        head.next.prev = cache;
        cache.prev = head;
        head.next = cache;
        return cache;
    }

    /**
     * 删除节点
     *
     * @param cache
     * @return
     */
    private Cache remove(Cache cache) {
        cache.prev.next = cache.next;
        cache.next.prev = cache.prev;
        return cache;
    }

    /**
     * 移动到头部
     *
     * @param cache
     * @return
     */
    private Cache moveHead(Cache cache) {
        remove(cache);
        addHead(cache);
        return cache;
    }

    private Cache removeTail() {
        Cache cache = tail.prev;
        remove(cache);
        return cache;
    }

    private static class Cache {
        public int key;
        public int value;
        public Cache next;
        public Cache prev;

        public Cache(int key, int value, Cache next, Cache prev) {
            this.key = key;
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}
