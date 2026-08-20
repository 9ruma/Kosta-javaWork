package com.ws04.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.ws04.dto.AccountDto;
import com.ws04.dto.UserDto;

/*
 * 고객과 계좌에 관련된 서비스
 * (Business Logic 을 처리하는 객체)
 */
public class BankService {
	List<AccountDto> accountList;
	List<UserDto> userList;
	
	/*
	 * 생성자에서 테스트를 위한 고객 및 계좌 저장
	 */
	public BankService() {
		accountList = new ArrayList<AccountDto>();
		userList = new ArrayList<UserDto>();
		
		// 고객과 계좌를 생성한다.
		userList.add(new UserDto(100, "장희정", "8253jang@daum.net", "010-8875-8253", false));
		userList.add(new UserDto(200, "이효리", "lee@daum.net", "010-2222-3333", false));
		userList.add(new UserDto(300, "송중기", "song@naver.com", "010-5554-2222", false));
		userList.add(new UserDto(400, "삼순이", "sam@daum.com", "010-2222-2222", false));
		
		accountList.add(new AccountDto(1, "1111-11111", 1000000, 100));
		accountList.add(new AccountDto(2, "2222-22222", 250000, 100));
		accountList.add(new AccountDto(3, "3333-33333", 350000, 100));
		accountList.add(new AccountDto(4, "4444-44444", 150000, 200));
		accountList.add(new AccountDto(5, "5555-55555", 250000, 200));
		accountList.add(new AccountDto(6, "6666-66666", 350000, 300));
	
	}
	
	/**
	 * 모든 계좌 목록을 리턴하는 메소드
	 */
	public List<AccountDto> getAccountList() {
		
		return accountList;
		
	}
	
	/**
	 * 특정 사용자의 계좌 목록을 리턴 하는 메소드
	 */
	public List<AccountDto> getAccountList(int userSeq) {
		List<AccountDto> selectedList = new ArrayList<AccountDto>();
		
		for(AccountDto dto : accountList) {
			if(dto.getUserSeq() == userSeq) selectedList.add(dto);
		}
		
		return selectedList;
		
	}
	
	/**
	 * 특정 사용자의 고객 정보를 리턴 하는 메소드
	 */
	public List<UserDto> getUserDetail(int userSeq) {
		List<UserDto> selectedList = new ArrayList<UserDto>();
		
		for(UserDto dto : userList) {
			if(dto.getUserSeq() == userSeq) selectedList.add(dto);
		}
		
		return selectedList;
		
	}
	
	/**
	 * 잔액 기준으로 정렬 (Comparable)
	 */
	public List<AccountDto> getAccountListSortByBalance() {
		List<AccountDto> shallowCopy = new ArrayList<AccountDto>(accountList);
		Collections.sort(shallowCopy);
		
		return shallowCopy;
		
	}
	
	/**
	 * UserSeq 기준으로 정렬 (Comparator)
	 */
	public List<AccountDto> getAccountListSortByUserSeq() {
		List<AccountDto> shallowCopy = new ArrayList<AccountDto>(accountList);
		Collections.sort(shallowCopy, (o1, o2) -> o1.getUserSeq() - o2.getUserSeq());
		
		return shallowCopy;
		
	}

}


