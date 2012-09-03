/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator;
import org.wso2.developerstudio.eclipse.gmf.esb.AggregateSequenceType;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;

/**
 * This is the item provider adapter for a {@link org.wso2.developerstudio.eclipse.gmf.esb.AggregateMediator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AggregateMediatorItemProvider
	extends MediatorItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateMediatorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		AggregateMediator mediator = (AggregateMediator) object;
		if (itemPropertyDescriptors != null) {
			itemPropertyDescriptors.clear();
		}
		super.getPropertyDescriptors(object);
		addAggregateIDPropertyDescriptor(object);
		addCorrelationExpressionPropertyDescriptor(object);
		addCompletionTimeoutPropertyDescriptor(object);
		addCompletionMinMessagesPropertyDescriptor(object);
		addCompletionMaxMessagesPropertyDescriptor(object);
		addAggregationExpressionPropertyDescriptor(object);
		addSequenceTypePropertyDescriptor(object);

		if (mediator.getSequenceType().equals(AggregateSequenceType.REGISTRY_REFERENCE)) {
			addSequenceKeyPropertyDescriptor(object);
		}

		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Aggregate ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAggregateIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AggregateMediator_aggregateID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AggregateMediator_aggregateID_feature", "_UI_AggregateMediator_type"),
				 EsbPackage.Literals.AGGREGATE_MEDIATOR__AGGREGATE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}
	
	
	protected void addCorrelationExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AggregateMediator_correlationExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AggregateMediator_correlationExpression_feature", "_UI_AggregateMediator_type"),
				 EsbPackage.Literals.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Completion Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompletionTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AggregateMediator_completionTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AggregateMediator_completionTimeout_feature", "_UI_AggregateMediator_type"),
				 EsbPackage.Literals.AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Completion Min Messages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompletionMinMessagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AggregateMediator_completionMinMessages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AggregateMediator_completionMinMessages_feature", "_UI_AggregateMediator_type"),
				 EsbPackage.Literals.AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Completion Max Messages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompletionMaxMessagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AggregateMediator_completionMaxMessages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AggregateMediator_completionMaxMessages_feature", "_UI_AggregateMediator_type"),
				 EsbPackage.Literals.AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}
	

	/**
	 * This adds a property descriptor for the Aggregation Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAggregationExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AggregateMediator_aggregationExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AggregateMediator_aggregationExpression_feature", "_UI_AggregateMediator_type"),
				 EsbPackage.Literals.AGGREGATE_MEDIATOR__AGGREGATION_EXPRESSION,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_onCompletePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sequence Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSequenceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AggregateMediator_sequenceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AggregateMediator_sequenceType_feature", "_UI_AggregateMediator_type"),
				 EsbPackage.Literals.AGGREGATE_MEDIATOR__SEQUENCE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_onCompletePropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Sequence Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSequenceKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AggregateMediator_sequenceKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AggregateMediator_sequenceKey_feature", "_UI_AggregateMediator_type"),
				 EsbPackage.Literals.AGGREGATE_MEDIATOR__SEQUENCE_KEY,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_onCompletePropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EsbPackage.Literals.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION);
			childrenFeatures.add(EsbPackage.Literals.AGGREGATE_MEDIATOR__INPUT_CONNECTOR);
			childrenFeatures.add(EsbPackage.Literals.AGGREGATE_MEDIATOR__OUTPUT_CONNECTOR);
			childrenFeatures.add(EsbPackage.Literals.AGGREGATE_MEDIATOR__ON_COMPLETE_OUTPUT_CONNECTOR);
			childrenFeatures.add(EsbPackage.Literals.AGGREGATE_MEDIATOR__MEDIATOR_FLOW);
			childrenFeatures.add(EsbPackage.Literals.AGGREGATE_MEDIATOR__AGGREGATION_EXPRESSION);
			childrenFeatures.add(EsbPackage.Literals.AGGREGATE_MEDIATOR__SEQUENCE_KEY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AggregateMediator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AggregateMediator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public String getText(Object object) {
		AggregateMediator aggregateMediator = (AggregateMediator)object;
		return getString("_UI_AggregateMediator_type") + " " + aggregateMediator.isReverse();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AggregateMediator.class)) {
			case EsbPackage.AGGREGATE_MEDIATOR__AGGREGATE_ID:
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_TIMEOUT:
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_MIN_MESSAGES:
			case EsbPackage.AGGREGATE_MEDIATOR__COMPLETION_MAX_MESSAGES:
			case EsbPackage.AGGREGATE_MEDIATOR__SEQUENCE_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EsbPackage.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION:
			case EsbPackage.AGGREGATE_MEDIATOR__INPUT_CONNECTOR:
			case EsbPackage.AGGREGATE_MEDIATOR__OUTPUT_CONNECTOR:
			case EsbPackage.AGGREGATE_MEDIATOR__ON_COMPLETE_OUTPUT_CONNECTOR:
			case EsbPackage.AGGREGATE_MEDIATOR__MEDIATOR_FLOW:
			case EsbPackage.AGGREGATE_MEDIATOR__AGGREGATION_EXPRESSION:
			case EsbPackage.AGGREGATE_MEDIATOR__SEQUENCE_KEY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION,
				 EsbFactory.eINSTANCE.createNamespacedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.AGGREGATE_MEDIATOR__INPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createAggregateMediatorInputConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.AGGREGATE_MEDIATOR__OUTPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createAggregateMediatorOutputConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.AGGREGATE_MEDIATOR__ON_COMPLETE_OUTPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createAggregateMediatorOnCompleteOutputConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.AGGREGATE_MEDIATOR__MEDIATOR_FLOW,
				 EsbFactory.eINSTANCE.createMediatorFlow()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.AGGREGATE_MEDIATOR__AGGREGATION_EXPRESSION,
				 EsbFactory.eINSTANCE.createNamespacedProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.AGGREGATE_MEDIATOR__SEQUENCE_KEY,
				 EsbFactory.eINSTANCE.createRegistryKeyProperty()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == EsbPackage.Literals.AGGREGATE_MEDIATOR__CORRELATION_EXPRESSION ||
			childFeature == EsbPackage.Literals.AGGREGATE_MEDIATOR__AGGREGATION_EXPRESSION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
