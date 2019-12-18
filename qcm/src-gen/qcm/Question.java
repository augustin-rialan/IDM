/**
 */
package qcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qcm.Question#getReponse <em>Reponse</em>}</li>
 *   <li>{@link qcm.Question#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see qcm.QcmPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Reponse</b></em>' containment reference list.
	 * The list contents are of type {@link qcm.Reponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reponse</em>' containment reference list.
	 * @see qcm.QcmPackage#getQuestion_Reponse()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Reponse> getReponse();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see qcm.QcmPackage#getQuestion_Data()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link qcm.Question#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

} // Question
