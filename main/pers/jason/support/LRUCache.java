package pers.jason.support;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<S, T> {

  private Node root;

  private int n = 0;

  private final int max;

  private final Map<S, T> map;

  public static void main(String[] args) {
    /* 2
    "put"  1-1
    "put"  2-2
    "get"  1 --------- 1
    "put"  3-3
    "get"  2 --------- 2
    "put"  4-4
    "get"  1 --------- -1
    "get"  3 --------- 3
    "get"  4 --------- 4
    ]
[[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]]
     */
    LRUCache<String, String> cache = new LRUCache<>(2);
//    cache.put("1", "1"); // top 1 end
//    cache.put("2", "2"); // top 2 1 end
//    cache.get("1");      // top 1 2 end 1
//    cache.put("3", "3"); // top 3 1 end
//    cache.get("2");      //             null
//    cache.put("4", "4"); // top 4 3 end
//    cache.get("1");      //             null
//    cache.get("3");      // top 3 4 end 3
//    cache.get("4");      // top 4 3 end 4

    cache.put("1", "1"); System.out.println(cache.getList(cache.root));
    cache.put("2", "2");System.out.println(cache.getList(cache.root));
    cache.get("1");
    System.out.println(cache.getList(cache.root));
    cache.put("3", "3"); System.out.println(cache.getList(cache.root));
    cache.get("2"); System.out.println(cache.getList(cache.root));
    cache.put("4", "4"); System.out.println(cache.getList(cache.root));
    cache.get("1"); System.out.println(cache.getList(cache.root));
    cache.get("3"); System.out.println(cache.getList(cache.root));
    cache.get("4"); System.out.println(cache.getList(cache.root));
  }

  private String getList(Node root) {
    StringBuilder sb = new StringBuilder();
    Node p = root;
    while(null != p) {
      sb.append(",").append(p.s);
      p = p.next;
    }
    return sb.toString();
  }

  public LRUCache(int size) {
    this.max = size;
    map = new HashMap<>(size+1);
  }

  public T get(S key) {
    boolean contains = map.containsKey(key);
    if(contains) {
      //将KEY排在第一位
      moveToHead(key);
      return map.get(key);
    }
    return null;
  }

  private void moveToHead(S key) {
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

  public void put(S key, T value) {
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

  class Node {
    private S s;
    protected Node next;
    public Node(S s) {
      this.s = s;
    }

    public S getS() {
      return s;
    }

    public void setS(S s) {
      this.s = s;

    }

  }



}
