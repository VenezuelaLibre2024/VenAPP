package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzab {
    private final zzj zza;
    private final boolean zzb;
    private final zzah zzc;
    private final int zzd;

    private zzab(zzah zzahVar) {
        this(zzahVar, false, zzn.zza, a.e.API_PRIORITY_OTHER);
    }

    private zzab(zzah zzahVar, boolean z10, zzj zzjVar, int i10) {
        this.zzc = zzahVar;
        this.zzb = false;
        this.zza = zzjVar;
        this.zzd = a.e.API_PRIORITY_OTHER;
    }

    public static zzab zza(char c10) {
        zzl zzlVar = new zzl(c10);
        zzy.zza(zzlVar);
        return new zzab(new zzaa(zzlVar));
    }

    public static zzab zza(String str) {
        zzs zza = zzx.zza(str);
        if (!zza.zza("").zzc()) {
            return new zzab(new zzac(zza));
        }
        throw new IllegalArgumentException(zzag.zza("The pattern may not match the empty string: %s", zza));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzy.zza(charSequence);
        Iterator<String> zza = this.zzc.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza.hasNext()) {
            arrayList.add(zza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
