package com.google.android.recaptcha.internal;

import dk.z;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.n;
import xk.q;

/* loaded from: classes2.dex */
public final class zzbj {
    public static final zzbj zza = new zzbj();
    private static Set zzb;
    private static Set zzc;
    private static Long zzd;
    private static int zze;

    private zzbj() {
    }

    public static final void zza(zzlr zzlrVar) {
        Set j02;
        Set j03;
        j02 = z.j0(zzlrVar.zzf().zzi());
        zzb = j02;
        j03 = z.j0(zzlrVar.zzg().zzi());
        zzc = j03;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object zzb(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, android.content.Context r23, com.google.android.recaptcha.internal.zzr r24, gk.Continuation r25) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbj.zzb(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.content.Context, com.google.android.recaptcha.internal.zzr, gk.Continuation):java.lang.Object");
    }

    public static final boolean zzc(String str) {
        Set set = zzb;
        if (set == null || zzc == null) {
            if (zzd == null) {
                zzd = Long.valueOf(System.currentTimeMillis());
            }
            zze++;
            return true;
        }
        n.c(set, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = zzc;
        n.c(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (zzd(str, set2)) {
            return false;
        }
        return zzd(str, set);
    }

    private static final boolean zzd(String str, Set set) {
        List t02;
        t02 = q.t0(str, new char[]{'.'}, false, 0, 6, null);
        Iterator it = t02.iterator();
        String str2 = "";
        while (it.hasNext()) {
            String concat = str2.concat(String.valueOf((String) it.next()));
            if (set.contains(concat)) {
                return true;
            }
            str2 = concat.concat(".");
        }
        return false;
    }
}
