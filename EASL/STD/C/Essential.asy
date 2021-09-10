// This file contains essential functions from the C standard library.
// The rule for determining what is essential is that if you can rewrite it without system calls, it is not essential.
// IT IS IMPOSSIBLE TO USE ASYLUM WITHOUT THE BELOW FUNCTIONS!!!

/*
* Memory Operations
*/

// Malloc is needed to allocate dynamic memory.
extern fn malloc(size_t size) -> unsafe object*;

// Needed to allocate arrays.
extern fn calloc(size_t num, size_t size) -> unsafe object*;

// Needed to resize arrays.
extern fn realloc(unsafe object* ptr, size_t size) -> unsafe object*;

// Needed to free memory.
extern fn free(unsafe object* ptr);

/*
* File Operations
*/

/*
* IO Operations
*/

/*
* Process Operations
*/

// Execute a system command.
extern fn system(const unsafe char* command) -> int;

// Abort the current process.
extern fn abort();

// Set function to be executed at exit.
extern fn atexit(func toExecute) -> int;

// Set function to be executed at quick exit.
extern fn at_quick_exit(func toExecute) -> int;

// Exit the current program.
extern fn exit(int status);

// Quickly exit the current program (no cleanups).
extern fn quick_exit(int status);

// Exit without calling registered functions or destructing.
extern fn _Exit(int status);

/*
* Misc Operations
*/

// Get an environment variable.
extern fn getenv(const unsafe char* name) -> unsafe char*;