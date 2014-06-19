/**
 */
package OrchestrationMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OrchestrationMM.CompositeApplication#getConcretePlans <em>Concrete Plans</em>}</li>
 *   <li>{@link OrchestrationMM.CompositeApplication#getAbstractPlan <em>Abstract Plan</em>}</li>
 *   <li>{@link OrchestrationMM.CompositeApplication#getConcreteServices <em>Concrete Services</em>}</li>
 *   <li>{@link OrchestrationMM.CompositeApplication#getNetworkNodes <em>Network Nodes</em>}</li>
 *   <li>{@link OrchestrationMM.CompositeApplication#getServiceUser <em>Service User</em>}</li>
 * </ul>
 * </p>
 *
 * @see OrchestrationMM.OrchestrationMMPackage#getCompositeApplication()
 * @model
 * @generated
 */
public interface CompositeApplication extends EObject
{
  /**
   * Returns the value of the '<em><b>Concrete Plans</b></em>' containment reference list.
   * The list contents are of type {@link OrchestrationMM.ConcretePlan}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Plans</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Plans</em>' containment reference list.
   * @see OrchestrationMM.OrchestrationMMPackage#getCompositeApplication_ConcretePlans()
   * @model containment="true" required="true"
   * @generated
   */
  EList<ConcretePlan> getConcretePlans();

  /**
   * Returns the value of the '<em><b>Abstract Plan</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Plan</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Plan</em>' containment reference.
   * @see #setAbstractPlan(AbstractPlan)
   * @see OrchestrationMM.OrchestrationMMPackage#getCompositeApplication_AbstractPlan()
   * @model containment="true" required="true"
   * @generated
   */
  AbstractPlan getAbstractPlan();

  /**
   * Sets the value of the '{@link OrchestrationMM.CompositeApplication#getAbstractPlan <em>Abstract Plan</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract Plan</em>' containment reference.
   * @see #getAbstractPlan()
   * @generated
   */
  void setAbstractPlan(AbstractPlan value);

  /**
   * Returns the value of the '<em><b>Concrete Services</b></em>' containment reference list.
   * The list contents are of type {@link OrchestrationMM.ConcreteService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Services</em>' containment reference list.
   * @see OrchestrationMM.OrchestrationMMPackage#getCompositeApplication_ConcreteServices()
   * @model containment="true"
   * @generated
   */
  EList<ConcreteService> getConcreteServices();

  /**
   * Returns the value of the '<em><b>Network Nodes</b></em>' containment reference list.
   * The list contents are of type {@link OrchestrationMM.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Network Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Network Nodes</em>' containment reference list.
   * @see OrchestrationMM.OrchestrationMMPackage#getCompositeApplication_NetworkNodes()
   * @model containment="true"
   * @generated
   */
  EList<Node> getNetworkNodes();

  /**
   * Returns the value of the '<em><b>Service User</b></em>' containment reference list.
   * The list contents are of type {@link OrchestrationMM.User}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service User</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service User</em>' containment reference list.
   * @see OrchestrationMM.OrchestrationMMPackage#getCompositeApplication_ServiceUser()
   * @model containment="true"
   * @generated
   */
  EList<User> getServiceUser();

} // CompositeApplication
