import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hundred_Add{

static void dfs2(List<String> ele, List<String> res, int i, int target, int tmpSum, String tmp) {
	if(i == ele.size()) {
		if(target == tmpSum)
			if(tmp.charAt(1) == '+')
				res.add(tmp.substring(2));
			else
				res.add(tmp.substring(1));
	}else if(i > ele.size())
		return;
	else {
		int curInt = Integer.parseInt(ele.get(i));
		dfs2(ele, res, i+1, target, tmpSum + curInt, tmp + "+" + ele.get(i));
		dfs2(ele, res, i+1, target, tmpSum - curInt, tmp + "-" + ele.get(i));
	}
}

static List<List<String>> dfs(String s) {
	List<List<String>> res = new ArrayList<>();
	if(s.length() == 1) {
		res.add(Arrays.asList(s));
	}else {
		for(int i=0;i<s.length()-1;i++) {
			String l = s.substring(0, i+1);
			String r = s.substring(i+1);
			for(List<String> strs : dfs(r)) {
				List<String> tmp = new ArrayList<>();
				tmp.add(l);
				tmp.addAll(strs);
				res.add(tmp);
			}
		}
		res.add(Arrays.asList(s));
	}
	return res;
}
public static void main(String[] args) {
	String s = "123456789";
	int target = 100;
	List<List<String>> fullCombinations = dfs(s);
	List<String> res = new ArrayList<>();
	for(List<String> ele : fullCombinations) {
		dfs2(ele, res, 0, target, 0, "0");
	}
	for(String str : res) {
		System.out.println(str);
	}
}

}