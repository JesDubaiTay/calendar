package com.company.calendar.view.parliamentary_factions;

import com.company.calendar.entity.Parliamentary_Factions;
import com.company.calendar.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "parliamentary_Factionses", layout = MainView.class)
@ViewController(id = "cs_Parliamentary_Factions.list")
@ViewDescriptor(path = "parliamentary_factions-list-view.xml")
@LookupComponent("parliamentary_FactionsesDataGrid")
@DialogMode(width = "64em")
public class Parliamentary_FactionsListView extends StandardListView<Parliamentary_Factions> {
}