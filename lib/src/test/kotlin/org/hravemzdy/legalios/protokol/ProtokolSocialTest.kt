package org.hravemzdy.legalios.protokol

import org.hravemzdy.legalios.factories.FactorySocial
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

class ProtokolSocialTest : Spek({
    data class TestIntScenario(val minYear: Int, val maxYear: Int)

    // 03_Social_01_MaxAnnualsBasis
    describe("GetProps_ShouldExport_MaxAnnualsBasis") {
        listOf(
            TestIntScenario(2011, 2022),
        ).forEach { tt ->
            it("GetProps should export values") {
                val factory = FactorySocial()

                ExportPropsIntFile("03_Social_01_MaxAnnualsBasis.txt",
                    tt.minYear, tt.maxYear, factory)
                { prop -> prop.maxAnnualsBasis }
            }
        }
    }
    // 03_Social_02_FactorEmployer
    describe("GetProps_ShouldExport_FactorEmployer") {
        listOf(
            TestIntScenario(2011, 2022),
        ).forEach { tt ->
            it("GetProps should export values") {
                val factory = FactorySocial()

                ExportPropsDecFile("03_Social_02_FactorEmployer.txt",
                    tt.minYear, tt.maxYear, factory)
                { prop -> prop.factorEmployer }
            }
        }
    }
    // 03_Social_03_FactorEmployerHigher
    describe("GetProps_ShouldExport_FactorEmployerHigher") {
        listOf(
            TestIntScenario(2011, 2022),
        ).forEach { tt ->
            it("GetProps should export values") {
                val factory = FactorySocial()

                ExportPropsDecFile("03_Social_03_FactorEmployerHigher.txt",
                    tt.minYear, tt.maxYear, factory)
                { prop -> prop.factorEmployerHigher }
            }
        }
    }
    // 03_Social_04_FactorEmployee
    describe("GetProps_ShouldExport_FactorEmployee") {
        listOf(
            TestIntScenario(2011, 2022),
        ).forEach { tt ->
            it("GetProps should export values") {
                val factory = FactorySocial()

                ExportPropsDecFile("03_Social_04_FactorEmployee.txt",
                    tt.minYear, tt.maxYear, factory)
                { prop -> prop.factorEmployee }
            }
        }
    }
    // 03_Social_05_FactorEmployeeGarant
    describe("GetProps_ShouldExport_FactorEmployeeGarant") {
        listOf(
            TestIntScenario(2011, 2022),
        ).forEach { tt ->
            it("GetProps should export values") {
                val factory = FactorySocial()

                ExportPropsDecFile("03_Social_05_FactorEmployeeGarant.txt",
                    tt.minYear, tt.maxYear, factory)
                { prop -> prop.factorEmployeeGarant }
            }
        }
    }
    // 03_Social_06_FactorEmployeeReduce
    describe("GetProps_ShouldExport_FactorEmployeeReduce") {
        listOf(
            TestIntScenario(2011, 2022),
        ).forEach { tt ->
            it("GetProps should export values") {
                val factory = FactorySocial()

                ExportPropsDecFile("03_Social_06_FactorEmployeeReduce.txt",
                    tt.minYear, tt.maxYear, factory)
                { prop -> prop.factorEmployeeReduce }
            }
        }
    }
    // 03_Social_07_MarginIncomeEmp
    describe("GetProps_ShouldExport_MarginIncomeEmp") {
        listOf(
            TestIntScenario(2011, 2022),
        ).forEach { tt ->
            it("GetProps should export values") {
                val factory = FactorySocial()

                ExportPropsIntFile("03_Social_07_MarginIncomeEmp.txt",
                    tt.minYear, tt.maxYear, factory)
                { prop -> prop.marginIncomeEmp }
            }
        }
    }
    // 03_Social_08_MarginIncomeAgr
    describe("GetProps_ShouldExport_MarginIncomeAgr") {
        listOf(
            TestIntScenario(2011, 2022),
        ).forEach { tt ->
            it("GetProps should export values") {
                val factory = FactorySocial()

                ExportPropsIntFile("03_Social_08_MarginIncomeAgr.txt",
                    tt.minYear, tt.maxYear, factory)
                { prop -> prop.marginIncomeAgr }
            }
        }
    }
})

