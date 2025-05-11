package com.company.calendar.view.bookingcalendar;

import com.company.calendar.entity.BookingCalendar;
import com.company.calendar.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "bookingCalendars", layout = MainView.class)
@ViewController(id = "cs_BookingCalendar.list")
@ViewDescriptor(path = "booking-calendar-list-view.xml")
@LookupComponent("bookingCalendarsDataGrid")
@DialogMode(width = "64em")
public class BookingCalendarListView extends StandardListView<BookingCalendar> {
}