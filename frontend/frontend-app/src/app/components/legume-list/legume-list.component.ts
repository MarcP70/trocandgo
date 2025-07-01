import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common'; // ⚠️ Important pour *ngIf et *ngFor
import { LegumeService, Legume } from '../../services/legume.service';

@Component({
  selector: 'app-legume-list',
  standalone: true, // ✅ Composant autonome
  imports: [CommonModule], // ✅ Ajouté pour activer *ngIf et *ngFor
  templateUrl: './legume-list.component.html',
  styleUrls: ['./legume-list.component.css']
})
export class LegumeListComponent implements OnInit {
  legumes: Legume[] = [];
  errorMessage = '';

  constructor(private legumeService: LegumeService) {}

  ngOnInit(): void {
    this.legumeService.getLegumes().subscribe({
      next: (data) => this.legumes = data,
      error: () => this.errorMessage = 'Erreur lors du chargement des légumes'
    });
  }
}
