/**
 */
package OrchestrationMM.impl;

import OrchestrationMM.AbstractPlan;
import OrchestrationMM.AbstractService;
import OrchestrationMM.OrchestrationMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OrchestrationMM.impl.AbstractPlanImpl#getAbstractServices <em>Abstract Services</em>}</li>
 *   <li>{@link OrchestrationMM.impl.AbstractPlanImpl#getStart <em>Start</em>}</li>
 *   <li>{@link OrchestrationMM.impl.AbstractPlanImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractPlanImpl extends EObjectImpl implements AbstractPlan
{
  /**
   * The cached value of the '{@link #getAbstractServices() <em>Abstract Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractServices()
   * @generated
   * @ordered
   */
  protected EList<AbstractService> abstractServices;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected AbstractService start;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected AbstractService end;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractPlanImpl()
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
    return OrchestrationMMPackage.Literals.ABSTRACT_PLAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractService> getAbstractServices()
  {
    if (abstractServices == null)
    {
      abstractServices = new EObjectContainmentEList<AbstractService>(AbstractService.class, this, OrchestrationMMPackage.ABSTRACT_PLAN__ABSTRACT_SERVICES);
    }
    return abstractServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractService getStart()
  {
    if (start != null && start.eIsProxy())
    {
      InternalEObject oldStart = (InternalEObject)start;
      start = (AbstractService)eResolveProxy(oldStart);
      if (start != oldStart)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestrationMMPackage.ABSTRACT_PLAN__START, oldStart, start));
      }
    }
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractService basicGetStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(AbstractService newStart)
  {
    AbstractService oldStart = start;
    start = newStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationMMPackage.ABSTRACT_PLAN__START, oldStart, start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractService getEnd()
  {
    if (end != null && end.eIsProxy())
    {
      InternalEObject oldEnd = (InternalEObject)end;
      end = (AbstractService)eResolveProxy(oldEnd);
      if (end != oldEnd)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestrationMMPackage.ABSTRACT_PLAN__END, oldEnd, end));
      }
    }
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractService basicGetEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(AbstractService newEnd)
  {
    AbstractService oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationMMPackage.ABSTRACT_PLAN__END, oldEnd, end));
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
      case OrchestrationMMPackage.ABSTRACT_PLAN__ABSTRACT_SERVICES:
        return ((InternalEList<?>)getAbstractServices()).basicRemove(otherEnd, msgs);
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
      case OrchestrationMMPackage.ABSTRACT_PLAN__ABSTRACT_SERVICES:
        return getAbstractServices();
      case OrchestrationMMPackage.ABSTRACT_PLAN__START:
        if (resolve) return getStart();
        return basicGetStart();
      case OrchestrationMMPackage.ABSTRACT_PLAN__END:
        if (resolve) return getEnd();
        return basicGetEnd();
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
      case OrchestrationMMPackage.ABSTRACT_PLAN__ABSTRACT_SERVICES:
        getAbstractServices().clear();
        getAbstractServices().addAll((Collection<? extends AbstractService>)newValue);
        return;
      case OrchestrationMMPackage.ABSTRACT_PLAN__START:
        setStart((AbstractService)newValue);
        return;
      case OrchestrationMMPackage.ABSTRACT_PLAN__END:
        setEnd((AbstractService)newValue);
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
      case OrchestrationMMPackage.ABSTRACT_PLAN__ABSTRACT_SERVICES:
        getAbstractServices().clear();
        return;
      case OrchestrationMMPackage.ABSTRACT_PLAN__START:
        setStart((AbstractService)null);
        return;
      case OrchestrationMMPackage.ABSTRACT_PLAN__END:
        setEnd((AbstractService)null);
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
      case OrchestrationMMPackage.ABSTRACT_PLAN__ABSTRACT_SERVICES:
        return abstractServices != null && !abstractServices.isEmpty();
      case OrchestrationMMPackage.ABSTRACT_PLAN__START:
        return start != null;
      case OrchestrationMMPackage.ABSTRACT_PLAN__END:
        return end != null;
    }
    return super.eIsSet(featureID);
  }

} //AbstractPlanImpl
