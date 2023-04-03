import { NgFor } from '@angular/common';
import { Injectable } from '@angular/core';
import { Item } from './item';

@Injectable({
  providedIn: 'root'
})
export class ItemService {
  item: Item[] =[{id:1, name:"HP", price: 40000, quantity:5},
  {id:2, name:"Acer", price: 30000, quantity:4},
  {id:3, name:"Apple", price: 100000, quantity:0}]
  constructor() { }

  toBeUpdated:Item= new Item();
  getItems(): Item[]{
    return this.item;
  }
  decrease(name:string):void{
    this.item.forEach(element => {
      if(name== element.name){
        element.quantity--;
      }
    });
  }
  updateToBe(index:number):void{
    let item= this.item.at(index);
    if(item!=null){
      this.toBeUpdated= item;
    }
  }
  getUpdate():Item{
    return this.toBeUpdated;
  }
}
