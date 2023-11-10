import { Component, Input, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormArray, NgForm, Validators } from '@angular/forms';
import { Question } from '../question/question.model';
import { SubmitQuestionService } from './submit-question.service';

@Component({
  selector: 'app-submit-question',
  templateUrl: './submit-question.component.html',
  styleUrls: ['./submit-question.component.css']
})
export class SubmitQuestionComponent implements OnInit {
  questionForm: FormGroup;
  @Input() required: boolean;
  question: Question;

  constructor(private submitQuestionService: SubmitQuestionService) {
  }

  ngOnInit() {
    this.questionForm = new FormGroup({
      question: new FormControl(null, [Validators.required]),
      answer: new FormControl(null, Validators.required),
      type: new FormControl(null, Validators.required),
      category: new FormControl(null, Validators.required),
      book: new FormControl(null, Validators.required),
      page: new FormControl(null, Validators.required),
      topic: new FormControl(null)
    });

  }

  onSubmit(form: NgForm) {
    this.question = form.value;
    console.log('in on submit in the COMPONENT')
    this.submitQuestionService.saveNewQuestion(this.question);
  }

}
