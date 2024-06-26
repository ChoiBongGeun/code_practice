import React from 'react';

type Color = 'red' | 'green' | 'blue' | 'yellow' | 'pink';

interface UnionComponentProps {
  color: Color;
}

const UnionComponent: React.FC<UnionComponentProps> = ({ color }) => {
  return <div style={{ color }}>This text is {color}</div>;
};

export default UnionComponent;
