package io.getarrays.securecapita.query;

/**
 * @author: Bek
 * since: 05/27/2023
 * Time: 11:30 AM
 * Project Name: securecapita
 */
public class CustomerQuery {
    public static final String STATS_QUERY = "SELECT c.total_customers, i.total_invoices, inv.total_billed FROM (SELECT COUNT(*) total_customers FROM customer) c, (SELECT COUNT(*) total_invoices FROM invoice) i, (SELECT ROUND(SUM(total)) total_billed FROM invoice) inv";
}
