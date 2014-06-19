/**
 */
package OrchestrationMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orchestrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OrchestrationMM.Orchestrator#getTargetOrchestrator <em>Target Orchestrator</em>}</li>
 *   <li>{@link OrchestrationMM.Orchestrator#getAbstractServices <em>Abstract Services</em>}</li>
 *   <li>{@link OrchestrationMM.Orchestrator#getStart <em>Start</em>}</li>
 *   <li>{@link OrchestrationMM.Orchestrator#getEnd <em>End</em>}</li>
 *   <li>{@link OrchestrationMM.Orchestrator#getConcreteServices <em>Concrete Services</em>}</li>
 *   <li>{@link OrchestrationMM.Orchestrator#getDeployedOn <em>Deployed On</em>}</li>
 * </ul>
 * </p>
 *
 * @see OrchestrationMM.OrchestrationMMPackage#getOrchestrator()
 * @model
 * @generated
 */
public interface Orchestrator extends EObject
{
  /**
   * Returns the value of the '<em><b>Target Orchestrator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Orchestrator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Orchestrator</em>' reference.
   * @see #setTargetOrchestrator(Orchestrator)
   * @see OrchestrationMM.OrchestrationMMPackage#getOrchestrator_TargetOrchestrator()
   * @model
   * @generated
   */
  Orchestrator getTargetOrchestrator();

  /**
   * Sets the value of the '{@link OrchestrationMM.Orchestrator#getTargetOrchestrator <em>Target Orchestrator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Orchestrator</em>' reference.
   * @see #getTargetOrchestrator()
   * @generated
   */
  void setTargetOrchestrator(Orchestrator value);

  /**
   * Returns the value of the '<em><b>Abstract Services</b></em>' reference list.
   * The list contents are of type {@link OrchestrationMM.AbstractService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Services</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Services</em>' reference list.
   * @see OrchestrationMM.OrchestrationMMPackage#getOrchestrator_AbstractServices()
   * @model required="true"
   * @generated
   */
  EList<AbstractService> getAbstractServices();

  /**
   * Returns the value of the '<em><b>Start</b></em>' reference list.
   * The list contents are of type {@link OrchestrationMM.AbstractService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' reference list.
   * @see OrchestrationMM.OrchestrationMMPackage#getOrchestrator_Start()
   * @model required="true"
   * @generated
   */
  EList<AbstractService> getStart();

  /**
   * Returns the value of the '<em><b>End</b></em>' reference list.
   * The list contents are of type {@link OrchestrationMM.AbstractService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' reference list.
   * @see OrchestrationMM.OrchestrationMMPackage#getOrchestrator_End()
   * @model required="true"
   * @generated
   */
  EList<AbstractService> getEnd();

  /**
   * Returns the value of the '<em><b>Concrete Services</b></em>' reference list.
   * The list contents are of type {@link OrchestrationMM.ConcreteService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Services</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Services</em>' reference list.
   * @see OrchestrationMM.OrchestrationMMPackage#getOrchestrator_ConcreteServices()
   * @model required="true"
   * @generated
   */
  EList<ConcreteService> getConcreteServices();

  /**
   * Returns the value of the '<em><b>Deployed On</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deployed On</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deployed On</em>' reference.
   * @see #setDeployedOn(Node)
   * @see OrchestrationMM.OrchestrationMMPackage#getOrchestrator_DeployedOn()
   * @model required="true"
   * @generated
   */
  Node getDeployedOn();

  /**
   * Sets the value of the '{@link OrchestrationMM.Orchestrator#getDeployedOn <em>Deployed On</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deployed On</em>' reference.
   * @see #getDeployedOn()
   * @generated
   */
  void setDeployedOn(Node value);

} // Orchestrator
