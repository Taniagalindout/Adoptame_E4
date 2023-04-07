package utez.edu.mx.adoptame.e4.service;

import utez.edu.mx.adoptame.e4.entity.UserAdoptame;

import java.util.Optional;

import utez.edu.mx.adoptame.e4.model.request.user.UserInsertDto;

public interface UserAdoptameService {
    boolean saveUser(UserInsertDto user);

    Optional<UserAdoptame> findUserById(Long id);

    UserAdoptame findUserByUsername(String username);
}
