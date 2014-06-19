/**
 */
package OrchestrationMM.impl;

import OrchestrationMM.AbstractService;
import OrchestrationMM.ConcreteService;
import OrchestrationMM.OrchestrationMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OrchestrationMM.impl.AbstractServiceImpl#getConcreteServices <em>Concrete Services</em>}</li>
 *   <li>{@link OrchestrationMM.impl.AbstractServiceImpl#getTargetServices <em>Target Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractServiceImpl extends EObjectImpl implements AbstractService
{
  /**
   * The cached value of the '{@link #getConcreteServices() <em>Concrete Services</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcreteServices()
   * @generated
   * @ordered
   */
  protected EList<ConcreteService> concreteServices;

  /**
   * The cached value of the '{@link #getTargetServices() <em>Target Services</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetServices()
   * @generated
   * @ordered
   */
  protected EList<AbstractService> targetServices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractServiceImpl()
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
    return OrchestrationMMPackage.Literals.ABSTRACT_SERVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConcreteService> getConcreteServices()
  {
    if (concreteServices == null)
    {
      concreteServices = new EObjectWithInverseResolvingEList<ConcreteService>(ConcreteService.class, this, OrchestrationMMPackage.ABSTRACT_SERVICE__CONCRETE_SERVICES, OrchestrationMMPackage.CONCRETE_SERVICE__ABSTRACT_SERVICE);
    }
    return concreteServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractService> getTargetServices()
  {
    if (targetServices == null)
    {
      targetServices = new EObjectResolvingEList<AbstractService>(AbstractService.class, this, OrchestrationMMPackage.ABSTRACT_SERVICE__TARGET_SERVICES);
    }
    return targetServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OrchestrationMMPackage.ABSTRACT_SERVICE__CONCRETE_SERVICES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getConcreteServices()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OrchestrationMMPackage.ABSTRACT_SERVICE__CONCRETE_SERVICES:
        return ((InternalEList<?>)getConcreteServices()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case OrchestrationMMPackage.ABSTRACT_SERVICE__CONCRETE_SERVICES:
        return getConcreteServices();
      case OrchestrationMMPackage.ABSTRACT_SERVICE__TARGET_SERVICES:
        return getTargetServices();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OrchestrationMMPackage.ABSTRACT_SERVICE__CONCRETE_SERVICES:
        getConcreteServices().clear();
        getConcreteServices().addAll((Collection<? extends ConcreteService>)newValue);
        return;
      case OrchestrationMMPackage.ABSTRACT_SERVICE__TARGET_SERVICES:
        getTargetServices().clear();
        getTargetServices().addAll((Collection<? extends AbstractService>)newValue);
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
      case OrchestrationMMPackage.ABSTRACT_SERVICE__CONCRETE_SERVICES:
        getConcreteServices().clear();
        return;
      case OrchestrationMMPackage.ABSTRACT_SERVICE__TARGET_SERVICES:
        getTargetServices().clear();
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
      case OrchestrationMMPackage.ABSTRACT_SERVICE__CONCRETE_SERVICES:
        return concreteServices != null && !concreteServices.isEmpty();
      case OrchestrationMMPackage.ABSTRACT_SERVICE__TARGET_SERVICES:
        return targetServices != null && !targetServices.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AbstractServiceImpl
