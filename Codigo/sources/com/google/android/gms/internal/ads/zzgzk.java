package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzgzk {
    private static final zzgzk zzb = new zzgzk(true);
    final zzhcl zza = new zzhcb(16);
    private boolean zzc;
    private boolean zzd;

    private zzgzk() {
    }

    private zzgzk(boolean z10) {
        zzb();
        zzb();
    }

    public static zzgzk zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void zzd(com.google.android.gms.internal.ads.zzgzj r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.zzhdf r0 = r4.zzb()
            byte[] r1 = com.google.android.gms.internal.ads.zzhae.zzd
            r5.getClass()
            com.google.android.gms.internal.ads.zzhdf r1 = com.google.android.gms.internal.ads.zzhdf.zza
            com.google.android.gms.internal.ads.zzhdg r1 = com.google.android.gms.internal.ads.zzhdg.INT
            com.google.android.gms.internal.ads.zzhdg r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L43;
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L2b;
                case 7: goto L22;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L48
        L19:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhbe
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzhaj
            if (r0 == 0) goto L48
            goto L47
        L22:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgzw
            if (r0 == 0) goto L48
            goto L47
        L2b:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgyl
            if (r0 != 0) goto L47
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L48
            goto L47
        L34:
            boolean r0 = r5 instanceof java.lang.String
            goto L45
        L37:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L45
        L3a:
            boolean r0 = r5 instanceof java.lang.Double
            goto L45
        L3d:
            boolean r0 = r5 instanceof java.lang.Float
            goto L45
        L40:
            boolean r0 = r5 instanceof java.lang.Long
            goto L45
        L43:
            boolean r0 = r5 instanceof java.lang.Integer
        L45:
            if (r0 == 0) goto L48
        L47:
            return
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.internal.ads.zzhdf r4 = r4.zzb()
            com.google.android.gms.internal.ads.zzhdg r4 = r4.zza()
            r2 = 1
            r1[r2] = r4
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            r5 = 2
            r1[r5] = r4
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgzk.zzd(com.google.android.gms.internal.ads.zzgzj, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzgzk zzgzkVar = new zzgzk();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzgzkVar.zzc((zzgzj) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgzkVar.zzc((zzgzj) entry.getKey(), entry.getValue());
        }
        zzgzkVar.zzd = this.zzd;
        return zzgzkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgzk) {
            return this.zza.equals(((zzgzk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            if (zzg.getValue() instanceof zzgzu) {
                ((zzgzu) zzg.getValue()).zzaS();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzgzj zzgzjVar, Object obj) {
        if (!zzgzjVar.zzc()) {
            zzd(zzgzjVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzd(zzgzjVar, arrayList.get(i10));
            }
            obj = arrayList;
        }
        if (obj instanceof zzhaj) {
            this.zzd = true;
        }
        this.zza.put(zzgzjVar, obj);
    }
}
