import React from 'react';
import ReactDOM from 'react-dom';
import EnumComponent, { Color } from './EnumComponent';

ReactDOM.render(
  <EnumComponent color={Color.Red} />,
  document.getElementById('root')
);
