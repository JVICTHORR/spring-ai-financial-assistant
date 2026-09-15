package dio.budgeting.domain;

import java.util.List;

public interface TransactionRepository {
    Transaction save(Transaction transaction);

    List<Transaction> findAllByCategory(Category category);
}

package dio.budgeting.domain;

import java.time.LocalDateTime;
import java.util.List;

public interface TransactionRepository {
    void save(Transaction transaction);
    List<Transaction> findByCategory(Category category);
    
    // Adicione esta linha:
    List<Transaction> findByCreatedAtBetween(LocalDateTime start, LocalDateTime end);
}