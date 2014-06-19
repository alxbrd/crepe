/**
 */
package OrchestrationMM;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see OrchestrationMM.OrchestrationMMFactory
 * @model kind="package"
 * @generated
 */
public interface OrchestrationMMPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "OrchestrationMM";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://OrchestrationMM/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "OrchestrationMM";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OrchestrationMMPackage eINSTANCE = OrchestrationMM.impl.OrchestrationMMPackageImpl.init();

  /**
   * The meta object id for the '{@link OrchestrationMM.impl.CompositeApplicationImpl <em>Composite Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see OrchestrationMM.impl.CompositeApplicationImpl
   * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getCompositeApplication()
   * @generated
   */
  int COMPOSITE_APPLICATION = 0;

  /**
   * The feature id for the '<em><b>Concrete Plans</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_APPLICATION__CONCRETE_PLANS = 0;

  /**
   * The feature id for the '<em><b>Abstract Plan</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_APPLICATION__ABSTRACT_PLAN = 1;

  /**
   * The feature id for the '<em><b>Concrete Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_APPLICATION__CONCRETE_SERVICES = 2;

  /**
   * The feature id for the '<em><b>Network Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_APPLICATION__NETWORK_NODES = 3;

  /**
   * The feature id for the '<em><b>Service User</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_APPLICATION__SERVICE_USER = 4;

  /**
   * The number of structural features of the '<em>Composite Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_APPLICATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link OrchestrationMM.impl.ConcretePlanImpl <em>Concrete Plan</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see OrchestrationMM.impl.ConcretePlanImpl
   * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getConcretePlan()
   * @generated
   */
  int CONCRETE_PLAN = 1;

  /**
   * The feature id for the '<em><b>Start</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_PLAN__START = 0;

  /**
   * The feature id for the '<em><b>End</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_PLAN__END = 1;

  /**
   * The feature id for the '<em><b>Orchestrators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_PLAN__ORCHESTRATORS = 2;

  /**
   * The number of structural features of the '<em>Concrete Plan</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_PLAN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link OrchestrationMM.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see OrchestrationMM.impl.NodeImpl
   * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getNode()
   * @generated
   */
  int NODE = 2;

  /**
   * The feature id for the '<em><b>Provided Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__PROVIDED_SERVICE = 0;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link OrchestrationMM.impl.OrchestratorImpl <em>Orchestrator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see OrchestrationMM.impl.OrchestratorImpl
   * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getOrchestrator()
   * @generated
   */
  int ORCHESTRATOR = 3;

  /**
   * The feature id for the '<em><b>Target Orchestrator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORCHESTRATOR__TARGET_ORCHESTRATOR = 0;

  /**
   * The feature id for the '<em><b>Abstract Services</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORCHESTRATOR__ABSTRACT_SERVICES = 1;

  /**
   * The feature id for the '<em><b>Start</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORCHESTRATOR__START = 2;

  /**
   * The feature id for the '<em><b>End</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORCHESTRATOR__END = 3;

  /**
   * The feature id for the '<em><b>Concrete Services</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORCHESTRATOR__CONCRETE_SERVICES = 4;

  /**
   * The feature id for the '<em><b>Deployed On</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORCHESTRATOR__DEPLOYED_ON = 5;

  /**
   * The number of structural features of the '<em>Orchestrator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORCHESTRATOR_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link OrchestrationMM.impl.ConcreteServiceImpl <em>Concrete Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see OrchestrationMM.impl.ConcreteServiceImpl
   * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getConcreteService()
   * @generated
   */
  int CONCRETE_SERVICE = 4;

  /**
   * The feature id for the '<em><b>Abstract Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_SERVICE__ABSTRACT_SERVICE = 0;

  /**
   * The feature id for the '<em><b>Provided By</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_SERVICE__PROVIDED_BY = 1;

  /**
   * The number of structural features of the '<em>Concrete Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_SERVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link OrchestrationMM.impl.AbstractPlanImpl <em>Abstract Plan</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see OrchestrationMM.impl.AbstractPlanImpl
   * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getAbstractPlan()
   * @generated
   */
  int ABSTRACT_PLAN = 5;

  /**
   * The feature id for the '<em><b>Abstract Services</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_PLAN__ABSTRACT_SERVICES = 0;

  /**
   * The feature id for the '<em><b>Start</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_PLAN__START = 1;

  /**
   * The feature id for the '<em><b>End</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_PLAN__END = 2;

  /**
   * The number of structural features of the '<em>Abstract Plan</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_PLAN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link OrchestrationMM.impl.AbstractServiceImpl <em>Abstract Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see OrchestrationMM.impl.AbstractServiceImpl
   * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getAbstractService()
   * @generated
   */
  int ABSTRACT_SERVICE = 6;

  /**
   * The feature id for the '<em><b>Concrete Services</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SERVICE__CONCRETE_SERVICES = 0;

  /**
   * The feature id for the '<em><b>Target Services</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SERVICE__TARGET_SERVICES = 1;

  /**
   * The number of structural features of the '<em>Abstract Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_SERVICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link OrchestrationMM.impl.UserImpl <em>User</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see OrchestrationMM.impl.UserImpl
   * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getUser()
   * @generated
   */
  int USER = 7;

  /**
   * The feature id for the '<em><b>Hosted On</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__HOSTED_ON = 0;

  /**
   * The number of structural features of the '<em>User</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link OrchestrationMM.CompositeApplication <em>Composite Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Application</em>'.
   * @see OrchestrationMM.CompositeApplication
   * @generated
   */
  EClass getCompositeApplication();

  /**
   * Returns the meta object for the containment reference list '{@link OrchestrationMM.CompositeApplication#getConcretePlans <em>Concrete Plans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concrete Plans</em>'.
   * @see OrchestrationMM.CompositeApplication#getConcretePlans()
   * @see #getCompositeApplication()
   * @generated
   */
  EReference getCompositeApplication_ConcretePlans();

  /**
   * Returns the meta object for the containment reference '{@link OrchestrationMM.CompositeApplication#getAbstractPlan <em>Abstract Plan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstract Plan</em>'.
   * @see OrchestrationMM.CompositeApplication#getAbstractPlan()
   * @see #getCompositeApplication()
   * @generated
   */
  EReference getCompositeApplication_AbstractPlan();

  /**
   * Returns the meta object for the containment reference list '{@link OrchestrationMM.CompositeApplication#getConcreteServices <em>Concrete Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concrete Services</em>'.
   * @see OrchestrationMM.CompositeApplication#getConcreteServices()
   * @see #getCompositeApplication()
   * @generated
   */
  EReference getCompositeApplication_ConcreteServices();

  /**
   * Returns the meta object for the containment reference list '{@link OrchestrationMM.CompositeApplication#getNetworkNodes <em>Network Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Network Nodes</em>'.
   * @see OrchestrationMM.CompositeApplication#getNetworkNodes()
   * @see #getCompositeApplication()
   * @generated
   */
  EReference getCompositeApplication_NetworkNodes();

  /**
   * Returns the meta object for the containment reference list '{@link OrchestrationMM.CompositeApplication#getServiceUser <em>Service User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service User</em>'.
   * @see OrchestrationMM.CompositeApplication#getServiceUser()
   * @see #getCompositeApplication()
   * @generated
   */
  EReference getCompositeApplication_ServiceUser();

  /**
   * Returns the meta object for class '{@link OrchestrationMM.ConcretePlan <em>Concrete Plan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concrete Plan</em>'.
   * @see OrchestrationMM.ConcretePlan
   * @generated
   */
  EClass getConcretePlan();

  /**
   * Returns the meta object for the reference '{@link OrchestrationMM.ConcretePlan#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Start</em>'.
   * @see OrchestrationMM.ConcretePlan#getStart()
   * @see #getConcretePlan()
   * @generated
   */
  EReference getConcretePlan_Start();

  /**
   * Returns the meta object for the reference '{@link OrchestrationMM.ConcretePlan#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>End</em>'.
   * @see OrchestrationMM.ConcretePlan#getEnd()
   * @see #getConcretePlan()
   * @generated
   */
  EReference getConcretePlan_End();

  /**
   * Returns the meta object for the containment reference list '{@link OrchestrationMM.ConcretePlan#getOrchestrators <em>Orchestrators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Orchestrators</em>'.
   * @see OrchestrationMM.ConcretePlan#getOrchestrators()
   * @see #getConcretePlan()
   * @generated
   */
  EReference getConcretePlan_Orchestrators();

  /**
   * Returns the meta object for class '{@link OrchestrationMM.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see OrchestrationMM.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for the reference '{@link OrchestrationMM.Node#getProvidedService <em>Provided Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Provided Service</em>'.
   * @see OrchestrationMM.Node#getProvidedService()
   * @see #getNode()
   * @generated
   */
  EReference getNode_ProvidedService();

  /**
   * Returns the meta object for class '{@link OrchestrationMM.Orchestrator <em>Orchestrator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Orchestrator</em>'.
   * @see OrchestrationMM.Orchestrator
   * @generated
   */
  EClass getOrchestrator();

  /**
   * Returns the meta object for the reference '{@link OrchestrationMM.Orchestrator#getTargetOrchestrator <em>Target Orchestrator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Orchestrator</em>'.
   * @see OrchestrationMM.Orchestrator#getTargetOrchestrator()
   * @see #getOrchestrator()
   * @generated
   */
  EReference getOrchestrator_TargetOrchestrator();

  /**
   * Returns the meta object for the reference list '{@link OrchestrationMM.Orchestrator#getAbstractServices <em>Abstract Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Abstract Services</em>'.
   * @see OrchestrationMM.Orchestrator#getAbstractServices()
   * @see #getOrchestrator()
   * @generated
   */
  EReference getOrchestrator_AbstractServices();

  /**
   * Returns the meta object for the reference list '{@link OrchestrationMM.Orchestrator#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Start</em>'.
   * @see OrchestrationMM.Orchestrator#getStart()
   * @see #getOrchestrator()
   * @generated
   */
  EReference getOrchestrator_Start();

  /**
   * Returns the meta object for the reference list '{@link OrchestrationMM.Orchestrator#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>End</em>'.
   * @see OrchestrationMM.Orchestrator#getEnd()
   * @see #getOrchestrator()
   * @generated
   */
  EReference getOrchestrator_End();

  /**
   * Returns the meta object for the reference list '{@link OrchestrationMM.Orchestrator#getConcreteServices <em>Concrete Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Concrete Services</em>'.
   * @see OrchestrationMM.Orchestrator#getConcreteServices()
   * @see #getOrchestrator()
   * @generated
   */
  EReference getOrchestrator_ConcreteServices();

  /**
   * Returns the meta object for the reference '{@link OrchestrationMM.Orchestrator#getDeployedOn <em>Deployed On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Deployed On</em>'.
   * @see OrchestrationMM.Orchestrator#getDeployedOn()
   * @see #getOrchestrator()
   * @generated
   */
  EReference getOrchestrator_DeployedOn();

  /**
   * Returns the meta object for class '{@link OrchestrationMM.ConcreteService <em>Concrete Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concrete Service</em>'.
   * @see OrchestrationMM.ConcreteService
   * @generated
   */
  EClass getConcreteService();

  /**
   * Returns the meta object for the reference '{@link OrchestrationMM.ConcreteService#getAbstractService <em>Abstract Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Abstract Service</em>'.
   * @see OrchestrationMM.ConcreteService#getAbstractService()
   * @see #getConcreteService()
   * @generated
   */
  EReference getConcreteService_AbstractService();

  /**
   * Returns the meta object for the reference '{@link OrchestrationMM.ConcreteService#getProvidedBy <em>Provided By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Provided By</em>'.
   * @see OrchestrationMM.ConcreteService#getProvidedBy()
   * @see #getConcreteService()
   * @generated
   */
  EReference getConcreteService_ProvidedBy();

  /**
   * Returns the meta object for class '{@link OrchestrationMM.AbstractPlan <em>Abstract Plan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Plan</em>'.
   * @see OrchestrationMM.AbstractPlan
   * @generated
   */
  EClass getAbstractPlan();

  /**
   * Returns the meta object for the containment reference list '{@link OrchestrationMM.AbstractPlan#getAbstractServices <em>Abstract Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Abstract Services</em>'.
   * @see OrchestrationMM.AbstractPlan#getAbstractServices()
   * @see #getAbstractPlan()
   * @generated
   */
  EReference getAbstractPlan_AbstractServices();

  /**
   * Returns the meta object for the reference '{@link OrchestrationMM.AbstractPlan#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Start</em>'.
   * @see OrchestrationMM.AbstractPlan#getStart()
   * @see #getAbstractPlan()
   * @generated
   */
  EReference getAbstractPlan_Start();

  /**
   * Returns the meta object for the reference '{@link OrchestrationMM.AbstractPlan#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>End</em>'.
   * @see OrchestrationMM.AbstractPlan#getEnd()
   * @see #getAbstractPlan()
   * @generated
   */
  EReference getAbstractPlan_End();

  /**
   * Returns the meta object for class '{@link OrchestrationMM.AbstractService <em>Abstract Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Service</em>'.
   * @see OrchestrationMM.AbstractService
   * @generated
   */
  EClass getAbstractService();

  /**
   * Returns the meta object for the reference list '{@link OrchestrationMM.AbstractService#getConcreteServices <em>Concrete Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Concrete Services</em>'.
   * @see OrchestrationMM.AbstractService#getConcreteServices()
   * @see #getAbstractService()
   * @generated
   */
  EReference getAbstractService_ConcreteServices();

  /**
   * Returns the meta object for the reference list '{@link OrchestrationMM.AbstractService#getTargetServices <em>Target Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Target Services</em>'.
   * @see OrchestrationMM.AbstractService#getTargetServices()
   * @see #getAbstractService()
   * @generated
   */
  EReference getAbstractService_TargetServices();

  /**
   * Returns the meta object for class '{@link OrchestrationMM.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User</em>'.
   * @see OrchestrationMM.User
   * @generated
   */
  EClass getUser();

  /**
   * Returns the meta object for the reference '{@link OrchestrationMM.User#getHostedOn <em>Hosted On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Hosted On</em>'.
   * @see OrchestrationMM.User#getHostedOn()
   * @see #getUser()
   * @generated
   */
  EReference getUser_HostedOn();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OrchestrationMMFactory getOrchestrationMMFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link OrchestrationMM.impl.CompositeApplicationImpl <em>Composite Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see OrchestrationMM.impl.CompositeApplicationImpl
     * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getCompositeApplication()
     * @generated
     */
    EClass COMPOSITE_APPLICATION = eINSTANCE.getCompositeApplication();

    /**
     * The meta object literal for the '<em><b>Concrete Plans</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_APPLICATION__CONCRETE_PLANS = eINSTANCE.getCompositeApplication_ConcretePlans();

    /**
     * The meta object literal for the '<em><b>Abstract Plan</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_APPLICATION__ABSTRACT_PLAN = eINSTANCE.getCompositeApplication_AbstractPlan();

    /**
     * The meta object literal for the '<em><b>Concrete Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_APPLICATION__CONCRETE_SERVICES = eINSTANCE.getCompositeApplication_ConcreteServices();

    /**
     * The meta object literal for the '<em><b>Network Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_APPLICATION__NETWORK_NODES = eINSTANCE.getCompositeApplication_NetworkNodes();

    /**
     * The meta object literal for the '<em><b>Service User</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_APPLICATION__SERVICE_USER = eINSTANCE.getCompositeApplication_ServiceUser();

    /**
     * The meta object literal for the '{@link OrchestrationMM.impl.ConcretePlanImpl <em>Concrete Plan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see OrchestrationMM.impl.ConcretePlanImpl
     * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getConcretePlan()
     * @generated
     */
    EClass CONCRETE_PLAN = eINSTANCE.getConcretePlan();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCRETE_PLAN__START = eINSTANCE.getConcretePlan_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCRETE_PLAN__END = eINSTANCE.getConcretePlan_End();

    /**
     * The meta object literal for the '<em><b>Orchestrators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCRETE_PLAN__ORCHESTRATORS = eINSTANCE.getConcretePlan_Orchestrators();

    /**
     * The meta object literal for the '{@link OrchestrationMM.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see OrchestrationMM.impl.NodeImpl
     * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '<em><b>Provided Service</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE__PROVIDED_SERVICE = eINSTANCE.getNode_ProvidedService();

    /**
     * The meta object literal for the '{@link OrchestrationMM.impl.OrchestratorImpl <em>Orchestrator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see OrchestrationMM.impl.OrchestratorImpl
     * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getOrchestrator()
     * @generated
     */
    EClass ORCHESTRATOR = eINSTANCE.getOrchestrator();

    /**
     * The meta object literal for the '<em><b>Target Orchestrator</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORCHESTRATOR__TARGET_ORCHESTRATOR = eINSTANCE.getOrchestrator_TargetOrchestrator();

    /**
     * The meta object literal for the '<em><b>Abstract Services</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORCHESTRATOR__ABSTRACT_SERVICES = eINSTANCE.getOrchestrator_AbstractServices();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORCHESTRATOR__START = eINSTANCE.getOrchestrator_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORCHESTRATOR__END = eINSTANCE.getOrchestrator_End();

    /**
     * The meta object literal for the '<em><b>Concrete Services</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORCHESTRATOR__CONCRETE_SERVICES = eINSTANCE.getOrchestrator_ConcreteServices();

    /**
     * The meta object literal for the '<em><b>Deployed On</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORCHESTRATOR__DEPLOYED_ON = eINSTANCE.getOrchestrator_DeployedOn();

    /**
     * The meta object literal for the '{@link OrchestrationMM.impl.ConcreteServiceImpl <em>Concrete Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see OrchestrationMM.impl.ConcreteServiceImpl
     * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getConcreteService()
     * @generated
     */
    EClass CONCRETE_SERVICE = eINSTANCE.getConcreteService();

    /**
     * The meta object literal for the '<em><b>Abstract Service</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCRETE_SERVICE__ABSTRACT_SERVICE = eINSTANCE.getConcreteService_AbstractService();

    /**
     * The meta object literal for the '<em><b>Provided By</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCRETE_SERVICE__PROVIDED_BY = eINSTANCE.getConcreteService_ProvidedBy();

    /**
     * The meta object literal for the '{@link OrchestrationMM.impl.AbstractPlanImpl <em>Abstract Plan</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see OrchestrationMM.impl.AbstractPlanImpl
     * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getAbstractPlan()
     * @generated
     */
    EClass ABSTRACT_PLAN = eINSTANCE.getAbstractPlan();

    /**
     * The meta object literal for the '<em><b>Abstract Services</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_PLAN__ABSTRACT_SERVICES = eINSTANCE.getAbstractPlan_AbstractServices();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_PLAN__START = eINSTANCE.getAbstractPlan_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_PLAN__END = eINSTANCE.getAbstractPlan_End();

    /**
     * The meta object literal for the '{@link OrchestrationMM.impl.AbstractServiceImpl <em>Abstract Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see OrchestrationMM.impl.AbstractServiceImpl
     * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getAbstractService()
     * @generated
     */
    EClass ABSTRACT_SERVICE = eINSTANCE.getAbstractService();

    /**
     * The meta object literal for the '<em><b>Concrete Services</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_SERVICE__CONCRETE_SERVICES = eINSTANCE.getAbstractService_ConcreteServices();

    /**
     * The meta object literal for the '<em><b>Target Services</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_SERVICE__TARGET_SERVICES = eINSTANCE.getAbstractService_TargetServices();

    /**
     * The meta object literal for the '{@link OrchestrationMM.impl.UserImpl <em>User</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see OrchestrationMM.impl.UserImpl
     * @see OrchestrationMM.impl.OrchestrationMMPackageImpl#getUser()
     * @generated
     */
    EClass USER = eINSTANCE.getUser();

    /**
     * The meta object literal for the '<em><b>Hosted On</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER__HOSTED_ON = eINSTANCE.getUser_HostedOn();

  }

} //OrchestrationMMPackage
