package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import la.m;
import la.n;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: com.google.android.gms.common.server.response.a$a */
    /* loaded from: classes.dex */
    public static class C0150a<I, O> extends ea.a {
        public static final d CREATOR = new d();

        /* renamed from: a */
        private final int f9679a;

        /* renamed from: b */
        protected final int f9680b;

        /* renamed from: c */
        protected final boolean f9681c;

        /* renamed from: d */
        protected final int f9682d;

        /* renamed from: e */
        protected final boolean f9683e;

        /* renamed from: f */
        protected final String f9684f;

        /* renamed from: r */
        protected final int f9685r;

        /* renamed from: s */
        protected final Class f9686s;

        /* renamed from: t */
        protected final String f9687t;

        /* renamed from: u */
        private h f9688u;

        /* renamed from: v */
        private b f9689v;

        public C0150a(int i10, int i11, boolean z10, int i12, boolean z11, String str, int i13, String str2, ja.b bVar) {
            this.f9679a = i10;
            this.f9680b = i11;
            this.f9681c = z10;
            this.f9682d = i12;
            this.f9683e = z11;
            this.f9684f = str;
            this.f9685r = i13;
            if (str2 == null) {
                this.f9686s = null;
                this.f9687t = null;
            } else {
                this.f9686s = c.class;
                this.f9687t = str2;
            }
            if (bVar == null) {
                this.f9689v = null;
            } else {
                this.f9689v = bVar.v1();
            }
        }

        protected C0150a(int i10, boolean z10, int i11, boolean z11, String str, int i12, Class cls, b bVar) {
            this.f9679a = 1;
            this.f9680b = i10;
            this.f9681c = z10;
            this.f9682d = i11;
            this.f9683e = z11;
            this.f9684f = str;
            this.f9685r = i12;
            this.f9686s = cls;
            this.f9687t = cls == null ? null : cls.getCanonicalName();
            this.f9689v = bVar;
        }

        public static C0150a<byte[], byte[]> u1(String str, int i10) {
            return new C0150a<>(8, false, 8, false, str, i10, null, null);
        }

        public static <T extends a> C0150a<T, T> v1(String str, int i10, Class<T> cls) {
            return new C0150a<>(11, false, 11, false, str, i10, cls, null);
        }

        public static <T extends a> C0150a<ArrayList<T>, ArrayList<T>> w1(String str, int i10, Class<T> cls) {
            return new C0150a<>(11, true, 11, true, str, i10, cls, null);
        }

        public static C0150a<Integer, Integer> x1(String str, int i10) {
            return new C0150a<>(0, false, 0, false, str, i10, null, null);
        }

        public static C0150a<String, String> y1(String str, int i10) {
            return new C0150a<>(7, false, 7, false, str, i10, null, null);
        }

        public static C0150a<ArrayList<String>, ArrayList<String>> z1(String str, int i10) {
            return new C0150a<>(7, true, 7, true, str, i10, null, null);
        }

        public int A1() {
            return this.f9685r;
        }

        final ja.b B1() {
            b bVar = this.f9689v;
            if (bVar == null) {
                return null;
            }
            return ja.b.u1(bVar);
        }

        public final Object D1(Object obj) {
            s.j(this.f9689v);
            return s.j(this.f9689v.I0(obj));
        }

        public final Object E1(Object obj) {
            s.j(this.f9689v);
            return this.f9689v.D0(obj);
        }

        final String F1() {
            String str = this.f9687t;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final Map G1() {
            s.j(this.f9687t);
            s.j(this.f9688u);
            return (Map) s.j(this.f9688u.v1(this.f9687t));
        }

        public final void H1(h hVar) {
            this.f9688u = hVar;
        }

        public final boolean I1() {
            return this.f9689v != null;
        }

        public final String toString() {
            q.a a10 = q.d(this).a("versionCode", Integer.valueOf(this.f9679a)).a("typeIn", Integer.valueOf(this.f9680b)).a("typeInArray", Boolean.valueOf(this.f9681c)).a("typeOut", Integer.valueOf(this.f9682d)).a("typeOutArray", Boolean.valueOf(this.f9683e)).a("outputFieldName", this.f9684f).a("safeParcelFieldId", Integer.valueOf(this.f9685r)).a("concreteTypeName", F1());
            Class cls = this.f9686s;
            if (cls != null) {
                a10.a("concreteType.class", cls.getCanonicalName());
            }
            b bVar = this.f9689v;
            if (bVar != null) {
                a10.a("converterName", bVar.getClass().getCanonicalName());
            }
            return a10.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int a10 = ea.c.a(parcel);
            ea.c.u(parcel, 1, this.f9679a);
            ea.c.u(parcel, 2, this.f9680b);
            ea.c.g(parcel, 3, this.f9681c);
            ea.c.u(parcel, 4, this.f9682d);
            ea.c.g(parcel, 5, this.f9683e);
            ea.c.G(parcel, 6, this.f9684f, false);
            ea.c.u(parcel, 7, A1());
            ea.c.G(parcel, 8, F1(), false);
            ea.c.E(parcel, 9, B1(), i10, false);
            ea.c.b(parcel, a10);
        }
    }

    /* loaded from: classes.dex */
    public interface b<I, O> {
        Object D0(Object obj);

        Object I0(Object obj);
    }

    public static final Object zaD(C0150a c0150a, Object obj) {
        return c0150a.f9689v != null ? c0150a.E1(obj) : obj;
    }

    private final void zaE(C0150a c0150a, Object obj) {
        String str = c0150a.f9684f;
        Object D1 = c0150a.D1(obj);
        int i10 = c0150a.f9682d;
        switch (i10) {
            case 0:
                if (D1 != null) {
                    setIntegerInternal(c0150a, str, ((Integer) D1).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zaf(c0150a, str, (BigInteger) D1);
                return;
            case 2:
                if (D1 != null) {
                    setLongInternal(c0150a, str, ((Long) D1).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException("Unsupported type for conversion: " + i10);
            case 4:
                if (D1 != null) {
                    zan(c0150a, str, ((Double) D1).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zab(c0150a, str, (BigDecimal) D1);
                return;
            case 6:
                if (D1 != null) {
                    setBooleanInternal(c0150a, str, ((Boolean) D1).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(c0150a, str, (String) D1);
                return;
            case 8:
            case 9:
                if (D1 != null) {
                    setDecodedBytesInternal(c0150a, str, (byte[]) D1);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(StringBuilder sb2, C0150a c0150a, Object obj) {
        String aVar;
        int i10 = c0150a.f9680b;
        if (i10 == 11) {
            Class cls = c0150a.f9686s;
            s.j(cls);
            aVar = ((a) cls.cast(obj)).toString();
        } else if (i10 != 7) {
            sb2.append(obj);
            return;
        } else {
            aVar = "\"";
            sb2.append("\"");
            sb2.append(m.a((String) obj));
        }
        sb2.append(aVar);
    }

    private static final void zaG(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + str + ") has a null value, but expected a primitive");
        }
    }

    public <T extends a> void addConcreteTypeArrayInternal(C0150a c0150a, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends a> void addConcreteTypeInternal(C0150a c0150a, String str, T t10) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, C0150a<?, ?>> getFieldMappings();

    public Object getFieldValue(C0150a c0150a) {
        String str = c0150a.f9684f;
        if (c0150a.f9686s == null) {
            return getValueObject(str);
        }
        s.p(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", c0150a.f9684f);
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    protected abstract Object getValueObject(String str);

    public boolean isFieldSet(C0150a c0150a) {
        if (c0150a.f9682d != 11) {
            return isPrimitiveFieldSet(c0150a.f9684f);
        }
        if (c0150a.f9683e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected abstract boolean isPrimitiveFieldSet(String str);

    protected void setBooleanInternal(C0150a<?, ?> c0150a, String str, boolean z10) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    protected void setDecodedBytesInternal(C0150a<?, ?> c0150a, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    protected void setIntegerInternal(C0150a<?, ?> c0150a, String str, int i10) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    protected void setLongInternal(C0150a<?, ?> c0150a, String str, long j10) {
        throw new UnsupportedOperationException("Long not supported");
    }

    protected void setStringInternal(C0150a<?, ?> c0150a, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    protected void setStringMapInternal(C0150a<?, ?> c0150a, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    protected void setStringsInternal(C0150a<?, ?> c0150a, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x005b. Please report as an issue. */
    public String toString() {
        String str;
        String c10;
        Map<String, C0150a<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str2 : fieldMappings.keySet()) {
            C0150a<?, ?> c0150a = fieldMappings.get(str2);
            if (isFieldSet(c0150a)) {
                Object zaD = zaD(c0150a, getFieldValue(c0150a));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\":");
                if (zaD != null) {
                    switch (c0150a.f9682d) {
                        case 8:
                            sb2.append("\"");
                            c10 = la.c.c((byte[]) zaD);
                            sb2.append(c10);
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            c10 = la.c.d((byte[]) zaD);
                            sb2.append(c10);
                            sb2.append("\"");
                            break;
                        case 10:
                            n.a(sb2, (HashMap) zaD);
                            break;
                        default:
                            if (c0150a.f9681c) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        zaF(sb2, c0150a, obj);
                                    }
                                }
                                str = "]";
                                break;
                            } else {
                                zaF(sb2, c0150a, zaD);
                                break;
                            }
                    }
                } else {
                    str = "null";
                }
                sb2.append(str);
            }
        }
        sb2.append(sb2.length() > 0 ? "}" : "{}");
        return sb2.toString();
    }

    public final void zaA(C0150a c0150a, String str) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, str);
        } else {
            setStringInternal(c0150a, c0150a.f9684f, str);
        }
    }

    public final void zaB(C0150a c0150a, Map map) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, map);
        } else {
            setStringMapInternal(c0150a, c0150a.f9684f, map);
        }
    }

    public final void zaC(C0150a c0150a, ArrayList arrayList) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, arrayList);
        } else {
            setStringsInternal(c0150a, c0150a.f9684f, arrayList);
        }
    }

    public final void zaa(C0150a c0150a, BigDecimal bigDecimal) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, bigDecimal);
        } else {
            zab(c0150a, c0150a.f9684f, bigDecimal);
        }
    }

    protected void zab(C0150a c0150a, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(C0150a c0150a, ArrayList arrayList) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, arrayList);
        } else {
            zad(c0150a, c0150a.f9684f, arrayList);
        }
    }

    protected void zad(C0150a c0150a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(C0150a c0150a, BigInteger bigInteger) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, bigInteger);
        } else {
            zaf(c0150a, c0150a.f9684f, bigInteger);
        }
    }

    protected void zaf(C0150a c0150a, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(C0150a c0150a, ArrayList arrayList) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, arrayList);
        } else {
            zah(c0150a, c0150a.f9684f, arrayList);
        }
    }

    protected void zah(C0150a c0150a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(C0150a c0150a, boolean z10) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, Boolean.valueOf(z10));
        } else {
            setBooleanInternal(c0150a, c0150a.f9684f, z10);
        }
    }

    public final void zaj(C0150a c0150a, ArrayList arrayList) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, arrayList);
        } else {
            zak(c0150a, c0150a.f9684f, arrayList);
        }
    }

    protected void zak(C0150a c0150a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(C0150a c0150a, byte[] bArr) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, bArr);
        } else {
            setDecodedBytesInternal(c0150a, c0150a.f9684f, bArr);
        }
    }

    public final void zam(C0150a c0150a, double d10) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, Double.valueOf(d10));
        } else {
            zan(c0150a, c0150a.f9684f, d10);
        }
    }

    protected void zan(C0150a c0150a, String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(C0150a c0150a, ArrayList arrayList) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, arrayList);
        } else {
            zap(c0150a, c0150a.f9684f, arrayList);
        }
    }

    protected void zap(C0150a c0150a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(C0150a c0150a, float f10) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, Float.valueOf(f10));
        } else {
            zar(c0150a, c0150a.f9684f, f10);
        }
    }

    protected void zar(C0150a c0150a, String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(C0150a c0150a, ArrayList arrayList) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, arrayList);
        } else {
            zat(c0150a, c0150a.f9684f, arrayList);
        }
    }

    protected void zat(C0150a c0150a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(C0150a c0150a, int i10) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, Integer.valueOf(i10));
        } else {
            setIntegerInternal(c0150a, c0150a.f9684f, i10);
        }
    }

    public final void zav(C0150a c0150a, ArrayList arrayList) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, arrayList);
        } else {
            zaw(c0150a, c0150a.f9684f, arrayList);
        }
    }

    protected void zaw(C0150a c0150a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(C0150a c0150a, long j10) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, Long.valueOf(j10));
        } else {
            setLongInternal(c0150a, c0150a.f9684f, j10);
        }
    }

    public final void zay(C0150a c0150a, ArrayList arrayList) {
        if (c0150a.f9689v != null) {
            zaE(c0150a, arrayList);
        } else {
            zaz(c0150a, c0150a.f9684f, arrayList);
        }
    }

    protected void zaz(C0150a c0150a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
