package com.layeamehta.digitalbankingapi.datasource.mock

import com.layeamehta.digitalbankingapi.datasource.BankDataSource
import com.layeamehta.digitalbankingapi.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {
    val banks = mutableListOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("5678", 0.0, 100),
    )

    override fun retrieveBanks(): Collection<Bank> = banks

}