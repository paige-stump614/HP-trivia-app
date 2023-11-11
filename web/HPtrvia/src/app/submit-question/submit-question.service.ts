import { Observable } from 'rxjs';
import { Question } from '../question/question.model'
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable()
export class SubmitQuestionService {
  submitQuestionUrl: string = 'http://localhost:8080/api/trivia/submitQuestion';
  headers = new HttpHeaders().set('Content-Type', 'application/json; charset=utf-8');

  constructor(private http: HttpClient){

  }

  saveNewQuestion(question: Question) {
    this.http.post<any>(this.submitQuestionUrl, question, {headers: this.headers}).subscribe({
      next: data => {
                  console.log(data)
              },
              error: error => {
                  console.error('There was an error!', error);
              }
    })
  }
}
