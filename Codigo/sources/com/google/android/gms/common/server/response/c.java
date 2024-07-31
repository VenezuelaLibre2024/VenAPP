package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.server.response.a;
import ea.b;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import la.m;
import la.n;

/* loaded from: classes.dex */
public class c extends b {
    public static final Parcelable.Creator<c> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    private final int f9690a;

    /* renamed from: b, reason: collision with root package name */
    private final Parcel f9691b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9692c = 2;

    /* renamed from: d, reason: collision with root package name */
    private final h f9693d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9694e;

    /* renamed from: f, reason: collision with root package name */
    private int f9695f;

    /* renamed from: r, reason: collision with root package name */
    private int f9696r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(int i10, Parcel parcel, h hVar) {
        this.f9690a = i10;
        this.f9691b = (Parcel) s.j(parcel);
        this.f9693d = hVar;
        this.f9694e = hVar == null ? null : hVar.u1();
        this.f9695f = 2;
    }

    private final void b(a.C0150a c0150a) {
        if (c0150a.f9685r == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f9691b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i10 = this.f9695f;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f9696r = ea.c.a(parcel);
            this.f9695f = 1;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0071. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x0195. Please report as an issue. */
    private final void c(StringBuilder sb2, Map map, Parcel parcel) {
        Object c10;
        String a10;
        String str;
        Object valueOf;
        Object zaD;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((a.C0150a) entry.getValue()).A1(), entry);
        }
        sb2.append('{');
        int O = ea.b.O(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < O) {
            int E = ea.b.E(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(ea.b.w(E));
            if (entry2 != null) {
                if (z10) {
                    sb2.append(",");
                }
                String str2 = (String) entry2.getKey();
                a.C0150a c0150a = (a.C0150a) entry2.getValue();
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\":");
                if (c0150a.I1()) {
                    int i10 = c0150a.f9682d;
                    switch (i10) {
                        case 0:
                            valueOf = Integer.valueOf(ea.b.G(parcel, E));
                            zaD = a.zaD(c0150a, valueOf);
                            e(sb2, c0150a, zaD);
                            break;
                        case 1:
                            valueOf = ea.b.c(parcel, E);
                            zaD = a.zaD(c0150a, valueOf);
                            e(sb2, c0150a, zaD);
                            break;
                        case 2:
                            valueOf = Long.valueOf(ea.b.J(parcel, E));
                            zaD = a.zaD(c0150a, valueOf);
                            e(sb2, c0150a, zaD);
                            break;
                        case 3:
                            valueOf = Float.valueOf(ea.b.C(parcel, E));
                            zaD = a.zaD(c0150a, valueOf);
                            e(sb2, c0150a, zaD);
                            break;
                        case 4:
                            valueOf = Double.valueOf(ea.b.A(parcel, E));
                            zaD = a.zaD(c0150a, valueOf);
                            e(sb2, c0150a, zaD);
                            break;
                        case 5:
                            valueOf = ea.b.a(parcel, E);
                            zaD = a.zaD(c0150a, valueOf);
                            e(sb2, c0150a, zaD);
                            break;
                        case 6:
                            valueOf = Boolean.valueOf(ea.b.x(parcel, E));
                            zaD = a.zaD(c0150a, valueOf);
                            e(sb2, c0150a, zaD);
                            break;
                        case 7:
                            valueOf = ea.b.q(parcel, E);
                            zaD = a.zaD(c0150a, valueOf);
                            e(sb2, c0150a, zaD);
                            break;
                        case 8:
                        case 9:
                            zaD = a.zaD(c0150a, ea.b.g(parcel, E));
                            e(sb2, c0150a, zaD);
                            break;
                        case 10:
                            Bundle f10 = ea.b.f(parcel, E);
                            HashMap hashMap = new HashMap();
                            for (String str3 : f10.keySet()) {
                                hashMap.put(str3, (String) s.j(f10.getString(str3)));
                            }
                            zaD = a.zaD(c0150a, hashMap);
                            e(sb2, c0150a, zaD);
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i10);
                    }
                } else {
                    if (c0150a.f9683e) {
                        sb2.append("[");
                        switch (c0150a.f9682d) {
                            case 0:
                                la.b.e(sb2, ea.b.k(parcel, E));
                                break;
                            case 1:
                                la.b.g(sb2, ea.b.d(parcel, E));
                                break;
                            case 2:
                                la.b.f(sb2, ea.b.m(parcel, E));
                                break;
                            case 3:
                                la.b.d(sb2, ea.b.j(parcel, E));
                                break;
                            case 4:
                                la.b.c(sb2, ea.b.i(parcel, E));
                                break;
                            case 5:
                                la.b.g(sb2, ea.b.b(parcel, E));
                                break;
                            case 6:
                                la.b.h(sb2, ea.b.e(parcel, E));
                                break;
                            case 7:
                                la.b.i(sb2, ea.b.r(parcel, E));
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                Parcel[] o10 = ea.b.o(parcel, E);
                                int length = o10.length;
                                for (int i11 = 0; i11 < length; i11++) {
                                    if (i11 > 0) {
                                        sb2.append(",");
                                    }
                                    o10[i11].setDataPosition(0);
                                    c(sb2, c0150a.G1(), o10[i11]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        str = "]";
                    } else {
                        switch (c0150a.f9682d) {
                            case 0:
                                sb2.append(ea.b.G(parcel, E));
                                break;
                            case 1:
                                c10 = ea.b.c(parcel, E);
                                sb2.append(c10);
                                break;
                            case 2:
                                sb2.append(ea.b.J(parcel, E));
                                break;
                            case 3:
                                sb2.append(ea.b.C(parcel, E));
                                break;
                            case 4:
                                sb2.append(ea.b.A(parcel, E));
                                break;
                            case 5:
                                c10 = ea.b.a(parcel, E);
                                sb2.append(c10);
                                break;
                            case 6:
                                sb2.append(ea.b.x(parcel, E));
                                break;
                            case 7:
                                String q10 = ea.b.q(parcel, E);
                                sb2.append("\"");
                                a10 = m.a(q10);
                                sb2.append(a10);
                                sb2.append("\"");
                                break;
                            case 8:
                                byte[] g10 = ea.b.g(parcel, E);
                                sb2.append("\"");
                                a10 = la.c.c(g10);
                                sb2.append(a10);
                                sb2.append("\"");
                                break;
                            case 9:
                                byte[] g11 = ea.b.g(parcel, E);
                                sb2.append("\"");
                                a10 = la.c.d(g11);
                                sb2.append(a10);
                                sb2.append("\"");
                                break;
                            case 10:
                                Bundle f11 = ea.b.f(parcel, E);
                                Set<String> keySet = f11.keySet();
                                sb2.append("{");
                                boolean z11 = true;
                                for (String str4 : keySet) {
                                    if (!z11) {
                                        sb2.append(",");
                                    }
                                    sb2.append("\"");
                                    sb2.append(str4);
                                    sb2.append("\":\"");
                                    sb2.append(m.a(f11.getString(str4)));
                                    sb2.append("\"");
                                    z11 = false;
                                }
                                str = "}";
                                break;
                            case 11:
                                Parcel n10 = ea.b.n(parcel, E);
                                n10.setDataPosition(0);
                                c(sb2, c0150a.G1(), n10);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                    sb2.append(str);
                }
                z10 = true;
            }
        }
        if (parcel.dataPosition() == O) {
            sb2.append('}');
            return;
        }
        throw new b.a("Overread allowed size end=" + O, parcel);
    }

    private static final void d(StringBuilder sb2, int i10, Object obj) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                sb2.append(m.a(s.j(obj).toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                sb2.append(la.c.c((byte[]) obj));
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                sb2.append(la.c.d((byte[]) obj));
                sb2.append("\"");
                return;
            case 10:
                n.a(sb2, (HashMap) s.j(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i10);
        }
    }

    private static final void e(StringBuilder sb2, a.C0150a c0150a, Object obj) {
        if (!c0150a.f9681c) {
            d(sb2, c0150a.f9680b, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            d(sb2, c0150a.f9680b, arrayList.get(i10));
        }
        sb2.append("]");
    }

    public final Parcel a() {
        int i10 = this.f9695f;
        if (i10 != 0) {
            if (i10 == 1) {
                ea.c.b(this.f9691b, this.f9696r);
            }
            return this.f9691b;
        }
        int a10 = ea.c.a(this.f9691b);
        this.f9696r = a10;
        ea.c.b(this.f9691b, a10);
        this.f9695f = 2;
        return this.f9691b;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final <T extends a> void addConcreteTypeArrayInternal(a.C0150a c0150a, String str, ArrayList<T> arrayList) {
        b(c0150a);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) s.j(arrayList)).size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((c) arrayList.get(i10)).a());
        }
        ea.c.D(this.f9691b, c0150a.A1(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final <T extends a> void addConcreteTypeInternal(a.C0150a c0150a, String str, T t10) {
        b(c0150a);
        ea.c.C(this.f9691b, c0150a.A1(), ((c) t10).a(), true);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final Map<String, a.C0150a<?, ?>> getFieldMappings() {
        h hVar = this.f9693d;
        if (hVar == null) {
            return null;
        }
        return hVar.v1((String) s.j(this.f9694e));
    }

    @Override // com.google.android.gms.common.server.response.b, com.google.android.gms.common.server.response.a
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.b, com.google.android.gms.common.server.response.a
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setBooleanInternal(a.C0150a<?, ?> c0150a, String str, boolean z10) {
        b(c0150a);
        ea.c.g(this.f9691b, c0150a.A1(), z10);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setDecodedBytesInternal(a.C0150a<?, ?> c0150a, String str, byte[] bArr) {
        b(c0150a);
        ea.c.l(this.f9691b, c0150a.A1(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setIntegerInternal(a.C0150a<?, ?> c0150a, String str, int i10) {
        b(c0150a);
        ea.c.u(this.f9691b, c0150a.A1(), i10);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setLongInternal(a.C0150a<?, ?> c0150a, String str, long j10) {
        b(c0150a);
        ea.c.z(this.f9691b, c0150a.A1(), j10);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringInternal(a.C0150a<?, ?> c0150a, String str, String str2) {
        b(c0150a);
        ea.c.G(this.f9691b, c0150a.A1(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringMapInternal(a.C0150a<?, ?> c0150a, String str, Map<String, String> map) {
        b(c0150a);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) s.j(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        ea.c.j(this.f9691b, c0150a.A1(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringsInternal(a.C0150a<?, ?> c0150a, String str, ArrayList<String> arrayList) {
        b(c0150a);
        int size = ((ArrayList) s.j(arrayList)).size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = arrayList.get(i10);
        }
        ea.c.H(this.f9691b, c0150a.A1(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final String toString() {
        s.k(this.f9693d, "Cannot convert to JSON on client side.");
        Parcel a10 = a();
        a10.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        c(sb2, (Map) s.j(this.f9693d.v1((String) s.j(this.f9694e))), a10);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9690a);
        ea.c.C(parcel, 2, a(), false);
        ea.c.E(parcel, 3, this.f9692c != 0 ? this.f9693d : null, i10, false);
        ea.c.b(parcel, a10);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zab(a.C0150a c0150a, String str, BigDecimal bigDecimal) {
        b(c0150a);
        ea.c.c(this.f9691b, c0150a.A1(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zad(a.C0150a c0150a, String str, ArrayList arrayList) {
        b(c0150a);
        int size = ((ArrayList) s.j(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = (BigDecimal) arrayList.get(i10);
        }
        ea.c.d(this.f9691b, c0150a.A1(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zaf(a.C0150a c0150a, String str, BigInteger bigInteger) {
        b(c0150a);
        ea.c.e(this.f9691b, c0150a.A1(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zah(a.C0150a c0150a, String str, ArrayList arrayList) {
        b(c0150a);
        int size = ((ArrayList) s.j(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = (BigInteger) arrayList.get(i10);
        }
        ea.c.f(this.f9691b, c0150a.A1(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zak(a.C0150a c0150a, String str, ArrayList arrayList) {
        b(c0150a);
        int size = ((ArrayList) s.j(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue();
        }
        ea.c.h(this.f9691b, c0150a.A1(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zan(a.C0150a c0150a, String str, double d10) {
        b(c0150a);
        ea.c.n(this.f9691b, c0150a.A1(), d10);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zap(a.C0150a c0150a, String str, ArrayList arrayList) {
        b(c0150a);
        int size = ((ArrayList) s.j(arrayList)).size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        ea.c.o(this.f9691b, c0150a.A1(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zar(a.C0150a c0150a, String str, float f10) {
        b(c0150a);
        ea.c.q(this.f9691b, c0150a.A1(), f10);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zat(a.C0150a c0150a, String str, ArrayList arrayList) {
        b(c0150a);
        int size = ((ArrayList) s.j(arrayList)).size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = ((Float) arrayList.get(i10)).floatValue();
        }
        ea.c.r(this.f9691b, c0150a.A1(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zaw(a.C0150a c0150a, String str, ArrayList arrayList) {
        b(c0150a);
        int size = ((ArrayList) s.j(arrayList)).size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        ea.c.v(this.f9691b, c0150a.A1(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zaz(a.C0150a c0150a, String str, ArrayList arrayList) {
        b(c0150a);
        int size = ((ArrayList) s.j(arrayList)).size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        ea.c.A(this.f9691b, c0150a.A1(), jArr, true);
    }
}
