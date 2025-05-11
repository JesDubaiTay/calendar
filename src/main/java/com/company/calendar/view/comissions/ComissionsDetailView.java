package com.company.calendar.view.comissions;

import com.company.calendar.entity.Comissions;
import com.company.calendar.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "comissionses/:id", layout = MainView.class)
@ViewController(id = "cs_comissions.detail")
@ViewDescriptor(path = "comissions-detail-view.xml")
@EditedEntityContainer("comissionsDc")
public class ComissionsDetailView extends StandardDetailView<Comissions> {
}