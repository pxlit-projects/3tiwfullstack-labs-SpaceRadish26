import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {FormsModule} from "@angular/forms";
import {NgForOf, NgIf} from "@angular/common";
import {CalculatorComponent} from "./components/calculator/calculator.component";
import {PokemonItemComponent} from "./components/pokemon-item/pokemon-item.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FormsModule, NgIf, CalculatorComponent, PokemonItemComponent, NgForOf],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  //oef 1 en 2
  title = 'oef1';
  username = '';

  clearUsername() {
    this.username = '';
  }
  //oef 3


  pokemons: Pokemon[] = [
    { id: 1, name: "Bulbasaur", type: "grass", icon: "public/1.png" },
    { id: 2, name: "Ivysaur", type: "grass", icon: "public/2.png" },
    { id: 3, name: "Venusaur", type: "grass", icon: "public/3.png" },
    { id: 4, name: "Charmander", type: "fire", icon: "public/4.png" },
    { id: 5, name: "Charmeleon", type: "fire", icon: "public/5.png" },
    { id: 6, name: "Charizard", type: "fire", icon: "public/6.png" },
    { id: 7, name: "Squirtle", type: "water", icon: "public/7.png" },
    { id: 8, name: "Wartortle", type: "water", icon: "public/8.png" },
    { id: 9, name: "Blastoise", type: "water", icon: "public/9.png" }
  ];

  selectedPokemon: Pokemon | null = null;

  selectPokemon(pokemon: Pokemon) {
    this.selectedPokemon = pokemon;
  }

  protected readonly Pokemon = Pokemon;
}

export class Pokemon {
  id: number;
  name: string;
  type: string;
  icon: string;

  constructor(id: number, name: string, type: string, icon: string) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.icon = icon;
  }
}
