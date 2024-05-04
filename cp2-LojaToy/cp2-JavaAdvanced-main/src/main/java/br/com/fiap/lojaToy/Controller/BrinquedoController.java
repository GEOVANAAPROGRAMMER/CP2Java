package br.com.fiap.lojaToy.Controller;

import br.com.fiap.lojaToy.DTO.BrinquedoDTO;
import br.com.fiap.lojaToy.Service.BrinquedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoService brinquedoService;

    @GetMapping
    public ResponseEntity<List<BrinquedoDTO>> getAll() {
        List<BrinquedoDTO> brinquedos = brinquedoService.getAll();

        if (!brinquedos.isEmpty()) {
            return ResponseEntity.ok(brinquedos);
        } else {
            return ResponseEntity.noContent().build();
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<BrinquedoDTO> getById(@PathVariable Long id){
        BrinquedoDTO brinquedoExistente = brinquedoService.getById(id);
        if (brinquedoExistente != null) {
            return ResponseEntity.ok(brinquedoExistente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping()
    public ResponseEntity<?> criarBrinquedo(@RequestBody BrinquedoDTO brinquedo){
        BrinquedoDTO novoBrinquedo = brinquedoService.criarBrinquedo(brinquedo);
        if( novoBrinquedo != null){
            return ResponseEntity.status(HttpStatus.CREATED).body(novoBrinquedo);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Não foi possível realizar a operação");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarBrinquedo(@PathVariable Long id){
        boolean brinquedoDeletado = brinquedoService.deleteBrinquedo(id);
        if(brinquedoDeletado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<BrinquedoDTO> atualizarBrinquedo(@PathVariable Long id, @RequestBody BrinquedoDTO brinquedo){
        BrinquedoDTO brinquedoAtualiazado = brinquedoService.updateBrinquedo(id, brinquedo);

        if(brinquedoAtualiazado != null){
            return ResponseEntity.ok(brinquedoAtualiazado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
