/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum150425;

/**
 *
 * @author DAFA
 */
public class Anjing extends Hewan{
    public Anjing(String nama){
        super(nama);
    }
    
    @Override
    public void Suara(){
        System.out.println(nama+"bersuara : Guk Guk !!!");
    }
    
}
