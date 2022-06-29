/*
주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.

이새롬,송하영,이새롬,장규리,박지원,이나경,노지선,이서연,백지헌,백지헌,장규리,이채영,송하영,이나경,이새롬,이나경,이나경,장규리,이채영,박지원,노지선,노지선,이나경,이새롬,이새롬

1. 이씨와 장씨는 각각 몇 명 인가요?
2. "이새롬"이란 이름이 몇 번 반복되나요?
3. 중복을 제거한 이름을 출력하세요.
4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.

LinkedHashSet 사용

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;


public class SortName {

	public static void main(String[] args) {
		
		final String input = "이새롬,송하영,이새롬,장규리,박지원,이나경,노지선,이서연,백지헌,백지헌,장규리,이채영,송하영"
				+ ",이나경,이새롬,이나경,이나경,장규리,이채영,박지원,노지선,노지선,이나경,이새롬,이새롬";
		
	String name;
	StringTokenizer token;
	
	int countLee = 0;
	int countJang = 0;
	int countLeeSR = 0;
	
	ArrayList<String> NameArrList = new ArrayList<String>();
	
	token = new StringTokenizer(input, ",");
	
	while(token.hasMoreTokens()) 
		{
			name = token.nextToken();
			NameArrList.add(name);
			if(name.startsWith("이")) countLee++;
			if(name.startsWith("장")) countJang++;
			if("이새롬".equals(name)) countLeeSR++;
		}
	
	System.out.println("1. count Lee: " + countLee + ", count Jang: " + countJang );
	System.out.println("2. 이새롬이란 이름은 몇번? " + countLeeSR);
	
    NameArrList = new ArrayList<String>(new LinkedHashSet<String>(NameArrList));
    System.out.println("3. 중복제거 ");
    int listSize = NameArrList.size();
    for(int i=0;i<listSize;i++)
    {
        System.out.print(NameArrList.get(i)+((i==listSize-1)?"":","));  
    }
    System.out.println("\n4. 중복제거 오름차순 ");
    Collections.sort(NameArrList);
    for(int i=0;i<listSize;i++)
    {
        System.out.print(NameArrList.get(i)+((i==listSize-1)?"":","));              
    }
    
    }
	
	
		

	}
