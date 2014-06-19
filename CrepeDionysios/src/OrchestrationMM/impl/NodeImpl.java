/**
 */
package OrchestrationMM.impl;

import OrchestrationMM.ConcreteService;
import OrchestrationMM.Node;
import OrchestrationMM.OrchestrationMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OrchestrationMM.impl.NodeImpl#getProvidedService <em>Provided Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node
{
  /**
   * The cached value of the '{@link #getProvidedService() <em>Provided Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvidedService()
   * @generated
   * @ordered
   */
  protected ConcreteService providedService;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OrchestrationMMPackage.Literals.NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteService getProvidedService()
  {
    if (providedService != null && providedService.eIsProxy())
    {
      InternalEObject oldProvidedService = (InternalEObject)providedService;
      providedService = (ConcreteService)eResolveProxy(oldProvidedService);
      if (providedService != oldProvidedService)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestrationMMPackage.NODE__PROVIDED_SERVICE, oldProvidedService, providedService));
      }
    }
    return providedService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteService basicGetProvidedService()
  {
    return providedService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvidedService(ConcreteService newProvidedService)
  {
    ConcreteService oldProvidedService = providedService;
    providedService = newProvidedService;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationMMPackage.NODE__PROVIDED_SERVICE, oldProvidedService, providedService));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OrchestrationMMPackage.NODE__PROVIDED_SERVICE:
        if (resolve) return getProvidedService();
        return basicGetProvidedService();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OrchestrationMMPackage.NODE__PROVIDED_SERVICE:
        setProvidedService((ConcreteService)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OrchestrationMMPackage.NODE__PROVIDED_SERVICE:
        setProvidedService((ConcreteService)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OrchestrationMMPackage.NODE__PROVIDED_SERVICE:
        return providedService != null;
    }
    return super.eIsSet(featureID);
  }

} //NodeImpl
