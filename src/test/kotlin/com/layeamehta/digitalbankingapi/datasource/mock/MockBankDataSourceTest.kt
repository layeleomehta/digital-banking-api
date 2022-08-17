package com.layeamehta.digitalbankingapi.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MockBankDataSourceTest {
    private val mockBankDataSource = MockBankDataSource()

    @Test
    fun `Should provide collection of banks`() {
        val banks = mockBankDataSource.retrieveBanks()

        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `Should provide some mock data`() {
        val banks = mockBankDataSource.retrieveBanks()

        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).anyMatch { it.transactionFee != 0 }
    }


}