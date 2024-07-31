package com.google.android.recaptcha.internal;

import dk.m;
import dk.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbz implements zzby {
    public static final zzbz zza = new zzbz();

    private zzbz() {
    }

    public static final List zzc(Object obj) {
        List a02;
        List b02;
        List d02;
        List c02;
        List f02;
        List Z;
        if (obj instanceof byte[]) {
            Z = m.Z((byte[]) obj);
            return Z;
        }
        if (obj instanceof short[]) {
            f02 = m.f0((short[]) obj);
            return f02;
        }
        if (obj instanceof int[]) {
            c02 = m.c0((int[]) obj);
            return c02;
        }
        if (obj instanceof long[]) {
            d02 = m.d0((long[]) obj);
            return d02;
        }
        if (obj instanceof float[]) {
            b02 = m.b0((float[]) obj);
            return b02;
        }
        if (!(obj instanceof double[])) {
            return null;
        }
        a02 = m.a0((double[]) obj);
        return a02;
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, zzbl zzblVar, Object... objArr) {
        if (objArr.length != 2) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Object)) {
            obj = null;
        }
        if (obj == null) {
            throw new zzt(4, 5, null);
        }
        Object obj2 = objArr[1];
        if (true != (obj2 instanceof Object)) {
            obj2 = null;
        }
        if (obj2 == null) {
            throw new zzt(4, 5, null);
        }
        zzblVar.zzc().zzf(i10, zzb(obj, obj2));
    }

    public final Object zzb(Object obj, Object obj2) {
        int r10;
        int r11;
        List zzc = zzc(obj);
        List zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                r11 = s.r(zzc2, 10);
                ArrayList arrayList = new ArrayList(r11);
                Iterator it = zzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            r10 = s.r(zzc, 10);
            ArrayList arrayList2 = new ArrayList(r10);
            Iterator it2 = zzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (zzc == null || zzc2 == null) {
            throw new zzt(4, 5, null);
        }
        zzbx.zzb(this, zzc.size(), zzc2.size());
        int size = zzc.size();
        Double[] dArr = new Double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = Double.valueOf(Math.pow(((Number) zzc.get(i10)).doubleValue(), ((Number) zzc2.get(i10)).doubleValue()));
        }
        return dArr;
    }
}
