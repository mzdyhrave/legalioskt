package org.hravemzdy.legalios.props

import org.hravemzdy.legalios.interfaces.IPropsHealth
import org.hravemzdy.legalios.service.types.VersionId
import java.math.BigDecimal

class PropsHealth2012(version: VersionId,
                      _minMonthlyBasis: Int,
                      _maxAnnualsBasis: Int,
                      _limMonthlyState: Int,
                      _limMonthlyDis50: Int,
                      _factorCompound: BigDecimal,
                      _factorEmployee: BigDecimal,
                      _marginIncomeEmp: Int,
                      _marginIncomeAgr: Int) :
    PropsHealthBase(version,
        _minMonthlyBasis,
        _maxAnnualsBasis,
        _limMonthlyState,
        _limMonthlyDis50,
        _factorCompound,
        _factorEmployee,
        _marginIncomeEmp,
        _marginIncomeAgr), IPropsHealth {

    constructor(version: Int) : this(
        VersionId.get(version),
        0,0,0,0,
        BigDecimal.ZERO, BigDecimal.ZERO,
        0,0)

    companion object {
        fun empty(): IPropsHealth {
            return PropsHealth2012(VERSION_ZERO)
        }
    }
 }