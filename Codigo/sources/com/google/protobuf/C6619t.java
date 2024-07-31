package com.google.protobuf;

import com.google.protobuf.C6572d0;
import com.google.protobuf.C6619t.b;
import com.google.protobuf.C6621t1;
import com.google.protobuf.C6633z;
import com.google.protobuf.InterfaceC6614r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.t */
/* loaded from: classes2.dex */
public final class C6619t<T extends b<T>> {

    /* renamed from: d */
    private static final C6619t f14616d = new C6619t(true);

    /* renamed from: a */
    private final C6591j1<T, Object> f14617a;

    /* renamed from: b */
    private boolean f14618b;

    /* renamed from: c */
    private boolean f14619c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.protobuf.t$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14620a;

        /* renamed from: b */
        static final /* synthetic */ int[] f14621b;

        static {
            int[] iArr = new int[C6621t1.b.values().length];
            f14621b = iArr;
            try {
                iArr[C6621t1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14621b[C6621t1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14621b[C6621t1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14621b[C6621t1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14621b[C6621t1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14621b[C6621t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14621b[C6621t1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14621b[C6621t1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14621b[C6621t1.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14621b[C6621t1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14621b[C6621t1.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14621b[C6621t1.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14621b[C6621t1.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14621b[C6621t1.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14621b[C6621t1.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14621b[C6621t1.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f14621b[C6621t1.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f14621b[C6621t1.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C6621t1.c.values().length];
            f14620a = iArr2;
            try {
                iArr2[C6621t1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f14620a[C6621t1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f14620a[C6621t1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f14620a[C6621t1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f14620a[C6621t1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f14620a[C6621t1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f14620a[C6621t1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f14620a[C6621t1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f14620a[C6621t1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: com.google.protobuf.t$b */
    /* loaded from: classes2.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        /* renamed from: a */
        int mo19176a();

        /* renamed from: c */
        boolean mo19177c();

        /* renamed from: d */
        C6621t1.b mo19178d();

        /* renamed from: e */
        C6621t1.c mo19179e();

        /* renamed from: f */
        boolean mo19180f();

        /* renamed from: g */
        InterfaceC6614r0.a mo19181g(InterfaceC6614r0.a aVar, InterfaceC6614r0 interfaceC6614r0);
    }

    private C6619t() {
        this.f14617a = C6591j1.m18837r(16);
    }

    private C6619t(C6591j1<T, Object> c6591j1) {
        this.f14617a = c6591j1;
        m19173u();
    }

    private C6619t(boolean z10) {
        this(C6591j1.m18837r(0));
        m19173u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static void m19148A(AbstractC6589j abstractC6589j, C6621t1.b bVar, int i10, Object obj) {
        if (bVar == C6621t1.b.GROUP) {
            abstractC6589j.m18807z0(i10, (InterfaceC6614r0) obj);
        } else {
            abstractC6589j.mo18780V0(i10, m19156m(bVar, false));
            m19149B(abstractC6589j, bVar, obj);
        }
    }

    /* renamed from: B */
    static void m19149B(AbstractC6589j abstractC6589j, C6621t1.b bVar, Object obj) {
        switch (a.f14621b[bVar.ordinal()]) {
            case 1:
                abstractC6589j.m18798q0(((Double) obj).doubleValue());
                return;
            case 2:
                abstractC6589j.m18806y0(((Float) obj).floatValue());
                return;
            case 3:
                abstractC6589j.m18765G0(((Long) obj).longValue());
                return;
            case 4:
                abstractC6589j.mo18784Z0(((Long) obj).longValue());
                return;
            case 5:
                abstractC6589j.mo18763E0(((Integer) obj).intValue());
                return;
            case 6:
                abstractC6589j.mo18804w0(((Long) obj).longValue());
                return;
            case 7:
                abstractC6589j.mo18802u0(((Integer) obj).intValue());
                return;
            case 8:
                abstractC6589j.m18792k0(((Boolean) obj).booleanValue());
                return;
            case 9:
                abstractC6589j.m18760B0((InterfaceC6614r0) obj);
                return;
            case 10:
                abstractC6589j.mo18767I0((InterfaceC6614r0) obj);
                return;
            case 11:
                if (!(obj instanceof AbstractC6580g)) {
                    abstractC6589j.mo18779U0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC6580g)) {
                    abstractC6589j.m18793l0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                abstractC6589j.mo18782X0(((Integer) obj).intValue());
                return;
            case 14:
                abstractC6589j.m18771M0(((Integer) obj).intValue());
                return;
            case 15:
                abstractC6589j.m18773O0(((Long) obj).longValue());
                return;
            case 16:
                abstractC6589j.m18775Q0(((Integer) obj).intValue());
                return;
            case 17:
                abstractC6589j.m18777S0(((Long) obj).longValue());
                return;
            case 18:
                abstractC6589j.m18800s0(obj instanceof C6633z.c ? ((C6633z.c) obj).mo19357a() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        abstractC6589j.mo18796o0((AbstractC6580g) obj);
    }

    /* renamed from: c */
    private static Object m19150c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m19151d(C6621t1.b bVar, int i10, Object obj) {
        int m18725U = AbstractC6589j.m18725U(i10);
        if (bVar == C6621t1.b.GROUP) {
            m18725U *= 2;
        }
        return m18725U + m19152e(bVar, obj);
    }

    /* renamed from: e */
    static int m19152e(C6621t1.b bVar, Object obj) {
        switch (a.f14621b[bVar.ordinal()]) {
            case 1:
                return AbstractC6589j.m18742j(((Double) obj).doubleValue());
            case 2:
                return AbstractC6589j.m18750r(((Float) obj).floatValue());
            case 3:
                return AbstractC6589j.m18757y(((Long) obj).longValue());
            case 4:
                return AbstractC6589j.m18729Y(((Long) obj).longValue());
            case 5:
                return AbstractC6589j.m18755w(((Integer) obj).intValue());
            case 6:
                return AbstractC6589j.m18748p(((Long) obj).longValue());
            case 7:
                return AbstractC6589j.m18746n(((Integer) obj).intValue());
            case 8:
                return AbstractC6589j.m18734e(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC6589j.m18752t((InterfaceC6614r0) obj);
            case 10:
                return obj instanceof C6572d0 ? AbstractC6589j.m18706B((C6572d0) obj) : AbstractC6589j.m18711G((InterfaceC6614r0) obj);
            case 11:
                return obj instanceof AbstractC6580g ? AbstractC6589j.m18740h((AbstractC6580g) obj) : AbstractC6589j.m18724T((String) obj);
            case 12:
                return obj instanceof AbstractC6580g ? AbstractC6589j.m18740h((AbstractC6580g) obj) : AbstractC6589j.m18736f((byte[]) obj);
            case 13:
                return AbstractC6589j.m18727W(((Integer) obj).intValue());
            case 14:
                return AbstractC6589j.m18716L(((Integer) obj).intValue());
            case 15:
                return AbstractC6589j.m18718N(((Long) obj).longValue());
            case 16:
                return AbstractC6589j.m18720P(((Integer) obj).intValue());
            case 17:
                return AbstractC6589j.m18722R(((Long) obj).longValue());
            case 18:
                return obj instanceof C6633z.c ? AbstractC6589j.m18744l(((C6633z.c) obj).mo19357a()) : AbstractC6589j.m18744l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m19153f(b<?> bVar, Object obj) {
        C6621t1.b mo19178d = bVar.mo19178d();
        int mo19176a = bVar.mo19176a();
        if (!bVar.mo19177c()) {
            return m19151d(mo19178d, mo19176a, obj);
        }
        int i10 = 0;
        List list = (List) obj;
        if (bVar.mo19180f()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i10 += m19152e(mo19178d, it.next());
            }
            return AbstractC6589j.m18725U(mo19176a) + i10 + AbstractC6589j.m18727W(i10);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i10 += m19151d(mo19178d, mo19176a, it2.next());
        }
        return i10;
    }

    /* renamed from: h */
    public static <T extends b<T>> C6619t<T> m19154h() {
        return f14616d;
    }

    /* renamed from: k */
    private int m19155k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo19179e() != C6621t1.c.MESSAGE || key.mo19177c() || key.mo19180f()) {
            return m19153f(key, value);
        }
        boolean z10 = value instanceof C6572d0;
        int mo19176a = entry.getKey().mo19176a();
        return z10 ? AbstractC6589j.m18758z(mo19176a, (C6572d0) value) : AbstractC6589j.m18708D(mo19176a, (InterfaceC6614r0) value);
    }

    /* renamed from: m */
    static int m19156m(C6621t1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.m19193i();
    }

    /* renamed from: q */
    private static <T extends b<T>> boolean m19157q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo19179e() != C6621t1.c.MESSAGE) {
            return true;
        }
        boolean mo19177c = key.mo19177c();
        Object value = entry.getValue();
        if (!mo19177c) {
            return m19158r(value);
        }
        Iterator it = ((List) value).iterator();
        while (it.hasNext()) {
            if (!m19158r(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    private static boolean m19158r(Object obj) {
        if (obj instanceof InterfaceC6617s0) {
            return ((InterfaceC6617s0) obj).isInitialized();
        }
        if (obj instanceof C6572d0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: s */
    private static boolean m19159s(C6621t1.b bVar, Object obj) {
        C6633z.m19347a(obj);
        switch (a.f14620a[bVar.m19192h().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC6580g) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof C6633z.c);
            case 9:
                return (obj instanceof InterfaceC6614r0) || (obj instanceof C6572d0);
            default:
                return false;
        }
    }

    /* renamed from: w */
    private void m19160w(Map.Entry<T, Object> entry) {
        C6591j1<T, Object> c6591j1;
        Object m19150c;
        Object m19166i;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C6572d0) {
            value = ((C6572d0) value).m18423f();
        }
        if (key.mo19177c()) {
            Object m19166i2 = m19166i(key);
            if (m19166i2 == null) {
                m19166i2 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) m19166i2).add(m19150c(it.next()));
            }
            this.f14617a.put(key, m19166i2);
            return;
        }
        if (key.mo19179e() != C6621t1.c.MESSAGE || (m19166i = m19166i(key)) == null) {
            c6591j1 = this.f14617a;
            m19150c = m19150c(value);
        } else {
            m19150c = key.mo19181g(((InterfaceC6614r0) m19166i).mo19032a(), (InterfaceC6614r0) value).build();
            c6591j1 = this.f14617a;
        }
        c6591j1.put(key, m19150c);
    }

    /* renamed from: x */
    public static <T extends b<T>> C6619t<T> m19161x() {
        return new C6619t<>();
    }

    /* renamed from: z */
    private void m19162z(T t10, Object obj) {
        if (!m19159s(t10.mo19178d(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.mo19176a()), t10.mo19178d().m19192h(), obj.getClass().getName()));
        }
    }

    /* renamed from: a */
    public void m19163a(T t10, Object obj) {
        List list;
        if (!t10.mo19177c()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m19162z(t10, obj);
        Object m19166i = m19166i(t10);
        if (m19166i == null) {
            list = new ArrayList();
            this.f14617a.put(t10, list);
        } else {
            list = (List) m19166i;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6619t<T> clone() {
        C6619t<T> m19161x = m19161x();
        for (int i10 = 0; i10 < this.f14617a.m18841l(); i10++) {
            Map.Entry<T, Object> m18840k = this.f14617a.m18840k(i10);
            m19161x.m19175y(m18840k.getKey(), m18840k.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f14617a.m18843n()) {
            m19161x.m19175y(entry.getKey(), entry.getValue());
        }
        m19161x.f14619c = this.f14619c;
        return m19161x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6619t) {
            return this.f14617a.equals(((C6619t) obj).f14617a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Iterator<Map.Entry<T, Object>> m19165g() {
        return this.f14619c ? new C6572d0.c(this.f14617a.m18839i().iterator()) : this.f14617a.m18839i().iterator();
    }

    public int hashCode() {
        return this.f14617a.hashCode();
    }

    /* renamed from: i */
    public Object m19166i(T t10) {
        Object obj = this.f14617a.get(t10);
        return obj instanceof C6572d0 ? ((C6572d0) obj).m18423f() : obj;
    }

    /* renamed from: j */
    public int m19167j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f14617a.m18841l(); i11++) {
            i10 += m19155k(this.f14617a.m18840k(i11));
        }
        Iterator<Map.Entry<T, Object>> it = this.f14617a.m18843n().iterator();
        while (it.hasNext()) {
            i10 += m19155k(it.next());
        }
        return i10;
    }

    /* renamed from: l */
    public int m19168l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f14617a.m18841l(); i11++) {
            Map.Entry<T, Object> m18840k = this.f14617a.m18840k(i11);
            i10 += m19153f(m18840k.getKey(), m18840k.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f14617a.m18843n()) {
            i10 += m19153f(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m19169n() {
        return this.f14617a.isEmpty();
    }

    /* renamed from: o */
    public boolean m19170o() {
        return this.f14618b;
    }

    /* renamed from: p */
    public boolean m19171p() {
        for (int i10 = 0; i10 < this.f14617a.m18841l(); i10++) {
            if (!m19157q(this.f14617a.m18840k(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f14617a.m18843n().iterator();
        while (it.hasNext()) {
            if (!m19157q(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public Iterator<Map.Entry<T, Object>> m19172t() {
        return this.f14619c ? new C6572d0.c(this.f14617a.entrySet().iterator()) : this.f14617a.entrySet().iterator();
    }

    /* renamed from: u */
    public void m19173u() {
        if (this.f14618b) {
            return;
        }
        for (int i10 = 0; i10 < this.f14617a.m18841l(); i10++) {
            Map.Entry<T, Object> m18840k = this.f14617a.m18840k(i10);
            if (m18840k.getValue() instanceof AbstractC6629x) {
                ((AbstractC6629x) m18840k.getValue()).m19302O();
            }
        }
        this.f14617a.mo18845q();
        this.f14618b = true;
    }

    /* renamed from: v */
    public void m19174v(C6619t<T> c6619t) {
        for (int i10 = 0; i10 < c6619t.f14617a.m18841l(); i10++) {
            m19160w(c6619t.f14617a.m18840k(i10));
        }
        Iterator<Map.Entry<T, Object>> it = c6619t.f14617a.m18843n().iterator();
        while (it.hasNext()) {
            m19160w(it.next());
        }
    }

    /* renamed from: y */
    public void m19175y(T t10, Object obj) {
        if (!t10.mo19177c()) {
            m19162z(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m19162z(t10, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C6572d0) {
            this.f14619c = true;
        }
        this.f14617a.put(t10, obj);
    }
}
