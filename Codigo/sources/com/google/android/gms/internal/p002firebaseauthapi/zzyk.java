package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.d2;
import com.google.firebase.auth.j0;
import java.util.List;
import oc.i0;

/* loaded from: classes2.dex */
public final class zzyk {
    private String zza;
    private List<zzafr> zzb;
    private d2 zzc;

    public zzyk(String str, List<zzafr> list, d2 d2Var) {
        this.zza = str;
        this.zzb = list;
        this.zzc = d2Var;
    }

    public final d2 zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List<j0> zzc() {
        return i0.b(this.zzb);
    }
}
