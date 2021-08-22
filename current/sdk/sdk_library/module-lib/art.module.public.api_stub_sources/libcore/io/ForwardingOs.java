/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package libcore.io;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class ForwardingOs implements libcore.io.Os {

protected ForwardingOs(@androidx.annotation.RecentlyNonNull libcore.io.Os os) { throw new RuntimeException("Stub!"); }

public boolean access(@androidx.annotation.RecentlyNullable java.lang.String path, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

public java.io.FileDescriptor open(@androidx.annotation.RecentlyNullable java.lang.String path, int flags, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

public void remove(@androidx.annotation.RecentlyNullable java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

public void rename(@androidx.annotation.RecentlyNullable java.lang.String oldPath, @androidx.annotation.RecentlyNullable java.lang.String newPath) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public android.system.StructStat stat(@androidx.annotation.RecentlyNullable java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

public void unlink(@androidx.annotation.RecentlyNullable java.lang.String pathname) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }
}

