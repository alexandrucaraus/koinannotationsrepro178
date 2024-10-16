package de.test.koinannotationsrepro178

import de.test.modulea.ADi
import de.test.moduleb.BDi
import org.koin.ksp.generated.module


val modules : List<org.koin.core.module.Module> = ADi().module + BDi().module