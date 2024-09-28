import {Component, EventEmitter, Input, Output} from '@angular/core';
import {Pokemon} from "../../app.component";
import {NgStyle} from "@angular/common";

@Component({
  selector: 'app-pokemon',
  standalone: true,
  imports: [
    NgStyle
  ],
  templateUrl: './pokemon-item.component.html',
  styleUrl: './pokemon-item.component.css'
})
export class PokemonItemComponent {
  @Input() pokemon!: Pokemon;
  @Output() cardClick = new EventEmitter<Pokemon>();
  isSelected: boolean = false;

  getBackgroundColor(): string {
    switch (this.pokemon.type) {
      case 'grass':
        return 'lightgreen';
      case 'fire':
        return 'lightcoral';
      case 'water':
        return 'lightblue';
      default:
        return 'lightgray';
    }
  }

  onCardClick() {
    this.cardClick.emit(this.pokemon);
  }
}
