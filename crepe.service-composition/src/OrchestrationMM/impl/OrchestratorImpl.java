/**
 */
package OrchestrationMM.impl;

import OrchestrationMM.AbstractService;
import OrchestrationMM.ConcreteService;
import OrchestrationMM.Node;
import OrchestrationMM.OrchestrationMMPackage;
import OrchestrationMM.Orchestrator;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orchestrator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OrchestrationMM.impl.OrchestratorImpl#getTargetOrchestrator <em>Target Orchestrator</em>}</li>
 *   <li>{@link OrchestrationMM.impl.OrchestratorImpl#getAbstractServices <em>Abstract Services</em>}</li>
 *   <li>{@link OrchestrationMM.impl.OrchestratorImpl#getStart <em>Start</em>}</li>
 *   <li>{@link OrchestrationMM.impl.OrchestratorImpl#getEnd <em>End</em>}</li>
 *   <li>{@link OrchestrationMM.impl.OrchestratorImpl#getConcreteServices <em>Concrete Services</em>}</li>
 *   <li>{@link OrchestrationMM.impl.OrchestratorImpl#getDeployedOn <em>Deployed On</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrchestratorImpl extends EObjectImpl implements Orchestrator
{
  /**
   * The cached value of the '{@link #getTargetOrchestrator() <em>Target Orchestrator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetOrchestrator()
   * @generated
   * @ordered
   */
  protected Orchestrator targetOrchestrator;

  /**
   * The cached value of the '{@link #getAbstractServices() <em>Abstract Services</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractServices()
   * @generated
   * @ordered
   */
  protected EList<AbstractService> abstractServices;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected EList<AbstractService> start;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected EList<AbstractService> end;

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
   * The cached value of the '{@link #getDeployedOn() <em>Deployed On</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeployedOn()
   * @generated
   * @ordered
   */
  protected Node deployedOn;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrchestratorImpl()
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
    return OrchestrationMMPackage.Literals.ORCHESTRATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Orchestrator getTargetOrchestrator()
  {
    if (targetOrchestrator != null && targetOrchestrator.eIsProxy())
    {
      InternalEObject oldTargetOrchestrator = (InternalEObject)targetOrchestrator;
      targetOrchestrator = (Orchestrator)eResolveProxy(oldTargetOrchestrator);
      if (targetOrchestrator != oldTargetOrchestrator)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestrationMMPackage.ORCHESTRATOR__TARGET_ORCHESTRATOR, oldTargetOrchestrator, targetOrchestrator));
      }
    }
    return targetOrchestrator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Orchestrator basicGetTargetOrchestrator()
  {
    return targetOrchestrator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetOrchestrator(Orchestrator newTargetOrchestrator)
  {
    Orchestrator oldTargetOrchestrator = targetOrchestrator;
    targetOrchestrator = newTargetOrchestrator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationMMPackage.ORCHESTRATOR__TARGET_ORCHESTRATOR, oldTargetOrchestrator, targetOrchestrator));
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
      abstractServices = new EObjectResolvingEList<AbstractService>(AbstractService.class, this, OrchestrationMMPackage.ORCHESTRATOR__ABSTRACT_SERVICES);
    }
    return abstractServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractService> getStart()
  {
    if (start == null)
    {
      start = new EObjectResolvingEList<AbstractService>(AbstractService.class, this, OrchestrationMMPackage.ORCHESTRATOR__START);
    }
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractService> getEnd()
  {
    if (end == null)
    {
      end = new EObjectResolvingEList<AbstractService>(AbstractService.class, this, OrchestrationMMPackage.ORCHESTRATOR__END);
    }
    return end;
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
      concreteServices = new EObjectResolvingEList<ConcreteService>(ConcreteService.class, this, OrchestrationMMPackage.ORCHESTRATOR__CONCRETE_SERVICES);
    }
    return concreteServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getDeployedOn()
  {
    if (deployedOn != null && deployedOn.eIsProxy())
    {
      InternalEObject oldDeployedOn = (InternalEObject)deployedOn;
      deployedOn = (Node)eResolveProxy(oldDeployedOn);
      if (deployedOn != oldDeployedOn)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestrationMMPackage.ORCHESTRATOR__DEPLOYED_ON, oldDeployedOn, deployedOn));
      }
    }
    return deployedOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetDeployedOn()
  {
    return deployedOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeployedOn(Node newDeployedOn)
  {
    Node oldDeployedOn = deployedOn;
    deployedOn = newDeployedOn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationMMPackage.ORCHESTRATOR__DEPLOYED_ON, oldDeployedOn, deployedOn));
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
      case OrchestrationMMPackage.ORCHESTRATOR__TARGET_ORCHESTRATOR:
        if (resolve) return getTargetOrchestrator();
        return basicGetTargetOrchestrator();
      case OrchestrationMMPackage.ORCHESTRATOR__ABSTRACT_SERVICES:
        return getAbstractServices();
      case OrchestrationMMPackage.ORCHESTRATOR__START:
        return getStart();
      case OrchestrationMMPackage.ORCHESTRATOR__END:
        return getEnd();
      case OrchestrationMMPackage.ORCHESTRATOR__CONCRETE_SERVICES:
        return getConcreteServices();
      case OrchestrationMMPackage.ORCHESTRATOR__DEPLOYED_ON:
        if (resolve) return getDeployedOn();
        return basicGetDeployedOn();
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
      case OrchestrationMMPackage.ORCHESTRATOR__TARGET_ORCHESTRATOR:
        setTargetOrchestrator((Orchestrator)newValue);
        return;
      case OrchestrationMMPackage.ORCHESTRATOR__ABSTRACT_SERVICES:
        getAbstractServices().clear();
        getAbstractServices().addAll((Collection<? extends AbstractService>)newValue);
        return;
      case OrchestrationMMPackage.ORCHESTRATOR__START:
        getStart().clear();
        getStart().addAll((Collection<? extends AbstractService>)newValue);
        return;
      case OrchestrationMMPackage.ORCHESTRATOR__END:
        getEnd().clear();
        getEnd().addAll((Collection<? extends AbstractService>)newValue);
        return;
      case OrchestrationMMPackage.ORCHESTRATOR__CONCRETE_SERVICES:
        getConcreteServices().clear();
        getConcreteServices().addAll((Collection<? extends ConcreteService>)newValue);
        return;
      case OrchestrationMMPackage.ORCHESTRATOR__DEPLOYED_ON:
        setDeployedOn((Node)newValue);
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
      case OrchestrationMMPackage.ORCHESTRATOR__TARGET_ORCHESTRATOR:
        setTargetOrchestrator((Orchestrator)null);
        return;
      case OrchestrationMMPackage.ORCHESTRATOR__ABSTRACT_SERVICES:
        getAbstractServices().clear();
        return;
      case OrchestrationMMPackage.ORCHESTRATOR__START:
        getStart().clear();
        return;
      case OrchestrationMMPackage.ORCHESTRATOR__END:
        getEnd().clear();
        return;
      case OrchestrationMMPackage.ORCHESTRATOR__CONCRETE_SERVICES:
        getConcreteServices().clear();
        return;
      case OrchestrationMMPackage.ORCHESTRATOR__DEPLOYED_ON:
        setDeployedOn((Node)null);
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
      case OrchestrationMMPackage.ORCHESTRATOR__TARGET_ORCHESTRATOR:
        return targetOrchestrator != null;
      case OrchestrationMMPackage.ORCHESTRATOR__ABSTRACT_SERVICES:
        return abstractServices != null && !abstractServices.isEmpty();
      case OrchestrationMMPackage.ORCHESTRATOR__START:
        return start != null && !start.isEmpty();
      case OrchestrationMMPackage.ORCHESTRATOR__END:
        return end != null && !end.isEmpty();
      case OrchestrationMMPackage.ORCHESTRATOR__CONCRETE_SERVICES:
        return concreteServices != null && !concreteServices.isEmpty();
      case OrchestrationMMPackage.ORCHESTRATOR__DEPLOYED_ON:
        return deployedOn != null;
    }
    return super.eIsSet(featureID);
  }

} //OrchestratorImpl
