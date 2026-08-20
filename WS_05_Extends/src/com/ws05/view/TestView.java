package com.ws05.view;

import java.util.List;

import com.ws05.dto.AccountDto;
import com.ws05.dto.UserDto;
import com.ws05.service.BankService;

public class TestView {

	public static void main(String[] args) {
		BankService service = new BankService();
		
		System.out.println("*** 1. 고객 seq에 해당하는 계좌정보 검색하기 *****");
		List<AccountDto> accountList = service.getAccountList(111);
		
		if(accountList.isEmpty()) {
			System.out.println("회원의 계좌정보가 없습니다. ");
			
		} else {
			System.out.println("회원계좌개수 : " + accountList.size());
			
			for(AccountDto dto : accountList) {
				System.out.println(dto.getAccountSeq() + ", "  + dto.getAccountNumber() + ", " + dto.getUserSeq());
				
			}
			
		}
		
		
		System.out.println("\n\n*** 2. userSeq에 해당하는 고객의 정보 *****");
		List<UserDto> userDto = service.getUserDetail(111);
		
		if(!userDto.isEmpty()) {
			for(UserDto dto : userDto) {
				System.out.print(dto.getUserSeq() + ", " + dto.getName() + ", " + dto.getEmail() + ", ");
				System.out.println(dto.getPhone() + ", " + dto.isSleep());
			}
			
		} else {
			System.out.println("회원의 정보가 없습니다.");
			
		}

	}

}





