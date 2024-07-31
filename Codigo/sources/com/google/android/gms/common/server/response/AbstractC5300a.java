package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import la.C9458c;
import la.C9468m;
import la.C9469n;
import p081ea.AbstractC7138a;
import p081ea.C7140c;
import p178ja.C9004b;

/* renamed from: com.google.android.gms.common.server.response.a */
/* loaded from: classes.dex */
public abstract class AbstractC5300a {

    /* renamed from: com.google.android.gms.common.server.response.a$a */
    /* loaded from: classes.dex */
    public static class a<I, O> extends AbstractC7138a {
        public static final C5303d CREATOR = new C5303d();

        /* renamed from: a */
        private final int f10794a;

        /* renamed from: b */
        protected final int f10795b;

        /* renamed from: c */
        protected final boolean f10796c;

        /* renamed from: d */
        protected final int f10797d;

        /* renamed from: e */
        protected final boolean f10798e;

        /* renamed from: f */
        protected final String f10799f;

        /* renamed from: r */
        protected final int f10800r;

        /* renamed from: s */
        protected final Class f10801s;

        /* renamed from: t */
        protected final String f10802t;

        /* renamed from: u */
        private C5307h f10803u;

        /* renamed from: v */
        private b f10804v;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10, int i11, boolean z10, int i12, boolean z11, String str, int i13, String str2, C9004b c9004b) {
            this.f10794a = i10;
            this.f10795b = i11;
            this.f10796c = z10;
            this.f10797d = i12;
            this.f10798e = z11;
            this.f10799f = str;
            this.f10800r = i13;
            if (str2 == null) {
                this.f10801s = null;
                this.f10802t = null;
            } else {
                this.f10801s = C5302c.class;
                this.f10802t = str2;
            }
            if (c9004b == null) {
                this.f10804v = null;
            } else {
                this.f10804v = c9004b.m26423v1();
            }
        }

        protected a(int i10, boolean z10, int i11, boolean z11, String str, int i12, Class cls, b bVar) {
            this.f10794a = 1;
            this.f10795b = i10;
            this.f10796c = z10;
            this.f10797d = i11;
            this.f10798e = z11;
            this.f10799f = str;
            this.f10800r = i12;
            this.f10801s = cls;
            this.f10802t = cls == null ? null : cls.getCanonicalName();
            this.f10804v = bVar;
        }

        /* renamed from: u1 */
        public static a<byte[], byte[]> m13371u1(String str, int i10) {
            return new a<>(8, false, 8, false, str, i10, null, null);
        }

        /* renamed from: v1 */
        public static <T extends AbstractC5300a> a<T, T> m13372v1(String str, int i10, Class<T> cls) {
            return new a<>(11, false, 11, false, str, i10, cls, null);
        }

        /* renamed from: w1 */
        public static <T extends AbstractC5300a> a<ArrayList<T>, ArrayList<T>> m13373w1(String str, int i10, Class<T> cls) {
            return new a<>(11, true, 11, true, str, i10, cls, null);
        }

        /* renamed from: x1 */
        public static a<Integer, Integer> m13374x1(String str, int i10) {
            return new a<>(0, false, 0, false, str, i10, null, null);
        }

        /* renamed from: y1 */
        public static a<String, String> m13375y1(String str, int i10) {
            return new a<>(7, false, 7, false, str, i10, null, null);
        }

        /* renamed from: z1 */
        public static a<ArrayList<String>, ArrayList<String>> m13376z1(String str, int i10) {
            return new a<>(7, true, 7, true, str, i10, null, null);
        }

        /* renamed from: A1 */
        public int m13377A1() {
            return this.f10800r;
        }

        /* renamed from: B1 */
        final C9004b m13378B1() {
            b bVar = this.f10804v;
            if (bVar == null) {
                return null;
            }
            return C9004b.m26422u1(bVar);
        }

        /* renamed from: D1 */
        public final Object m13379D1(Object obj) {
            C5276s.m13324j(this.f10804v);
            return C5276s.m13324j(this.f10804v.mo13386I0(obj));
        }

        /* renamed from: E1 */
        public final Object m13380E1(Object obj) {
            C5276s.m13324j(this.f10804v);
            return this.f10804v.mo13385D0(obj);
        }

        /* renamed from: F1 */
        final String m13381F1() {
            String str = this.f10802t;
            if (str == null) {
                return null;
            }
            return str;
        }

        /* renamed from: G1 */
        public final Map m13382G1() {
            C5276s.m13324j(this.f10802t);
            C5276s.m13324j(this.f10803u);
            return (Map) C5276s.m13324j(this.f10803u.m13393v1(this.f10802t));
        }

        /* renamed from: H1 */
        public final void m13383H1(C5307h c5307h) {
            this.f10803u = c5307h;
        }

        /* renamed from: I1 */
        public final boolean m13384I1() {
            return this.f10804v != null;
        }

