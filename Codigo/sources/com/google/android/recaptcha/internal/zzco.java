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
public final class zzco implements zzby {
    public static final zzco zza = new zzco();

    private zzco() {
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
        f k10;
        int r10;
        f k11;
        int r11;
        f k12;
        int r12;
        f k13;
        int r13;
        int[] e02;
        byte[] c02;
        boolean z10 = obj instanceof Byte;
        if (z10 && (obj2 instanceof Byte)) {
            return Byte.valueOf((byte) (((Number) obj).byteValue() ^ ((Number) obj2).byteValue()));
        }
        boolean z11 = obj instanceof Short;
        if (z11 && (obj2 instanceof Short)) {
            return Short.valueOf((short) (((Number) obj).shortValue() ^ ((Number) obj2).shortValue()));
        }
        boolean z12 = obj instanceof Integer;
        if (z12 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() ^ ((Number) obj2).intValue());
        }
        boolean z13 = obj instanceof Long;
        if (z13 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj2).longValue() ^ ((Number) obj).longValue());
        }
        int i10 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(d.f31393b);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i10 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i10] ^ ((Number) obj2).byteValue())));
                    i10++;
                }
                c02 = z.c0(arrayList);
                return c02;
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i10 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i10] ^ ((Number) obj2).intValue()));
                    i10++;
                }
                e02 = z.e0(arrayList2);
                return e02;
            }
        }
        if (z10 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b10 : bArr) {
                arrayList3.add(Byte.valueOf((byte) (b10 ^ ((Number) obj).byteValue())));
            }
            return arrayList3.toArray(new Byte[0]);
        }
        if (z11 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s10 : sArr) {
                arrayList4.add(Short.valueOf((short) (s10 ^ ((Number) obj).shortValue())));
            }
            return arrayList4.toArray(new Short[0]);
        }
        if (z12 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList5.add(Integer.valueOf(i11 ^ ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z13 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j10 : jArr) {
                arrayList6.add(Long.valueOf(j10 ^ ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        boolean z14 = obj instanceof byte[];
        if (z14 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList7 = new ArrayList(bArr2.length);
            for (byte b11 : bArr2) {
                arrayList7.add(Byte.valueOf((byte) (b11 ^ ((Number) obj2).byteValue())));
            }
            return arrayList7.toArray(new Byte[0]);
        }
        boolean z15 = obj instanceof short[];
        if (z15 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList8 = new ArrayList(sArr2.length);
            for (short s11 : sArr2) {
                arrayList8.add(Short.valueOf((short) (s11 ^ ((Number) obj2).shortValue())));
            }
            return arrayList8.toArray(new Short[0]);
        }
        boolean z16 = obj instanceof int[];
        if (z16 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            ArrayList arrayList9 = new ArrayList(iArr2.length);
            for (int i12 : iArr2) {
                arrayList9.add(Integer.valueOf(i12 ^ ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z17 = obj instanceof long[];
        if (z17 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList10 = new ArrayList(jArr2.length);
            for (long j11 : jArr2) {
                arrayList10.add(Long.valueOf(j11 ^ ((Number) obj2).longValue()));
            }
            return arrayList10.toArray(new Long[0]);
        }
        if (z14 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length3 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzbx.zzb(this, length3, bArr4.length);
            k13 = l.k(0, length3);
            r13 = s.r(k13, 10);
            ArrayList arrayList11 = new ArrayList(r13);
            Iterator<Integer> it = k13.iterator();
            while (it.hasNext()) {
                int nextInt = ((e0) it).nextInt();
                arrayList11.add(Byte.valueOf((byte) (bArr4[nextInt] ^ bArr3[nextInt])));
            }
            return arrayList11.toArray(new Byte[0]);
        }
        if (z15 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length4 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzbx.zzb(this, length4, sArr4.length);
            k12 = l.k(0, length4);
            r12 = s.r(k12, 10);
            ArrayList arrayList12 = new ArrayList(r12);
            Iterator<Integer> it2 = k12.iterator();
            while (it2.hasNext()) {
                int nextInt2 = ((e0) it2).nextInt();
                arrayList12.add(Short.valueOf((short) (sArr4[nextInt2] ^ sArr3[nextInt2])));
            }
            return arrayList12.toArray(new Short[0]);
        }
        if (z16 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length5 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzbx.zzb(this, length5, iArr4.length);
            k11 = l.k(0, length5);
            r11 = s.r(k11, 10);
            ArrayList arrayList13 = new ArrayList(r11);
            Iterator<Integer> it3 = k11.iterator();
            while (it3.hasNext()) {
                int nextInt3 = ((e0) it3).nextInt();
                arrayList13.add(Integer.valueOf(iArr4[nextInt3] ^ iArr3[nextInt3]));
            }
            return arrayList13.toArray(new Integer[0]);
        }
        if (!z17 || !(obj2 instanceof long[])) {
            throw new zzt(4, 5, null);
        }
        long[] jArr3 = (long[]) obj;
        int length6 = jArr3.length;
        long[] jArr4 = (long[]) obj2;
        zzbx.zzb(this, length6, jArr4.length);
        k10 = l.k(0, length6);
        r10 = s.r(k10, 10);
        ArrayList arrayList14 = new ArrayList(r10);
        Iterator<Integer> it4 = k10.iterator();
        while (it4.hasNext()) {
            int nextInt4 = ((e0) it4).nextInt();
            arrayList14.add(Long.valueOf(jArr3[nextInt4] ^ jArr4[nextInt4]));
        }
        return arrayList14.toArray(new Long[0]);
    }
}
