import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.atacado.dominio.*;
import br.com.atacado.fakeDB.*;

public class App {
    public static void main(String[] args) throws Exception {

        CategoriaFakeDB db = new CategoriaFakeDB();
        for (Categoria c : db.getTabela()) {
            System.out.println(c.toString());
        }
    }

    ProdutoFakeDB db1 = new ProdutoFakeDB();for(
    Produto c:db1.getTabela())
    {
        System.out.println(c.toString());
    }

    SubcategoriaFakeDB db2 = new SubcategoriaFakeDB();for(
    Subcategoria c:db2.getTabela())
    {
        System.out.println(c.toString());
    }
}
