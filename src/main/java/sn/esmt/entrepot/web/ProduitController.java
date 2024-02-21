package sn.esmt.entrepot.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.entrepot.entity.ProduitEntity;
import sn.esmt.entrepot.service.ProduitService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produit")
@AllArgsConstructor
public class ProduitController {
  private ProduitService produitService;
  @PostMapping
  public ProduitEntity save(ProduitEntity produitEntity){
    return produitService.save(produitEntity);
  }
  @GetMapping
  public List<ProduitEntity> all() {
    return produitService.getAll().get();
  }
  @GetMapping("/{qtStock}")
  public Optional<ProduitEntity> find(String ref){
    return produitService.get(ref);
  }
  @DeleteMapping

  public void delete(String ref){
    produitService.delete(ref);
  }
  @PutMapping
  public ProduitEntity update(String ref,ProduitEntity produitEntity){
    return produitService.update(ref,produitEntity);
  }


}
