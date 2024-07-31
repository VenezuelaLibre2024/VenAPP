package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzadq {
    public static int zza(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i10;
        if ((byteBuffer.get(5) & 2) == 0) {
            i10 = 0;
        } else {
            byte b10 = byteBuffer.get(26);
            int i11 = 28;
            int i12 = 28;
            for (int i13 = 0; i13 < b10; i13++) {
                i12 += byteBuffer.get(i13 + 27);
            }
            byte b11 = byteBuffer.get(i12 + 26);
            for (int i14 = 0; i14 < b11; i14++) {
                i11 += byteBuffer.get(i12 + 27 + i14);
            }
            i10 = i12 + i11;
        }
        int i15 = byteBuffer.get(i10 + 26) + 27 + i10;
        return (int) ((zzg(byteBuffer.get(i15), byteBuffer.limit() - i15 > 1 ? byteBuffer.get(i15 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        return (int) ((zzg(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        return zzg(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List zze(byte[] bArr) {
        long zza = zza(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzi(zzh(zza)));
        arrayList.add(zzi(zzh(3840L)));
        return arrayList;
    }

    public static boolean zzf(long j10, long j11) {
        return j10 - j11 <= zzh(3840L) / 1000;
    }

    private static long zzg(byte b10, byte b11) {
        int i10;
        int i11 = b10 & 255;
        int i12 = i11 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return i10 * (i13 >= 16 ? 2500 << r0 : i13 >= 12 ? ModuleDescriptor.MODULE_VERSION << (r0 & 1) : (i13 & 3) == 3 ? 60000 : ModuleDescriptor.MODULE_VERSION << r0);
    }

    private static long zzh(long j10) {
        return (j10 * 1000000000) / 48000;
    }

    private static byte[] zzi(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }
}
