/**
 */
package OrchestrationMM.impl;

import OrchestrationMM.AbstractPlan;
import OrchestrationMM.AbstractService;
import OrchestrationMM.CompositeApplication;
import OrchestrationMM.ConcretePlan;
import OrchestrationMM.ConcreteService;
import OrchestrationMM.Node;
import OrchestrationMM.OrchestrationMMFactory;
import OrchestrationMM.OrchestrationMMPackage;
import OrchestrationMM.Orchestrator;
import OrchestrationMM.User;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrchestrationMMPackageImpl extends EPackageImpl implements OrchestrationMMPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositeApplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concretePlanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orchestratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concreteServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractPlanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see OrchestrationMM.OrchestrationMMPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OrchestrationMMPackageImpl()
  {
    super(eNS_URI, OrchestrationMMFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link OrchestrationMMPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OrchestrationMMPackage init()
  {
    if (isInited) return (OrchestrationMMPackage)EPackage.Registry.INSTANCE.getEPackage(OrchestrationMMPackage.eNS_URI);

    // Obtain or create and register package
    OrchestrationMMPackageImpl theOrchestrationMMPackage = (OrchestrationMMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrchestrationMMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OrchestrationMMPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theOrchestrationMMPackage.createPackageContents();

    // Initialize created meta-data
    theOrchestrationMMPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOrchestrationMMPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OrchestrationMMPackage.eNS_URI, theOrchestrationMMPackage);
    return theOrchestrationMMPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositeApplication()
  {
    return compositeApplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeApplication_ConcretePlans()
  {
    return (EReference)compositeApplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeApplication_AbstractPlan()
  {
    return (EReference)compositeApplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeApplication_ConcreteServices()
  {
    return (EReference)compositeApplicationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeApplication_NetworkNodes()
  {
    return (EReference)compositeApplicationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeApplication_ServiceUser()
  {
    return (EReference)compositeApplicationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcretePlan()
  {
    return concretePlanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcretePlan_Start()
  {
    return (EReference)concretePlanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcretePlan_End()
  {
    return (EReference)concretePlanEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcretePlan_Orchestrators()
  {
    return (EReference)concretePlanEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNode()
  {
    return nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNode_ProvidedService()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrchestrator()
  {
    return orchestratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrchestrator_TargetOrchestrator()
  {
    return (EReference)orchestratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrchestrator_AbstractServices()
  {
    return (EReference)orchestratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrchestrator_Start()
  {
    return (EReference)orchestratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrchestrator_End()
  {
    return (EReference)orchestratorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrchestrator_ConcreteServices()
  {
    return (EReference)orchestratorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrchestrator_DeployedOn()
  {
    return (EReference)orchestratorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcreteService()
  {
    return concreteServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcreteService_AbstractService()
  {
    return (EReference)concreteServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcreteService_ProvidedBy()
  {
    return (EReference)concreteServiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractPlan()
  {
    return abstractPlanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractPlan_AbstractServices()
  {
    return (EReference)abstractPlanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractPlan_Start()
  {
    return (EReference)abstractPlanEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractPlan_End()
  {
    return (EReference)abstractPlanEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractService()
  {
    return abstractServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractService_ConcreteServices()
  {
    return (EReference)abstractServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractService_TargetServices()
  {
    return (EReference)abstractServiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUser()
  {
    return userEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUser_HostedOn()
  {
    return (EReference)userEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrchestrationMMFactory getOrchestrationMMFactory()
  {
    return (OrchestrationMMFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    compositeApplicationEClass = createEClass(COMPOSITE_APPLICATION);
    createEReference(compositeApplicationEClass, COMPOSITE_APPLICATION__CONCRETE_PLANS);
    createEReference(compositeApplicationEClass, COMPOSITE_APPLICATION__ABSTRACT_PLAN);
    createEReference(compositeApplicationEClass, COMPOSITE_APPLICATION__CONCRETE_SERVICES);
    createEReference(compositeApplicationEClass, COMPOSITE_APPLICATION__NETWORK_NODES);
    createEReference(compositeApplicationEClass, COMPOSITE_APPLICATION__SERVICE_USER);

    concretePlanEClass = createEClass(CONCRETE_PLAN);
    createEReference(concretePlanEClass, CONCRETE_PLAN__START);
    createEReference(concretePlanEClass, CONCRETE_PLAN__END);
    createEReference(concretePlanEClass, CONCRETE_PLAN__ORCHESTRATORS);

    nodeEClass = createEClass(NODE);
    createEReference(nodeEClass, NODE__PROVIDED_SERVICE);

    orchestratorEClass = createEClass(ORCHESTRATOR);
    createEReference(orchestratorEClass, ORCHESTRATOR__TARGET_ORCHESTRATOR);
    createEReference(orchestratorEClass, ORCHESTRATOR__ABSTRACT_SERVICES);
    createEReference(orchestratorEClass, ORCHESTRATOR__START);
    createEReference(orchestratorEClass, ORCHESTRATOR__END);
    createEReference(orchestratorEClass, ORCHESTRATOR__CONCRETE_SERVICES);
    createEReference(orchestratorEClass, ORCHESTRATOR__DEPLOYED_ON);

    concreteServiceEClass = createEClass(CONCRETE_SERVICE);
    createEReference(concreteServiceEClass, CONCRETE_SERVICE__ABSTRACT_SERVICE);
    createEReference(concreteServiceEClass, CONCRETE_SERVICE__PROVIDED_BY);

    abstractPlanEClass = createEClass(ABSTRACT_PLAN);
    createEReference(abstractPlanEClass, ABSTRACT_PLAN__ABSTRACT_SERVICES);
    createEReference(abstractPlanEClass, ABSTRACT_PLAN__START);
    createEReference(abstractPlanEClass, ABSTRACT_PLAN__END);

    abstractServiceEClass = createEClass(ABSTRACT_SERVICE);
    createEReference(abstractServiceEClass, ABSTRACT_SERVICE__CONCRETE_SERVICES);
    createEReference(abstractServiceEClass, ABSTRACT_SERVICE__TARGET_SERVICES);

    userEClass = createEClass(USER);
    createEReference(userEClass, USER__HOSTED_ON);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(compositeApplicationEClass, CompositeApplication.class, "CompositeApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompositeApplication_ConcretePlans(), this.getConcretePlan(), null, "concretePlans", null, 1, -1, CompositeApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositeApplication_AbstractPlan(), this.getAbstractPlan(), null, "abstractPlan", null, 1, 1, CompositeApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositeApplication_ConcreteServices(), this.getConcreteService(), null, "concreteServices", null, 0, -1, CompositeApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositeApplication_NetworkNodes(), this.getNode(), null, "networkNodes", null, 0, -1, CompositeApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositeApplication_ServiceUser(), this.getUser(), null, "serviceUser", null, 0, -1, CompositeApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(concretePlanEClass, ConcretePlan.class, "ConcretePlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConcretePlan_Start(), this.getOrchestrator(), null, "start", null, 1, 1, ConcretePlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConcretePlan_End(), this.getOrchestrator(), null, "end", null, 1, 1, ConcretePlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConcretePlan_Orchestrators(), this.getOrchestrator(), null, "orchestrators", null, 1, -1, ConcretePlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNode_ProvidedService(), this.getConcreteService(), null, "providedService", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orchestratorEClass, Orchestrator.class, "Orchestrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrchestrator_TargetOrchestrator(), this.getOrchestrator(), null, "targetOrchestrator", null, 0, 1, Orchestrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrchestrator_AbstractServices(), this.getAbstractService(), null, "abstractServices", null, 1, -1, Orchestrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrchestrator_Start(), this.getAbstractService(), null, "start", null, 1, -1, Orchestrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrchestrator_End(), this.getAbstractService(), null, "end", null, 1, -1, Orchestrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrchestrator_ConcreteServices(), this.getConcreteService(), null, "concreteServices", null, 1, -1, Orchestrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrchestrator_DeployedOn(), this.getNode(), null, "deployedOn", null, 1, 1, Orchestrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(concreteServiceEClass, ConcreteService.class, "ConcreteService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConcreteService_AbstractService(), this.getAbstractService(), this.getAbstractService_ConcreteServices(), "abstractService", null, 1, 1, ConcreteService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConcreteService_ProvidedBy(), this.getNode(), null, "providedBy", null, 1, 1, ConcreteService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractPlanEClass, AbstractPlan.class, "AbstractPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractPlan_AbstractServices(), this.getAbstractService(), null, "abstractServices", null, 0, -1, AbstractPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractPlan_Start(), this.getAbstractService(), null, "start", null, 1, 1, AbstractPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractPlan_End(), this.getAbstractService(), null, "end", null, 1, 1, AbstractPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractServiceEClass, AbstractService.class, "AbstractService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractService_ConcreteServices(), this.getConcreteService(), this.getConcreteService_AbstractService(), "concreteServices", null, 1, -1, AbstractService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractService_TargetServices(), this.getAbstractService(), null, "targetServices", null, 0, -1, AbstractService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUser_HostedOn(), this.getNode(), null, "hostedOn", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //OrchestrationMMPackageImpl
