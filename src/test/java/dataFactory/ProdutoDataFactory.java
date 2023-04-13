package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarProdutoComumComOvalorIgualA(double valor){

        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Livia");
        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("Branco");
        cores.add("Rosa");

        produto.setProdutoCores(cores);
        produto.setProdutoMock("");

        List<ComponentePojo> componentes = new ArrayList<>();

        ComponentePojo componente = new ComponentePojo();
        componente.setComponenteNome("Óculos");
        componente.setComponenteQuantidade(1);
        componentes.add(componente);

        ComponentePojo segundoComponente = new ComponentePojo();
        segundoComponente.setComponenteNome("Mochila");
        segundoComponente.setComponenteQuantidade(1);
        componentes.add(segundoComponente);

        produto.setComponentes(componentes);

        return produto;

    }
}
