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


package android.system;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class StructStat {

public StructStat(long st_dev, long st_ino, int st_mode, long st_nlink, int st_uid, int st_gid, long st_rdev, long st_size, long st_atime, long st_mtime, long st_ctime, long st_blksize, long st_blocks) { throw new RuntimeException("Stub!"); }

public StructStat(long st_dev, long st_ino, int st_mode, long st_nlink, int st_uid, int st_gid, long st_rdev, long st_size, android.system.StructTimespec st_atim, android.system.StructTimespec st_mtim, android.system.StructTimespec st_ctim, long st_blksize, long st_blocks) { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }

public final android.system.StructTimespec st_atim;
{ st_atim = null; }

public final long st_atime;
{ st_atime = 0; }

public final long st_blksize;
{ st_blksize = 0; }

public final long st_blocks;
{ st_blocks = 0; }

public final android.system.StructTimespec st_ctim;
{ st_ctim = null; }

public final long st_ctime;
{ st_ctime = 0; }

public final long st_dev;
{ st_dev = 0; }

public final int st_gid;
{ st_gid = 0; }

public final long st_ino;
{ st_ino = 0; }

public final int st_mode;
{ st_mode = 0; }

public final android.system.StructTimespec st_mtim;
{ st_mtim = null; }

public final long st_mtime;
{ st_mtime = 0; }

public final long st_nlink;
{ st_nlink = 0; }

public final long st_rdev;
{ st_rdev = 0; }

public final long st_size;
{ st_size = 0; }

public final int st_uid;
{ st_uid = 0; }
}

