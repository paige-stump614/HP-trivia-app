import { Injectable } from '@angular/core';
import { Question } from '../question/question.model'

@Injectable()
export class SubmitQuestionService {

  saveNewQuestion(question: Question) {
    console.log('in the submit question service');
    console.log('the question object is: ', question);
  }
}
