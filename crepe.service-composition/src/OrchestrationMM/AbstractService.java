/**
 */
package OrchestrationMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OrchestrationMM.AbstractService#getConcreteServices <em>Concrete Services</em>}</li>
 *   <li>{@link OrchestrationMM.AbstractService#getTargetServices <em>Target Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see OrchestrationMM.OrchestrationMMPackage#getAbstractService()
 * @model
 * @generated
 */
public interface AbstractService extends EObject
{
  /**
   * Returns the value of the '<em><b>Concrete Services</b></em>' reference list.
   * The list contents are of type {@link OrchestrationMM.ConcreteService}.
   * It is bidirectional and its opposite is '{@link OrchestrationMM.ConcreteService#getAbstractService <em>Abstract Service</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Services</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concrete Services</em>' reference list.
   * @see OrchestrationMM.OrchestrationMMPackage#getAbstractService_ConcreteServices()
   * @see OrchestrationMM.ConcreteService#getAbstractService
   * @model opposite="abstractService" required="true"
   * @generated
   */
  EList<ConcreteService> getConcreteServices();

  /**
   * Returns the value of the '<em><b>Target Services</b></em>' reference list.
   * The list contents are of type {@link OrchestrationMM.AbstractService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Services</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Services</em>' reference list.
   * @see OrchestrationMM.OrchestrationMMPackage#getAbstractService_TargetServices()
   * @model
   * @generated
   */
  EList<AbstractService> getTargetServices();

} // AbstractService
