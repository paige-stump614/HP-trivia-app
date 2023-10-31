import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SubmitQuestionComponent } from './submit-question.component';

describe('SubmitQuestionComponent', () => {
  let component: SubmitQuestionComponent;
  let fixture: ComponentFixture<SubmitQuestionComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SubmitQuestionComponent]
    });
    fixture = TestBed.createComponent(SubmitQuestionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
