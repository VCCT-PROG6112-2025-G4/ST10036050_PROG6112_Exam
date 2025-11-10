/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author maxwe
 */
    public class ProductSales implements IProductSales {
    private int[][] productSales;
    private final int SALES_LIMIT = 500;
    
    public ProductSales() {
        // Initialize with sample data
        this.productSales = new int[][] {
            {300, 150, 700},  // Year 1: Microphone, Speakers, Mixing Desk
            {250, 200, 600}   // Year 2: Microphone, Speakers, Mixing Desk
        };
    }
    
    @Override
    public int[][] GetProductSales() {
        return productSales;
    }
    
    @Override
    public int GetTotalSales() {
        int total = 0;
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                total += productSales[i][j];
            }
        }
        return total;
    }
    
    @Override
    public int GetSalesOverLimit() {
        int count = 0;
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                if (productSales[i][j] > SALES_LIMIT) {
                    count++;
                }
            }
        }
        return count;
    }
    
    @Override
    public int GetSalesUnderLimit() {
        int count = 0;
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                if (productSales[i][j] <= SALES_LIMIT) {
                    count++;
                }
            }
        }
        return count;
    }
    
    @Override
    public int GetProduct3Processed() {
        return productSales.length; // Returns number of years processed
    }
    
    @Override
    public double GetAverageSales() {
        int total = GetTotalSales();
        int count = 0;
        
        for (int i = 0; i < productSales.length; i++) {
            count += productSales[i].length;
        }
        
        return count > 0 ? (double) total / count : 0;
    }
}

