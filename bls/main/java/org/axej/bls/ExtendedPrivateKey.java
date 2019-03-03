/*
 * Copyright 2018 Dash Core Group
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

package org.dashj.bls;

public class ExtendedPrivateKey {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ExtendedPrivateKey(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExtendedPrivateKey obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JNI.delete_ExtendedPrivateKey(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static ExtendedPrivateKey FromSeed(byte[] seed, long seedLen) {
    return new ExtendedPrivateKey(JNI.ExtendedPrivateKey_FromSeed(seed, seedLen), true);
  }

  public static ExtendedPrivateKey FromBytes(byte[] serialized) {
    return new ExtendedPrivateKey(JNI.ExtendedPrivateKey_FromBytes(serialized), true);
  }

  public ExtendedPrivateKey PrivateChild(long i) {
    return new ExtendedPrivateKey(JNI.ExtendedPrivateKey_PrivateChild(swigCPtr, this, i), true);
  }

  public ExtendedPublicKey PublicChild(long i) {
    return new ExtendedPublicKey(JNI.ExtendedPrivateKey_PublicChild(swigCPtr, this, i), true);
  }

  public long GetVersion() {
    return JNI.ExtendedPrivateKey_GetVersion(swigCPtr, this);
  }

  public short GetDepth() {
    return JNI.ExtendedPrivateKey_GetDepth(swigCPtr, this);
  }

  public long GetParentFingerprint() {
    return JNI.ExtendedPrivateKey_GetParentFingerprint(swigCPtr, this);
  }

  public long GetChildNumber() {
    return JNI.ExtendedPrivateKey_GetChildNumber(swigCPtr, this);
  }

  public ChainCode GetChainCode() {
    return new ChainCode(JNI.ExtendedPrivateKey_GetChainCode(swigCPtr, this), true);
  }

  public PrivateKey GetPrivateKey() {
    return new PrivateKey(JNI.ExtendedPrivateKey_GetPrivateKey(swigCPtr, this), true);
  }

  public PublicKey GetPublicKey() {
    return new PublicKey(JNI.ExtendedPrivateKey_GetPublicKey(swigCPtr, this), true);
  }

  public ExtendedPublicKey GetExtendedPublicKey() {
    return new ExtendedPublicKey(JNI.ExtendedPrivateKey_GetExtendedPublicKey(swigCPtr, this), true);
  }

  public void Serialize(byte[] buffer) {
    JNI.ExtendedPrivateKey_Serialize__SWIG_0(swigCPtr, this, buffer);
  }

  public SWIGTYPE_p_std__vectorT_unsigned_char_t Serialize() {
    return new SWIGTYPE_p_std__vectorT_unsigned_char_t(JNI.ExtendedPrivateKey_Serialize__SWIG_1(swigCPtr, this), true);
  }

  public final static long EXTENDED_PRIVATE_KEY_SIZE = JNI.ExtendedPrivateKey_EXTENDED_PRIVATE_KEY_SIZE_get();
}
