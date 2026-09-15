package dio.budgeting;

import dio.budgeting.application.input.PeriodQueryInput;
import dio.budgeting.application.output.ListTransactionsByPeriodUseCase;
import dio.budgeting.application.output.TransactionOutput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;

import java.util.List;
import java.util.function.Function;

@SpringBootApplication
public class BudgetingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BudgetingApplication.class, args);
    }

    @Bean
    @Description("Busca as transações financeiras realizadas em um determinado período de datas")
    public Function<PeriodQueryInput, List<TransactionOutput>> findTransactionsByPeriod(
            ListTransactionsByPeriodUseCase useCase) {
        return input -> useCase.execute(input.startDate(), input.endDate())
                .stream()
                .map(TransactionOutput::fromDomain)
                .toList();
    }
}