/**
 */
package qcm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see qcm.QcmFactory
 * @model kind="package"
 * @generated
 */
public interface QcmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qcm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/qcm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qcm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QcmPackage eINSTANCE = qcm.impl.QcmPackageImpl.init();

	/**
	 * The meta object id for the '{@link qcm.impl.QCMImpl <em>QCM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.QCMImpl
	 * @see qcm.impl.QcmPackageImpl#getQCM()
	 * @generated
	 */
	int QCM = 0;

	/**
	 * The feature id for the '<em><b>Domaine</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCM__DOMAINE = 0;

	/**
	 * The number of structural features of the '<em>QCM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>QCM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qcm.impl.DomaineImpl <em>Domaine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.DomaineImpl
	 * @see qcm.impl.QcmPackageImpl#getDomaine()
	 * @generated
	 */
	int DOMAINE = 1;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINE__QUESTION = 0;

	/**
	 * The number of structural features of the '<em>Domaine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Domaine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qcm.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.QuestionImpl
	 * @see qcm.impl.QcmPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Reponse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REPONSE = 0;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qcm.impl.ReponseImpl <em>Reponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qcm.impl.ReponseImpl
	 * @see qcm.impl.QcmPackageImpl#getReponse()
	 * @generated
	 */
	int REPONSE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPONSE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link qcm.QCM <em>QCM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QCM</em>'.
	 * @see qcm.QCM
	 * @generated
	 */
	EClass getQCM();

	/**
	 * Returns the meta object for the containment reference list '{@link qcm.QCM#getDomaine <em>Domaine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domaine</em>'.
	 * @see qcm.QCM#getDomaine()
	 * @see #getQCM()
	 * @generated
	 */
	EReference getQCM_Domaine();

	/**
	 * Returns the meta object for class '{@link qcm.Domaine <em>Domaine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domaine</em>'.
	 * @see qcm.Domaine
	 * @generated
	 */
	EClass getDomaine();

	/**
	 * Returns the meta object for the containment reference list '{@link qcm.Domaine#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question</em>'.
	 * @see qcm.Domaine#getQuestion()
	 * @see #getDomaine()
	 * @generated
	 */
	EReference getDomaine_Question();

	/**
	 * Returns the meta object for class '{@link qcm.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see qcm.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link qcm.Question#getReponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reponse</em>'.
	 * @see qcm.Question#getReponse()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Reponse();

	/**
	 * Returns the meta object for class '{@link qcm.Reponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reponse</em>'.
	 * @see qcm.Reponse
	 * @generated
	 */
	EClass getReponse();

	/**
	 * Returns the meta object for the attribute '{@link qcm.Reponse#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qcm.Reponse#isValue()
	 * @see #getReponse()
	 * @generated
	 */
	EAttribute getReponse_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QcmFactory getQcmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link qcm.impl.QCMImpl <em>QCM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.QCMImpl
		 * @see qcm.impl.QcmPackageImpl#getQCM()
		 * @generated
		 */
		EClass QCM = eINSTANCE.getQCM();

		/**
		 * The meta object literal for the '<em><b>Domaine</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QCM__DOMAINE = eINSTANCE.getQCM_Domaine();

		/**
		 * The meta object literal for the '{@link qcm.impl.DomaineImpl <em>Domaine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.DomaineImpl
		 * @see qcm.impl.QcmPackageImpl#getDomaine()
		 * @generated
		 */
		EClass DOMAINE = eINSTANCE.getDomaine();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAINE__QUESTION = eINSTANCE.getDomaine_Question();

		/**
		 * The meta object literal for the '{@link qcm.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.QuestionImpl
		 * @see qcm.impl.QcmPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Reponse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__REPONSE = eINSTANCE.getQuestion_Reponse();

		/**
		 * The meta object literal for the '{@link qcm.impl.ReponseImpl <em>Reponse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qcm.impl.ReponseImpl
		 * @see qcm.impl.QcmPackageImpl#getReponse()
		 * @generated
		 */
		EClass REPONSE = eINSTANCE.getReponse();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPONSE__VALUE = eINSTANCE.getReponse_Value();

	}

} //QcmPackage
