/**
 */
package OrchestrationMM.impl;

import OrchestrationMM.AbstractService;
import OrchestrationMM.ConcreteService;
import OrchestrationMM.Node;
import OrchestrationMM.OrchestrationMMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link OrchestrationMM.impl.ConcreteServiceImpl#getAbstractService <em>Abstract Service</em>}</li>
 *   <li>{@link OrchestrationMM.impl.ConcreteServiceImpl#getProvidedBy <em>Provided By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcreteServiceImpl extends EObjectImpl implements ConcreteService
{
  /**
   * The cached value of the '{@link #getAbstractService() <em>Abstract Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractService()
   * @generated
   * @ordered
   */
  protected AbstractService abstractService;

  /**
   * The cached value of the '{@link #getProvidedBy() <em>Provided By</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvidedBy()
   * @generated
   * @ordered
   */
  protected Node providedBy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConcreteServiceImpl()
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
    return OrchestrationMMPackage.Literals.CONCRETE_SERVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractService getAbstractService()
  {
    if (abstractService != null && abstractService.eIsProxy())
    {
      InternalEObject oldAbstractService = (InternalEObject)abstractService;
      abstractService = (AbstractService)eResolveProxy(oldAbstractService);
      if (abstractService != oldAbstractService)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestrationMMPackage.CONCRETE_SERVICE__ABSTRACT_SERVICE, oldAbstractService, abstractService));
      }
    }
    return abstractService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractService basicGetAbstractService()
  {
    return abstractService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstractService(AbstractService newAbstractService, NotificationChain msgs)
  {
    AbstractService oldAbstractService = abstractService;
    abstractService = newAbstractService;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrchestrationMMPackage.CONCRETE_SERVICE__ABSTRACT_SERVICE, oldAbstractService, newAbstractService);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstractService(AbstractService newAbstractService)
  {
    if (newAbstractService != abstractService)
    {
      NotificationChain msgs = null;
      if (abstractService != null)
        msgs = ((InternalEObject)abstractService).eInverseRemove(this, OrchestrationMMPackage.ABSTRACT_SERVICE__CONCRETE_SERVICES, AbstractService.class, msgs);
      if (newAbstractService != null)
        msgs = ((InternalEObject)newAbstractService).eInverseAdd(this, OrchestrationMMPackage.ABSTRACT_SERVICE__CONCRETE_SERVICES, AbstractService.class, msgs);
      msgs = basicSetAbstractService(newAbstractService, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationMMPackage.CONCRETE_SERVICE__ABSTRACT_SERVICE, newAbstractService, newAbstractService));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getProvidedBy()
  {
    if (providedBy != null && providedBy.eIsProxy())
    {
      InternalEObject oldProvidedBy = (InternalEObject)providedBy;
      providedBy = (Node)eResolveProxy(oldProvidedBy);
      if (providedBy != oldProvidedBy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrchestrationMMPackage.CONCRETE_SERVICE__PROVIDED_BY, oldProvidedBy, providedBy));
      }
    }
    return providedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetProvidedBy()
  {
    return providedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvidedBy(Node newProvidedBy)
  {
    Node oldProvidedBy = providedBy;
    providedBy = newProvidedBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationMMPackage.CONCRETE_SERVICE__PROVIDED_BY, oldProvidedBy, providedBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OrchestrationMMPackage.CONCRETE_SERVICE__ABSTRACT_SERVICE:
        if (abstractService != null)
          msgs = ((InternalEObject)abstractService).eInverseRemove(this, OrchestrationMMPackage.ABSTRACT_SERVICE__CONCRETE_SERVICES, AbstractService.class, msgs);
        return basicSetAbstractService((AbstractService)otherEnd, msgs);
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
      case OrchestrationMMPackage.CONCRETE_SERVICE__ABSTRACT_SERVICE:
        return basicSetAbstractService(null, msgs);
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
      case OrchestrationMMPackage.CONCRETE_SERVICE__ABSTRACT_SERVICE:
        if (resolve) return getAbstractService();
        return basicGetAbstractService();
      case OrchestrationMMPackage.CONCRETE_SERVICE__PROVIDED_BY:
        if (resolve) return getProvidedBy();
        return basicGetProvidedBy();
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
      case OrchestrationMMPackage.CONCRETE_SERVICE__ABSTRACT_SERVICE:
        setAbstractService((AbstractService)newValue);
        return;
      case OrchestrationMMPackage.CONCRETE_SERVICE__PROVIDED_BY:
        setProvidedBy((Node)newValue);
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
      case OrchestrationMMPackage.CONCRETE_SERVICE__ABSTRACT_SERVICE:
        setAbstractService((AbstractService)null);
        return;
      case OrchestrationMMPackage.CONCRETE_SERVICE__PROVIDED_BY:
        setProvidedBy((Node)null);
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
      case OrchestrationMMPackage.CONCRETE_SERVICE__ABSTRACT_SERVICE:
        return abstractService != null;
      case OrchestrationMMPackage.CONCRETE_SERVICE__PROVIDED_BY:
        return providedBy != null;
    }
    return super.eIsSet(featureID);
  }

} //ConcreteServiceImpl
