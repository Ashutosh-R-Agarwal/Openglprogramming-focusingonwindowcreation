ASSUMING YOU ALREADY HAVE :
Windows Enterprise 8.1 Update 4, 64 Bit With Visual Studio 2013 Ultimate Edition Update 4
=========================================================================================

- Get Binaries ( .Dll And .Lib ) And Headers ( .h ) From http://glew.sourceforge.net/index.html
  As A Zip File Named : glew-<version number>-win32.zip

- Extract The Zip File To Its Default Directory : glew-<version number>-win32

- From Above glew-<version number>-win32\glew-<version number>\include\GL Directory, Copy 3 .h Files
  glew.h, glxew.h And wglew.h To Visual Studio 2013 Related SDK, i.e.
  C:\Program Files (x86)\Windows Kits\8.1\Include\um\gl Directory.
  ( There Will Be Already 2 .h Files Present There, GL.h And GLU.H )

- For 32 Bit PROJECT:
  ===================
  From Above glew-<version number>-win32\glew-<version number>\lib\Release\Win32 Directory 
  ( Not From x64 Directory Though Our OS Is 64 Bit ), Copy 2 .lib Files 
  glew32.lib And glew32s.lib To Visual Studio 2013 Related SDK, i.e.
  C:\Program Files (x86)\Windows Kits\8.1\Lib\winv6.3\um\x86 Directory 
  ( Not To x64 Directory )

  For 64 Bit PROJECT:
  ===================
  From Above glew-<version number>-win32\glew-<version number>\lib\Release\x64 Directory 
  ( Not From Win32 Directory ), Copy 2 .lib Files glew32.lib And glew32s.lib 
  To Visual Studio 2013 Related SDK, i.e.
  C:\Program Files (x86)\Windows Kits\8.1\Lib\winv6.3\um\x64 Directory 
  ( Not To x86 Directory )

- For 32 Bit PROJECT:
  ===================
  From Above glew-<version number>-win32\glew-<version number>\bin\Release\Win32 Directory 
  ( Not From x64 Directory Though Our OS Is 64 Bit ), Copy The Only 1 .dll File 
  glew32.dll To Our C:\Windows\SysWOW64 Directory ( Not To System32 Directory ).

  For 64 Bit PROJECT:
  ===================
  From Above glew-<version number>-win32\glew-<version number>\bin\Release\x64 Directory 
  ( Not From Win32 Directory ), Copy The Only 1 .dll File glew32.dll 
  To Our C:\Windows\System32 Directory ( Not To SysWOW64 Directory ).

- In Any Program's Source Code #include <glew.h>.
  IMPORTANT : This Should Be Done Before #include For gl/gl.h and gl/glu.h

- Link Any Program To 'glew32.lib'.

- In Source Code Add GLEW Initialization Code.
  IMPORTANT : It Must Be Added After Creating OpenGL Context But Before Using Any OpenGL Function.
