package com.layeamehta.digitalbankingapi.services

import com.layeamehta.digitalbankingapi.datasource.BankDataSource
import com.layeamehta.digitalbankingapi.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> {
        return dataSource.retrieveBanks()
    }


}
