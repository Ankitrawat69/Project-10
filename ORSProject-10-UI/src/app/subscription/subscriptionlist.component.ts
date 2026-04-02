import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-subscriptionlist',
  templateUrl: './subscriptionlist.component.html',
  styleUrls: ['./subscriptionlist.component.css']
})
export class SubscriptionlistComponent extends BaseListCtl {

   constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
      super(locator.endpoints.SUBSCRIPTION, locator, route);
  
  }
  }