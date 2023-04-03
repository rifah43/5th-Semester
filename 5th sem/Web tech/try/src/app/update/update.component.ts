import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Item } from '../item';
import { ItemService } from '../item-service.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent {
  item:Item= new Item;
constructor(private itemService: ItemService, private route:Router) {}
ngOnInit(): void {
  this.item= this.itemService.getUpdate();
}
return():void{
  this.route.navigate(["items"]);
}

}
