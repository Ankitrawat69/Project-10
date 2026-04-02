import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-reportlist',
  templateUrl: './reportlist.component.html',
  styleUrls: ['./reportlist.component.css']
})
export class ReportlistComponent extends BaseListCtl {

   constructor(locator : ServiceLocatorService, route : ActivatedRoute) {
        super(locator.endpoints.REPORT, locator, route);
      }
}
