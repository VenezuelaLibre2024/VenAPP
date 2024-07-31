package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
final class zzans extends zzacg {
    public zzans(zzfw zzfwVar, long j10, long j11) {
        super(new zzacb(), new zzanr(zzfwVar, null), j10, 0L, j10 + 1, 0L, j11, 188L, AdError.NETWORK_ERROR_CODE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ int zzh(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
