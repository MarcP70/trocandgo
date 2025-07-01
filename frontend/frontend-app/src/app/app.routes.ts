import { Routes } from '@angular/router';
import { LegumeListComponent } from './components/legume-list/legume-list.component';

export const routes: Routes = [
  {
    path: '',
    redirectTo: 'legumes',
    pathMatch: 'full'
  },
  {
    path: 'legumes',
    component: LegumeListComponent
  }
];
