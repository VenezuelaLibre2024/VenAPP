package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzis;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zziq<T extends zzis<T>> {
    private static final zziq zzb = new zziq(true);
    final zzlg<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zziq() {
        this.zza = zzlg.zza(16);
    }

    private zziq(zzlg<T, Object> zzlgVar) {
        this.zza = zzlgVar;
        zze();
    }

    private zziq(boolean z10) {
        this(zzlg.zza(0));
        zze();
    }

    public static int zza(zzis<?> zzisVar, Object obj) {
        zzmn zzb2 = zzisVar.zzb();
        int zza = zzisVar.zza();
        if (!zzisVar.zze()) {
            return zza(zzb2, zza, obj);
        }
        List list = (List) obj;
        int i10 = 0;
        if (!zzisVar.zzd()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i10 += zza(zzb2, zza, it.next());
            }
            return i10;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i10 += zza(zzb2, it2.next());
        }
        return zzig.zzi(zza) + i10 + zzig.zzj(i10);
    }

    public static int zza(zzmn zzmnVar, int i10, Object obj) {
        int zzi = zzig.zzi(i10);
        if (zzmnVar == zzmn.zzj) {
            zziz.zza((zzkj) obj);
            zzi <<= 1;
        }
        return zzi + zza(zzmnVar, obj);
    }

    private static int zza(zzmn zzmnVar, Object obj) {
        switch (zzip.zzb[zzmnVar.ordinal()]) {
            case 1:
                return zzig.zza(((Double) obj).doubleValue());
            case 2:
                return zzig.zza(((Float) obj).floatValue());
            case 3:
                return zzig.zzd(((Long) obj).longValue());
            case 4:
                return zzig.zzg(((Long) obj).longValue());
            case 5:
                return zzig.zzf(((Integer) obj).intValue());
            case 6:
                return zzig.zzc(((Long) obj).longValue());
            case 7:
                return zzig.zze(((Integer) obj).intValue());
            case 8:
                return zzig.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzig.zzb((zzkj) obj);
            case 10:
                return obj instanceof zzjj ? zzig.zza((zzjj) obj) : zzig.zzc((zzkj) obj);
            case 11:
                return obj instanceof zzhm ? zzig.zzb((zzhm) obj) : zzig.zzb((String) obj);
            case 12:
                return obj instanceof zzhm ? zzig.zzb((zzhm) obj) : zzig.zza((byte[]) obj);
            case 13:
                return zzig.zzj(((Integer) obj).intValue());
            case 14:
                return zzig.zzg(((Integer) obj).intValue());
            case 15:
                return zzig.zze(((Long) obj).longValue());
            case 16:
                return zzig.zzh(((Integer) obj).intValue());
            case 17:
                return zzig.zzf(((Long) obj).longValue());
            case 18:
                return obj instanceof zzjc ? zzig.zzd(((zzjc) obj).zza()) : zzig.zzd(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() != zzmx.MESSAGE || key.zze() || key.zzd()) {
            return zza((zzis<?>) key, value);
        }
        boolean z10 = value instanceof zzjj;
        int zza = entry.getKey().zza();
        return z10 ? zzig.zza(zza, (zzjj) value) : zzig.zzb(zza, (zzkj) value);
    }

    private final Object zza(T t10) {
        Object obj = this.zza.get(t10);
        if (!(obj instanceof zzjj)) {
            return obj;
        }
        return zzjj.zza();
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzks) {
            return ((zzks) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void zza(zzig zzigVar, zzmn zzmnVar, int i10, Object obj) {
        if (zzmnVar == zzmn.zzj) {
            zzkj zzkjVar = (zzkj) obj;
            zziz.zza(zzkjVar);
            zzigVar.zzc(i10, 3);
            zzkjVar.zza(zzigVar);
            zzigVar.zzc(i10, 4);
            return;
        }
        zzigVar.zzc(i10, zzmnVar.zza());
        switch (zzip.zzb[zzmnVar.ordinal()]) {
            case 1:
                zzigVar.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzigVar.zzb(((Float) obj).floatValue());
                return;
            case 3:
                zzigVar.zzb(((Long) obj).longValue());
                return;
            case 4:
                zzigVar.zzb(((Long) obj).longValue());
                return;
            case 5:
                zzigVar.zzb(((Integer) obj).intValue());
                return;
            case 6:
                zzigVar.zza(((Long) obj).longValue());
                return;
            case 7:
                zzigVar.zza(((Integer) obj).intValue());
                return;
            case 8:
                zzigVar.zzb(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzkj) obj).zza(zzigVar);
                return;
            case 10:
                zzigVar.zza((zzkj) obj);
                return;
            case 11:
                if (obj instanceof zzhm) {
                    zzigVar.zza((zzhm) obj);
                    return;
                } else {
                    zzigVar.zza((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzhm) {
                    zzigVar.zza((zzhm) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzigVar.zzb(bArr, 0, bArr.length);
                    return;
                }
            case 13:
                zzigVar.zzc(((Integer) obj).intValue());
                return;
            case 14:
                zzigVar.zza(((Integer) obj).intValue());
                return;
            case 15:
                zzigVar.zza(((Long) obj).longValue());
                return;
            case 16:
                zzigVar.zzk(((Integer) obj).intValue());
                return;
            case 17:
                zzigVar.zzh(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzjc) {
                    zzigVar.zzb(((zzjc) obj).zza());
                    return;
                } else {
                    zzigVar.zzb(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static <T extends zzis<T>> zziq<T> zzb() {
        return zzb;
    }

    private final void zzb(T t10, Object obj) {
        if (!t10.zze()) {
            zzc(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                zzc(t10, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzjj) {
            this.zzd = true;
        }
        this.zza.zza((zzlg<T, Object>) t10, (T) obj);
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzjj) {
            value = zzjj.zza();
        }
        if (key.zze()) {
            Object zza = zza((zziq<T>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) zza).add(zza(it.next()));
            }
            this.zza.zza((zzlg<T, Object>) key, (T) zza);
            return;
        }
        if (key.zzc() != zzmx.MESSAGE) {
            this.zza.zza((zzlg<T, Object>) key, (T) zza(value));
            return;
        }
        Object zza2 = zza((zziq<T>) key);
        if (zza2 == null) {
            this.zza.zza((zzlg<T, Object>) key, (T) zza(value));
        } else {
            this.zza.zza((zzlg<T, Object>) key, (T) (zza2 instanceof zzks ? key.zza((zzks) zza2, (zzks) value) : key.zza(((zzkj) zza2).zzce(), (zzkj) value).zzab()));
        }
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzkl) {
            return ((zzkl) obj).zzci();
        }
        if (obj instanceof zzjj) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.measurement.zzjj) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.measurement.zzjc) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if ((r6 instanceof byte[]) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzc(T r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.measurement.zzmn r0 = r5.zzb()
            com.google.android.gms.internal.measurement.zziz.zza(r6)
            int[] r1 = com.google.android.gms.internal.measurement.zzip.zza
            com.google.android.gms.internal.measurement.zzmx r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2c;
                case 8: goto L23;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = r2
            goto L47
        L1a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzkj
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzjj
            if (r0 == 0) goto L18
            goto L34
        L23:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzjc
            if (r0 == 0) goto L18
            goto L34
        L2c:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzhm
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
        L34:
            r0 = r1
            goto L47
        L36:
            boolean r0 = r6 instanceof java.lang.String
            goto L47
        L39:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L47
        L3c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L47
        L3f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L47
        L42:
            boolean r0 = r6 instanceof java.lang.Long
            goto L47
        L45:
            boolean r0 = r6 instanceof java.lang.Integer
        L47:
            if (r0 == 0) goto L4a
            return
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r5.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            com.google.android.gms.internal.measurement.zzmn r5 = r5.zzb()
            com.google.android.gms.internal.measurement.zzmx r5 = r5.zzb()
            r3[r1] = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r6 = 2
            r3[r6] = r5
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zziq.zzc(com.google.android.gms.internal.measurement.zzis, java.lang.Object):void");
    }

    private static <T extends zzis<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzmx.MESSAGE) {
            return true;
        }
        boolean zze = key.zze();
        Object value = entry.getValue();
        if (!zze) {
            return zzb(value);
        }
        Iterator it = ((List) value).iterator();
        while (it.hasNext()) {
            if (!zzb(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() {
        zziq zziqVar = new zziq();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry<T, Object> zzb2 = this.zza.zzb(i10);
            zziqVar.zzb(zzb2.getKey(), zzb2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzc()) {
            zziqVar.zzb(entry.getKey(), entry.getValue());
        }
        zziqVar.zzd = this.zzd;
        return zziqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zziq) {
            return this.zza.equals(((zziq) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zza() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            i10 += zza((Map.Entry) this.zza.zzb(i11));
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i10 += zza((Map.Entry) it.next());
        }
        return i10;
    }

    public final void zza(zziq<T> zziqVar) {
        for (int i10 = 0; i10 < zziqVar.zza.zzb(); i10++) {
            zzb((Map.Entry) zziqVar.zza.zzb(i10));
        }
        Iterator<Map.Entry<T, Object>> it = zziqVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zzd ? new zzjo(this.zza.zzd().iterator()) : this.zza.zzd().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zzd ? new zzjo(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry<T, Object> zzb2 = this.zza.zzb(i10);
            if (zzb2.getValue() instanceof zzix) {
                ((zzix) zzb2.getValue()).zzcg();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            if (!zzc(this.zza.zzb(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzc(it.next())) {
                return false;
            }
        }
        return true;
    }
}
