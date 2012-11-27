package org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import org.apache.synapse.endpoints.AbstractEndpoint;
import org.eclipse.core.runtime.Assert;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.AbstractEndPoint;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

public class DefaultEndpointDeserializer extends AbstractEndpointDeserializer{

	public AbstractEndPoint createNode(IGraphicalEditPart part,AbstractEndpoint object) {
		
		Assert.isTrue(object instanceof org.apache.synapse.endpoints.DefaultEndpoint, "Unsupported endpoint passed in for deserialization at "+ this.getClass());
		
		org.apache.synapse.endpoints.DefaultEndpoint dafaultEndpoint = (org.apache.synapse.endpoints.DefaultEndpoint)object;
		
		AbstractEndPoint endPoint = (AbstractEndPoint) DeserializerUtils.createNode(part, EsbElementTypes.DefaultEndPoint_3609);
		setElementToEdit(endPoint);
		deserializeEndpoint(dafaultEndpoint,endPoint);
		return endPoint;
	}

}