package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzck implements Comparable<zzck> {
    private final byte[] zza;

    private zzck(byte[] bArr) {
        this.zza = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzck zzckVar) {
        zzck zzckVar2 = zzckVar;
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = zzckVar2.zza;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr3 = this.zza;
            if (i10 >= bArr3.length) {
                return 0;
            }
            byte b10 = bArr3[i10];
            byte b11 = zzckVar2.zza[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzck) {
            return Arrays.equals(this.zza, ((zzck) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzxj.zza(this.zza);
    }
}
