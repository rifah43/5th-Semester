import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Item } from '../item';
import { ItemService } from '../item-service.service';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit{

constructor(private itemService: ItemService, private route:Router) {}
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

updateList(index:number):void{
  // alert("Updated!");
  this.route.navigate(["update"]);
  this.itemService.updateToBe(index);
}

}
