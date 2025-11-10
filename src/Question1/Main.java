/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question1;

/**
 *
 * @author maxwe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize the 2D array with product sales data
        int[][] productSales = {
            {300, 150, 700},  // Year 1: Quarter 1, Quarter 2, Quarter 3
            {250, 200, 600}   // Year 2: Quarter 1, Quarter 2, Quarter 3
        };
        
        // Create ProductSales object
        ProductSales salesCalculator = new ProductSales();
        
        // Calculate statistics
        int totalSales = salesCalculator.TotalSales(productSales);
        double averageSales = salesCalculator.AverageSales(productSales);
        int maxSale = salesCalculator.MaxSale(productSales);
        int minSale = salesCalculator.MinSale(productSales);
        
        
    }
}
