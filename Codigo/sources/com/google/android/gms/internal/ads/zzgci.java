package com.google.android.gms.internal.ads;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class zzgci {
    private static final OutputStream zza = new zzgcg();

    public static InputStream zza(InputStream inputStream, long j10) {
        return new zzgch(inputStream, j10);
    }

    public static byte[] zzb(InputStream inputStream) {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int highestOneBit = Integer.highestOneBit(0);
        int min = Math.min(8192, Math.max(RecognitionOptions.ITF, highestOneBit + highestOneBit));
        int i10 = 0;
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = inputStream.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return zzc(arrayDeque, i10);
                }
                i11 += read;
                i10 += read;
            }
            min = zzgcu.zzc(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return zzc(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] zzc(Queue queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i10) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        int i11 = i10 - length;
        while (i11 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i11, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i10 - i11, min);
            i11 -= min;
        }
        return copyOf;
    }
}
