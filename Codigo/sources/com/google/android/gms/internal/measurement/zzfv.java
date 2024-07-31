package com.google.android.gms.internal.measurement;

import android.content.Context;
import eb.l;
import eb.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfv extends zzgu {
    private final Context zza;
    private final v<l<zzgh>> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfv(Context context, v<l<zzgh>> vVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context;
        this.zzb = vVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgu) {
            zzgu zzguVar = (zzgu) obj;
            if (this.zza.equals(zzguVar.zza())) {
                v<l<zzgh>> vVar = this.zzb;
                v<l<zzgh>> zzb = zzguVar.zzb();
                if (vVar != null ? vVar.equals(zzb) : zzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        v<l<zzgh>> vVar = this.zzb;
        return hashCode ^ (vVar == null ? 0 : vVar.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.zza) + ", hermeticFileOverrides=" + String.valueOf(this.zzb) + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzgu
    public final Context zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzgu
    public final v<l<zzgh>> zzb() {
        return this.zzb;
    }
}
