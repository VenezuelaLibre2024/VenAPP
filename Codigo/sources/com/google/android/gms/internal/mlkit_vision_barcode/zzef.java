package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.internal.ads.k;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzef {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!k.a(unsafe, obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
