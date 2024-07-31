package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zzfg extends zzfk {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzfg() {
        super(null);
    }

    public /* synthetic */ zzfg(zzff zzffVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zza(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzhi.zzf(obj, j10);
        if (list instanceof zzfe) {
            unmodifiableList = ((zzfe) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzgd) && (list instanceof zzey)) {
                zzey zzeyVar = (zzey) list;
                if (zzeyVar.zzc()) {
                    zzeyVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzhi.zzp(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0094 A[ADDED_TO_REGION] */
    @Override // com.google.android.gms.internal.auth.zzfk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.auth.zzhi.zzf(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzhi.zzf(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L39
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.zzfe
            if (r2 == 0) goto L20
            com.google.android.gms.internal.auth.zzfd r1 = new com.google.android.gms.internal.auth.zzfd
            r1.<init>(r0)
            goto L35
        L20:
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.zzgd
            if (r2 == 0) goto L30
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.zzey
            if (r2 == 0) goto L30
            com.google.android.gms.internal.auth.zzey r1 = (com.google.android.gms.internal.auth.zzey) r1
            com.google.android.gms.internal.auth.zzey r0 = r1.zzd(r0)
            r1 = r0
            goto L35
        L30:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L35:
            com.google.android.gms.internal.auth.zzhi.zzp(r5, r7, r1)
            goto L8a
        L39:
            java.lang.Class r2 = com.google.android.gms.internal.auth.zzfg.zza
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L57
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L52:
            com.google.android.gms.internal.auth.zzhi.zzp(r5, r7, r2)
            r1 = r2
            goto L8a
        L57:
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.zzhd
            if (r2 == 0) goto L6f
            com.google.android.gms.internal.auth.zzfd r2 = new com.google.android.gms.internal.auth.zzfd
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            com.google.android.gms.internal.auth.zzhd r1 = (com.google.android.gms.internal.auth.zzhd) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L52
        L6f:
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.zzgd
            if (r2 == 0) goto L8a
            boolean r2 = r1 instanceof com.google.android.gms.internal.auth.zzey
            if (r2 == 0) goto L8a
            r2 = r1
            com.google.android.gms.internal.auth.zzey r2 = (com.google.android.gms.internal.auth.zzey) r2
            boolean r3 = r2.zzc()
            if (r3 != 0) goto L8a
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.auth.zzey r1 = r2.zzd(r1)
            goto L35
        L8a:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L99
            if (r2 <= 0) goto L99
            r1.addAll(r6)
        L99:
            if (r0 > 0) goto L9c
            goto L9d
        L9c:
            r6 = r1
        L9d:
            com.google.android.gms.internal.auth.zzhi.zzp(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfg.zzb(java.lang.Object, java.lang.Object, long):void");
    }
}
