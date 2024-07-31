package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzge {
    private static final zzge zzb = new zzge(true);
    final zziy zza = new zzio(16);
    private boolean zzc;
    private boolean zzd;

    private zzge() {
    }

    private zzge(boolean z10) {
        zzg();
        zzg();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002d. Please report as an issue. */
    public static int zza(zzgd zzgdVar, Object obj) {
        long longValue;
        int intValue;
        int zza;
        int intValue2;
        zzjv zzd = zzgdVar.zzd();
        int zza2 = zzgdVar.zza();
        zzgdVar.zzg();
        int zzy = zzfk.zzy(zza2 << 3);
        if (zzd == zzjv.zzj) {
            zzhy zzhyVar = (zzhy) obj;
            byte[] bArr = zzgw.zzd;
            if (zzhyVar instanceof zzej) {
                throw null;
            }
            zzy += zzy;
        }
        zzjw zzjwVar = zzjw.INT;
        int i10 = 4;
        switch (zzd.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i10 = 8;
                return zzy + i10;
            case 1:
                ((Float) obj).floatValue();
                return zzy + i10;
            case 2:
            case 3:
                longValue = ((Long) obj).longValue();
                i10 = zzfk.zzz(longValue);
                return zzy + i10;
            case 4:
                intValue = ((Integer) obj).intValue();
                i10 = zzfk.zzu(intValue);
                return zzy + i10;
            case 5:
            case 15:
                ((Long) obj).longValue();
                i10 = 8;
                return zzy + i10;
            case 6:
            case 14:
                ((Integer) obj).intValue();
                return zzy + i10;
            case 7:
                ((Boolean) obj).booleanValue();
                i10 = 1;
                return zzy + i10;
            case 8:
                if (!(obj instanceof zzez)) {
                    i10 = zzfk.zzx((String) obj);
                    return zzy + i10;
                }
                zza = ((zzez) obj).zzd();
                i10 = zzfk.zzy(zza) + zza;
                return zzy + i10;
            case 9:
                i10 = ((zzhy) obj).zzn();
                return zzy + i10;
            case 10:
                if (!(obj instanceof zzhd)) {
                    i10 = zzfk.zzv((zzhy) obj);
                    return zzy + i10;
                }
                zza = ((zzhd) obj).zza();
                i10 = zzfk.zzy(zza) + zza;
                return zzy + i10;
            case 11:
                if (!(obj instanceof zzez)) {
                    zza = ((byte[]) obj).length;
                    i10 = zzfk.zzy(zza) + zza;
                    return zzy + i10;
                }
                zza = ((zzez) obj).zzd();
                i10 = zzfk.zzy(zza) + zza;
                return zzy + i10;
            case 12:
                intValue2 = ((Integer) obj).intValue();
                i10 = zzfk.zzy(intValue2);
                return zzy + i10;
            case 13:
                if (obj instanceof zzgq) {
                    intValue = ((zzgq) obj).zza();
                    i10 = zzfk.zzu(intValue);
                    return zzy + i10;
                }
                intValue = ((Integer) obj).intValue();
                i10 = zzfk.zzu(intValue);
                return zzy + i10;
            case 16:
                int intValue3 = ((Integer) obj).intValue();
                intValue2 = (intValue3 >> 31) ^ (intValue3 + intValue3);
                i10 = zzfk.zzy(intValue2);
                return zzy + i10;
            case 17:
                long longValue2 = ((Long) obj).longValue();
                longValue = (longValue2 >> 63) ^ (longValue2 + longValue2);
                i10 = zzfk.zzz(longValue);
                return zzy + i10;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzge zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzid) {
            return ((zzid) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zziy zziyVar;
        Object zzl;
        Object zze;
        zzgd zzgdVar = (zzgd) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzhd) {
            throw null;
        }
        zzgdVar.zzg();
        if (zzgdVar.zze() != zzjw.MESSAGE || (zze = zze(zzgdVar)) == null) {
            zziyVar = this.zza;
            zzl = zzl(value);
        } else {
            if (zze instanceof zzid) {
                zzl = zzgdVar.zzc((zzid) zze, (zzid) value);
            } else {
                zzhx zzW = ((zzhy) zze).zzW();
                zzgdVar.zzb(zzW, (zzhy) value);
                zzl = zzW.zzj();
            }
            zziyVar = this.zza;
        }
        zziyVar.put(zzgdVar, zzl);
    }

    private static boolean zzn(Map.Entry entry) {
        zzgd zzgdVar = (zzgd) entry.getKey();
        if (zzgdVar.zze() != zzjw.MESSAGE) {
            return true;
        }
        zzgdVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzhz) {
            return ((zzhz) value).zzo();
        }
        if (value instanceof zzhd) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        zzgd zzgdVar = (zzgd) entry.getKey();
        Object value = entry.getValue();
        if (zzgdVar.zze() != zzjw.MESSAGE) {
            return zza(zzgdVar, value);
        }
        zzgdVar.zzg();
        zzgdVar.zzf();
        boolean z10 = value instanceof zzhd;
        int zza = ((zzgd) entry.getKey()).zza();
        if (!z10) {
            int zzy = zzfk.zzy(zza);
            int zzy2 = zzfk.zzy(24) + zzfk.zzv((zzhy) value);
            int zzy3 = zzfk.zzy(16);
            int zzy4 = zzfk.zzy(8);
            return zzy4 + zzy4 + zzy3 + zzy + zzy2;
        }
        int zzy5 = zzfk.zzy(zza);
        int zza2 = ((zzhd) value).zza();
        int zzy6 = zzfk.zzy(zza2) + zza2;
        int zzy7 = zzfk.zzy(24);
        int zzy8 = zzfk.zzy(16);
        int zzy9 = zzfk.zzy(8);
        return zzy9 + zzy9 + zzy8 + zzy5 + zzy7 + zzy6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzge) {
            return this.zza.equals(((zzge) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            i10 += zzo(this.zza.zzg(i11));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i10 += zzo((Map.Entry) it.next());
        }
        return i10;
    }

    /* renamed from: zzc */
    public final zzge clone() {
        zzge zzgeVar = new zzge();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzgeVar.zzi((zzgd) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgeVar.zzi((zzgd) entry.getKey(), entry.getValue());
        }
        zzgeVar.zzd = this.zzd;
        return zzgeVar;
    }

    public final Object zze(zzgd zzgdVar) {
        Object obj = this.zza.get(zzgdVar);
        if (!(obj instanceof zzhd)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        return this.zzd ? new zzhc(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            if (zzg.getValue() instanceof zzgo) {
                ((zzgo) zzg.getValue()).zzA();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzge zzgeVar) {
        for (int i10 = 0; i10 < zzgeVar.zza.zzb(); i10++) {
            zzm(zzgeVar.zza.zzg(i10));
        }
        Iterator it = zzgeVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zzgq) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r0 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zzhd) == false) goto L66;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.recaptcha.internal.zzgd r6, java.lang.Object r7) {
        /*
            r5 = this;
            r6.zzg()
            com.google.android.recaptcha.internal.zzjv r0 = r6.zzd()
            byte[] r1 = com.google.android.recaptcha.internal.zzgw.zzd
            r7.getClass()
            com.google.android.recaptcha.internal.zzjv r1 = com.google.android.recaptcha.internal.zzjv.zza
            com.google.android.recaptcha.internal.zzjw r1 = com.google.android.recaptcha.internal.zzjw.INT
            com.google.android.recaptcha.internal.zzjw r0 = r0.zza()
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 0: goto L47;
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L2f;
                case 7: goto L26;
                case 8: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L57
        L1d:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzhy
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzhd
            if (r0 == 0) goto L57
            goto L4b
        L26:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzgq
            if (r0 == 0) goto L57
            goto L4b
        L2f:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzez
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L57
            goto L4b
        L38:
            boolean r0 = r7 instanceof java.lang.String
            goto L49
        L3b:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L49
        L3e:
            boolean r0 = r7 instanceof java.lang.Double
            goto L49
        L41:
            boolean r0 = r7 instanceof java.lang.Float
            goto L49
        L44:
            boolean r0 = r7 instanceof java.lang.Long
            goto L49
        L47:
            boolean r0 = r7 instanceof java.lang.Integer
        L49:
            if (r0 == 0) goto L57
        L4b:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzhd
            if (r0 == 0) goto L51
            r5.zzd = r1
        L51:
            com.google.android.recaptcha.internal.zziy r0 = r5.zza
            r0.put(r6, r7)
            return
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r6.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            com.google.android.recaptcha.internal.zzjv r6 = r6.zzd()
            com.google.android.recaptcha.internal.zzjw r6 = r6.zza()
            r2[r1] = r6
            java.lang.Class r6 = r7.getClass()
            java.lang.String r6 = r6.getName()
            r7 = 2
            r2[r7] = r6
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzge.zzi(com.google.android.recaptcha.internal.zzgd, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            if (!zzn(this.zza.zzg(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
