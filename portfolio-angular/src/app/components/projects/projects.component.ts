import { Component } from '@angular/core';
import { ProjectService } from 'src/app/services/project.service';
import { Project } from 'src/app/Project';


@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css']
})
export class ProjectsComponent {
  projects: Project[] = [];

  constructor(private projectService: ProjectService) {}

  ngOnInit() {
    this.projectService.getProjects().subscribe((projects) => (this.projects = projects));
  }

  toggleAddTask() {
    console.log("toggle");
  }
}
