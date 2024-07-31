package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzfj {
    public static final int zza(int i10, Object obj, Object obj2) {
        zzfi zzfiVar = (zzfi) obj;
        if (zzfiVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzfiVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzfi zzfiVar = (zzfi) obj;
        zzfi zzfiVar2 = (zzfi) obj2;
        if (!zzfiVar2.isEmpty()) {
            if (!zzfiVar.zze()) {
                zzfiVar = zzfiVar.zzb();
            }
            zzfiVar.zzd(zzfiVar2);
        }
        return zzfiVar;
    }
}
