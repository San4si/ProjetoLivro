/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoLivro;

/**
 *
 * @author Sandro
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa [2];
        Livro[] l = new Livro [3];
        
        p[0] = new Pessoa("Sandro", 32, "M");
        p[1] = new Pessoa ("Maria", 31, "F");
        
        l[0] = new Livro ("A cabana", "Romam", 300, p[0]);
        l[1] = new Livro ("A pescada", "Julia", 500, p[1]);
        l[2] = new Livro("Maresia", "Cornon", 800, p[0]);
        
        
        l[0].abrir();
        l[0].folhear(400);
        l[0].avancarPag();
        
        System.out.println(l[0].detalhes());
        System.out.println("============================");
        
        l[1].abrir();
        l[1].folhear(400);
        l[1].avancarPag();
        l[1].fechar();
        System.out.println(l[1].detalhes());
    }
    
}
