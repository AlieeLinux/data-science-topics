section	.text
   global _start     ;must be declared for linker (ld)
	
_start:	            ;tells linker entry point
   mov	edx,len     
   mov	ecx,msg     
   mov	ebx,1       
   mov	eax,4          
   int	0x80        
	
   mov	eax,1       ;system call number (sys_exit)
   int	0x80        ;call kernel

section	.data
msg db 'Hello, world!', 0xa 
len equ $ - msg     
