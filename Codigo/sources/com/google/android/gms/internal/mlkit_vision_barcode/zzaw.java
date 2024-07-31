package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzaw {
    private final String zza;
    private final zzau zzb;
    private zzau zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaw(String str, zzav zzavVar) {
        zzau zzauVar = new zzau(null);
        this.zzb = zzauVar;
        this.zzc = zzauVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzau zzauVar = this.zzb.zzb;
        String str = "";
        while (zzauVar != null) {
            Object obj = zzauVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzauVar = zzauVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzaw zza(Object obj) {
        zzau zzauVar = new zzau(null);
        this.zzc.zzb = zzauVar;
        this.zzc = zzauVar;
        zzauVar.zza = obj;
        return this;
    }
}
