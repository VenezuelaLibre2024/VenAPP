package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaff {
    private List<zzafc> zza;

    public zzaff() {
        this.zza = new ArrayList();
    }

    public zzaff(List<zzafc> list) {
        this.zza = Collections.unmodifiableList(list);
    }

    public final List<zzafc> zza() {
        return this.zza;
    }
}
