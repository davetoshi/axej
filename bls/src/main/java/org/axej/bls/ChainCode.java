/*
 * Copyright 2018 Axe Core Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This file was generated by SWIG (http://www.swig.org) and modified.
 * Version 3.0.12
 */
package org.axej.bls;

public class ChainCode {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ChainCode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ChainCode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JNI.delete_ChainCode(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static ChainCode FromBytes(byte[] bytes) {
    return new ChainCode(JNI.ChainCode_FromBytes(bytes), true);
  }

  public ChainCode(ChainCode cc) {
    this(JNI.new_ChainCode(ChainCode.getCPtr(cc), cc), true);
  }

  public void Serialize(byte[] buffer) {
    JNI.ChainCode_Serialize__SWIG_0(swigCPtr, this, buffer);
  }

  public SWIGTYPE_p_std__vectorT_unsigned_char_t Serialize() {
    return new SWIGTYPE_p_std__vectorT_unsigned_char_t(JNI.ChainCode_Serialize__SWIG_1(swigCPtr, this), true);
  }

  public final static long CHAIN_CODE_SIZE = JNI.ChainCode_CHAIN_CODE_SIZE_get();
}
