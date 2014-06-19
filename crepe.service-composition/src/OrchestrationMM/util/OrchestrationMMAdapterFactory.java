/**
 */
package OrchestrationMM.util;

import OrchestrationMM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see OrchestrationMM.OrchestrationMMPackage
 * @generated
 */
public class OrchestrationMMAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OrchestrationMMPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrchestrationMMAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = OrchestrationMMPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrchestrationMMSwitch<Adapter> modelSwitch =
    new OrchestrationMMSwitch<Adapter>()
    {
      @Override
      public Adapter caseCompositeApplication(CompositeApplication object)
      {
        return createCompositeApplicationAdapter();
      }
      @Override
      public Adapter caseConcretePlan(ConcretePlan object)
      {
        return createConcretePlanAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseOrchestrator(Orchestrator object)
      {
        return createOrchestratorAdapter();
      }
      @Override
      public Adapter caseConcreteService(ConcreteService object)
      {
        return createConcreteServiceAdapter();
      }
      @Override
      public Adapter caseAbstractPlan(AbstractPlan object)
      {
        return createAbstractPlanAdapter();
      }
      @Override
      public Adapter caseAbstractService(AbstractService object)
      {
        return createAbstractServiceAdapter();
      }
      @Override
      public Adapter caseUser(User object)
      {
        return createUserAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link OrchestrationMM.CompositeApplication <em>Composite Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OrchestrationMM.CompositeApplication
   * @generated
   */
  public Adapter createCompositeApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OrchestrationMM.ConcretePlan <em>Concrete Plan</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OrchestrationMM.ConcretePlan
   * @generated
   */
  public Adapter createConcretePlanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OrchestrationMM.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OrchestrationMM.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OrchestrationMM.Orchestrator <em>Orchestrator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OrchestrationMM.Orchestrator
   * @generated
   */
  public Adapter createOrchestratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OrchestrationMM.ConcreteService <em>Concrete Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OrchestrationMM.ConcreteService
   * @generated
   */
  public Adapter createConcreteServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OrchestrationMM.AbstractPlan <em>Abstract Plan</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OrchestrationMM.AbstractPlan
   * @generated
   */
  public Adapter createAbstractPlanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OrchestrationMM.AbstractService <em>Abstract Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OrchestrationMM.AbstractService
   * @generated
   */
  public Adapter createAbstractServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OrchestrationMM.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OrchestrationMM.User
   * @generated
   */
  public Adapter createUserAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //OrchestrationMMAdapterFactory
