/*
    * Let there be 3 types of pointers as the compiler is concerned: Owners (own data), Weak (access data from owners), and Traditional (behave like standard C pointer).
    * Once an owner pointer goes out of scope, any weak pointers pointing to the data turn null, and the data pointed to is deleted from memory.
    * Any traditional pointer can point to the same value a managed pointer (weak or owner) points to, but it can never take ownership.
    * Only an owner or a traditional pointer can own data. Only one owner is allowed to own data at a time. Owner can be transferred to a weak pointer to make it the new owner.
    * It is not possible for a managed pointer to interact with data owned by a traditional pointer, as this raises unsafe use cases.
    * Let there be a heap allocation function, malloc (this means malloc must be always defined in order to use managed pointers).
    * Owners point to a weak pointer.
    * Weak pointers point to a control block.
    * A control block is allocated with malloc. It has a traditional pointer to the true data it points to, along with a weak pointer counter.
    * Both owner and weak pointers have a function that will return the traditional pointer.
    * When creating an owner to own new data, it creates a weak pointer that points to a brand new control block. The weak pointer counter is set to 1.
    * When creating a weak pointer to access and write to the data, it is to point to the control block and increment the weak pointer count. This count will decrement if the weak pointer goes out of scope.
    * When ownership is transferred, the contexts of a weak pointer and an owner pointer are swapped. No counts are modified.
    * When the owner pointer goes out of scope, the data pointed to by the traditional pointer in the control block is deleted, and the traditional pointer is set to null, and thus the count decrements since a weak pointer is removed.
    * When the weak pointer count is 0, the control block is deleted.

    Notes:
    * It is impossible for anything to own a stack variable, a hidden owner is created alongside it (this goes for function parameters too).
*/

// Generic pointer context.
pub interface PointerContext<T>;

// Any pointer context should be able to return the true pointed to value.
impl PointerContext<T> {
	pub virtual fn GetPtr() -> unsafe T* {}
}

// Context of a pointer the owns data.
pub unsafe struct OwnerPointerContext<T> : PointerContext {
	pro unsafe WeakPointerContext<T>* ptr;
}

// Implement necessary functions.
impl OwnerPointerContext<T> {

	// Constructor that takes ownership of data, used only by compiler.
	pub unsafe fn OwnerPointerContext<T>(unsafe T* destData) {
		ptr -> new WeakPointerContext<T>();
		ptr.destData -> destData;
	}

	// Destructor. This makes the original pointer null so weak pointers can't use it.
	pub fn ~OwnerPointerContext<T>() {
		delete ptr.@destData;
		ptr.@destData = null;
	}

}

// Implement the generic method.
impl PointerContext<T> for OwnerPointerContext<T> {

	// Get pointed to value.
	pub override fn GetPtr() -> unsafe T* {
		ptr.@destData
	}

}

// For weak pointers, they contain a pointer to the true data.
pub unsafe struct WeakPointerContext<T> : PointerContext<T> {
	pro unsafe T* destData;
	pro atomic size_t cnt;
}

// Implement the generic method.
impl PointerContext<T> for WeakPointerContext<T> {

	// Constructor.
	pub fn WeakPointerContext<T>() {
		cnt++;
	}

	// Get pointed to value.
	pub override fn GetPtr() -> unsafe T* {
		@destData
	}

	// Destructor.
	pub fn ~WeakPointerContext<T>() {
		cnt--;
		if (cnt <= 0) {
			delete this;
		}
	}

}

// The true pointer class.
pub unsafe struct Pointer<T> {
	unsafe PointerContext<T>* ptrContext;
}

// Diet Pointer (DP) implementation.
impl DietPointer<T> {

	// Create a weak pointer.
	pub fn DietPointer<T>(DietPointer<T> owner) {
		ptrContext -> ((OwnerPointerContext<T>)owner).ptr;
	}

	// Create an owner pointer.
	pub unsafe fn DietPointer<T>(unsafe T* destData) {
		ptrContext -> OwnerPointerContext<T>(@destData);
	}

	// Transfer ownership to another pointer.
	pub fn TransferOwnership(DietPointer<T> newOwner) {
		if (IsOwner()) {
			newOwner.ptrContext -> ptrContext;
			ptrContext -> ((OwnerPointerContext<T>)newOwner).ptr;
		}
	}

	// Get the true pointer.
	pub fn GetPtr() -> unsafe T* {
		ptrContext.GetPointedTo()
	}

	// If this pointer owns data.
	pub fn IsOwner() -> bool {
		ptrContext.GetType() == typeof(OwnerPointerContext<T>);
	}

}