public class Teclado {
    String modelo;
    String marca;
    String cor;
    String paisdeproducao;
    Float preço;
    Boolean afinado;

    void afinado(){
        if(afinado == true){
            System.out.println("Afinado");
        }
        else{
            System.out.println("Afinar");
        }

    }

    void status(){
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("pais de produção: " + this.paisdeproducao);
        System.out.println("preço: " + this.preço);
        System.out.println("Afinado?: " + this.afinado);
    }
}
