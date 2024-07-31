package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import cg.a;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class BarhopperV3 implements Closeable {
    private static final long NULL_NATIVE_CONTEXT = 0;
    private static final String TAG = "BarhopperV3";
    private long nativeContext;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j10);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    private native byte[] recognizeBitmapNative(long j10, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j10, int i10, int i11, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j10, int i10, int i11, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j10, int i10, int i11, int i12, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j10, int i10, int i11, int i12, byte[] bArr, RecognitionOptions recognitionOptions);

    private static a toProto(byte[] bArr) {
        bArr.getClass();
        try {
            return a.b(bArr, zzdo.zza());
        } catch (zzeo e10) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.nativeContext;
        if (j10 != 0) {
            closeNative(j10);
            this.nativeContext = 0L;
        }
    }

    public void create() {
        if (this.nativeContext != 0) {
            Log.w(TAG, "Native context already exists.");
            return;
        }
        long createNative = createNative();
        this.nativeContext = createNative;
        if (createNative == 0) {
            throw new IllegalStateException("Failed to create native context.");
        }
    }

    public void create(db.a aVar) {
        if (this.nativeContext != 0) {
            Log.w(TAG, "Native context already exists.");
            return;
        }
        try {
            int zzE = aVar.zzE();
            byte[] bArr = new byte[zzE];
            zzdj zzA = zzdj.zzA(bArr, 0, zzE);
            aVar.zzaa(zzA);
            zzA.zzB();
            long createNativeWithClientOptions = createNativeWithClientOptions(bArr);
            this.nativeContext = createNativeWithClientOptions;
            if (createNativeWithClientOptions == 0) {
                throw new IllegalArgumentException("Failed to create native context with client options.");
            }
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + aVar.getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public a recognize(int i10, int i11, int i12, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j10 = this.nativeContext;
        if (j10 != 0) {
            return toProto(recognizeStridedBufferNative(j10, i10, i11, i12, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public a recognize(int i10, int i11, int i12, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j10 = this.nativeContext;
        if (j10 != 0) {
            return toProto(recognizeStridedNative(j10, i10, i11, i12, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public a recognize(int i10, int i11, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j10 = this.nativeContext;
        if (j10 != 0) {
            return toProto(recognizeBufferNative(j10, i10, i11, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public a recognize(int i10, int i11, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j10 = this.nativeContext;
        if (j10 != 0) {
            return toProto(recognizeNative(j10, i10, i11, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public a recognize(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.nativeContext == 0) {
            throw new IllegalStateException("Native context does not exist.");
        }
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            Log.d(TAG, "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
        }
        return toProto(recognizeBitmapNative(this.nativeContext, bitmap, recognitionOptions));
    }
}
