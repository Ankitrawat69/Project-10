import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CateringlistComponent } from './cateringlist.component';

describe('CateringlistComponent', () => {
  let component: CateringlistComponent;
  let fixture: ComponentFixture<CateringlistComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CateringlistComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CateringlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
