/**
 */
package qcm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qcm.Domaine;
import qcm.QCM;
import qcm.QcmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QCM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qcm.impl.QCMImpl#getDomaine <em>Domaine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QCMImpl extends MinimalEObjectImpl.Container implements QCM {
	/**
	 * The cached value of the '{@link #getDomaine() <em>Domaine</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomaine()
	 * @generated
	 * @ordered
	 */
	protected EList<Domaine> domaine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QCMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QcmPackage.Literals.QCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domaine> getDomaine() {
		if (domaine == null) {
			domaine = new EObjectContainmentEList<Domaine>(Domaine.class, this, QcmPackage.QCM__DOMAINE);
		}
		return domaine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QcmPackage.QCM__DOMAINE:
			return ((InternalEList<?>) getDomaine()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QcmPackage.QCM__DOMAINE:
			return getDomaine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QcmPackage.QCM__DOMAINE:
			getDomaine().clear();
			getDomaine().addAll((Collection<? extends Domaine>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case QcmPackage.QCM__DOMAINE:
			getDomaine().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case QcmPackage.QCM__DOMAINE:
			return domaine != null && !domaine.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QCMImpl
