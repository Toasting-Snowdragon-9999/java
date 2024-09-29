package com.math;
/**
 * Class representing a complex number.
 *
 * The ComplexNumbers class handles complex number arithmetic.
 * It supports operations such as addition and subtraction of complex numbers.
 */
public class ComplexNumbers{
    private double _real , _im;

    public ComplexNumbers(){
        this._real = 0;
        this._im = 0;
    }

    public ComplexNumbers(double real, double imaginary){
        this._real = real;
        this._im = imaginary;
    }
    /**
     * Multiply two complex numbers.
     * 
     * @param num The complex number to multiply with.
     * @return A new ComplexNumbers object representing the product.
     */
    public ComplexNumbers multiplication(ComplexNumbers num){
        double real = 0;
        double im = 0;
        
        real = this._real * num._real - this._im*num._im; 
        im = this._real * num._im + this._im*num._real;
        
        ComplexNumbers new_complex_number = new ComplexNumbers(real, im); 
        return new_complex_number;
    }
    /**
     * Adds two complex numbers.
     * 
     * @param num The complex number to add.
     * @return A new ComplexNumbers object representing the sum.
     */
    public ComplexNumbers add(ComplexNumbers num){
        double real = 0;
        double im = 0;
        
        real = this._real + num._real;
        im = this._im + num._im;
        
        ComplexNumbers new_complex_number = new ComplexNumbers(real, im); 
        return new_complex_number;
    }
    /**
     * Subtract two complex numbers.
     * 
     * @param num The complex number to be subtracted.
     * @return A new ComplexNumbers object representing the outcome.
     */
    public ComplexNumbers sub(ComplexNumbers num){
        double real = 0;
        double im = 0;
        
        real = this._real - num._real;
        im = this._im - num._im;
        
        ComplexNumbers new_complex_number = new ComplexNumbers(real, im); 
        return new_complex_number;
    }
    /**
     * Method for printing the numbers in cartesion form, z = a + bi
     * 
     */
    public void print(){
        if (this._im >= 0){
            System.out.println(this._real + "+" + this._im + "i");
        }
        else{
            String real_string = Double.toString(this._real);
            String im_string = Double.toString(this._im);
            System.out.println(real_string + im_string + "i");
        }
    }


}


