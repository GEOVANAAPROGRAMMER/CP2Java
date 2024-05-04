package br.com.fiap.lojaToy.Service;

import br.com.fiap.lojaToy.DTO.BrinquedoDTO;
import br.com.fiap.lojaToy.Factory.BrinquedoFactory;
import br.com.fiap.lojaToy.Models.Brinquedo;
import br.com.fiap.lojaToy.Repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrinquedoService {

    @Autowired
    private BrinquedoRepository brinquedoRepository;

    private final BrinquedoFactory factory = new BrinquedoFactory();

    public List<BrinquedoDTO> getAll(){
        return factory.toDto((List<Brinquedo>) brinquedoRepository.findAll());
    }

    public BrinquedoDTO getById(Long id) {
        Optional<Brinquedo> brinquedoOptional = brinquedoRepository.findById(id);
        return brinquedoOptional.map(factory::toDto).orElse(null);
    }

    public BrinquedoDTO criarBrinquedo(BrinquedoDTO brinquedo){
        Brinquedo novoBrinquedo = brinquedoRepository.save(factory.toEntity(brinquedo));
        return factory.toDto(novoBrinquedo);
    }

    public BrinquedoDTO updateBrinquedo(Long id, BrinquedoDTO brinquedo){
        Brinquedo brinquedoExistente = brinquedoRepository.findById(id).orElse(null);

        if(brinquedoExistente != null){
            Brinquedo desatualizado = factory.toEntity(brinquedo);
            desatualizado.setId(id);

            Brinquedo atualizado = brinquedoRepository.save(desatualizado);
            return factory.toDto(atualizado);
        } else {
            return factory.toDto(brinquedoExistente);
        }
    }

    public boolean deleteBrinquedo(Long id) {
        if (brinquedoRepository.existsById(id)) {
            brinquedoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
