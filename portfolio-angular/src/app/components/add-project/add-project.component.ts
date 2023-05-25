import { Component, Output, EventEmitter } from '@angular/core';
import { Project } from 'src/app/Project';

@Component({
  selector: 'app-add-project',
  templateUrl: './add-project.component.html',
  styleUrls: ['./add-project.component.css']
})
export class AddProjectComponent {
  @Output() onAddProject: EventEmitter<Project> = new EventEmitter() 
  title!: string;

  onSubmit() {
    if(!this.title) {
      alert('Please add a project')
      return;
    }

    const newProject = {
      title: this.title
    }

    this.onAddProject.emit(newProject);

    this.title = '';
  }

}
