import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Dinesh from './Dinesh.js'
import Model from './Car.js'

// ========================================
const mycar = new Model("Ford", "Mustang");

ReactDOM.render(<Dinesh />, document.getElementById('root'));
ReactDOM.render(mycar.show(), document.getElementById('mydiv'))


function getCookie(cname) {
  var name = cname + "=";
  var decodedCookie = decodeURIComponent(document.cookie);
  var ca = decodedCookie.split(';');
  for(var i = 0; i <ca.length; i++) {
    var c = ca[i];
    while (c.charAt(0) == ' ') {
      c = c.substring(1);
    }
    if (c.indexOf(name) == 0) {
      return c.substring(name.length, c.length);
    }
  }
  return "";
}

if (getCookie("dinesh")==="") {
  var cookievalue = Math.random()
  console.log(cookievalue)
  document.cookie = "dinesh=" + cookievalue;
  document.write ("Setting Cookies : " + "dinesh=" + cookievalue );
}

document.write ("get Cookies : " + "dinesh=" + getCookie("dinesh") );
