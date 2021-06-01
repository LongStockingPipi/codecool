package pers.jason.algorithm.backtracking;

import pers.jason.utils.PrintUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static pers.jason.utils.PrintUtil.printCollection;

/**
 * @author Jason
 * @date 2021/6/1 22:23
 * @description
 */
public class PowerSet {

  /*
  已知一个集合A，求出A的所有子集
  例如：
  [1,2,3]
  输出：
  [],[1],[2],[3],[1,2],[1,3],[2,3],[1,2,3]
   */

  public static void main(String[] args) {
    String[] input = new String[] {"a", "b", "c"};
    calculate(0, input, new ArrayList<>());
  }

  private static void calculate(int i, String[] input, List<String> result) {
    if(i == input.length) {
      printCollection(result);
    } else {
      String a = input[i];
      result.add(a);
      calculate(i+1, input, result);

      result.remove(a);
      calculate(i+1, input, result);
    }
  }

}
