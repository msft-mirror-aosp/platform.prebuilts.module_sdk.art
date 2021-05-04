/*
 * Copyright (c) 2003, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


package sun.misc;

import java.lang.ref.*;

/**
 * General-purpose phantom-reference-based cleaners.
 *
 * <p> Cleaners are a lightweight and more robust alternative to finalization.
 * They are lightweight because they are not created by the VM and thus do not
 * require a JNI upcall to be created, and because their cleanup code is
 * invoked directly by the reference-handler thread rather than by the
 * finalizer thread.  They are more robust because they use phantom references,
 * the weakest type of reference object, thereby avoiding the nasty ordering
 * problems inherent to finalization.
 *
 * <p> A cleaner tracks a referent object and encapsulates a thunk of arbitrary
 * cleanup code.  Some time after the GC detects that a cleaner's referent has
 * become phantom-reachable, the reference-handler thread will run the cleaner.
 * Cleaners may also be invoked directly; they are thread safe and ensure that
 * they run their thunks at most once.
 *
 * <p> Cleaners are not a replacement for finalization.  They should be used
 * only when the cleanup code is extremely simple and straightforward.
 * Nontrivial cleaners are inadvisable since they risk blocking the
 * reference-handler thread and delaying further cleanup and finalization.
 *
 *
 * @author Mark Reinhold
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class Cleaner extends java.lang.ref.PhantomReference<java.lang.Object> {

private Cleaner() { super(null, null); throw new RuntimeException("Stub!"); }

/**
 * Creates a new cleaner.
 *
 * @param  ob the referent object to be cleaned
 * @param  thunk
 *         The cleanup code to be run when the cleaner is invoked.  The
 *         cleanup code is run directly from the reference-handler thread,
 *         so it should be as simple and straightforward as possible.
 *
 * @return  The new cleaner
 */

public static sun.misc.Cleaner create(java.lang.Object ob, java.lang.Runnable thunk) { throw new RuntimeException("Stub!"); }

/**
 * Runs this cleaner, if it has not been run before.
 */

public void clean() { throw new RuntimeException("Stub!"); }
}

