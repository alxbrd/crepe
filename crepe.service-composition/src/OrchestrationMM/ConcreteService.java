/**
 */
package OrchestrationMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OrchestrationMM.ConcreteService#getAbstractService <em>Abstract Service</em>}</li>
 *   <li>{@link OrchestrationMM.ConcreteService#getProvidedBy <em>Provided By</em>}</li>
 * </ul>
 * </p>
 *
 * @see OrchestrationMM.OrchestrationMMPackage#getConcreteService()
 * @model
 * @generated
 */
public interface ConcreteService extends EObject
{
  /**
   * Returns the value of the '<em><b>Abstract Service</b></em>' reference.
   * It is bidirectional and its opposite is '{@link OrchestrationMM.AbstractService#getConcreteServices <em>Concrete Services</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Service</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract Service</em>' reference.
   * @see #setAbstractService(AbstractService)
   * @see OrchestrationMM.OrchestrationMMPackage#getConcreteService_AbstractService()
   * @see OrchestrationMM.AbstractService#getConcreteServices
   * @model opposite="concreteServices" required="true"
   * @generated
   */
  AbstractService getAbstractService();

  /**
   * Sets the value of the '{@link OrchestrationMM.ConcreteService#getAbstractService <em>Abstract Service</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract Service</em>' reference.
   * @see #getAbstractService()
   * @generated
   */
  void setAbstractService(AbstractService value);

  /**
   * Returns the value of the '<em><b>Provided By</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provided By</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provided By</em>' reference.
   * @see #setProvidedBy(Node)
   * @see OrchestrationMM.OrchestrationMMPackage#getConcreteService_ProvidedBy()
   * @model required="true"
   * @generated
   */
  Node getProvidedBy();

  /**
   * Sets the value of the '{@link OrchestrationMM.ConcreteService#getProvidedBy <em>Provided By</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provided By</em>' reference.
   * @see #getProvidedBy()
   * @generated
   */
  void setProvidedBy(Node value);

} // ConcreteService
