package com.ws07.service;

import java.util.List;

import com.ws07.dto.AccountDto;
import com.ws07.dto.UserDto;

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
	
	/**
	 * 고객의 일련번호와 계좌 일련번호를 입력받아 계좌 정보 리턴
	 */
	public AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException;
	
	/**
	 * 고객의 일련번호, 계좌 일련번호 그리고 출금 금액을 입력받아 출금 처리
	 */
	public int withdraw(int userSeq, int accountSeq, int amount) throws BalanceLackException, UserAccountNotFoundException;

}
	
