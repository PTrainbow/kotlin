/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.diagnosticProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.diagnosticProvider.AbstractCollectDiagnosticsTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisSourceModuleCollectDiagnosticsTestGenerated extends AbstractCollectDiagnosticsTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fir,
                TestModuleKind.Source,
                AnalysisSessionMode.Normal,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    public void testAllFilesPresentInDiagnostics() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("annotationWithEnumFromDuplicatedLibrary.kt")
    public void testAnnotationWithEnumFromDuplicatedLibrary() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/annotationWithEnumFromDuplicatedLibrary.kt");
    }

    @Test
    @TestMetadata("declarationErrors.kt")
    public void testDeclarationErrors() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/declarationErrors.kt");
    }

    @Test
    @TestMetadata("delegationToLibraryInterface.kt")
    public void testDelegationToLibraryInterface() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/delegationToLibraryInterface.kt");
    }

    @Test
    @TestMetadata("duplicatedCallableWithImplicitType.kt")
    public void testDuplicatedCallableWithImplicitType() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/duplicatedCallableWithImplicitType.kt");
    }

    @Test
    @TestMetadata("errorsInFunctionalInterfacesInstances.kt")
    public void testErrorsInFunctionalInterfacesInstances() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/errorsInFunctionalInterfacesInstances.kt");
    }

    @Test
    @TestMetadata("incompleteDelegation.kt")
    public void testIncompleteDelegation() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/incompleteDelegation.kt");
    }

    @Test
    @TestMetadata("incompleteFor.kt")
    public void testIncompleteFor() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/incompleteFor.kt");
    }

    @Test
    @TestMetadata("inferTypeFromGetValueDelegate.kt")
    public void testInferTypeFromGetValueDelegate() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/inferTypeFromGetValueDelegate.kt");
    }

    @Test
    @TestMetadata("inferTypeFromGetValueDelegateLibrary.kt")
    public void testInferTypeFromGetValueDelegateLibrary() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/inferTypeFromGetValueDelegateLibrary.kt");
    }

    @Test
    @TestMetadata("javaInnerClass.kt")
    public void testJavaInnerClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaInnerClass.kt");
    }

    @Test
    @TestMetadata("javaInnerClassFromAnotherModule.kt")
    public void testJavaInnerClassFromAnotherModule() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaInnerClassFromAnotherModule.kt");
    }

    @Test
    @TestMetadata("javaInnerClassFromLibrary.kt")
    public void testJavaInnerClassFromLibrary() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaInnerClassFromLibrary.kt");
    }

    @Test
    @TestMetadata("javaNestedClass.kt")
    public void testJavaNestedClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaNestedClass.kt");
    }

    @Test
    @TestMetadata("javaNestedClassFromAnotherModule.kt")
    public void testJavaNestedClassFromAnotherModule() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaNestedClassFromAnotherModule.kt");
    }

    @Test
    @TestMetadata("javaNestedClassFromLibrary.kt")
    public void testJavaNestedClassFromLibrary() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/javaNestedClassFromLibrary.kt");
    }

    @Test
    @TestMetadata("overrideProtectedClassReturnFromLibrary.kt")
    public void testOverrideProtectedClassReturnFromLibrary() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/overrideProtectedClassReturnFromLibrary.kt");
    }

    @Test
    @TestMetadata("resolutionErrors.kt")
    public void testResolutionErrors() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/resolutionErrors.kt");
    }

    @Test
    @TestMetadata("typeMismatches.kt")
    public void testTypeMismatches() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/typeMismatches.kt");
    }

    @Test
    @TestMetadata("unresolved.kt")
    public void testUnresolved() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolved.kt");
    }

    @Test
    @TestMetadata("unresolvedAnnotationsOnPropertyFromParameter.kt")
    public void testUnresolvedAnnotationsOnPropertyFromParameter() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedAnnotationsOnPropertyFromParameter.kt");
    }

    @Test
    @TestMetadata("unresolvedReferenceInsideSuperConstructorCall.kt")
    public void testUnresolvedReferenceInsideSuperConstructorCall() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperConstructorCall.kt");
    }

    @Test
    @TestMetadata("unresolvedReferenceInsideSuperConstructorCallWithLocalFunction.kt")
    public void testUnresolvedReferenceInsideSuperConstructorCallWithLocalFunction() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperConstructorCallWithLocalFunction.kt");
    }

    @Test
    @TestMetadata("unresolvedReferenceInsideSuperConstructorCallWithPrimaryConstructor.kt")
    public void testUnresolvedReferenceInsideSuperConstructorCallWithPrimaryConstructor() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperConstructorCallWithPrimaryConstructor.kt");
    }

    @Test
    @TestMetadata("unresolvedReferenceInsideSuperConstructorCallWithSecondaryConstructor.kt")
    public void testUnresolvedReferenceInsideSuperConstructorCallWithSecondaryConstructor() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperConstructorCallWithSecondaryConstructor.kt");
    }

    @Test
    @TestMetadata("unresolvedReferenceInsideSuperPrimaryConstructorCallWithLocalFunction.kt")
    public void testUnresolvedReferenceInsideSuperPrimaryConstructorCallWithLocalFunction() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedReferenceInsideSuperPrimaryConstructorCallWithLocalFunction.kt");
    }

    @Test
    @TestMetadata("unresolvedSuperConstructorCall.kt")
    public void testUnresolvedSuperConstructorCall() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unresolvedSuperConstructorCall.kt");
    }

    @Test
    @TestMetadata("unusedDestructuring.kt")
    public void testUnusedDestructuring() throws Exception {
        runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/unusedDestructuring.kt");
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression")
    @TestDataPath("$PROJECT_ROOT")
    public class Suppression {
        @Test
        public void testAllFilesPresentInSuppression() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("conflictingOverloadsAtTopLevel.kt")
        public void testConflictingOverloadsAtTopLevel() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsAtTopLevel.kt");
        }

        @Test
        @TestMetadata("conflictingOverloadsAtTopLevel2.kt")
        public void testConflictingOverloadsAtTopLevel2() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsAtTopLevel2.kt");
        }

        @Test
        @TestMetadata("conflictingOverloadsAtTopLevelWithFileSuppression.kt")
        public void testConflictingOverloadsAtTopLevelWithFileSuppression() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsAtTopLevelWithFileSuppression.kt");
        }

        @Test
        @TestMetadata("conflictingOverloadsInClass.kt")
        public void testConflictingOverloadsInClass() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsInClass.kt");
        }

        @Test
        @TestMetadata("conflictingOverloadsInNestedClass.kt")
        public void testConflictingOverloadsInNestedClass() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/conflictingOverloadsInNestedClass.kt");
        }

        @Test
        @TestMetadata("deprecationAtTopLevel.kt")
        public void testDeprecationAtTopLevel() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/suppression/deprecationAtTopLevel.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when")
    @TestDataPath("$PROJECT_ROOT")
    public class When {
        @Test
        public void testAllFilesPresentInWhen() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("sealedClassFromDependencyExhaustive.kt")
        public void testSealedClassFromDependencyExhaustive() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassFromDependencyExhaustive.kt");
        }

        @Test
        @TestMetadata("sealedClassFromDependencyMissingCase.kt")
        public void testSealedClassFromDependencyMissingCase() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassFromDependencyMissingCase.kt");
        }

        @Test
        @TestMetadata("sealedClassFromLibraryExhaustive.kt")
        public void testSealedClassFromLibraryExhaustive() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassFromLibraryExhaustive.kt");
        }

        @Test
        @TestMetadata("sealedClassFromLibraryMissingCase.kt")
        public void testSealedClassFromLibraryMissingCase() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassFromLibraryMissingCase.kt");
        }

        @Test
        @TestMetadata("sealedClassSameModuleExhaustive.kt")
        public void testSealedClassSameModuleExhaustive() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassSameModuleExhaustive.kt");
        }

        @Test
        @TestMetadata("sealedClassSameModuleMissingCase.kt")
        public void testSealedClassSameModuleMissingCase() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedClassSameModuleMissingCase.kt");
        }

        @Test
        @TestMetadata("sealedInterfaceFromDependencyExhaustive.kt")
        public void testSealedInterfaceFromDependencyExhaustive() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceFromDependencyExhaustive.kt");
        }

        @Test
        @TestMetadata("sealedInterfaceFromDependencyMissingCase.kt")
        public void testSealedInterfaceFromDependencyMissingCase() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceFromDependencyMissingCase.kt");
        }

        @Test
        @TestMetadata("sealedInterfaceFromLibraryExhaustive.kt")
        public void testSealedInterfaceFromLibraryExhaustive() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceFromLibraryExhaustive.kt");
        }

        @Test
        @TestMetadata("sealedInterfaceFromLibraryMissingCase.kt")
        public void testSealedInterfaceFromLibraryMissingCase() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceFromLibraryMissingCase.kt");
        }

        @Test
        @TestMetadata("sealedInterfaceSameModuleExhaustive.kt")
        public void testSealedInterfaceSameModuleExhaustive() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceSameModuleExhaustive.kt");
        }

        @Test
        @TestMetadata("sealedInterfaceSameModuleMissingCase.kt")
        public void testSealedInterfaceSameModuleMissingCase() throws Exception {
            runTest("analysis/analysis-api/testData/components/diagnosticsProvider/diagnostics/when/sealedInterfaceSameModuleMissingCase.kt");
        }
    }
}
