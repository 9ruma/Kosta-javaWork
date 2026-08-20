package com.ws06.service;

import java.util.List;

import com.ws06.dto.AccountDto;
import com.ws06.dto.InstallAccountDto;
import com.ws06.dto.LoanAccountDto;
import com.ws06.dto.SavingAccountDto;
import com.ws06.dto.UserDto;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 고객과 계좌에 관련된 서비스
 * (Business Logic 을 처리하는 객체)
 */
public class BankServiceImpl implements BankService {
	List<AccountDto> accountList;
	List<UserDto> userList;
	
	/*
	 * 생성자에서 테스트를 위한 고객 및 계좌 저장
	 */
	public BankServiceImpl() {
		userList = new ArrayList<UserDto>(); 
		accountList = new ArrayList<AccountDto>(); 
		
		userList.add(new UserDto(111, "홍길동", "hong@gildong@com", "010-1111-1111", false));
		userList.add(new UserDto(222, "이길동", "lee@gildong@com", "010-2222-2222", true));
		userList.add(new UserDto(333, "삼길동", "sam@gildong@com", "010-3333-3333", false));
		
		accountList.add(new InstallAccountDto(20, "00200202002002", 1000, 111, 12, 10000));
		accountList.add(new SavingAccountDto(10, "00100101001001", 500, 111, 100) );
		accountList.add(new LoanAccountDto(60, "00600606006006", 500, 333, "House"));
		accountList.add(new LoanAccountDto(30, "00300303003003", 0, 111, "Building"));
		accountList.add(new SavingAccountDto(70, "00700707007007", 500, 333, 200));
		accountList.add(new LoanAccountDto(50, "00500505005005", 200, 222, "Car"));
		accountList.add(new SavingAccountDto(40, "00400404004004", 1000, 222, 50));
		
	}
	
	
	/**
	 * 모든 계좌 목록을 리턴하는 메소드
	 */
	@Override
	public List<AccountDto> getAccountList() {
		
		return accountList;
		
	}
	
	/**
	 * 특정 사용자의 계좌 목록을 리턴 하는 메소드
	 */
	@Override
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
	@Override
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
	@Override
	public List<AccountDto> getAccountListSortByBalance() {
		List<AccountDto> shallowCopy = new ArrayList<AccountDto>(accountList);
		Collections.sort(shallowCopy);
		
		return shallowCopy;
		
	}
	
	/**
	 * UserSeq 기준으로 정렬 (Comparator)
	 */
	@Override
	public List<AccountDto> getAccountListSortByUserSeq() {
		List<AccountDto> shallowCopy = new ArrayList<AccountDto>(accountList);
		Collections.sort(shallowCopy, (o1, o2) -> o1.getUserSeq() - o2.getUserSeq());
		
		return shallowCopy;
		
	}

}


