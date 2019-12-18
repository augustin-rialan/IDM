/**
 */
package qcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QCM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcm.QCM#getDomaine <em>Domaine</em>}</li>
 * </ul>
 *
 * @see qcm.QcmPackage#getQCM()
 * @model
 * @generated
 */
public interface QCM extends EObject {
	/**
	 * Returns the value of the '<em><b>Domaine</b></em>' containment reference list.
	 * The list contents are of type {@link qcm.Domaine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domaine</em>' containment reference list.
	 * @see qcm.QcmPackage#getQCM_Domaine()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Domaine> getDomaine();

} // QCM
