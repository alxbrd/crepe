/**
 */
package OrchestrationMM.impl;

import OrchestrationMM.Node;
import OrchestrationMM.OrchestrationMMPackage;
import OrchestrationMM.User;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OrchestrationMM.impl.UserImpl#getHostedOn <em>Hosted On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends EObjectImpl implements User
{
  /**
   * The cached value of the '{@link #getHostedOn() <em>Hosted On</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostedOn()
   * @generated
   * @ordered
   */
  protected Node hostedOn;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UserImpl()
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
    return OrchestrationMMPackage.Literals.USER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getHostedOn()
  {
    if (hostedOn != null && hostedOn.eIsProxy())
    {
      InternalEObject oldHostedOn = (InternalEObject)hostedOn;
      hostedOn = (Node)eResolveProxy(oldHostedOn);
      if (hostedOn != oldHostedOn)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestrationMMPackage.USER__HOSTED_ON, oldHostedOn, hostedOn));
      }
    }
    return hostedOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetHostedOn()
  {
    return hostedOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHostedOn(Node newHostedOn)
  {
    Node oldHostedOn = hostedOn;
    hostedOn = newHostedOn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationMMPackage.USER__HOSTED_ON, oldHostedOn, hostedOn));
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
      case OrchestrationMMPackage.USER__HOSTED_ON:
        if (resolve) return getHostedOn();
        return basicGetHostedOn();
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
      case OrchestrationMMPackage.USER__HOSTED_ON:
        setHostedOn((Node)newValue);
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
      case OrchestrationMMPackage.USER__HOSTED_ON:
        setHostedOn((Node)null);
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
      case OrchestrationMMPackage.USER__HOSTED_ON:
        return hostedOn != null;
    }
    return super.eIsSet(featureID);
  }

} //UserImpl
