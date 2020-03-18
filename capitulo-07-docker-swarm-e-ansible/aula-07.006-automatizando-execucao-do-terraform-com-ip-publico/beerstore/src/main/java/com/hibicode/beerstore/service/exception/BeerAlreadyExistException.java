package com.hibicode.beerstore.service.exception;

import org.springframework.http.HttpStatus;

public class BeerAlreadyExistException extends BusinessException {

//    public BeerAlreadyExistException(String code, HttpStatus status) {
    public BeerAlreadyExistException() {
        super("beers-5", HttpStatus.BAD_REQUEST);
    }

}
