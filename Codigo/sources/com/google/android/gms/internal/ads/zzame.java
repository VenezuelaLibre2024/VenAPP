package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzame {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzame(String str, int i10, String str2, Set set) {
        this.zzb = i10;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzame zza(String str, int i10) {
        String str2;
        String trim = str.trim();
        zzek.zzd(!trim.isEmpty());
        int indexOf = trim.indexOf(" ");
        if (indexOf == -1) {
            str2 = "";
        } else {
            String trim2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
            str2 = trim2;
        }
        int i11 = zzfy.zza;
        String[] split = trim.split("\\.", -1);
        String str3 = split[0];
        HashSet hashSet = new HashSet();
        for (int i12 = 1; i12 < split.length; i12++) {
            hashSet.add(split[i12]);
        }
        return new zzame(str3, i10, str2, hashSet);
    }

    public static zzame zzb() {
        return new zzame("", 0, "", Collections.emptySet());
    }
}
