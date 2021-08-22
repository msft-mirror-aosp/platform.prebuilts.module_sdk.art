/*
 * Copyright (C) 2018 The Android Open Source Project
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


package dalvik.annotation.codegen;

@SuppressWarnings({"unchecked", "deprecation", "all"})
@java.lang.annotation.Repeatable(CovariantReturnType.CovariantReturnTypes.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
public @interface CovariantReturnType {

public java.lang.Class<?> returnType();

public int presentAfter();
@SuppressWarnings({"unchecked", "deprecation", "all"})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
public static @interface CovariantReturnTypes {

public dalvik.annotation.codegen.CovariantReturnType[] value();
}

}

