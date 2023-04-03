import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { Item } from './item';
import { ItemComponent } from './item/item.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [
  {path:"home",component:HomeComponent},
  {path:"items",component:ItemComponent},
  {path:"update",component:UpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
