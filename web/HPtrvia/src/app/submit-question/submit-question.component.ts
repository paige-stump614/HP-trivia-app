import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormArray, NgForm } from '@angular/forms';
import { Question } from '../question/question.model';

@Component({
  selector: 'app-submit-question',
  templateUrl: './submit-question.component.html',
  styleUrls: ['./submit-question.component.css']
})
export class SubmitQuestionComponent implements OnInit {
  questionForm = new FormGroup({
    question: new FormControl(null),
    answer: new FormControl(null),
    type: new FormControl(null),
    category: new FormControl(null),
    book: new FormControl(null),
    page: new FormControl(null),
    topic: new FormControl(null)
  });

  type: string[] = ['magic', 'muggle'];

  question: Question;

  ngOnInit() {
  }

  onSubmit(form: NgForm) {
    this.question = form.value;
    console.log(this.question);
  }

}
