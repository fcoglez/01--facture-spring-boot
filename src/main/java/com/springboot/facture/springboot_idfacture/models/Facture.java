package com.springboot.facture.springboot_idfacture.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Facture {

    @Autowired
    private Client client;

    @Value("${facture.office.name}")
    private String description;

    @Autowired
    @Qualifier("default")
    private List<Item> listItems;

    public Facture() {

    }

    @PostConstruct //Se ejecuta justo después de llamar al constructor
    public void init(){
        client.setName("Faku");
    }

    @PreDestroy
    public void destroy(){
        // Aquí cierras cualquier recurso adicional o realizas limpieza
        System.out.println("Este método se ejecuta justo cuando el " +
                            "contexto de spring destruye este Bean");
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> getListItems() {
        return listItems;
    }

    public void setListItems(List<Item> listItems) {
        this.listItems = listItems;
    }

    public String getTotal(){
//       int total = 0;
//       for (Item item : items){
//           total += items
//       }
       return listItems.stream()
               .map(item -> item.getPriceTotal())
               .reduce(0, (sum, importe) -> sum + importe) + " €";
    }
}
