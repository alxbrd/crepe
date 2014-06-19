/**
 */
package OrchestrationMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OrchestrationMM.ConcretePlan#getStart <em>Start</em>}</li>
 *   <li>{@link OrchestrationMM.ConcretePlan#getEnd <em>End</em>}</li>
 *   <li>{@link OrchestrationMM.ConcretePlan#getOrchestrators <em>Orchestrators</em>}</li>
 * </ul>
 * </p>
 *
 * @see OrchestrationMM.OrchestrationMMPackage#getConcretePlan()
 * @model
 * @generated
 */
public interface ConcretePlan extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' reference.
   * @see #setStart(Orchestrator)
   * @see OrchestrationMM.OrchestrationMMPackage#getConcretePlan_Start()
   * @model required="true"
   * @generated
   */
  Orchestrator getStart();

  /**
   * Sets the value of the '{@link OrchestrationMM.ConcretePlan#getStart <em>Start</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' reference.
   * @see #getStart()
   * @generated
   */
  void setStart(Orchestrator value);

  /**
   * Returns the value of the '<em><b>End</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' reference.
   * @see #setEnd(Orchestrator)
   * @see OrchestrationMM.OrchestrationMMPackage#getConcretePlan_End()
   * @model required="true"
   * @generated
   */
  Orchestrator getEnd();

  /**
   * Sets the value of the '{@link OrchestrationMM.ConcretePlan#getEnd <em>End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(Orchestrator value);

  /**
   * Returns the value of the '<em><b>Orchestrators</b></em>' containment reference list.
   * The list contents are of type {@link OrchestrationMM.Orchestrator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orchestrators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orchestrators</em>' containment reference list.
   * @see OrchestrationMM.OrchestrationMMPackage#getConcretePlan_Orchestrators()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Orchestrator> getOrchestrators();

} // ConcretePlan
