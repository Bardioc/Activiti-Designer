package org.activiti.designer.features.subprocess;

import org.activiti.designer.PluginImage;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;


public class CollapseSubProcessFeature extends AbstractCustomFeature {

  public CollapseSubProcessFeature(final IFeatureProvider fp) {
    super(fp);
  }

  @Override
  public String getDescription() {
    return "Collapses the Subprocess and hide the contents";
  }

  @Override
  public String getName() {
    return "Collapse Subprocess";
  }

  @Override
  public String getImageId() {
    return PluginImage.IMG_COLLAPSE.getImageKey();
  }

  @Override
  public boolean isAvailable(IContext context) {
    return super.isAvailable(context);
  }

  @Override
  public boolean canExecute(ICustomContext context) {
    return true;
  }

  @Override
  public void execute(ICustomContext context) {
  }

}
