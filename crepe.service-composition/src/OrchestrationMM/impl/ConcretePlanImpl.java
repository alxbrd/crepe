/**
 */
package OrchestrationMM.impl;

import OrchestrationMM.ConcretePlan;
import OrchestrationMM.OrchestrationMMPackage;
import OrchestrationMM.Orchestrator;

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
 * An implementation of the model object '<em><b>Concrete Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OrchestrationMM.impl.ConcretePlanImpl#getStart <em>Start</em>}</li>
 *   <li>{@link OrchestrationMM.impl.ConcretePlanImpl#getEnd <em>End</em>}</li>
 *   <li>{@link OrchestrationMM.impl.ConcretePlanImpl#getOrchestrators <em>Orchestrators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcretePlanImpl extends EObjectImpl implements ConcretePlan
{
  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected Orchestrator start;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected Orchestrator end;

  /**
   * The cached value of the '{@link #getOrchestrators() <em>Orchestrators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrchestrators()
   * @generated
   * @ordered
   */
  protected EList<Orchestrator> orchestrators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConcretePlanImpl()
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
    return OrchestrationMMPackage.Literals.CONCRETE_PLAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Orchestrator getStart()
  {
    if (start != null && start.eIsProxy())
    {
      InternalEObject oldStart = (InternalEObject)start;
      start = (Orchestrator)eResolveProxy(oldStart);
      if (start != oldStart)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestrationMMPackage.CONCRETE_PLAN__START, oldStart, start));
      }
    }
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Orchestrator basicGetStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(Orchestrator newStart)
  {
    Orchestrator oldStart = start;
    start = newStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationMMPackage.CONCRETE_PLAN__START, oldStart, start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Orchestrator getEnd()
  {
    if (end != null && end.eIsProxy())
    {
      InternalEObject oldEnd = (InternalEObject)end;
      end = (Orchestrator)eResolveProxy(oldEnd);
      if (end != oldEnd)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestrationMMPackage.CONCRETE_PLAN__END, oldEnd, end));
      }
    }
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Orchestrator basicGetEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(Orchestrator newEnd)
  {
    Orchestrator oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationMMPackage.CONCRETE_PLAN__END, oldEnd, end));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Orchestrator> getOrchestrators()
  {
    if (orchestrators == null)
    {
      orchestrators = new EObjectContainmentEList<Orchestrator>(Orchestrator.class, this, OrchestrationMMPackage.CONCRETE_PLAN__ORCHESTRATORS);
    }
    return orchestrators;
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
      case OrchestrationMMPackage.CONCRETE_PLAN__ORCHESTRATORS:
        return ((InternalEList<?>)getOrchestrators()).basicRemove(otherEnd, msgs);
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
      case OrchestrationMMPackage.CONCRETE_PLAN__START:
        if (resolve) return getStart();
        return basicGetStart();
      case OrchestrationMMPackage.CONCRETE_PLAN__END:
        if (resolve) return getEnd();
        return basicGetEnd();
      case OrchestrationMMPackage.CONCRETE_PLAN__ORCHESTRATORS:
        return getOrchestrators();
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
      case OrchestrationMMPackage.CONCRETE_PLAN__START:
        setStart((Orchestrator)newValue);
        return;
      case OrchestrationMMPackage.CONCRETE_PLAN__END:
        setEnd((Orchestrator)newValue);
        return;
      case OrchestrationMMPackage.CONCRETE_PLAN__ORCHESTRATORS:
        getOrchestrators().clear();
        getOrchestrators().addAll((Collection<? extends Orchestrator>)newValue);
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
      case OrchestrationMMPackage.CONCRETE_PLAN__START:
        setStart((Orchestrator)null);
        return;
      case OrchestrationMMPackage.CONCRETE_PLAN__END:
        setEnd((Orchestrator)null);
        return;
      case OrchestrationMMPackage.CONCRETE_PLAN__ORCHESTRATORS:
        getOrchestrators().clear();
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
      case OrchestrationMMPackage.CONCRETE_PLAN__START:
        return start != null;
      case OrchestrationMMPackage.CONCRETE_PLAN__END:
        return end != null;
      case OrchestrationMMPackage.CONCRETE_PLAN__ORCHESTRATORS:
        return orchestrators != null && !orchestrators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConcretePlanImpl
