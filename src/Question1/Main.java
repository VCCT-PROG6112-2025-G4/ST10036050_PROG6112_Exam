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
        //2D array with product sales data
        int[][] productSales = {
            {300, 150, 700},  
            {250, 200, 600}   
        };
        
        ProductSales salesCalculator = new ProductSales();
        
        //Calculate statistics
        int totalSales = salesCalculator.TotalSales(productSales);
        double averageSales = salesCalculator.AverageSales(productSales);
        int maxSale = salesCalculator.MaxSale(productSales);
        int minSale = salesCalculator.MinSale(productSales);
        
        
    //Display the product sales report
        displayReport(productSales, totalSales, averageSales, maxSale, minSale);
    }
    
    public static void displayReport(int[][] productSales, int total, double average, int max, int min) {
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("-----------------------------");
        
        
        System.out.println();
        System.out.printf("Total sales: %d\n", total);
        System.out.printf("Average sales: %.0f\n", average);
        System.out.printf("Maximum sale: %d\n", max);
        System.out.printf("Minimum sale: %d\n", min);
        System.out.println("-----------------------------");
    }
}
