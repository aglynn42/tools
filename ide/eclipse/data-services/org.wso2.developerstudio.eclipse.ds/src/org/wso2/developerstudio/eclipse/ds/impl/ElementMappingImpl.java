/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.ds.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wso2.developerstudio.eclipse.ds.AttributeMapping;
import org.wso2.developerstudio.eclipse.ds.CallQuery;
import org.wso2.developerstudio.eclipse.ds.ConfigurationProperty;
import org.wso2.developerstudio.eclipse.ds.DsPackage;
import org.wso2.developerstudio.eclipse.ds.ElementMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ElementMappingImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ElementMappingImpl#getExport <em>Export</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ElementMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ElementMappingImpl#getRequiredRoles <em>Required Roles</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ElementMappingImpl#getExportType <em>Export Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ElementMappingImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ElementMappingImpl#getXsdType <em>Xsd Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ElementMappingImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ElementMappingImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ElementMappingImpl#getCallQuery <em>Call Query</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ElementMappingImpl#isIsComplexType <em>Is Complex Type</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ElementMappingImpl#getQueryParam <em>Query Param</em>}</li>
 *   <li>{@link org.wso2.developerstudio.eclipse.ds.impl.ElementMappingImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementMappingImpl extends EObjectImpl implements ElementMapping {
	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected String column = COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getExport() <em>Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExport() <em>Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport()
	 * @generated
	 * @ordered
	 */
	protected String export = EXPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredRoles() <em>Required Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRoles()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_ROLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredRoles() <em>Required Roles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRoles()
	 * @generated
	 * @ordered
	 */
	protected String requiredRoles = REQUIRED_ROLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getExportType() <em>Export Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportType()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExportType() <em>Export Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportType()
	 * @generated
	 * @ordered
	 */
	protected String exportType = EXPORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXsdType() <em>Xsd Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdType()
	 * @generated
	 * @ordered
	 */
	protected static final String XSD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXsdType() <em>Xsd Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsdType()
	 * @generated
	 * @ordered
	 */
	protected String xsdType = XSD_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementMapping> element;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeMapping> attribute;

	/**
	 * The cached value of the '{@link #getCallQuery() <em>Call Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallQuery()
	 * @generated
	 * @ordered
	 */
	protected CallQuery callQuery;
 
	/**
	 * The default value of the '{@link #isIsComplexType() <em>Is Complex Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComplexType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPLEX_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComplexType() <em>Is Complex Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComplexType()
	 * @generated
	 * @ordered
	 */
	protected boolean isComplexType = IS_COMPLEX_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueryParam() <em>Query Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryParam()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_PARAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryParam() <em>Query Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryParam()
	 * @generated
	 * @ordered
	 */
	protected String queryParam = QUERY_PARAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	private boolean complex;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.ELEMENT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(String newColumn) {
		String oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.ELEMENT_MAPPING__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExport() {
		return export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExport(String newExport) {
		String oldExport = export;
		export = newExport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.ELEMENT_MAPPING__EXPORT, oldExport, export));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.ELEMENT_MAPPING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredRoles() {
		return requiredRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRoles(String newRequiredRoles) {
		String oldRequiredRoles = requiredRoles;
		requiredRoles = newRequiredRoles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.ELEMENT_MAPPING__REQUIRED_ROLES, oldRequiredRoles, requiredRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExportType() {
		return exportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportType(String newExportType) {
		String oldExportType = exportType;
		exportType = newExportType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.ELEMENT_MAPPING__EXPORT_TYPE, oldExportType, exportType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.ELEMENT_MAPPING__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXsdType() {
		return xsdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXsdType(String newXsdType) {
		String oldXsdType = xsdType;
		xsdType = newXsdType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.ELEMENT_MAPPING__XSD_TYPE, oldXsdType, xsdType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementMapping> getElement() {
		if (element == null) {
			element = new EObjectContainmentEList<ElementMapping>(ElementMapping.class, this, DsPackage.ELEMENT_MAPPING__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeMapping> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<AttributeMapping>(AttributeMapping.class, this, DsPackage.ELEMENT_MAPPING__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallQuery getCallQuery() {
		return callQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallQuery(CallQuery newCallQuery, NotificationChain msgs) {
		CallQuery oldCallQuery = callQuery;
		callQuery = newCallQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsPackage.ELEMENT_MAPPING__CALL_QUERY, oldCallQuery, newCallQuery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallQuery(CallQuery newCallQuery) {
		if (newCallQuery != callQuery) {
			NotificationChain msgs = null;
			if (callQuery != null)
				msgs = ((InternalEObject)callQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsPackage.ELEMENT_MAPPING__CALL_QUERY, null, msgs);
			if (newCallQuery != null)
				msgs = ((InternalEObject)newCallQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsPackage.ELEMENT_MAPPING__CALL_QUERY, null, msgs);
			msgs = basicSetCallQuery(newCallQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.ELEMENT_MAPPING__CALL_QUERY, newCallQuery, newCallQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComplexType() {
		return isComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComplexType(boolean newIsComplexType) {
		boolean oldIsComplexType = isComplexType;
		isComplexType = newIsComplexType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.ELEMENT_MAPPING__IS_COMPLEX_TYPE, oldIsComplexType, isComplexType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryParam() {
		return queryParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryParam(String newQueryParam) {
		String oldQueryParam = queryParam;
		queryParam = newQueryParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.ELEMENT_MAPPING__QUERY_PARAM, oldQueryParam, queryParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.ELEMENT_MAPPING__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsPackage.ELEMENT_MAPPING__ELEMENT:
				return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
			case DsPackage.ELEMENT_MAPPING__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case DsPackage.ELEMENT_MAPPING__CALL_QUERY:
				return basicSetCallQuery(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsPackage.ELEMENT_MAPPING__COLUMN:
				return getColumn();
			case DsPackage.ELEMENT_MAPPING__EXPORT:
				return getExport();
			case DsPackage.ELEMENT_MAPPING__NAME:
				return getName();
			case DsPackage.ELEMENT_MAPPING__REQUIRED_ROLES:
				return getRequiredRoles();
			case DsPackage.ELEMENT_MAPPING__EXPORT_TYPE:
				return getExportType();
			case DsPackage.ELEMENT_MAPPING__NAMESPACE:
				return getNamespace();
			case DsPackage.ELEMENT_MAPPING__XSD_TYPE:
				return getXsdType();
			case DsPackage.ELEMENT_MAPPING__ELEMENT:
				return getElement();
			case DsPackage.ELEMENT_MAPPING__ATTRIBUTE:
				return getAttribute();
			case DsPackage.ELEMENT_MAPPING__CALL_QUERY:
				return getCallQuery();
			case DsPackage.ELEMENT_MAPPING__IS_COMPLEX_TYPE:
				return isIsComplexType();
			case DsPackage.ELEMENT_MAPPING__QUERY_PARAM:
				return getQueryParam();
			case DsPackage.ELEMENT_MAPPING__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DsPackage.ELEMENT_MAPPING__COLUMN:
				setColumn((String)newValue);
				return;
			case DsPackage.ELEMENT_MAPPING__EXPORT:
				setExport((String)newValue);
				return;
			case DsPackage.ELEMENT_MAPPING__NAME:
				setName((String)newValue);
				return;
			case DsPackage.ELEMENT_MAPPING__REQUIRED_ROLES:
				setRequiredRoles((String)newValue);
				return;
			case DsPackage.ELEMENT_MAPPING__EXPORT_TYPE:
				setExportType((String)newValue);
				return;
			case DsPackage.ELEMENT_MAPPING__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case DsPackage.ELEMENT_MAPPING__XSD_TYPE:
				setXsdType((String)newValue);
				return;
			case DsPackage.ELEMENT_MAPPING__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends ElementMapping>)newValue);
				return;
			case DsPackage.ELEMENT_MAPPING__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends AttributeMapping>)newValue);
				return;
			case DsPackage.ELEMENT_MAPPING__CALL_QUERY:
				setCallQuery((CallQuery)newValue);
				return;
			case DsPackage.ELEMENT_MAPPING__IS_COMPLEX_TYPE:
				setIsComplexType((Boolean)newValue);
				return;
			case DsPackage.ELEMENT_MAPPING__QUERY_PARAM:
				setQueryParam((String)newValue);
				return;
			case DsPackage.ELEMENT_MAPPING__VALUE:
				setValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DsPackage.ELEMENT_MAPPING__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case DsPackage.ELEMENT_MAPPING__EXPORT:
				setExport(EXPORT_EDEFAULT);
				return;
			case DsPackage.ELEMENT_MAPPING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DsPackage.ELEMENT_MAPPING__REQUIRED_ROLES:
				setRequiredRoles(REQUIRED_ROLES_EDEFAULT);
				return;
			case DsPackage.ELEMENT_MAPPING__EXPORT_TYPE:
				setExportType(EXPORT_TYPE_EDEFAULT);
				return;
			case DsPackage.ELEMENT_MAPPING__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case DsPackage.ELEMENT_MAPPING__XSD_TYPE:
				setXsdType(XSD_TYPE_EDEFAULT);
				return;
			case DsPackage.ELEMENT_MAPPING__ELEMENT:
				getElement().clear();
				return;
			case DsPackage.ELEMENT_MAPPING__ATTRIBUTE:
				getAttribute().clear();
				return;
			case DsPackage.ELEMENT_MAPPING__CALL_QUERY:
				setCallQuery((CallQuery)null);
				return;
			case DsPackage.ELEMENT_MAPPING__IS_COMPLEX_TYPE:
				setIsComplexType(IS_COMPLEX_TYPE_EDEFAULT);
				return;
			case DsPackage.ELEMENT_MAPPING__QUERY_PARAM:
				setQueryParam(QUERY_PARAM_EDEFAULT);
				return;
			case DsPackage.ELEMENT_MAPPING__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DsPackage.ELEMENT_MAPPING__COLUMN:
				return COLUMN_EDEFAULT == null ? column != null : !COLUMN_EDEFAULT.equals(column);
			case DsPackage.ELEMENT_MAPPING__EXPORT:
				return EXPORT_EDEFAULT == null ? export != null : !EXPORT_EDEFAULT.equals(export);
			case DsPackage.ELEMENT_MAPPING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DsPackage.ELEMENT_MAPPING__REQUIRED_ROLES:
				return REQUIRED_ROLES_EDEFAULT == null ? requiredRoles != null : !REQUIRED_ROLES_EDEFAULT.equals(requiredRoles);
			case DsPackage.ELEMENT_MAPPING__EXPORT_TYPE:
				return EXPORT_TYPE_EDEFAULT == null ? exportType != null : !EXPORT_TYPE_EDEFAULT.equals(exportType);
			case DsPackage.ELEMENT_MAPPING__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case DsPackage.ELEMENT_MAPPING__XSD_TYPE:
				return XSD_TYPE_EDEFAULT == null ? xsdType != null : !XSD_TYPE_EDEFAULT.equals(xsdType);
			case DsPackage.ELEMENT_MAPPING__ELEMENT:
				return element != null && !element.isEmpty();
			case DsPackage.ELEMENT_MAPPING__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case DsPackage.ELEMENT_MAPPING__CALL_QUERY:
				return callQuery != null;
			case DsPackage.ELEMENT_MAPPING__IS_COMPLEX_TYPE:
				return isComplexType != IS_COMPLEX_TYPE_EDEFAULT;
			case DsPackage.ELEMENT_MAPPING__QUERY_PARAM:
				return QUERY_PARAM_EDEFAULT == null ? queryParam != null : !QUERY_PARAM_EDEFAULT.equals(queryParam);
			case DsPackage.ELEMENT_MAPPING__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (column: ");
		result.append(column);
		result.append(", export: ");
		result.append(export);
		result.append(", name: ");
		result.append(name);
		result.append(", requiredRoles: ");
		result.append(requiredRoles);
		result.append(", exportType: ");
		result.append(exportType);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", xsdType: ");
		result.append(xsdType);
		result.append(", isComplexType: ");
		result.append(isComplexType);
		result.append(", queryParam: ");
		result.append(queryParam);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

	/*@Override
	public boolean isComplex() {
		// TODO Auto-generated method stub
		return complex;
	}

	@Override
	public void setComplex(boolean isComplex) {
		
		complex = isComplex;
	}*/

} //ElementMappingImpl
