import { Component, OnInit } from '@angular/core';
import { Item } from '../item';
import { ItemService } from '../item-service.service';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit{

constructor(private itemService: ItemService) {}
item: Item[]=[];
ngOnInit(): void {
  this.item = this.itemService.getItems();
}

requestItem(name:string): void{
  alert("Requested "+name);
}

buyItem(quantity:number, name:string): void{
  quantity--;
  this.itemService.decrease(name);
  alert("Item "+name+" is bought!\n Updated quantity is "+quantity);
}

}
