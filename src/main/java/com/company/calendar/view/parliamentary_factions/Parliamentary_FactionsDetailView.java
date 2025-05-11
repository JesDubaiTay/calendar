package com.company.calendar.view.parliamentary_factions;

import com.company.calendar.entity.Parliamentary_Factions;
import com.company.calendar.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "parliamentary_Factionses/:id", layout = MainView.class)
@ViewController(id = "cs_Parliamentary_Factions.detail")
@ViewDescriptor(path = "parliamentary_factions-detail-view.xml")
@EditedEntityContainer("parliamentary_FactionsDc")
public class Parliamentary_FactionsDetailView extends StandardDetailView<Parliamentary_Factions> {
}