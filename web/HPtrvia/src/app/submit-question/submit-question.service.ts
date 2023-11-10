import { Observable } from 'rxjs';
import { Question } from '../question/question.model'
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable()
export class SubmitQuestionService {
  submitQuestionUrl: string = 'localhost:8080/api/trivia/submitQuestion';

  constructor(private http: HttpClient){
  }

  saveNewQuestion(question: Question) {
    console.log('the question object is: ', question);
    this.http.post<any>(this.submitQuestionUrl, question, ).subscribe({
      next: data => {
                  console.log(data)
              },
              error: error => {
                  console.error('There was an error!', error);
              }
    })
  }
}
