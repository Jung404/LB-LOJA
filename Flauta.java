public class Flauta {
    String modelo;
    String marca;
    String cor;
    String paisdeproducao;
    Float preço;
    Boolean assoprar;

    void assoprar(){
        if(assoprar == true){
            System.out.println("Sai som");
        }
        else{
            System.out.println("Não sai som");
        }

    }

    void status(){
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("pais de produção: " + this.paisdeproducao);
        System.out.println("preço: " + this.preço);
        System.out.println("Assopra?: " + this.assoprar);
    }
}
