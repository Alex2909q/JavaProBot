package academy.prog.javaprobot;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    public List<User> findAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable).getContent();
    }
    @Transactional(readOnly = true)
    public List<User> findAllUserss() {
        return userRepository.findAll();
    }

    @Transactional(readOnly = true)
    public long getUsersCount() {
        return userRepository.count();
    }

    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public Optional<User> findUserByChatId(long chatId) {
        return userRepository.findByChatId(chatId);
    }

    @Transactional
    public void remove (User user) {
        userRepository.delete(user);
    }
}
