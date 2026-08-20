package com.ws06.service;

import java.util.List;

import com.ws06.dto.AccountDto;
import com.ws06.dto.UserDto;

public interface BankService {
	
	/**
	 * 모든 계좌 목록을 리턴하는 메소드
	 */
	public List<AccountDto> getAccountList();
	
	/**
	 * 특정 사용자의 계좌 목록을 리턴 하는 메소드
	 */
	public List<AccountDto> getAccountList(int userSeq);
	
	/**
	 * 특정 사용자의 고객 정보를 리턴 하는 메소드
	 */
	public List<UserDto> getUserDetail(int userSeq);
	
	/**
	 * 잔액 기준으로 정렬 (Comparable)
	 */
	public List<AccountDto> getAccountListSortByBalance();
	
	/**
	 * UserSeq 기준으로 정렬 (Comparator)
	 */
	public List<AccountDto> getAccountListSortByUserSeq();

}
	
