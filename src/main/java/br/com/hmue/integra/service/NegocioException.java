/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmue.integra.service;

/**
 *
 * @author gleyw
 */
public class NegocioException extends RuntimeException{

    public NegocioException(String msg) {
        super(msg);
    }
    
}
