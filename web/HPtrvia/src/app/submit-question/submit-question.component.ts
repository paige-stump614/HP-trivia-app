import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, NgForm } from '@angular/forms';
import { Question } from '../question/question.model';
import { SubmitQuestionService } from './submit-question.service';

@Component({
  selector: 'app-submit-question',
  templateUrl: './submit-question.component.html',
  styleUrls: ['./submit-question.component.css']
})
export class SubmitQuestionComponent implements OnInit {
  questionForm: FormGroup;
  question: Question;

  constructor(private submitQuestionService: SubmitQuestionService) {
  }

  ngOnInit() {
    this.questionForm = new FormGroup({
      question: new FormControl(null),
      answer: new FormControl(null),
      type: new FormControl(null),
      category: new FormControl(null),
      book: new FormControl(null),
      page: new FormControl(null),
      topic: new FormControl(null)
    });

  }

  onSubmit(form: NgForm) {
    this.question = form.value;
    this.submitQuestionService.saveNewQuestion(this.question);
  }

}
