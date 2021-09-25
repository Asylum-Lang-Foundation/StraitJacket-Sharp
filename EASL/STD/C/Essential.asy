// This file contains essential functions from the C standard library.
// The rule for determining what is essential is that if you can rewrite it without system calls, it is not essential.
// IT IS IMPOSSIBLE TO USE ASYLUM WITHOUT THE BELOW FUNCTIONS!!!

/*
* Memory Operations
*/

// Malloc is needed to allocate dynamic memory.
extern fn malloc(size_t size) -> object*;

// Needed to allocate arrays.
extern fn calloc(size_t num, size_t size) -> object*;

// Needed to resize arrays.
extern fn realloc(object* ptr, size_t size) -> object*;

// Needed to free memory.
extern fn free(object* ptr);

/*
* File Operations
*/

// Remove a file.
extern fn remove(const char* file) -> int;

// Rename a file.
extern fn rename(const char* file, const char* newName) -> int;

// Open a temporary file.
extern fn tmpfile() -> object*;

// Generate a temporary name.
extern fn tmpnam(char* str);

// Open a file.
extern fn fopen(const char* filename, const char* mode) -> object*;

// Close a file.
extern fn fclose(object* file) -> int;

// Flush the file buffer to disk.
extern fn fflush(object* file) -> int;

// Reopen a file with different name or mode.
extern fn freopen(const char* filename, const char* mode,  object* stream) -> object*;

/*
* IO Operations
*/

// Print to a file.
extern fn fprintf(object* stream, const char* format, ... args) -> int;

// Read from a file.
extern fn fscanf( object* stream, const char* format, ... args) -> int;

// Print to standard out.
extern fn printf(const char* format, ... args) -> int;

// Read from standard in.
extern fn scanf(const char* format, ... args) -> int;

// Unget a character from a stream.
extern fn ungetc(int character, object* stream) -> int;

// Set stream buffer.
extern fn setvbuf(object* stream, byte* buffer, int mode, size_t size) -> int;

// Read from a stream.
extern fn fread(byte* ptr, size_t size, size_t count, object* stream) -> size_t;

// Write to a stream.
extern fn fwrite(byte* ptr, size_t size, size_t count, object* stream) -> size_t;

// Seek to a certain position in the file.
extern fn fseek(object* stream, long offset, int origin) -> int;

// Get the position in the stream.
extern fn ftell(object* stream) -> long;

// Get any errors from stream.
extern fn ferror(object* stream) -> int;

// Clear errors in stream.
extern fn clearerr(object* stream);

// Check for end of file.
extern fn feof( object* stream) -> int;

// Print to standard error.
extern fn perror(const char* str);

/*
* Process Operations
*/

// Execute a system command.
extern fn system(const char* command) -> int;

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
extern fn getenv(const char* name) -> char*;

// Set a signal handler.
extern fn signal(int sig, func<int> handler) -> func<int>;

// Raise a signal.
extern fn raise(int sig) -> int;

// Processor time consumed by program.
extern fn clock() -> ulong;

// Get calendar time.
extern fn time(ulong* timer) -> ulong;

// Get a random number.
extern fn rand() -> int;

// Seed the random number generator.
extern fn srand(uint seed);