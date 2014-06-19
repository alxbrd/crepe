/**
 */
package OrchestrationMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OrchestrationMM.Node#getProvidedService <em>Provided Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see OrchestrationMM.OrchestrationMMPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject
{
  /**
   * Returns the value of the '<em><b>Provided Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provided Service</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provided Service</em>' reference.
   * @see #setProvidedService(ConcreteService)
   * @see OrchestrationMM.OrchestrationMMPackage#getNode_ProvidedService()
   * @model required="true"
   * @generated
   */
  ConcreteService getProvidedService();

  /**
   * Sets the value of the '{@link OrchestrationMM.Node#getProvidedService <em>Provided Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provided Service</em>' reference.
   * @see #getProvidedService()
   * @generated
   */
  void setProvidedService(ConcreteService value);

} // Node
