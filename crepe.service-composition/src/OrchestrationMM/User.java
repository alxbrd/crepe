/**
 */
package OrchestrationMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OrchestrationMM.User#getHostedOn <em>Hosted On</em>}</li>
 * </ul>
 * </p>
 *
 * @see OrchestrationMM.OrchestrationMMPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject
{
  /**
   * Returns the value of the '<em><b>Hosted On</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hosted On</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hosted On</em>' reference.
   * @see #setHostedOn(Node)
   * @see OrchestrationMM.OrchestrationMMPackage#getUser_HostedOn()
   * @model required="true"
   * @generated
   */
  Node getHostedOn();

  /**
   * Sets the value of the '{@link OrchestrationMM.User#getHostedOn <em>Hosted On</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hosted On</em>' reference.
   * @see #getHostedOn()
   * @generated
   */
  void setHostedOn(Node value);

} // User
