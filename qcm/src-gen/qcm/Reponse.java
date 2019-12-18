/**
 */
package qcm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcm.Reponse#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see qcm.QcmPackage#getReponse()
 * @model
 * @generated
 */
public interface Reponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see qcm.QcmPackage#getReponse_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link qcm.Reponse#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // Reponse
