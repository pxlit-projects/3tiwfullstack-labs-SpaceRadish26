import { Component } from '@angular/core';
import {FormsModule} from "@angular/forms";
import {NgIf} from "@angular/common";

@Component({
  selector: 'app-calculator',
  standalone: true,
  imports: [
    FormsModule,
    NgIf
  ],
  templateUrl: './calculator.component.html',
  styleUrl: './calculator.component.css'
})
export class CalculatorComponent {
  textbox1 = '';
  textbox2 = '';
  result: number = Infinity;

  Add() {
     this.result = parseInt(this.textbox1) + parseInt(this.textbox2);
  }

  protected readonly Infinity = Infinity;
}
