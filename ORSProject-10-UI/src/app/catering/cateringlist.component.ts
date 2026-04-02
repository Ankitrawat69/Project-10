import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-cateringlist',
  templateUrl: './cateringlist.component.html',
  styleUrls: ['./cateringlist.component.css']
})
export class CateringlistComponent extends BaseListCtl{

  constructor(locator : ServiceLocatorService, route : ActivatedRoute) {
      super(locator.endpoints.CATERING, locator, route);
    }
}
