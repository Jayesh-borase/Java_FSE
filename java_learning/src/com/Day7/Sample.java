package com.Day7;

import java.util.*;

class Solution{
	private int difference(String word1,String word2) {
		int count = 0;
		for(int i=0;i<word1.length();i++) {
			if(word1.charAt(i) != word2.charAt(i));
				count++;				
		}
		return count;
	}
	public int wordLadderLength(String startWord,String targetWord,String[] wordList) {
		int[][] mat= new int[wordList.length][wordList.length];
		
		return 0;
	}
}
public class Sample {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of words in dictionary
        int n = sc.nextInt();

        String[] wordList = new String[n];
        for (int i = 0; i < n; i++) {
            wordList[i] = sc.next();
        }

        // Start word and target word
        String startWord = sc.next();
        String targetWord = sc.next();

        Solution obj = new Solution();
        int ans = obj.wordLadderLength(startWord, targetWord, wordList);

        System.out.println(ans);

        sc.close();
    }
}
