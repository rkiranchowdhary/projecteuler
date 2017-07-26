package com.kiran.project.euler.problems;

import java.util.*;

import com.kiran.project.euler.CommonHelper;
import com.kiran.project.euler.Problem;

public class Problem23 extends Problem {
	
	public static List<String> list = new ArrayList<String>();

	public long solve(){
		String str ="0123456789";
		permute(str.toCharArray(), 0, str.length()-1);
		//List<String> list = new ArrayList<String>();
//		for (StringBuilder s : strs){
//			list.add(s.toString());
//		}
		Collections.sort(list);
		String st = list.get(999999);
		return Long.parseLong(st);
	}
	
//	public static StringBuilder[] permutations(String s) {
//        if (s.length() == 0)
//            return null;
//        int length =(int) fact(s.length());
//        StringBuilder[] sb = new StringBuilder[length];
//        for (int i = 0; i < length; i++) {
//            sb[i] = new StringBuilder();
//        }
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            int times = length / (i + 1);
//            for (int j = 0; j < times; j++) {
//                for (int k = 0; k < length / times; k++) {
//                    sb[j * length / times + k].insert(k, ch);
//                }
//            }
//        }
//        return sb;
//    }
//	
//	public static long fact(int len){
//		return CommonHelper.factorial(len);
//	}
	
	public static void permute(char[] ary, int startIndex, int endIndex) {
        if(startIndex == endIndex){
            list.add(String.valueOf(ary));
        }else{
            for(int i=startIndex;i<=endIndex;i++) {
                 swap(ary, startIndex, i );
                 permute(ary, startIndex+1, endIndex);
                 swap(ary, startIndex, i );
            }
        }
    }

    public static void swap(char[] ary, int x, int y) {
        char temp = ary[x];
        ary[x] = ary[y];
        ary[y] = temp;
    }
}
