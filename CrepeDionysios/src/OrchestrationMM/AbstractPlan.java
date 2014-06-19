/**
 */
package OrchestrationMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OrchestrationMM.AbstractPlan#getAbstractServices <em>Abstract Services</em>}</li>
 *   <li>{@link OrchestrationMM.AbstractPlan#getStart <em>Start</em>}</li>
 *   <li>{@link OrchestrationMM.AbstractPlan#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see OrchestrationMM.OrchestrationMMPackage#getAbstractPlan()
 * @model
 * @generated
 */
public interface AbstractPlan extends EObject
{
  /**
   * Returns the value of the '<em><b>Abstract Services</b></em>' containment reference list.
   * The list contents are of type {@link OrchestrationMM.AbstractService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Services</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Services</em>' containment reference list.
   * @see OrchestrationMM.OrchestrationMMPackage#getAbstractPlan_AbstractServices()
   * @model containment="true"
   * @generated
   */
  EList<AbstractService> getAbstractServices();

  /**
   * Returns the value of the '<em><b>Start</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' reference.
   * @see #setStart(AbstractService)
   * @see OrchestrationMM.OrchestrationMMPackage#getAbstractPlan_Start()
   * @model required="true"
   * @generated
   */
  AbstractService getStart();

  /**
   * Sets the value of the '{@link OrchestrationMM.AbstractPlan#getStart <em>Start</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' reference.
   * @see #getStart()
   * @generated
   */
  void setStart(AbstractService value);

  /**
   * Returns the value of the '<em><b>End</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' reference.
   * @see #setEnd(AbstractService)
   * @see OrchestrationMM.OrchestrationMMPackage#getAbstractPlan_End()
   * @model required="true"
   * @generated
   */
  AbstractService getEnd();

  /**
   * Sets the value of the '{@link OrchestrationMM.AbstractPlan#getEnd <em>End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(AbstractService value);

} // AbstractPlan
