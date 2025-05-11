package com.company.calendar.view.bookingcalendar;

import com.company.calendar.entity.BookingCalendar;
import com.company.calendar.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import io.jmix.core.DataManager;

@Route(value = "bookingCalendars/:id", layout = MainView.class)
@ViewController(id = "cs_BookingCalendar.detail")
@ViewDescriptor(path = "booking-calendar-detail-view.xml")
@EditedEntityContainer("bookingCalendarDc")
public class BookingCalendarDetailView extends StandardDetailView<BookingCalendar> {

    @Autowired
    private DataManager dataManager;


}