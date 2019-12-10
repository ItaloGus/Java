/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.Dimension;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Italo
 */
public class GraficoDeBarra {
    //Criar dataset
    public CategoryDataset createDataSet(ArrayList <MesesDeVenda> listaDeVendas){
        
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        
        for (MesesDeVenda mesesDeVenda : listaDeVendas){
            dataSet.addValue(mesesDeVenda.getNumeroVenda() , mesesDeVenda.getNomeProduto(), "");
        }
        return dataSet;
    }
    
    //Criar o grafico de barras
    public JFreeChart createBarChart(CategoryDataset dataSet){
       
        JFreeChart graficoBarras = ChartFactory.createBarChart("Mês de Janeiro", "Produtos", 
        "Numero de Vendas", dataSet, PlotOrientation.VERTICAL, true, true, false);
        
        return graficoBarras;        
    }
    
    //Criar grafico completo
    public ChartPanel criarGrafico(ArrayList<MesesDeVenda> listaDeVenda){
        
        CategoryDataset dataSet = this.createDataSet(listaDeVenda);
        
        JFreeChart grafico = this.createBarChart(dataSet);
        
        ChartPanel painelDoGrafico = new ChartPanel(grafico);
        painelDoGrafico.setPreferredSize(new Dimension(998, 458));
        
        return painelDoGrafico;
        
    }
}
