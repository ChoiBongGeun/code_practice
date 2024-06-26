
Enum을 사용하면 빌드하는 과정에서 Tree Shaking이 발생하지 않아 
빌드 완료된 코드 사이즈가 증가하게 됩니다. 

이 문제를 해결하기 위해 Union Type을 사용하는 방법을 소개합니다.

<h2>Enum</h2>
 
enum 이란 enumerated type의 줄임말로 열거형을 의미 
Typescript에서는 아래와 같이 사용 가능

```typescript
export enum Color {
  Red = 'red',
  Green = 'green',
  Blue = 'blue',
  Yellow = 'yellow',
  Pink = 'pink',
}
```

<h2>union type</h2>

Union은 합집합 **|** 로 구분 아래와 같이 정의

```typescript
type Color = 'red' | 'green' | 'blue' | 'yellow' | 'pink';
```


<h2> Typescript에서 왜 Enum이 문제가 있을까? </h2>

- Typescript에서 enum을  사용할때 tree-shacking이 되지 않음
	- Tree Shaking은 빌드 과정에서 실제로 사용되지 않는 코드를 제외 하는
	  최적화 기법
	- TypeScript의 Enum을 사용 할 경우 Tree Shaking이 제대로 적용되지 않아 
	  코드 사이즈가 증가하는 이슈 발생
	  
- 타입 에러 발생 
	- Enum을 사용할 때, 값 할당 시 타입 에러가 발생할 수 있습니다.
        ```typescript
        const color: Color; 
        color = 'red'; // 오류 발생 
        color = Color.Red; // 올바른 사용
        ```

- 숫자 타입 Enum의 문제
	- 숫자 타입 Enum을 사용할 때, 예상치 못한 타입 에러가 발생할 수 있습니다.
  
        ```typescript
        const enum Number { 
            One = 1, 
            Two = 2, 
            Zero = 0 
        } 

        const number: Number = 100;
        ```

- 런타임 성능 
	- Enum은 런타임에 실제 객체로 존재 
		- 추가적인 메모리와 성능 오버헤드가 발생할 수 있습니다
	- Union Type은 단순한 문자열 리터럴 타입
	  
- 번들린된 코드 사이즈 비교 
    - Enum
        ```typescript
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
            
        ```
    - union Type
        ```typescript

        import React from 'react';

        type Color = 'red' | 'green' | 'blue' | 'yellow' | 'pink';

        interface UnionComponentProps {
          color: Color;
        }

        const UnionComponent: React.FC<UnionComponentProps> = ({ color }) => {
          return <div style={{ color }}>This text is {color}</div>;
        };

        export default UnionComponent;
        ```

  - 빌드 후 bundle 크기 비교

	![image](https://github.com/ChoiBongGeun/code_practice/assets/32670745/6c26b70b-e5b1-4d0f-bd7e-15f31c92d75b)
