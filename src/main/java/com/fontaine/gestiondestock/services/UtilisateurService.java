package com.fontaine.gestiondestock.services;

import com.fontaine.gestiondestock.dto.ChangerMotDePasseUtilisateurDto;
import com.fontaine.gestiondestock.dto.UtilisateurDto;
import java.util.List;

public interface UtilisateurService {

  UtilisateurDto save(UtilisateurDto dto);

  UtilisateurDto findById(Integer id);

  List<UtilisateurDto> findAll();

  void delete(Integer id);

  UtilisateurDto findByEmail(String email);

  UtilisateurDto changerMotDePasse(ChangerMotDePasseUtilisateurDto dto);


}
