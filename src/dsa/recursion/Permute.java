package dsa.recursion;

import static java.util.Collections.swap;

public class Permute {
    void permute(String s, int i){
        if(i==s.length()-1){
            System.out.println(s + "");
        }
        for (int j=i; j<s.length(); j++){
            //swap(s[i],s[j]);
            permute (s, i+1);
            //swap(s[j], s[i]);
        }

    }


}
