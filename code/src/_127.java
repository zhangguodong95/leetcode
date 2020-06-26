import java.util.*;

/**
 * @author zgd
 * @version 1.0
 * @date 2020/6/4 8:53
 */
//单词接龙
public class _127 {
    //双向BFS
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //特殊情况 直接返回
        if (wordList.size() <= 0 || !wordList.contains(endWord)) return 0;
        wordList.add(beginWord);//添加
        //从begin 找 end
        Queue<String> queue1 = new LinkedList<>();
        return 1 ;
    }
}
