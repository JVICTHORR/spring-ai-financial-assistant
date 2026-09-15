package dio.budgeting.application.output;

import dio.budgeting.domain.Transaction;
import dio.budgeting.domain.TransactionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class ListTransactionsByPeriodUseCase {

    private final TransactionRepository repository;

    public ListTransactionsByPeriodUseCase(TransactionRepository repository) {
        this.repository = repository;
    }

    public List<Transaction> execute(String startDate, String endDate) {
        LocalDateTime start = LocalDate.parse(startDate).atStartOfDay();
        LocalDateTime end = LocalDate.parse(endDate).atTime(LocalTime.MAX);

        return repository.findByCreatedAtBetween(start, end);
    }
}