package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzfww {
    private final String zza;
    private final zzfwu zzb;
    private zzfwu zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfww(String str, zzfwv zzfwvVar) {
        zzfwu zzfwuVar = new zzfwu();
        this.zzb = zzfwuVar;
        this.zzc = zzfwuVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzfwu zzfwuVar = this.zzb.zzb;
        String str = "";
        while (zzfwuVar != null) {
            Object obj = zzfwuVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzfwuVar = zzfwuVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzfww zza(Object obj) {
        zzfwu zzfwuVar = new zzfwu();
        this.zzc.zzb = zzfwuVar;
        this.zzc = zzfwuVar;
        zzfwuVar.zza = obj;
        return this;
    }
}
