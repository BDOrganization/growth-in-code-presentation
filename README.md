<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [DevCon2016](#devcon2016)
  - [Abstract](#abstract)
  - [Target Audience](#target-audience)
  - [Topics](#topics)
    - [General Advice](#general-advice)
    - [Inflexible/Rigid APIs](#inflexiblerigid-apis)
    - [Burdensome APIs](#burdensome-apis)
    - [Easily misused or misunderstood APIs](#easily-misused-or-misunderstood-apis)
    - [“Untestable” code](#%E2%80%9Cuntestable%E2%80%9D-code)
    - [Leaked abstractions](#leaked-abstractions)
    - [Compiling against implementations](#compiling-against-implementations)
    - [Third-party coupling](#third-party-coupling)
    - [Unnecessarily complex APIs](#unnecessarily-complex-apis)
    - [Prematurely developed features/functionality](#prematurely-developed-featuresfunctionality)
    - [Prematurely optimized code](#prematurely-optimized-code)
    - [Premature architecture/design decisions](#premature-architecturedesign-decisions)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

# DevCon2016
## Abstract
Topics covered in this manner (pending time) will include the following:

* Inflexible/Rigid APIs
* Burdensome APIs
* Easily misused or misunderstood APIs
* Prematurely developed features/functionality
* “Untestable” code
* Leaked abstractions
* Third-party coupling
* Unnecessarily complex APIs
* Prematurely optimized code
* Compiling against implementations
* Premature architecture/design decisions

## Target Audience
This presentation will be geared towards software engineers and architects who are interested in the application of design patterns and best practices in an effort to improve the maintainability and sustainability of their code over time and through growth (of their developer base, code base, and consumers). This presentation will also be of particular interest to those who may be currently experiencing pains associated with decisions which have not allowed for graceful growth over time.

## Topics
### General Advice
* A lot of the presentation is going to be about currently being in a very difficult situation as a starting point.  A couple of things to consider
 * Very rarely will you get the chance to rewrite significant portions of the code right now or in a large chunk
 * Always strive for better-than-nothing.  If the current situations is bad, consider a way that you can simplify future work to do a rewrite in pieces
 * Keep pushing to improve the current state.  It gets exhausting and feels like it is pointless, but it is an investment in the future.

### Inflexible/Rigid APIs
* Managers that take in only a single value (appointmentId for example) - consider parameter object
* All values must be specified correctly (List can’t have any null values in it, etc.) - Just omit those, or massage data into a no-op value
* Requiring code be consumed in a “blocking” manner.  Perhaps a callback/listener would give you more freedom in the future 

### Burdensome APIs
* Providing APIs that allow for easily accomplishing common tasks rather than making consumers first return/create some data structure so that they can then parse through it on their own
 * Think wrapping collection with a plural noun (Participants)
 * This allows for large performance gains in the future by delegating to the implementation for how certain tasks should be handled.
* Listener implementations.  Maybe consumers do not need all of the listener methods implemented.  Consider an “adapter” class that has no-op for all methods.

### Easily misused or misunderstood APIs
* Returning empty collections instead of null
* Misrepresented Data Types - String representing the days of week
* Taking in primitive values vs strongly typed identifiers (think MID).
* Model objects that guarantee no consistent state.

### “Untestable” code
* Using ‘new’ in constructors versus injecting dependencies leading to difficult to construct objects
* Difficulties caused by testing at an inappropriate level, such as detailed view logic from a controller
 * Trying to test beyond the responsibilities of the class under test

### Leaked abstractions
* Obvious: leaking implementation details on your interfaces/public APIs
* Less obvious: unintentionally revealing details about a planned implementation b/c it is the only currently planned implementation (and making it less likely that another implementation would be able to be put into place in the future)
 * View/Listener interfaces which reveal too much details about how the view will be implemented (ie. references to particular field types, such as buttons, tables, etc)
* Returning data in a format consistent with the internal storage mechanism (returned as JSON vs a strongly typed object)

### Compiling against implementations
* DON’T
 * Pull out an interface for the class, even if the interface is less than ideal.  You might even consider writing an adapter that takes the implementation class and forces it to conform to a more ideal interface, giving you more freedom to specify a nicer interface.  This will also allow you to handle the re-factor at a later time.

### Third-party coupling
* Writing against third party implementations
 * Consider how hard it would be to move away from
 * Should you really have third party libraries on your public interfaces?  This forces a dependency for your consumers.
 * Consider if your consumer could even use this (osgi compatibility, etc)

### Unnecessarily complex APIs
* Potential example: Map implementations as either input/output params whenever the API isn’t specifically in place for the purpose of manipulating/returning a data structure
 * Consider wrapping a map in a class which relates the key-value pairs in a more meaningful (less data structure-specific) manner
 * Something like "behind every map on a public API is a model object trying to get out"?

### Prematurely developed features/functionality
* From clean code, pg 168
 * We often forget that it is also best to postpone decisions until the last possible moment. This isn’t lazy or irresponsible; it lets us make informed choices with the best possible information. A premature decision is a decision made with suboptimal knowledge. We will have that much less customer feedback, mental reflection on the project, and experience with our implementation choices if we decide too soon.
* https://en.wikipedia.org/wiki/You_aren%27t_gonna_need_it
 * Adding the code feels like it is a simple and not-so-time-consuming process.  However, adding code is not the only step in the software development cycle.  Consider code reviewing, testing, merging.  There is also an inherent risk of a defect caused by code that isn’t even necessary.

### Prematurely optimized code
* https://en.wikipedia.org/wiki/Amdahl%27s_law
* "More computing sins are committed in the name of efficiency (without necessarily achieving it) than for any other single reason — including blind stupidity." — W.A. Wulf
* Consider an anecdote for this.

### Premature architecture/design decisions
