import { Component, Input, Output, EventEmitter } from '@angular/core';
import { Project } from 'src/app/Project';

@Component({
  selector: 'app-project-item',
  templateUrl: './project-item.component.html',
  styleUrls: ['./project-item.component.css']
})
export class ProjectItemComponent {
  @Input()
  project!: Project;
  @Output() onDeleteProject: EventEmitter<Project> = new EventEmitter()

  onDelete(project: any) {
    console.log(project)
    this.onDeleteProject.emit(project);
  }
}