        public final String toString() {
            C5270q.a m13307a = C5270q.m13306d(this).m13307a("versionCode", Integer.valueOf(this.f10794a)).m13307a("typeIn", Integer.valueOf(this.f10795b)).m13307a("typeInArray", Boolean.valueOf(this.f10796c)).m13307a("typeOut", Integer.valueOf(this.f10797d)).m13307a("typeOutArray", Boolean.valueOf(this.f10798e)).m13307a("outputFieldName", this.f10799f).m13307a("safeParcelFieldId", Integer.valueOf(this.f10800r)).m13307a("concreteTypeName", m13381F1());
            Class cls = this.f10801s;
            if (cls != null) {
                m13307a.m13307a("concreteType.class", cls.getCanonicalName());
            }
            b bVar = this.f10804v;
            if (bVar != null) {
                m13307a.m13307a("converterName", bVar.getClass().getCanonicalName());
            }
            return m13307a.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int m21209a = C7140c.m21209a(parcel);
            C7140c.m21229u(parcel, 1, this.f10794a);
            C7140c.m21229u(parcel, 2, this.f10795b);
            C7140c.m21215g(parcel, 3, this.f10796c);
            C7140c.m21229u(parcel, 4, this.f10797d);
            C7140c.m21215g(parcel, 5, this.f10798e);
            C7140c.m21200G(parcel, 6, this.f10799f, false);
            C7140c.m21229u(parcel, 7, m13377A1());
            C7140c.m21200G(parcel, 8, m13381F1(), false);
            C7140c.m21198E(parcel, 9, m13378B1(), i10, false);
            C7140c.m21210b(parcel, m21209a);
        }
    }

    /* renamed from: com.google.android.gms.common.server.response.a$b */
    /* loaded from: classes.dex */
    public interface b<I, O> {
        /* renamed from: D0 */
        Object mo13385D0(Object obj);

        /* renamed from: I0 */
        Object mo13386I0(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final Object zaD(a aVar, Object obj) {
        return aVar.f10804v != null ? aVar.m13380E1(obj) : obj;
    }

    private final void zaE(a aVar, Object obj) {
        String str = aVar.f10799f;
        Object m13379D1 = aVar.m13379D1(obj);
        int i10 = aVar.f10797d;
        switch (i10) {
            case 0:
                if (m13379D1 != null) {
                    setIntegerInternal(aVar, str, ((Integer) m13379D1).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zaf(aVar, str, (BigInteger) m13379D1);
                return;
            case 2:
                if (m13379D1 != null) {
                    setLongInternal(aVar, str, ((Long) m13379D1).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException("Unsupported type for conversion: " + i10);
            case 4:
                if (m13379D1 != null) {
                    zan(aVar, str, ((Double) m13379D1).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zab(aVar, str, (BigDecimal) m13379D1);
                return;
            case 6:
                if (m13379D1 != null) {
                    setBooleanInternal(aVar, str, ((Boolean) m13379D1).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(aVar, str, (String) m13379D1);
                return;
            case 8:
            case 9:
                if (m13379D1 != null) {
                    setDecodedBytesInternal(aVar, str, (byte[]) m13379D1);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(StringBuilder sb2, a aVar, Object obj) {
        String abstractC5300a;
        int i10 = aVar.f10795b;
        if (i10 == 11) {
            Class cls = aVar.f10801s;
            C5276s.m13324j(cls);
            abstractC5300a = ((AbstractC5300a) cls.cast(obj)).toString();
        } else if (i10 != 7) {
            sb2.append(obj);
            return;
        } else {
            abstractC5300a = "\"";
            sb2.append("\"");
            sb2.append(C9468m.m28161a((String) obj));
        }
        sb2.append(abstractC5300a);
    }

    private static final void zaG(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + str + ") has a null value, but expected a primitive");
        }
    }

    public <T extends AbstractC5300a> void addConcreteTypeArrayInternal(a aVar, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends AbstractC5300a> void addConcreteTypeInternal(a aVar, String str, T t10) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, a<?, ?>> getFieldMappings();

    /* JADX INFO: Access modifiers changed from: protected */
    public Object getFieldValue(a aVar) {
        String str = aVar.f10799f;
        if (aVar.f10801s == null) {
            return getValueObject(str);
        }
        C5276s.m13330p(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", aVar.f10799f);
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    protected abstract Object getValueObject(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isFieldSet(a aVar) {
        if (aVar.f10797d != 11) {
            return isPrimitiveFieldSet(aVar.f10799f);
        }
        if (aVar.f10798e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected abstract boolean isPrimitiveFieldSet(String str);

    protected void setBooleanInternal(a<?, ?> aVar, String str, boolean z10) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    protected void setDecodedBytesInternal(a<?, ?> aVar, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    protected void setIntegerInternal(a<?, ?> aVar, String str, int i10) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    protected void setLongInternal(a<?, ?> aVar, String str, long j10) {
        throw new UnsupportedOperationException("Long not supported");
    }

    protected void setStringInternal(a<?, ?> aVar, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    protected void setStringMapInternal(a<?, ?> aVar, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    protected void setStringsInternal(a<?, ?> aVar, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x005b. Please report as an issue. */
    public String toString() {
        String str;
        String m28126c;
        Map<String, a<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str2 : fieldMappings.keySet()) {
            a<?, ?> aVar = fieldMappings.get(str2);
            if (isFieldSet(aVar)) {
                Object zaD = zaD(aVar, getFieldValue(aVar));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\":");
                if (zaD != null) {
                    switch (aVar.f10797d) {
                        case 8:
                            sb2.append("\"");
                            m28126c = C9458c.m28126c((byte[]) zaD);
                            sb2.append(m28126c);
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            m28126c = C9458c.m28127d((byte[]) zaD);
                            sb2.append(m28126c);
                            sb2.append("\"");
                            break;
                        case 10:
                            C9469n.m28162a(sb2, (HashMap) zaD);
                            break;
                        default:
                            if (aVar.f10796c) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        zaF(sb2, aVar, obj);
                                    }
                                }
                                str = "]";
                                break;
                            } else {
                                zaF(sb2, aVar, zaD);
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

    public final void zaA(a aVar, String str) {
        if (aVar.f10804v != null) {
            zaE(aVar, str);
        } else {
            setStringInternal(aVar, aVar.f10799f, str);
        }
    }

    public final void zaB(a aVar, Map map) {
        if (aVar.f10804v != null) {
            zaE(aVar, map);
        } else {
            setStringMapInternal(aVar, aVar.f10799f, map);
        }
    }

    public final void zaC(a aVar, ArrayList arrayList) {
        if (aVar.f10804v != null) {
            zaE(aVar, arrayList);
        } else {
            setStringsInternal(aVar, aVar.f10799f, arrayList);
        }
    }

    public final void zaa(a aVar, BigDecimal bigDecimal) {
        if (aVar.f10804v != null) {
            zaE(aVar, bigDecimal);
        } else {
            zab(aVar, aVar.f10799f, bigDecimal);
        }
    }

    protected void zab(a aVar, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(a aVar, ArrayList arrayList) {
        if (aVar.f10804v != null) {
            zaE(aVar, arrayList);
        } else {
            zad(aVar, aVar.f10799f, arrayList);
        }
    }

    protected void zad(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(a aVar, BigInteger bigInteger) {
        if (aVar.f10804v != null) {
            zaE(aVar, bigInteger);
        } else {
            zaf(aVar, aVar.f10799f, bigInteger);
        }
    }

    protected void zaf(a aVar, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(a aVar, ArrayList arrayList) {
        if (aVar.f10804v != null) {
            zaE(aVar, arrayList);
        } else {
            zah(aVar, aVar.f10799f, arrayList);
        }
    }

    protected void zah(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(a aVar, boolean z10) {
        if (aVar.f10804v != null) {
            zaE(aVar, Boolean.valueOf(z10));
        } else {
            setBooleanInternal(aVar, aVar.f10799f, z10);
        }
    }

    public final void zaj(a aVar, ArrayList arrayList) {
        if (aVar.f10804v != null) {
            zaE(aVar, arrayList);
        } else {
            zak(aVar, aVar.f10799f, arrayList);
        }
    }

    protected void zak(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(a aVar, byte[] bArr) {
        if (aVar.f10804v != null) {
            zaE(aVar, bArr);
        } else {
            setDecodedBytesInternal(aVar, aVar.f10799f, bArr);
        }
    }

    public final void zam(a aVar, double d10) {
        if (aVar.f10804v != null) {
            zaE(aVar, Double.valueOf(d10));
        } else {
            zan(aVar, aVar.f10799f, d10);
        }
    }

    protected void zan(a aVar, String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(a aVar, ArrayList arrayList) {
        if (aVar.f10804v != null) {
            zaE(aVar, arrayList);
        } else {
            zap(aVar, aVar.f10799f, arrayList);
        }
    }

    protected void zap(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(a aVar, float f10) {
        if (aVar.f10804v != null) {
            zaE(aVar, Float.valueOf(f10));
        } else {
            zar(aVar, aVar.f10799f, f10);
        }
    }

    protected void zar(a aVar, String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(a aVar, ArrayList arrayList) {
        if (aVar.f10804v != null) {
            zaE(aVar, arrayList);
        } else {
            zat(aVar, aVar.f10799f, arrayList);
        }
    }

    protected void zat(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(a aVar, int i10) {
        if (aVar.f10804v != null) {
            zaE(aVar, Integer.valueOf(i10));
        } else {
            setIntegerInternal(aVar, aVar.f10799f, i10);
        }
    }

    public final void zav(a aVar, ArrayList arrayList) {
        if (aVar.f10804v != null) {
            zaE(aVar, arrayList);
        } else {
            zaw(aVar, aVar.f10799f, arrayList);
        }
    }

    protected void zaw(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(a aVar, long j10) {
        if (aVar.f10804v != null) {
            zaE(aVar, Long.valueOf(j10));
        } else {
            setLongInternal(aVar, aVar.f10799f, j10);
        }
    }

    public final void zay(a aVar, ArrayList arrayList) {
        if (aVar.f10804v != null) {
            zaE(aVar, arrayList);
        } else {
            zaz(aVar, aVar.f10799f, arrayList);
        }
    }

    protected void zaz(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
