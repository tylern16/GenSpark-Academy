import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.css']
})
export class ButtonComponent {
  @Output() btnClick = new EventEmitter();

  onClick() {
    console.log("add");
    this.btnClick.emit();
  }
}
