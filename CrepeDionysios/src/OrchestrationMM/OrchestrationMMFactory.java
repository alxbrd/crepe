/**
 */
package OrchestrationMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see OrchestrationMM.OrchestrationMMPackage
 * @generated
 */
public interface OrchestrationMMFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OrchestrationMMFactory eINSTANCE = OrchestrationMM.impl.OrchestrationMMFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Composite Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Application</em>'.
   * @generated
   */
  CompositeApplication createCompositeApplication();

  /**
   * Returns a new object of class '<em>Concrete Plan</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concrete Plan</em>'.
   * @generated
   */
  ConcretePlan createConcretePlan();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns a new object of class '<em>Orchestrator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Orchestrator</em>'.
   * @generated
   */
  Orchestrator createOrchestrator();

  /**
   * Returns a new object of class '<em>Concrete Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concrete Service</em>'.
   * @generated
   */
  ConcreteService createConcreteService();

  /**
   * Returns a new object of class '<em>Abstract Plan</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Plan</em>'.
   * @generated
   */
  AbstractPlan createAbstractPlan();

  /**
   * Returns a new object of class '<em>Abstract Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Service</em>'.
   * @generated
   */
  AbstractService createAbstractService();

  /**
   * Returns a new object of class '<em>User</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User</em>'.
   * @generated
   */
  User createUser();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OrchestrationMMPackage getOrchestrationMMPackage();

} //OrchestrationMMFactory
