//Doesn't need to copy extra space
public class Solution {
    public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return isMatch(s,p,0,0);
    }
    public boolean isMatch(String s, String p, int i, int j){
        //Two edge cases
        if(j == p.length()) return s.length() == i;
        if(j == p.length() - 1)
            return s.length() - 1 == i && (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i));
        if(p.charAt(j + 1) != '*'){
            if(i < s.length() && (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i)))
                return naiveRecursion(s, p, i + 1, j + 1);
            else return false;
        }
        while(i < s.length()&& (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i))){
            if(naiveRecursion(s, p, i, j + 2))  return true;
            ++i;
        }
        return naiveRecursion(s, p, i, j + 2);
    }
}

//Without helper, but use substring()
public class Solution {
    public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(p.length() == 0)
            return s.length() == 0;

        if(p.length() > 1){
            if(p.charAt(1) != '*'){
                if(s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.'))
                    return isMatch(s.substring(1), p.substring(1));
                else
                    return false;
            }
            else{
                boolean flag = false;
                int i = 0;
                while(i < s.length() && (s.charAt(i) == p.charAt(0) || p.charAt(0) == '.')){
                    ++i;
                    if(isMatch(s.substring(i), p.substring(2)))
    		return true;
                }
                return flag || isMatch(s, p.substring(2));
            }
        }
        else
            return s.length() == 1 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
    }
}
    }
}