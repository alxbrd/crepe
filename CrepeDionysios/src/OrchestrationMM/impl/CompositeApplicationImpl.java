/**
 */
package OrchestrationMM.impl;

import OrchestrationMM.AbstractPlan;
import OrchestrationMM.CompositeApplication;
import OrchestrationMM.ConcretePlan;
import OrchestrationMM.ConcreteService;
import OrchestrationMM.Node;
import OrchestrationMM.OrchestrationMMPackage;
import OrchestrationMM.User;

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
 * An implementation of the model object '<em><b>Composite Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OrchestrationMM.impl.CompositeApplicationImpl#getConcretePlans <em>Concrete Plans</em>}</li>
 *   <li>{@link OrchestrationMM.impl.CompositeApplicationImpl#getAbstractPlan <em>Abstract Plan</em>}</li>
 *   <li>{@link OrchestrationMM.impl.CompositeApplicationImpl#getConcreteServices <em>Concrete Services</em>}</li>
 *   <li>{@link OrchestrationMM.impl.CompositeApplicationImpl#getNetworkNodes <em>Network Nodes</em>}</li>
 *   <li>{@link OrchestrationMM.impl.CompositeApplicationImpl#getServiceUser <em>Service User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeApplicationImpl extends EObjectImpl implements CompositeApplication
{
  /**
   * The cached value of the '{@link #getConcretePlans() <em>Concrete Plans</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcretePlans()
   * @generated
   * @ordered
   */
  protected EList<ConcretePlan> concretePlans;

  /**
   * The cached value of the '{@link #getAbstractPlan() <em>Abstract Plan</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractPlan()
   * @generated
   * @ordered
   */
  protected AbstractPlan abstractPlan;

  /**
   * The cached value of the '{@link #getConcreteServices() <em>Concrete Services</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcreteServices()
   * @generated
   * @ordered
   */
  protected EList<ConcreteService> concreteServices;

  /**
   * The cached value of the '{@link #getNetworkNodes() <em>Network Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNetworkNodes()
   * @generated
   * @ordered
   */
  protected EList<Node> networkNodes;

  /**
   * The cached value of the '{@link #getServiceUser() <em>Service User</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceUser()
   * @generated
   * @ordered
   */
  protected EList<User> serviceUser;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositeApplicationImpl()
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
    return OrchestrationMMPackage.Literals.COMPOSITE_APPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConcretePlan> getConcretePlans()
  {
    if (concretePlans == null)
    {
      concretePlans = new EObjectContainmentEList<ConcretePlan>(ConcretePlan.class, this, OrchestrationMMPackage.COMPOSITE_APPLICATION__CONCRETE_PLANS);
    }
    return concretePlans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractPlan getAbstractPlan()
  {
    return abstractPlan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstractPlan(AbstractPlan newAbstractPlan, NotificationChain msgs)
  {
    AbstractPlan oldAbstractPlan = abstractPlan;
    abstractPlan = newAbstractPlan;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrchestrationMMPackage.COMPOSITE_APPLICATION__ABSTRACT_PLAN, oldAbstractPlan, newAbstractPlan);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstractPlan(AbstractPlan newAbstractPlan)
  {
    if (newAbstractPlan != abstractPlan)
    {
      NotificationChain msgs = null;
      if (abstractPlan != null)
        msgs = ((InternalEObject)abstractPlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrchestrationMMPackage.COMPOSITE_APPLICATION__ABSTRACT_PLAN, null, msgs);
      if (newAbstractPlan != null)
        msgs = ((InternalEObject)newAbstractPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrchestrationMMPackage.COMPOSITE_APPLICATION__ABSTRACT_PLAN, null, msgs);
      msgs = basicSetAbstractPlan(newAbstractPlan, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationMMPackage.COMPOSITE_APPLICATION__ABSTRACT_PLAN, newAbstractPlan, newAbstractPlan));
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
      concreteServices = new EObjectContainmentEList<ConcreteService>(ConcreteService.class, this, OrchestrationMMPackage.COMPOSITE_APPLICATION__CONCRETE_SERVICES);
    }
    return concreteServices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Node> getNetworkNodes()
  {
    if (networkNodes == null)
    {
      networkNodes = new EObjectContainmentEList<Node>(Node.class, this, OrchestrationMMPackage.COMPOSITE_APPLICATION__NETWORK_NODES);
    }
    return networkNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<User> getServiceUser()
  {
    if (serviceUser == null)
    {
      serviceUser = new EObjectContainmentEList<User>(User.class, this, OrchestrationMMPackage.COMPOSITE_APPLICATION__SERVICE_USER);
    }
    return serviceUser;
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
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__CONCRETE_PLANS:
        return ((InternalEList<?>)getConcretePlans()).basicRemove(otherEnd, msgs);
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__ABSTRACT_PLAN:
        return basicSetAbstractPlan(null, msgs);
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__CONCRETE_SERVICES:
        return ((InternalEList<?>)getConcreteServices()).basicRemove(otherEnd, msgs);
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__NETWORK_NODES:
        return ((InternalEList<?>)getNetworkNodes()).basicRemove(otherEnd, msgs);
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__SERVICE_USER:
        return ((InternalEList<?>)getServiceUser()).basicRemove(otherEnd, msgs);
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
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__CONCRETE_PLANS:
        return getConcretePlans();
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__ABSTRACT_PLAN:
        return getAbstractPlan();
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__CONCRETE_SERVICES:
        return getConcreteServices();
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__NETWORK_NODES:
        return getNetworkNodes();
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__SERVICE_USER:
        return getServiceUser();
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
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__CONCRETE_PLANS:
        getConcretePlans().clear();
        getConcretePlans().addAll((Collection<? extends ConcretePlan>)newValue);
        return;
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__ABSTRACT_PLAN:
        setAbstractPlan((AbstractPlan)newValue);
        return;
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__CONCRETE_SERVICES:
        getConcreteServices().clear();
        getConcreteServices().addAll((Collection<? extends ConcreteService>)newValue);
        return;
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__NETWORK_NODES:
        getNetworkNodes().clear();
        getNetworkNodes().addAll((Collection<? extends Node>)newValue);
        return;
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__SERVICE_USER:
        getServiceUser().clear();
        getServiceUser().addAll((Collection<? extends User>)newValue);
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
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__CONCRETE_PLANS:
        getConcretePlans().clear();
        return;
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__ABSTRACT_PLAN:
        setAbstractPlan((AbstractPlan)null);
        return;
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__CONCRETE_SERVICES:
        getConcreteServices().clear();
        return;
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__NETWORK_NODES:
        getNetworkNodes().clear();
        return;
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__SERVICE_USER:
        getServiceUser().clear();
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
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__CONCRETE_PLANS:
        return concretePlans != null && !concretePlans.isEmpty();
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__ABSTRACT_PLAN:
        return abstractPlan != null;
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__CONCRETE_SERVICES:
        return concreteServices != null && !concreteServices.isEmpty();
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__NETWORK_NODES:
        return networkNodes != null && !networkNodes.isEmpty();
      case OrchestrationMMPackage.COMPOSITE_APPLICATION__SERVICE_USER:
        return serviceUser != null && !serviceUser.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CompositeApplicationImpl
