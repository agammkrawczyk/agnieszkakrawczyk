package com.kodilla.hibernate.manytomany.facade;

public class SeacrhingInEntityException extends Exception {
    public static final String ERR_WRONG_LENGHT="WRONG LENGHT. PLEASE ENTER EXACTYLY 3 LETTER ";
    public static final String ERR_NULL_LENGHT="EMPTY FIELD. PLEASE ENTER 1 LETTER FOR START SREACHING";
    public SeacrhingInEntityException(String message) {
        super(message);
    }
}
