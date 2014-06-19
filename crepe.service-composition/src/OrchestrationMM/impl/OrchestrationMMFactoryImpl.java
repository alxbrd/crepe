/**
 */
package OrchestrationMM.impl;

import OrchestrationMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrchestrationMMFactoryImpl extends EFactoryImpl implements OrchestrationMMFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OrchestrationMMFactory init()
  {
    try
    {
      OrchestrationMMFactory theOrchestrationMMFactory = (OrchestrationMMFactory)EPackage.Registry.INSTANCE.getEFactory(OrchestrationMMPackage.eNS_URI);
      if (theOrchestrationMMFactory != null)
      {
        return theOrchestrationMMFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OrchestrationMMFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrchestrationMMFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OrchestrationMMPackage.COMPOSITE_APPLICATION: return createCompositeApplication();
      case OrchestrationMMPackage.CONCRETE_PLAN: return createConcretePlan();
      case OrchestrationMMPackage.NODE: return createNode();
      case OrchestrationMMPackage.ORCHESTRATOR: return createOrchestrator();
      case OrchestrationMMPackage.CONCRETE_SERVICE: return createConcreteService();
      case OrchestrationMMPackage.ABSTRACT_PLAN: return createAbstractPlan();
      case OrchestrationMMPackage.ABSTRACT_SERVICE: return createAbstractService();
      case OrchestrationMMPackage.USER: return createUser();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeApplication createCompositeApplication()
  {
    CompositeApplicationImpl compositeApplication = new CompositeApplicationImpl();
    return compositeApplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcretePlan createConcretePlan()
  {
    ConcretePlanImpl concretePlan = new ConcretePlanImpl();
    return concretePlan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Orchestrator createOrchestrator()
  {
    OrchestratorImpl orchestrator = new OrchestratorImpl();
    return orchestrator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteService createConcreteService()
  {
    ConcreteServiceImpl concreteService = new ConcreteServiceImpl();
    return concreteService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractPlan createAbstractPlan()
  {
    AbstractPlanImpl abstractPlan = new AbstractPlanImpl();
    return abstractPlan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractService createAbstractService()
  {
    AbstractServiceImpl abstractService = new AbstractServiceImpl();
    return abstractService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User createUser()
  {
    UserImpl user = new UserImpl();
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrchestrationMMPackage getOrchestrationMMPackage()
  {
    return (OrchestrationMMPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OrchestrationMMPackage getPackage()
  {
    return OrchestrationMMPackage.eINSTANCE;
  }

} //OrchestrationMMFactoryImpl
