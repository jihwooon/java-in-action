# 코드 포인트와 코드 유닛
자바는 처음 만들 당시부터 유니코드 표준을 수용했습니다.  
유니코드 표준은 문자 인코딩 문제를 해결할 목적으로 개발했습니다.   
유니코드 이전에는 문자 인코딩의 문제가 많았습니다. 

> The Unicode standard was originally designed as a fixed-width 16-bit character encoding. It has since been changed to allow for characters whose representation requires more than 16 bits.

*유니코드 표준은 원래 고정 폭 16비트 문자 인코딩으로 설계되었지만 16비트 이상의 표현이 필요한 문자를 허용하도록 변경되었다.* 라고 말합니다.  
처음 자바에는 16비트 유니코드 문자를 사용하도록 설계가 되어있었습니다. 그렇지만 문자가 예상 외로 16비트를 넘어가는 경우가 생겼습니다. 현재 수준에서는 유니코드를 21비트를 요구 합니다.

> The range of legal code points is now U+0000 to U +10FFFF, using the hexadecimal *U+n*notation.

법적 코드 포인트의 범위는 16진수 U+n 표기법을 사용하여 U+0000에서 U+10FFFF까지이다.  
U+FFFF 넘는 문자는 **'대용 문자'**로 분류 되어서 코드의 공간을 따로 가져와 16비트 값을 쌍으로 나타냅니다.  
자바에서 16비트에서 21비트로 옮길 시 어려움이 있습니다.

> The Java programming language represents text in sequences of 16-bit code units, using the UTF-16 encoding.

어려움을 해결 하기 위해서 자바 프로그래밍 언어는 UTF-16 인코딩을 사용하여 16비트 코드 단위의 시퀀스로 텍스트를 나타냅니다.  

## Reference
* 가장 빨리 만나는 코어 자바 9 -p58
* The Java® Language Specification  *Java SE 18 Edition* - 3.1 Unicode, 




