package com.google.android.recaptcha.internal;

import dk.e0;
import dk.s;
import dk.z;
import java.util.ArrayList;
import java.util.Iterator;
import uk.f;
import uk.l;
import xk.d;

/* loaded from: classes2.dex */
public final class zzcg implements zzby {
    public static final zzcg zza = new zzcg();

    private zzcg() {
    }

    private final Object zzb(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        f k10;
        int r10;
        f k11;
        int r11;
        f k12;
        int r12;
        f k13;
        int r13;
        f k14;
        int r14;
        f k15;
        int r15;
        int[] e02;
        int[] e03;
        byte[] c02;
        boolean z12 = obj instanceof Byte;
        if ((z12 && (obj2 instanceof Byte)) || ((((z10 = obj instanceof Short)) && (obj2 instanceof Short)) || (((z11 = obj instanceof Integer)) && (obj2 instanceof Integer)))) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z13 = obj instanceof Long;
        if (z13 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z14 = obj instanceof Float;
        if (z14 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z15 = obj instanceof Double;
        if (z15 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i10 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(d.f31393b);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i10 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i10] % ((Number) obj2).intValue())));
                    i10++;
                }
                c02 = z.c0(arrayList);
                return new String(c02, d.f31393b);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i10 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i10] % ((Number) obj2).intValue()));
                    i10++;
                }
                e03 = z.e0(arrayList2);
                return e03;
            }
        }
        if (z12 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b10 : bArr) {
                arrayList3.add(Integer.valueOf(b10 % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        }
        if (z10 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s10 : sArr) {
                arrayList4.add(Integer.valueOf(s10 % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        }
        if (z11 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList5.add(Integer.valueOf(i11 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z13 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j10 : jArr) {
                arrayList6.add(Long.valueOf(j10 % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        if (z14 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f10 : fArr) {
                arrayList7.add(Float.valueOf(f10 % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        }
        if (z15 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d10 : dArr) {
                arrayList8.add(Double.valueOf(d10 % ((Number) obj).doubleValue()));
            }
            return arrayList8.toArray(new Double[0]);
        }
        boolean z16 = obj instanceof byte[];
        if (z16 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr2.length);
            for (byte b11 : bArr2) {
                arrayList9.add(Integer.valueOf(b11 % ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z17 = obj instanceof short[];
        if (z17 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList10 = new ArrayList(sArr2.length);
            for (short s11 : sArr2) {
                arrayList10.add(Integer.valueOf(s11 % ((Number) obj2).intValue()));
            }
            return arrayList10.toArray(new Integer[0]);
        }
        boolean z18 = obj instanceof int[];
        if (z18 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length3 = iArr2.length;
            ArrayList arrayList11 = new ArrayList(length3);
            while (i10 < length3) {
                arrayList11.add(Integer.valueOf(iArr2[i10] % ((Number) obj2).intValue()));
                i10++;
            }
            e02 = z.e0(arrayList11);
            return e02;
        }
        boolean z19 = obj instanceof long[];
        if (z19 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList12 = new ArrayList(jArr2.length);
            for (long j11 : jArr2) {
                arrayList12.add(Long.valueOf(j11 % ((Number) obj2).longValue()));
            }
            return arrayList12.toArray(new Long[0]);
        }
        boolean z20 = obj instanceof float[];
        if (z20 && (obj2 instanceof Float)) {
            float[] fArr2 = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr2.length);
            for (float f11 : fArr2) {
                arrayList13.add(Float.valueOf(f11 % ((Number) obj2).floatValue()));
            }
            return arrayList13.toArray(new Float[0]);
        }
        boolean z21 = obj instanceof double[];
        if (z21 && (obj2 instanceof Double)) {
            double[] dArr2 = (double[]) obj;
            ArrayList arrayList14 = new ArrayList(dArr2.length);
            for (double d11 : dArr2) {
                arrayList14.add(Double.valueOf(d11 % ((Number) obj2).doubleValue()));
            }
            return arrayList14.toArray(new Double[0]);
        }
        if (z16 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length4 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzbx.zzb(this, length4, bArr4.length);
            k15 = l.k(0, length4);
            r15 = s.r(k15, 10);
            ArrayList arrayList15 = new ArrayList(r15);
            Iterator<Integer> it = k15.iterator();
            while (it.hasNext()) {
                int nextInt = ((e0) it).nextInt();
                arrayList15.add(Integer.valueOf(bArr3[nextInt] % bArr4[nextInt]));
            }
            return arrayList15.toArray(new Integer[0]);
        }
        if (z17 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length5 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzbx.zzb(this, length5, sArr4.length);
            k14 = l.k(0, length5);
            r14 = s.r(k14, 10);
            ArrayList arrayList16 = new ArrayList(r14);
            Iterator<Integer> it2 = k14.iterator();
            while (it2.hasNext()) {
                int nextInt2 = ((e0) it2).nextInt();
                arrayList16.add(Integer.valueOf(sArr3[nextInt2] % sArr4[nextInt2]));
            }
            return arrayList16.toArray(new Integer[0]);
        }
        if (z18 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length6 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzbx.zzb(this, length6, iArr4.length);
            k13 = l.k(0, length6);
            r13 = s.r(k13, 10);
            ArrayList arrayList17 = new ArrayList(r13);
            Iterator<Integer> it3 = k13.iterator();
            while (it3.hasNext()) {
                int nextInt3 = ((e0) it3).nextInt();
                arrayList17.add(Integer.valueOf(iArr3[nextInt3] % iArr4[nextInt3]));
            }
            return arrayList17.toArray(new Integer[0]);
        }
        if (z19 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length7 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzbx.zzb(this, length7, jArr4.length);
            k12 = l.k(0, length7);
            r12 = s.r(k12, 10);
            ArrayList arrayList18 = new ArrayList(r12);
            Iterator<Integer> it4 = k12.iterator();
            while (it4.hasNext()) {
                int nextInt4 = ((e0) it4).nextInt();
                arrayList18.add(Long.valueOf(jArr3[nextInt4] % jArr4[nextInt4]));
            }
            return arrayList18.toArray(new Long[0]);
        }
        if (z20 && (obj2 instanceof float[])) {
            float[] fArr3 = (float[]) obj;
            int length8 = fArr3.length;
            float[] fArr4 = (float[]) obj2;
            zzbx.zzb(this, length8, fArr4.length);
            k11 = l.k(0, length8);
            r11 = s.r(k11, 10);
            ArrayList arrayList19 = new ArrayList(r11);
            Iterator<Integer> it5 = k11.iterator();
            while (it5.hasNext()) {
                int nextInt5 = ((e0) it5).nextInt();
                arrayList19.add(Float.valueOf(fArr3[nextInt5] % fArr4[nextInt5]));
            }
            return arrayList19.toArray(new Float[0]);
        }
        if (!z21 || !(obj2 instanceof double[])) {
            throw new zzt(4, 5, null);
        }
        double[] dArr3 = (double[]) obj;
        int length9 = dArr3.length;
        double[] dArr4 = (double[]) obj2;
        zzbx.zzb(this, length9, dArr4.length);
        k10 = l.k(0, length9);
        r10 = s.r(k10, 10);
        ArrayList arrayList20 = new ArrayList(r10);
        Iterator<Integer> it6 = k10.iterator();
        while (it6.hasNext()) {
            int nextInt6 = ((e0) it6).nextInt();
            arrayList20.add(Double.valueOf(dArr3[nextInt6] % dArr4[nextInt6]));
        }
        return arrayList20.toArray(new Double[0]);
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
        try {
            zzblVar.zzc().zzf(i10, zzb(obj, obj2));
        } catch (ArithmeticException e10) {
            throw new zzt(4, 6, e10);
        }
    }
}
