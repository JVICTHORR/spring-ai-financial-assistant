package dio.budgeting.application.input;

import org.springframework.ai.tool.annotation.Description;

public record PeriodQueryInput(
    @Description("Data de início no formato YYYY-MM-DD") String startDate,
    @Description("Data de fim no formato YYYY-MM-DD") String endDate
) {}