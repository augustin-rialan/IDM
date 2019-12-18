/**
 */
package qcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domaine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcm.Domaine#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see qcm.QcmPackage#getDomaine()
 * @model
 * @generated
 */
public interface Domaine extends EObject {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference list.
	 * The list contents are of type {@link qcm.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference list.
	 * @see qcm.QcmPackage#getDomaine_Question()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getQuestion();

} // Domaine
