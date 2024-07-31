package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzaiv<T extends zzaix<T>> {
    private static final zzaiv zzb = new zzaiv(true);
    final zzalg<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzaiv() {
        this.zza = zzalg.zza(16);
    }

    private zzaiv(zzalg<T, Object> zzalgVar) {
        this.zza = zzalgVar;
        zze();
    }

    private zzaiv(boolean z10) {
        this(zzalg.zza(0));
        zze();
    }

    public static int zza(zzaix<?> zzaixVar, Object obj) {
        zzamr zzb2 = zzaixVar.zzb();
        int zza = zzaixVar.zza();
        if (!zzaixVar.zze()) {
            return zza(zzb2, zza, obj);
        }
        List list = (List) obj;
        int i10 = 0;
        if (!zzaixVar.zzd()) {
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
        return zzaik.zzi(zza) + i10 + zzaik.zzj(i10);
    }

    public static int zza(zzamr zzamrVar, int i10, Object obj) {
        int zzi = zzaik.zzi(i10);
        if (zzamrVar == zzamr.zzj) {
            zzajf.zza((zzakn) obj);
            zzi <<= 1;
        }
        return zzi + zza(zzamrVar, obj);
    }

    private static int zza(zzamr zzamrVar, Object obj) {
        switch (zzaiu.zzb[zzamrVar.ordinal()]) {
            case 1:
                return zzaik.zza(((Double) obj).doubleValue());
            case 2:
                return zzaik.zza(((Float) obj).floatValue());
            case 3:
                return zzaik.zzd(((Long) obj).longValue());
            case 4:
                return zzaik.zzg(((Long) obj).longValue());
            case 5:
                return zzaik.zze(((Integer) obj).intValue());
            case 6:
                return zzaik.zzc(((Long) obj).longValue());
            case 7:
                return zzaik.zzd(((Integer) obj).intValue());
            case 8:
                return zzaik.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzaik.zza((zzakn) obj);
            case 10:
                return obj instanceof zzajn ? zzaik.zza((zzajn) obj) : zzaik.zzb((zzakn) obj);
            case 11:
                return obj instanceof zzahp ? zzaik.zza((zzahp) obj) : zzaik.zza((String) obj);
            case 12:
                return obj instanceof zzahp ? zzaik.zza((zzahp) obj) : zzaik.zza((byte[]) obj);
            case 13:
                return zzaik.zzj(((Integer) obj).intValue());
            case 14:
                return zzaik.zzg(((Integer) obj).intValue());
            case 15:
                return zzaik.zze(((Long) obj).longValue());
            case 16:
                return zzaik.zzh(((Integer) obj).intValue());
            case 17:
                return zzaik.zzf(((Long) obj).longValue());
            case 18:
                return obj instanceof zzaje ? zzaik.zzc(((zzaje) obj).zza()) : zzaik.zzc(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() != zzanb.MESSAGE || key.zze() || key.zzd()) {
            return zza((zzaix<?>) key, value);
        }
        boolean z10 = value instanceof zzajn;
        int zza = entry.getKey().zza();
        return z10 ? zzaik.zza(zza, (zzajn) value) : zzaik.zza(zza, (zzakn) value);
    }

    private final Object zza(T t10) {
        Object obj = this.zza.get(t10);
        if (!(obj instanceof zzajn)) {
            return obj;
        }
        return zzajn.zza();
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzaks) {
            return ((zzaks) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void zza(zzaik zzaikVar, zzamr zzamrVar, int i10, Object obj) {
        if (zzamrVar == zzamr.zzj) {
            zzakn zzaknVar = (zzakn) obj;
            zzajf.zza(zzaknVar);
            zzaikVar.zzk(i10, 3);
            zzaknVar.zza(zzaikVar);
            zzaikVar.zzk(i10, 4);
            return;
        }
        zzaikVar.zzk(i10, zzamrVar.zza());
        switch (zzaiu.zzb[zzamrVar.ordinal()]) {
            case 1:
                zzaikVar.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzaikVar.zzb(((Float) obj).floatValue());
                return;
            case 3:
                zzaikVar.zzj(((Long) obj).longValue());
                return;
            case 4:
                zzaikVar.zzj(((Long) obj).longValue());
                return;
            case 5:
                zzaikVar.zzl(((Integer) obj).intValue());
                return;
            case 6:
                zzaikVar.zzh(((Long) obj).longValue());
                return;
            case 7:
                zzaikVar.zzk(((Integer) obj).intValue());
                return;
            case 8:
                zzaikVar.zzb(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzakn) obj).zza(zzaikVar);
                return;
            case 10:
                zzaikVar.zzc((zzakn) obj);
                return;
            case 11:
                if (obj instanceof zzahp) {
                    zzaikVar.zzb((zzahp) obj);
                    return;
                } else {
                    zzaikVar.zzb((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzahp) {
                    zzaikVar.zzb((zzahp) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzaikVar.zzb(bArr, 0, bArr.length);
                    return;
                }
            case 13:
                zzaikVar.zzn(((Integer) obj).intValue());
                return;
            case 14:
                zzaikVar.zzk(((Integer) obj).intValue());
                return;
            case 15:
                zzaikVar.zzh(((Long) obj).longValue());
                return;
            case 16:
                zzaikVar.zzm(((Integer) obj).intValue());
                return;
            case 17:
                zzaikVar.zzi(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzaje) {
                    zzaikVar.zzl(((zzaje) obj).zza());
                    return;
                } else {
                    zzaikVar.zzl(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static <T extends zzaix<T>> zzaiv<T> zzb() {
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
        if (obj instanceof zzajn) {
            this.zzd = true;
        }
        this.zza.zza((zzalg<T, Object>) t10, (T) obj);
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzajn;
        if (key.zze()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object zza = zza((zzaiv<T>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) zza).add(zza(it.next()));
            }
            this.zza.zza((zzalg<T, Object>) key, (T) zza);
            return;
        }
        if (key.zzc() != zzanb.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza((zzalg<T, Object>) key, (T) zza(value));
            return;
        }
        Object zza2 = zza((zzaiv<T>) key);
        if (zza2 == null) {
            this.zza.zza((zzalg<T, Object>) key, (T) zza(value));
            if (z10) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z10) {
            value = zzajn.zza();
        }
        this.zza.zza((zzalg<T, Object>) key, (T) (zza2 instanceof zzaks ? key.zza((zzaks) zza2, (zzaks) value) : key.zza(((zzakn) zza2).zzr(), (zzakn) value).zzf()));
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzakp) {
            return ((zzakp) obj).zzk();
        }
        if (obj instanceof zzajn) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzajn) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzaje) == false) goto L34;
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
            com.google.android.gms.internal.firebase-auth-api.zzamr r0 = r5.zzb()
            com.google.android.gms.internal.p002firebaseauthapi.zzajf.zza(r6)
            int[] r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaiu.zza
            com.google.android.gms.internal.firebase-auth-api.zzanb r0 = r0.zzb()
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
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzakn
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzajn
            if (r0 == 0) goto L18
            goto L34
        L23:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzaje
            if (r0 == 0) goto L18
            goto L34
        L2c:
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzahp
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
            com.google.android.gms.internal.firebase-auth-api.zzamr r5 = r5.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzanb r5 = r5.zzb()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaiv.zzc(com.google.android.gms.internal.firebase-auth-api.zzaix, java.lang.Object):void");
    }

    private static <T extends zzaix<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzanb.MESSAGE) {
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
        zzaiv zzaivVar = new zzaiv();
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            Map.Entry<T, Object> zzb2 = this.zza.zzb(i10);
            zzaivVar.zzb(zzb2.getKey(), zzb2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzb()) {
            zzaivVar.zzb(entry.getKey(), entry.getValue());
        }
        zzaivVar.zzd = this.zzd;
        return zzaivVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaiv) {
            return this.zza.equals(((zzaiv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zza() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.zza.zza(); i11++) {
            i10 += zza((Map.Entry) this.zza.zzb(i11));
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            i10 += zza((Map.Entry) it.next());
        }
        return i10;
    }

    public final void zza(zzaiv<T> zzaivVar) {
        for (int i10 = 0; i10 < zzaivVar.zza.zza(); i10++) {
            zzb((Map.Entry) zzaivVar.zza.zzb(i10));
        }
        Iterator<Map.Entry<T, Object>> it = zzaivVar.zza.zzb().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zzd ? new zzajo(this.zza.zzc().iterator()) : this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zzd ? new zzajo(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            Map.Entry<T, Object> zzb2 = this.zza.zzb(i10);
            if (zzb2.getValue() instanceof zzajc) {
                ((zzajc) zzb2.getValue()).zzs();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            if (!zzc(this.zza.zzb(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            if (!zzc(it.next())) {
                return false;
            }
        }
        return true;
    }
}
