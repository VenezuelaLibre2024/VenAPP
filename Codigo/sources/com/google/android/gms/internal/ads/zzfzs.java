package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfzs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}
