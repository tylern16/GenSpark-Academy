import { Injectable } from '@angular/core';
import {PROJECTS} from "../mock-projects"
import { Project } from 'src/app/Project';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  constructor() { }

  getProjects(): Observable<Project[]> {
    const projects = of(PROJECTS);
    return projects;
  }
}
