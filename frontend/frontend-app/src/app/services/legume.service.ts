import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

// ✅ Modèle (interface) d’un légume
export interface Legume {
  id: number;
  nom: string;
}

@Injectable({
  providedIn: 'root' // ✅ Service accessible partout sans ajout dans les imports
})
export class LegumeService {
  private apiUrl = '/api/legumes'; // 🔁 Utilisation de api grace au fichier proxy.conf.json

  constructor(private http: HttpClient) {}

  // ✅ Récupérer la liste des légumes depuis une API
  getLegumes(): Observable<Legume[]> {
    return this.http.get<Legume[]>(this.apiUrl);
  }
}
