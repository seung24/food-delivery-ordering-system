package fooddeliveryorderingsystem.domain;

import fooddeliveryorderingsystem.domain.*;
import fooddeliveryorderingsystem.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Soldout extends AbstractEvent {

    private Long id;

    public Soldout() {
        super();
    }
}
//>>> DDD / Domain Event
