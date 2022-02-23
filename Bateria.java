public class Bateria {
    String modelo;
    String marca;
    String cor;
    String paisdeproducao;
    Float preço;
    Boolean montada;

    void montada(){
        if(montada == true){
            System.out.println("Montada");
        }
        else{
            System.out.println("Montar");
        }

    }

    void status(){
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("pais de produção: " + this.paisdeproducao);
        System.out.println("preço: " + this.preço);
        System.out.println("Montada?: " + this.montada);
    }
}
