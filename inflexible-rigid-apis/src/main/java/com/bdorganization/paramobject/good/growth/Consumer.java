package com.bdorganization.paramobject.good.growth;

import java.util.Date;

/**
 * In this situation, we have taken the AppointmentManager and made it now require that an object be specified. In
 * situations where growth is experienced (and we can now support additional fields when creating appointments), the
 * AppointmentManager no longer has to grow anymore.
 * 
 * The single method signature will be able to handle all different combinations. Any validation around require fields
 * is delegated to the AppointmentRetrievalCriteria object.
 * 
 * Additionally, if this approach is paired with a builder it greatly simplifies only specifying certain fields,
 * understanding which fields are being specified (given that the builder mutator/setter methods draws out the field
 * name when specifying it), and can provide validation to ensure that required fields are specified.
 */
@SuppressWarnings({ "javadoc" })
public class Consumer
{
    private final AppointmentManager appointmentManager;

    public Consumer(AppointmentManager appointmentManager)
    {
        this.appointmentManager = appointmentManager;
    }

    public void consumeAndSpecifyAllValues()
    {
        AppointmentRetrievalCriteria.Builder builder = new AppointmentRetrievalCriteria.Builder();
        builder.appointmentId(1L);
        builder.participantId(2L);
        builder.beginDate(new Date(1000L));
        builder.endDate(new Date(2000L));

        appointmentManager.getAppointments(builder.build());
    }

    public void consumeAndSpecifyRequiredValues()
    {
        AppointmentRetrievalCriteria.Builder builder = new AppointmentRetrievalCriteria.Builder();
        builder.appointmentId(1L);
        builder.beginDate(new Date(1000L));

        appointmentManager.getAppointments(builder.build());
    }
}
