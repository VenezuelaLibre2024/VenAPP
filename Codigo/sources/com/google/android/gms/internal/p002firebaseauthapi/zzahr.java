package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class zzahr implements Comparator<zzahp> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzahp zzahpVar, zzahp zzahpVar2) {
        zzahp zzahpVar3 = zzahpVar;
        zzahp zzahpVar4 = zzahpVar2;
        zzahv zzahvVar = (zzahv) zzahpVar3.iterator();
        zzahv zzahvVar2 = (zzahv) zzahpVar4.iterator();
        while (zzahvVar.hasNext() && zzahvVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzahp.zza(zzahvVar.zza())).compareTo(Integer.valueOf(zzahp.zza(zzahvVar2.zza())));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzahpVar3.zzb()).compareTo(Integer.valueOf(zzahpVar4.zzb()));
    }
}
