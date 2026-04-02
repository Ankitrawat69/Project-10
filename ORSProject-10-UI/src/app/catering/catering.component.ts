import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-catering',
  templateUrl: './catering.component.html',
  styleUrls: ['./catering.component.css']
})
export class CateringComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute) { 
     super(locator.endpoints.CATERING, locator, route);
   }
  }