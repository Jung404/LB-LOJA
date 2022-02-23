public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("**********");
        System.out.println("*Bem vindo*");
        System.out.println("**********");
        
        System.out.println("*GUITARRAS*");

        Guitarra g1 = new Guitarra();
        g1.marca = "Les Paul";
        g1.modelo = "Seven Braço Colado Slp-770 Gd";
        g1.cor = "Gold";
        g1.paisdeproducao = "Brasil";
        g1.preço = 1335f;
        g1.afinado = false;
        g1.status();

        System.out.println("");
        
        Guitarra g2 = new Guitarra();
        g2.marca = "Gibson";
        g2.modelo = "Sgj Vintage Sunburst Satin";
        g2.cor = "Marrom";
        g2.paisdeproducao = "Brasil";
        g2.preço = 1899f;
        g2.afinado = true;
        g2.status();

        System.out.println("");

        Guitarra g3 = new Guitarra();
        g3.marca = "Fender";
        g3.modelo = "Squier Mainstream Stratocaster";
        g3.cor = "Preto e Branco";
        g3.paisdeproducao = "Brasil";
        g3.preço = 1099f;
        g3.afinado = false;
        g3.status();

        System.out.println("");

        Guitarra g4 = new Guitarra();
        g4.marca = "Epiphone";
        g4.modelo = "Es339 Semi Acustica Pelham";
        g4.cor = "Azul";
        g4.paisdeproducao = "Brasil";
        g4.preço = 7910f;
        g4.afinado = true;
        g4.status();

        System.out.println("");

        Guitarra g5 = new Guitarra();
        g5.marca = "Ibanez";
        g5.modelo = "Grx 22ex Bl";
        g5.cor = "Azul";
        g5.paisdeproducao = "Brasil";
        g5.preço = 2199f;
        g5.afinado = false;
        g5.status();

        System.out.println("");
        System.out.println("*BATERIAS*");
        System.out.println("");

        Bateria b1 = new Bateria();
        b1.marca = "Gretsch";
        b1.modelo = "Acústica 2t Ny-f1rst";
        b1.cor = "Azul";
        b1.paisdeproducao = "Brasil";
        b1.preço = 2679f;
        b1.montada = false;
        b1.status();

        System.out.println("");

        Bateria b2 = new Bateria();
        b2.marca = "Pearl";
        b2.modelo = "Master Shell Pack";
        b2.cor = "Vermelho";
        b2.paisdeproducao = "Brasil";
        b2.preço = 13975f;
        b2.montada = true;
        b2.status();

        System.out.println("");

        Bateria b3 = new Bateria();
        b3.marca = "Yamaha";
        b3.modelo = "Stage Custom Hip Birch Matte Surf";
        b3.cor = "Ciano";
        b3.paisdeproducao = "Brasil";
        b3.preço = 5960f;
        b3.montada = false;
        b3.status();

        System.out.println("");

        Bateria b4 = new Bateria();
        b4.marca = "Tama";
        b4.modelo = "Club Jam Ljk 48s Ccm";
        b4.cor = "Preta";
        b4.paisdeproducao = "Brasil";
        b4.preço = 5780f;
        b4.montada = true;
        b4.status();

        System.out.println("");

        Bateria b5 = new Bateria();
        b5.marca = "Ludwing Drums";
        b5.modelo = "Premium Dx722 SI Chumbo Profissional";
        b5.cor = "Preto";
        b5.paisdeproducao = "Brasil";
        b5.preço = 2859f;
        b5.montada = false;
        b5.status();

        System.out.println("");
        System.out.println("*TECLADOS*");
        System.out.println("");

        Teclado t1 = new Teclado();
        t1.marca = "Casio";
        t1.modelo = "Casiotone CT-S100 61";
        t1.cor = "Preto";
        t1.paisdeproducao = "Brasil";
        t1.preço = 685f;
        t1.afinado = false;
        t1.status();

        System.out.println("");

        Teclado t2 = new Teclado();
        t2.marca = "Yamaha";
        t2.modelo = "Spring Tc 261";
        t2.cor = "Preto";
        t2.paisdeproducao = "Brasil";
        t2.preço = 859f;
        t2.afinado = true;
        t2.status();

        System.out.println("");

        Teclado t3 = new Teclado();
        t3.marca = "Spring";
        t3.modelo = "TC-361";
        t3.cor = "Preto";
        t3.paisdeproducao = "Brasil";
        t3.preço = 780f;
        t3.afinado = false;
        t3.status();

        System.out.println("");

        Teclado t4 = new Teclado();
        t4.marca = "Casio";
        t4.modelo = "Casiotone CT-S200";
        t4.cor = "Branco";
        t4.paisdeproducao = "Brasil";
        t4.preço = 759f;
        t4.afinado = true;
        t4.status();

        System.out.println("");

        Teclado t5 = new Teclado();
        t5.marca = "Yamaha";
        t5.modelo = "PSR-EW410";
        t5.cor = "Preto";
        t5.paisdeproducao = "Brasil";
        t5.preço = 3070f;
        t5.afinado = false;
        t5.status();

        System.out.println("");
        System.out.println("*VIOLINOS*");
        System.out.println("");

        Violino v1 = new Violino();
        v1.marca = "Mavis";
        v1.modelo = "Mv 1410";
        v1.cor = "Marrom";
        v1.paisdeproducao = "Brasil";
        v1.preço = 399f;
        v1.afinado = false;
        v1.status();

        System.out.println("");

        Violino v2 = new Violino();
        v2.marca = "Antoni Marsale";
        v2.modelo = "Hv320";
        v2.cor = "Marrom";
        v2.paisdeproducao = "Brasil";
        v2.preço = 1099f;
        v2.afinado = true;
        v2.status();

        System.out.println("");

        Violino v3 = new Violino();
        v3.marca = "Tarttan";
        v3.modelo = "Série 100 4/4";
        v3.cor = "Preto";
        v3.paisdeproducao = "Brasil";
        v3.preço = 599f;
        v3.afinado = false;
        v3.status();

        System.out.println("");

        Violino v4 = new Violino();
        v4.marca = "Dasons";
        v4.modelo = "Estudante";
        v4.cor = "Marrom";
        v4.paisdeproducao = "Brasil";
        v4.preço = 445f;
        v4.afinado = true;
        v4.status();

        System.out.println("");

        Violino v5 = new Violino();
        v5.marca = "Barth";
        v5.modelo = "Nt 4/4";
        v5.cor = "Marrom";
        v5.paisdeproducao = "Brasil";
        v5.preço = 519f;
        v5.afinado = false;
        v5.status();

        System.out.println("");
        System.out.println("*FLAUTAS*");
        System.out.println("");

        Flauta f1 = new Flauta();
        f1.marca = "Yamaha";
        f1.modelo = "Soprano Germânica Yrs20g";
        f1.cor = "Verde";
        f1.paisdeproducao = "Brasil";
        f1.preço = 73f;
        f1.assoprar = false;
        f1.status();

        System.out.println("");

        Flauta f2 = new Flauta();
        f2.marca = "Yamaha";
        f2.modelo = "Sopranino Barrosa Yrn302 Bii";
        f2.cor = "Preto";
        f2.paisdeproducao = "Brasil";
        f2.preço = 152f;
        f2.assoprar = true;
        f2.status();

        System.out.println("");

        Flauta f3 = new Flauta();
        f3.marca = "Eagle";
        f3.modelo = "Transversal FI03n";
        f3.cor = "Niquelada";
        f3.paisdeproducao = "Brasil";
        f3.preço = 1287f;
        f3.assoprar = false;
        f3.status();

        System.out.println("");

        Flauta f4 = new Flauta();
        f4.marca = "Doce";
        f4.modelo = "Brinquedo Plástico";
        f4.cor = "Diversas cores";
        f4.paisdeproducao = "Brasil";
        f4.preço = 9f;
        f4.assoprar = true;
        f4.status();

        System.out.println("");

        Flauta f5 = new Flauta();
        f5.marca = "Yamaha";
        f5.modelo = "Doce Barrosa Yrs-24b";
        f5.cor = "Bege";
        f5.paisdeproducao = "Brasil";
        f5.preço = 42f;
        f5.assoprar = false;
        f5.status();
    }
}
