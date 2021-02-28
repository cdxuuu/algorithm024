import java.util.Arrays;

public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        //胃口的索引
        int a = 0;
        //饼干的索引
        int b = 0;
        while (a < g.length && b< s.length){
            if (g[a] <= s[b]){
                a++;
            }
            b++;
        }
        return a;
    }
}
