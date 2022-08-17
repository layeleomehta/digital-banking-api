package com.layeamehta.digitalbankingapi.datasource

import com.layeamehta.digitalbankingapi.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}