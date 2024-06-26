import React from 'react';

export enum Color {
  Red = 'red',
  Green = 'green',
  Blue = 'blue',
  Yellow = 'yellow',
  Pink = 'pink',
}

interface EnumComponentProps {
  color: Color;
}

const EnumComponent: React.FC<EnumComponentProps> = ({ color }) => {
  return <div style={{ color }}>This text is {color}</div>;
};

export default EnumComponent;
