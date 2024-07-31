package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.common.server.response.AbstractC5300a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import la.C9457b;
import la.C9458c;
import la.C9468m;
import la.C9469n;
import p081ea.C7139b;
import p081ea.C7140c;

/* renamed from: com.google.android.gms.common.server.response.c */
/* loaded from: classes.dex */
public class C5302c extends AbstractC5301b {
    public static final Parcelable.Creator<C5302c> CREATOR = new C5310k();

    /* renamed from: a */
    private final int f10805a;

    /* renamed from: b */
    private final Parcel f10806b;

    /* renamed from: c */
    private final int f10807c = 2;

    /* renamed from: d */
    private final C5307h f10808d;

    /* renamed from: e */
    private final String f10809e;

    /* renamed from: f */
    private int f10810f;

    /* renamed from: r */
    private int f10811r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5302c(int i10, Parcel parcel, C5307h c5307h) {
        this.f10805a = i10;
        this.f10806b = (Parcel) C5276s.m13324j(parcel);
        this.f10808d = c5307h;
        this.f10809e = c5307h == null ? null : c5307h.m13392u1();
        this.f10810f = 2;
    }

    /* renamed from: b */
    private final void m13387b(AbstractC5300a.a aVar) {
        if (aVar.f10800r == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f10806b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i10 = this.f10810f;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f10811r = C7140c.m21209a(parcel);
            this.f10810f = 1;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0071. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x0195. Please report as an issue. */
    /* renamed from: c */
    private final void m13388c(StringBuilder sb2, Map map, Parcel parcel) {
        Object m21170c;
        String m28161a;
        String str;
        Object valueOf;
        Object zaD;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((AbstractC5300a.a) entry.getValue()).m13377A1(), entry);
        }
        sb2.append('{');
        int m21165O = C7139b.m21165O(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < m21165O) {
            int m21155E = C7139b.m21155E(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(C7139b.m21190w(m21155E));
            if (entry2 != null) {
                if (z10) {
                    sb2.append(",");
                }
                String str2 = (String) entry2.getKey();
                AbstractC5300a.a aVar = (AbstractC5300a.a) entry2.getValue();
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\":");
                if (aVar.m13384I1()) {
                    int i10 = aVar.f10797d;
                    switch (i10) {
                        case 0:
                            valueOf = Integer.valueOf(C7139b.m21157G(parcel, m21155E));
                            zaD = AbstractC5300a.zaD(aVar, valueOf);
                            m13390e(sb2, aVar, zaD);
                            break;
                        case 1:
                            valueOf = C7139b.m21170c(parcel, m21155E);
                            zaD = AbstractC5300a.zaD(aVar, valueOf);
                            m13390e(sb2, aVar, zaD);
                            break;
                        case 2:
                            valueOf = Long.valueOf(C7139b.m21160J(parcel, m21155E));
                            zaD = AbstractC5300a.zaD(aVar, valueOf);
                            m13390e(sb2, aVar, zaD);
                            break;
                        case 3:
                            valueOf = Float.valueOf(C7139b.m21153C(parcel, m21155E));
                            zaD = AbstractC5300a.zaD(aVar, valueOf);
                            m13390e(sb2, aVar, zaD);
                            break;
                        case 4:
                            valueOf = Double.valueOf(C7139b.m21151A(parcel, m21155E));
                            zaD = AbstractC5300a.zaD(aVar, valueOf);
                            m13390e(sb2, aVar, zaD);
                            break;
                        case 5:
                            valueOf = C7139b.m21168a(parcel, m21155E);
                            zaD = AbstractC5300a.zaD(aVar, valueOf);
                            m13390e(sb2, aVar, zaD);
                            break;
                        case 6:
                            valueOf = Boolean.valueOf(C7139b.m21191x(parcel, m21155E));
                            zaD = AbstractC5300a.zaD(aVar, valueOf);
                            m13390e(sb2, aVar, zaD);
                            break;
                        case 7:
                            valueOf = C7139b.m21184q(parcel, m21155E);
                            zaD = AbstractC5300a.zaD(aVar, valueOf);
                            m13390e(sb2, aVar, zaD);
                            break;
                        case 8:
                        case 9:
                            zaD = AbstractC5300a.zaD(aVar, C7139b.m21174g(parcel, m21155E));
                            m13390e(sb2, aVar, zaD);
                            break;
                        case 10:
                            Bundle m21173f = C7139b.m21173f(parcel, m21155E);
                            HashMap hashMap = new HashMap();
                            for (String str3 : m21173f.keySet()) {
                                hashMap.put(str3, (String) C5276s.m13324j(m21173f.getString(str3)));
                            }
                            zaD = AbstractC5300a.zaD(aVar, hashMap);
                            m13390e(sb2, aVar, zaD);
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i10);
                    }
                } else {
                    if (aVar.f10798e) {
                        sb2.append("[");
                        switch (aVar.f10797d) {
                            case 0:
                                C9457b.m28119e(sb2, C7139b.m21178k(parcel, m21155E));
                                break;
                            case 1:
                                C9457b.m28121g(sb2, C7139b.m21171d(parcel, m21155E));
                                break;
                            case 2:
                                C9457b.m28120f(sb2, C7139b.m21180m(parcel, m21155E));
                                break;
                            case 3:
                                C9457b.m28118d(sb2, C7139b.m21177j(parcel, m21155E));
                                break;
                            case 4:
                                C9457b.m28117c(sb2, C7139b.m21176i(parcel, m21155E));
                                break;
                            case 5:
                                C9457b.m28121g(sb2, C7139b.m21169b(parcel, m21155E));
                                break;
                            case 6:
                                C9457b.m28122h(sb2, C7139b.m21172e(parcel, m21155E));
                                break;
                            case 7:
                                C9457b.m28123i(sb2, C7139b.m21185r(parcel, m21155E));
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                Parcel[] m21182o = C7139b.m21182o(parcel, m21155E);
                                int length = m21182o.length;
                                for (int i11 = 0; i11 < length; i11++) {
                                    if (i11 > 0) {
                                        sb2.append(",");
                                    }
                                    m21182o[i11].setDataPosition(0);
                                    m13388c(sb2, aVar.m13382G1(), m21182o[i11]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        str = "]";
                    } else {
                        switch (aVar.f10797d) {
                            case 0:
                                sb2.append(C7139b.m21157G(parcel, m21155E));
                                break;
                            case 1:
                                m21170c = C7139b.m21170c(parcel, m21155E);
                                sb2.append(m21170c);
                                break;
                            case 2:
                                sb2.append(C7139b.m21160J(parcel, m21155E));
                                break;
                            case 3:
                                sb2.append(C7139b.m21153C(parcel, m21155E));
                                break;
                            case 4:
                                sb2.append(C7139b.m21151A(parcel, m21155E));
                                break;
                            case 5:
                                m21170c = C7139b.m21168a(parcel, m21155E);
                                sb2.append(m21170c);
                                break;
                            case 6:
                                sb2.append(C7139b.m21191x(parcel, m21155E));
                                break;
                            case 7:
                                String m21184q = C7139b.m21184q(parcel, m21155E);
                                sb2.append("\"");
                                m28161a = C9468m.m28161a(m21184q);
                                sb2.append(m28161a);
                                sb2.append("\"");
                                break;
                            case 8:
                                byte[] m21174g = C7139b.m21174g(parcel, m21155E);
                                sb2.append("\"");
                                m28161a = C9458c.m28126c(m21174g);
                                sb2.append(m28161a);
                                sb2.append("\"");
                                break;
                            case 9:
                                byte[] m21174g2 = C7139b.m21174g(parcel, m21155E);
                                sb2.append("\"");
                                m28161a = C9458c.m28127d(m21174g2);
                                sb2.append(m28161a);
                                sb2.append("\"");
                                break;
                            case 10:
                                Bundle m21173f2 = C7139b.m21173f(parcel, m21155E);
                                Set<String> keySet = m21173f2.keySet();
                                sb2.append("{");
                                boolean z11 = true;
                                for (String str4 : keySet) {
                                    if (!z11) {
                                        sb2.append(",");
                                    }
                                    sb2.append("\"");
                                    sb2.append(str4);
                                    sb2.append("\":\"");
                                    sb2.append(C9468m.m28161a(m21173f2.getString(str4)));
                                    sb2.append("\"");
                                    z11 = false;
                                }
                                str = "}";
                                break;
                            case 11:
                                Parcel m21181n = C7139b.m21181n(parcel, m21155E);
                                m21181n.setDataPosition(0);
                                m13388c(sb2, aVar.m13382G1(), m21181n);
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
        if (parcel.dataPosition() == m21165O) {
            sb2.append('}');
            return;
        }
        throw new C7139b.a("Overread allowed size end=" + m21165O, parcel);
    }

    /* renamed from: d */
    private static final void m13389d(StringBuilder sb2, int i10, Object obj) {
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
                sb2.append(C9468m.m28161a(C5276s.m13324j(obj).toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                sb2.append(C9458c.m28126c((byte[]) obj));
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                sb2.append(C9458c.m28127d((byte[]) obj));
                sb2.append("\"");
                return;
            case 10:
                C9469n.m28162a(sb2, (HashMap) C5276s.m13324j(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i10);
        }
    }

    /* renamed from: e */
    private static final void m13390e(StringBuilder sb2, AbstractC5300a.a aVar, Object obj) {
        if (!aVar.f10796c) {
            m13389d(sb2, aVar.f10795b, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            m13389d(sb2, aVar.f10795b, arrayList.get(i10));
        }
        sb2.append("]");
    }

    /* renamed from: a */
    public final Parcel m13391a() {
        int i10 = this.f10810f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7140c.m21210b(this.f10806b, this.f10811r);
            }
            return this.f10806b;
        }
        int m21209a = C7140c.m21209a(this.f10806b);
        this.f10811r = m21209a;
        C7140c.m21210b(this.f10806b, m21209a);
        this.f10810f = 2;
        return this.f10806b;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final <T extends AbstractC5300a> void addConcreteTypeArrayInternal(AbstractC5300a.a aVar, String str, ArrayList<T> arrayList) {
        m13387b(aVar);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) C5276s.m13324j(arrayList)).size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((C5302c) arrayList.get(i10)).m13391a());
        }
        C7140c.m21197D(this.f10806b, aVar.m13377A1(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final <T extends AbstractC5300a> void addConcreteTypeInternal(AbstractC5300a.a aVar, String str, T t10) {
        m13387b(aVar);
        C7140c.m21196C(this.f10806b, aVar.m13377A1(), ((C5302c) t10).m13391a(), true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final Map<String, AbstractC5300a.a<?, ?>> getFieldMappings() {
        C5307h c5307h = this.f10808d;
        if (c5307h == null) {
            return null;
        }
        return c5307h.m13393v1((String) C5276s.m13324j(this.f10809e));
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5301b, com.google.android.gms.common.server.response.AbstractC5300a
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5301b, com.google.android.gms.common.server.response.AbstractC5300a
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void setBooleanInternal(AbstractC5300a.a<?, ?> aVar, String str, boolean z10) {
        m13387b(aVar);
        C7140c.m21215g(this.f10806b, aVar.m13377A1(), z10);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void setDecodedBytesInternal(AbstractC5300a.a<?, ?> aVar, String str, byte[] bArr) {
        m13387b(aVar);
        C7140c.m21220l(this.f10806b, aVar.m13377A1(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void setIntegerInternal(AbstractC5300a.a<?, ?> aVar, String str, int i10) {
        m13387b(aVar);
        C7140c.m21229u(this.f10806b, aVar.m13377A1(), i10);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void setLongInternal(AbstractC5300a.a<?, ?> aVar, String str, long j10) {
        m13387b(aVar);
        C7140c.m21234z(this.f10806b, aVar.m13377A1(), j10);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void setStringInternal(AbstractC5300a.a<?, ?> aVar, String str, String str2) {
        m13387b(aVar);
        C7140c.m21200G(this.f10806b, aVar.m13377A1(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void setStringMapInternal(AbstractC5300a.a<?, ?> aVar, String str, Map<String, String> map) {
        m13387b(aVar);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) C5276s.m13324j(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        C7140c.m21218j(this.f10806b, aVar.m13377A1(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void setStringsInternal(AbstractC5300a.a<?, ?> aVar, String str, ArrayList<String> arrayList) {
        m13387b(aVar);
        int size = ((ArrayList) C5276s.m13324j(arrayList)).size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = arrayList.get(i10);
        }
        C7140c.m21201H(this.f10806b, aVar.m13377A1(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    public final String toString() {
        C5276s.m13325k(this.f10808d, "Cannot convert to JSON on client side.");
        Parcel m13391a = m13391a();
        m13391a.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        m13388c(sb2, (Map) C5276s.m13324j(this.f10808d.m13393v1((String) C5276s.m13324j(this.f10809e))), m13391a);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f10805a);
        C7140c.m21196C(parcel, 2, m13391a(), false);
        C7140c.m21198E(parcel, 3, this.f10807c != 0 ? this.f10808d : null, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void zab(AbstractC5300a.a aVar, String str, BigDecimal bigDecimal) {
        m13387b(aVar);
        C7140c.m21211c(this.f10806b, aVar.m13377A1(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void zad(AbstractC5300a.a aVar, String str, ArrayList arrayList) {
        m13387b(aVar);
        int size = ((ArrayList) C5276s.m13324j(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = (BigDecimal) arrayList.get(i10);
        }
        C7140c.m21212d(this.f10806b, aVar.m13377A1(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void zaf(AbstractC5300a.a aVar, String str, BigInteger bigInteger) {
        m13387b(aVar);
        C7140c.m21213e(this.f10806b, aVar.m13377A1(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void zah(AbstractC5300a.a aVar, String str, ArrayList arrayList) {
        m13387b(aVar);
        int size = ((ArrayList) C5276s.m13324j(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = (BigInteger) arrayList.get(i10);
        }
        C7140c.m21214f(this.f10806b, aVar.m13377A1(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void zak(AbstractC5300a.a aVar, String str, ArrayList arrayList) {
        m13387b(aVar);
        int size = ((ArrayList) C5276s.m13324j(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue();
        }
        C7140c.m21216h(this.f10806b, aVar.m13377A1(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void zan(AbstractC5300a.a aVar, String str, double d10) {
        m13387b(aVar);
        C7140c.m21222n(this.f10806b, aVar.m13377A1(), d10);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void zap(AbstractC5300a.a aVar, String str, ArrayList arrayList) {
        m13387b(aVar);
        int size = ((ArrayList) C5276s.m13324j(arrayList)).size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        C7140c.m21223o(this.f10806b, aVar.m13377A1(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void zar(AbstractC5300a.a aVar, String str, float f10) {
        m13387b(aVar);
        C7140c.m21225q(this.f10806b, aVar.m13377A1(), f10);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void zat(AbstractC5300a.a aVar, String str, ArrayList arrayList) {
        m13387b(aVar);
        int size = ((ArrayList) C5276s.m13324j(arrayList)).size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = ((Float) arrayList.get(i10)).floatValue();
        }
        C7140c.m21226r(this.f10806b, aVar.m13377A1(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void zaw(AbstractC5300a.a aVar, String str, ArrayList arrayList) {
        m13387b(aVar);
        int size = ((ArrayList) C5276s.m13324j(arrayList)).size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        C7140c.m21230v(this.f10806b, aVar.m13377A1(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.AbstractC5300a
    protected final void zaz(AbstractC5300a.a aVar, String str, ArrayList arrayList) {
        m13387b(aVar);
        int size = ((ArrayList) C5276s.m13324j(arrayList)).size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        C7140c.m21194A(this.f10806b, aVar.m13377A1(), jArr, true);
    }
}
