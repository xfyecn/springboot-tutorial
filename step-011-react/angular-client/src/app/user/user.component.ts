import {Component, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {WebsocketListenerComponent} from "../websocket/websocket-listener/websocket-listener.component";

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users: any;

  constructor(private http: HttpClient) {
  }

  ngOnInit() {
    new WebsocketListenerComponent();
    // this.http.get('http://localhost:8080/user/read/all').subscribe(data => this.users = data);
  }
}
