package com.dealbab.exception;

public class HotDealAlreadyExistsException extends RuntimeException {

	public HotDealAlreadyExistsException(Integer integer) {
        super("HotDeal already exists for ID: '" + integer + "'");
    }
}
