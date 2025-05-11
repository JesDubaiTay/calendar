package com.company.calendar.view.comissions;

import com.company.calendar.entity.Comissions;
import com.company.calendar.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "comissionses", layout = MainView.class)
@ViewController(id = "cs_comissions.list")
@ViewDescriptor(path = "comissions-list-view.xml")
@LookupComponent("comissionsesDataGrid")
@DialogMode(width = "64em")
public class ComissionsListView extends StandardListView<Comissions> {
}