import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { QuestionComponent } from './question/question.component';
import { AnswerComponent } from './answer/answer.component';
import { ScoreboardComponent } from './scoreboard/scoreboard.component';
import { SubmitQuestionComponent } from './submit-question/submit-question.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { SubmitQuestionService } from './submit-question/submit-question.service'

const appRoutes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'submit-question', component: SubmitQuestionComponent}
]
@NgModule({
  declarations: [
    AppComponent,
    QuestionComponent,
    AnswerComponent,
    ScoreboardComponent,
    SubmitQuestionComponent,
    HeaderComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),
    FormsModule
  ],
  providers: [SubmitQuestionService],
  bootstrap: [AppComponent]
})
export class AppModule { }
