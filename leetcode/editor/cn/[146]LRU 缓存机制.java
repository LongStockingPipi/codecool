//运用你所掌握的数据结构，设计和实现一个 LRU (最近最少使用) 缓存机制 。 
//
// 
// 
// 实现 LRUCache 类： 
//
// 
// LRUCache(int capacity) 以正整数作为容量 capacity 初始化 LRU 缓存 
// int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。 
// void put(int key, int value) 如果关键字已经存在，则变更其数据值；如果关键字不存在，
// 则插入该组「关键字-值」。当缓存容量达到上
//限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。 
// 
//
// 
// 
// 
//
// 进阶：你是否可以在 O(1) 时间复杂度内完成这两种操作？ 
//
// 
//
// 示例： 
//
// 
//输入
//["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
//[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
//输出
//[null, null, null, 1, null, -1, null, -1, 3, 4]
//
//解释
//LRUCache lRUCache = new LRUCache(2);
//lRUCache.put(1, 1); // 缓存是 {1=1}
//lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
//lRUCache.get(1);    // 返回 1
//lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
//lRUCache.get(2);    // 返回 -1 (未找到)
//lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
//lRUCache.get(1);    // 返回 -1 (未找到)
//lRUCache.get(3);    // 返回 3
//lRUCache.get(4);    // 返回 4
// 
//
// 
//
// 提示： 
//
// 
// 1 <= capacity <= 3000 
// 0 <= key <= 10000 
// 0 <= value <= 105 
// 最多调用 2 * 105 次 get 和 put 
// 
// Related Topics 设计 哈希表 链表 双向链表 
// 👍 1506 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class LRUCache {

    private Node root;

    private int n = 0;

    private final int max;

    private final Map<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.max = capacity;
        map = new HashMap<>(capacity+1);
    }


    
    public int get(int key) {
        boolean contains = map.containsKey(key);
        if(contains) {
            moveToHead(key);
            return map.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        boolean contains = map.containsKey(key);
        if(contains) {
            //如果包含key则更新value
            map.put(key, value);
            //将key更新到队列首
            moveToHead(key);
        } else {
            //新元素
            //重新设置头节点
            Node p = new Node(key);
            p.next = this.root;
            this.root = p;
            this.map.put(key, value);
            if(this.n >= max) {
                //元素在添加之前队列已经满了
                //移除尾节点，移除map中的值
                Node p_ = this.root;
                Node p_2 = p_.next;
                while(null != p_2) {
                    if(null == p_2.next) {
                        this.map.remove(p_2.s);
                        p_.next = null;
                        break;
                    } else {
                        p_ = p_2;
                        p_2 = p_.next;
                    }
                }
            } else {
                //队列如果没满则总量+1
                n++;
            }
        }
    }

    /**
     * 将指定元素移动到链表表头
     * @param key
     */
    private void moveToHead(Integer key) {
        Node p1 = null;
        Node p2 = this.root;
        while(null != p2) {
            if(p2.s.equals(key)) {
                if(null != p1) {
                    p1.next = p2.next;
                    p2.next = this.root;
                    this.root = p2;
                }
                break;
            }
            p1 = p2;
            p2 = p2.next;
        }
    }

    class Node {
        private Integer s;
        protected Node next;
        public Node(Integer s) {
            this.s = s;
        }

        public Integer getS() {
            return s;
        }

        public void setS(Integer s) {
            this.s = s;

        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
//leetcode submit region end(Prohibit modification and deletion)
