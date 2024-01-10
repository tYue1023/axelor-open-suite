/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2005-2023 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.axelor.apps.helpdesk.service;

import com.axelor.apps.base.AxelorException;
import com.axelor.apps.helpdesk.db.Sla;
import com.axelor.apps.helpdesk.db.Ticket;
import java.time.LocalDateTime;
import java.util.List;

public interface TicketService {

  public void computeSeq(Ticket ticket) throws AxelorException;

  public Sla computeSLA(Ticket ticket);

  public void computeSLAAndDeadLine(Ticket ticket) throws AxelorException;

  public void checkSLAcompleted(Ticket ticket);

  public void assignToMeTicket(Long id, List<?> ids);

  public Long computeDuration(Ticket ticket);

  public LocalDateTime computeEndDate(Ticket ticket);

  public LocalDateTime computeStartDate(Ticket ticket);

  public boolean isNewTicket(Ticket ticket);

  public boolean isInProgressTicket(Ticket ticket);

  public boolean isResolvedTicket(Ticket ticket);

  public boolean isClosedTicket(Ticket ticket);
}
