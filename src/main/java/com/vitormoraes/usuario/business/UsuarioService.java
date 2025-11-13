package com.vitormoraes.usuario.business;

import com.vitormoraes.usuario.business.converter.UsuarioConverter;
import com.vitormoraes.usuario.business.dto.UsuarioDTO;
import com.vitormoraes.usuario.infrastructure.entity.Usuario;
import com.vitormoraes.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }
}