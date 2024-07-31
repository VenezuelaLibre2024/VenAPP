package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import la.C9475t;

/* loaded from: classes2.dex */
public final class zzago {
    private final int zza;
    private List<String> zzb;

    public zzago() {
        this(null);
    }

    public zzago(int i10, List<String> list) {
        List<String> emptyList;
        this.zza = 1;
        if (list == null || list.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.set(i11, C9475t.m28179a(list.get(i11)));
            }
            emptyList = Collections.unmodifiableList(list);
        }
        this.zzb = emptyList;
    }

    private zzago(List<String> list) {
        this.zza = 1;
        this.zzb = new ArrayList();
    }

    public static zzago zza() {
        return new zzago(null);
    }

    public final List<String> zzb() {
        return this.zzb;
    }
}
