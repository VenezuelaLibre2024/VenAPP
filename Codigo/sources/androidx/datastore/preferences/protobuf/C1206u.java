package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1147a0;
import androidx.datastore.preferences.protobuf.C1156d0;
import androidx.datastore.preferences.protobuf.C1205t1;
import androidx.datastore.preferences.protobuf.C1206u.b;
import androidx.datastore.preferences.protobuf.InterfaceC1198r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.datastore.preferences.protobuf.u */
/* loaded from: classes.dex */
public final class C1206u<T extends b<T>> {

    /* renamed from: d */
    private static final C1206u f4993d = new C1206u(true);

    /* renamed from: a */
    private final C1175j1<T, Object> f4994a;

    /* renamed from: b */
    private boolean f4995b;

    /* renamed from: c */
    private boolean f4996c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.datastore.preferences.protobuf.u$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4997a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4998b;

        static {
            int[] iArr = new int[C1205t1.b.values().length];
            f4998b = iArr;
            try {
                iArr[C1205t1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4998b[C1205t1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4998b[C1205t1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4998b[C1205t1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4998b[C1205t1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4998b[C1205t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4998b[C1205t1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4998b[C1205t1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4998b[C1205t1.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4998b[C1205t1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4998b[C1205t1.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4998b[C1205t1.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4998b[C1205t1.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4998b[C1205t1.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4998b[C1205t1.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4998b[C1205t1.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4998b[C1205t1.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4998b[C1205t1.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C1205t1.c.values().length];
            f4997a = iArr2;
            try {
                iArr2[C1205t1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f4997a[C1205t1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f4997a[C1205t1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f4997a[C1205t1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f4997a[C1205t1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f4997a[C1205t1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f4997a[C1205t1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f4997a[C1205t1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f4997a[C1205t1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.u$b */
    /* loaded from: classes.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        /* renamed from: a */
        int mo6458a();

        /* renamed from: c */
        boolean mo6459c();

        /* renamed from: d */
        C1205t1.b mo6460d();

        /* renamed from: e */
        C1205t1.c mo6461e();

        /* renamed from: f */
        boolean mo6462f();

        /* renamed from: k */
        InterfaceC1198r0.a mo6463k(InterfaceC1198r0.a aVar, InterfaceC1198r0 interfaceC1198r0);
    }

    private C1206u() {
        this.f4994a = C1175j1.m5998r(16);
    }

    private C1206u(C1175j1<T, Object> c1175j1) {
        this.f4994a = c1175j1;
        m6455t();
    }

    private C1206u(boolean z10) {
        this(C1175j1.m5998r(0));
        m6455t();
    }

    /* renamed from: A */
    static void m6431A(AbstractC1176k abstractC1176k, C1205t1.b bVar, Object obj) {
        switch (a.f4998b[bVar.ordinal()]) {
            case 1:
                abstractC1176k.m6113r0(((Double) obj).doubleValue());
                return;
            case 2:
                abstractC1176k.m6121z0(((Float) obj).floatValue());
                return;
            case 3:
                abstractC1176k.m6080H0(((Long) obj).longValue());
                return;
            case 4:
                abstractC1176k.mo6099a1(((Long) obj).longValue());
                return;
            case 5:
                abstractC1176k.mo6078F0(((Integer) obj).intValue());
                return;
            case 6:
                abstractC1176k.mo6119x0(((Long) obj).longValue());
                return;
            case 7:
                abstractC1176k.mo6117v0(((Integer) obj).intValue());
                return;
            case 8:
                abstractC1176k.m6107l0(((Boolean) obj).booleanValue());
                return;
            case 9:
                abstractC1176k.m6075C0((InterfaceC1198r0) obj);
                return;
            case 10:
                abstractC1176k.mo6082J0((InterfaceC1198r0) obj);
                return;
            case 11:
                if (!(obj instanceof AbstractC1167h)) {
                    abstractC1176k.mo6094V0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC1167h)) {
                    abstractC1176k.m6108m0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                abstractC1176k.mo6097Y0(((Integer) obj).intValue());
                return;
            case 14:
                abstractC1176k.m6086N0(((Integer) obj).intValue());
                return;
            case 15:
                abstractC1176k.m6088P0(((Long) obj).longValue());
                return;
            case 16:
                abstractC1176k.m6090R0(((Integer) obj).intValue());
                return;
            case 17:
                abstractC1176k.m6092T0(((Long) obj).longValue());
                return;
            case 18:
                abstractC1176k.m6115t0(obj instanceof C1147a0.c ? ((C1147a0.c) obj).m5653a() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        abstractC1176k.mo6111p0((AbstractC1167h) obj);
    }

    /* renamed from: c */
    private static Object m6432c(Object obj) {
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
    public static int m6433d(C1205t1.b bVar, int i10, Object obj) {
        int m6039V = AbstractC1176k.m6039V(i10);
        if (bVar == C1205t1.b.GROUP) {
            m6039V *= 2;
        }
        return m6039V + m6434e(bVar, obj);
    }

    /* renamed from: e */
    static int m6434e(C1205t1.b bVar, Object obj) {
        switch (a.f4998b[bVar.ordinal()]) {
            case 1:
                return AbstractC1176k.m6056j(((Double) obj).doubleValue());
            case 2:
                return AbstractC1176k.m6064r(((Float) obj).floatValue());
            case 3:
                return AbstractC1176k.m6071y(((Long) obj).longValue());
            case 4:
                return AbstractC1176k.m6043Z(((Long) obj).longValue());
            case 5:
                return AbstractC1176k.m6069w(((Integer) obj).intValue());
            case 6:
                return AbstractC1176k.m6062p(((Long) obj).longValue());
            case 7:
                return AbstractC1176k.m6060n(((Integer) obj).intValue());
            case 8:
                return AbstractC1176k.m6048e(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC1176k.m6066t((InterfaceC1198r0) obj);
            case 10:
                return obj instanceof C1156d0 ? AbstractC1176k.m6019B((C1156d0) obj) : AbstractC1176k.m6024G((InterfaceC1198r0) obj);
            case 11:
                return obj instanceof AbstractC1167h ? AbstractC1176k.m6053h((AbstractC1167h) obj) : AbstractC1176k.m6038U((String) obj);
            case 12:
                return obj instanceof AbstractC1167h ? AbstractC1176k.m6053h((AbstractC1167h) obj) : AbstractC1176k.m6049f((byte[]) obj);
            case 13:
                return AbstractC1176k.m6041X(((Integer) obj).intValue());
            case 14:
                return AbstractC1176k.m6030M(((Integer) obj).intValue());
            case 15:
                return AbstractC1176k.m6032O(((Long) obj).longValue());
            case 16:
                return AbstractC1176k.m6034Q(((Integer) obj).intValue());
            case 17:
                return AbstractC1176k.m6036S(((Long) obj).longValue());
            case 18:
                return obj instanceof C1147a0.c ? AbstractC1176k.m6058l(((C1147a0.c) obj).m5653a()) : AbstractC1176k.m6058l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m6435f(b<?> bVar, Object obj) {
        C1205t1.b mo6460d = bVar.mo6460d();
        int mo6458a = bVar.mo6458a();
        if (!bVar.mo6459c()) {
            return m6433d(mo6460d, mo6458a, obj);
        }
        int i10 = 0;
        List list = (List) obj;
        if (bVar.mo6462f()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i10 += m6434e(mo6460d, it.next());
            }
            return AbstractC1176k.m6039V(mo6458a) + i10 + AbstractC1176k.m6028K(i10);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i10 += m6433d(mo6460d, mo6458a, it2.next());
        }
        return i10;
    }

    /* renamed from: h */
    public static <T extends b<T>> C1206u<T> m6436h() {
        return f4993d;
    }

    /* renamed from: k */
    private int m6437k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo6461e() != C1205t1.c.MESSAGE || key.mo6459c() || key.mo6462f()) {
            return m6435f(key, value);
        }
        boolean z10 = value instanceof C1156d0;
        int mo6458a = entry.getKey().mo6458a();
        return z10 ? AbstractC1176k.m6072z(mo6458a, (C1156d0) value) : AbstractC1176k.m6021D(mo6458a, (InterfaceC1198r0) value);
    }

    /* renamed from: m */
    static int m6438m(C1205t1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.m6430h();
    }

    /* renamed from: q */
    private static <T extends b<T>> boolean m6439q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo6461e() == C1205t1.c.MESSAGE) {
            boolean mo6459c = key.mo6459c();
            Object value = entry.getValue();
            if (mo6459c) {
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC1198r0) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                if (!(value instanceof InterfaceC1198r0)) {
                    if (value instanceof C1156d0) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((InterfaceC1198r0) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: r */
    private static boolean m6440r(C1205t1.b bVar, Object obj) {
        C1147a0.m5643a(obj);
        switch (a.f4997a[bVar.m6429b().ordinal()]) {
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
                return (obj instanceof AbstractC1167h) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof C1147a0.c);
            case 9:
                return (obj instanceof InterfaceC1198r0) || (obj instanceof C1156d0);
            default:
                return false;
        }
    }

    /* renamed from: v */
    private void m6441v(Map.Entry<T, Object> entry) {
        C1175j1<T, Object> c1175j1;
        Object m6432c;
        Object m6448i;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C1156d0) {
            value = ((C1156d0) value).m5685f();
        }
        if (key.mo6459c()) {
            Object m6448i2 = m6448i(key);
            if (m6448i2 == null) {
                m6448i2 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) m6448i2).add(m6432c(it.next()));
            }
            this.f4994a.put(key, m6448i2);
            return;
        }
        if (key.mo6461e() != C1205t1.c.MESSAGE || (m6448i = m6448i(key)) == null) {
            c1175j1 = this.f4994a;
            m6432c = m6432c(value);
        } else {
            m6432c = key.mo6463k(((InterfaceC1198r0) m6448i).mo6308a(), (InterfaceC1198r0) value).build();
            c1175j1 = this.f4994a;
        }
        c1175j1.put(key, m6432c);
    }

    /* renamed from: w */
    public static <T extends b<T>> C1206u<T> m6442w() {
        return new C1206u<>();
    }

    /* renamed from: y */
    private void m6443y(C1205t1.b bVar, Object obj) {
        if (!m6440r(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static void m6444z(AbstractC1176k abstractC1176k, C1205t1.b bVar, int i10, Object obj) {
        if (bVar == C1205t1.b.GROUP) {
            abstractC1176k.m6073A0(i10, (InterfaceC1198r0) obj);
        } else {
            abstractC1176k.mo6095W0(i10, m6438m(bVar, false));
            m6431A(abstractC1176k, bVar, obj);
        }
    }

    /* renamed from: a */
    public void m6445a(T t10, Object obj) {
        List list;
        if (!t10.mo6459c()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m6443y(t10.mo6460d(), obj);
        Object m6448i = m6448i(t10);
        if (m6448i == null) {
            list = new ArrayList();
            this.f4994a.put(t10, list);
        } else {
            list = (List) m6448i;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1206u<T> clone() {
        C1206u<T> m6442w = m6442w();
        for (int i10 = 0; i10 < this.f4994a.m6002l(); i10++) {
            Map.Entry<T, Object> m6001k = this.f4994a.m6001k(i10);
            m6442w.m6457x(m6001k.getKey(), m6001k.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f4994a.m6004n()) {
            m6442w.m6457x(entry.getKey(), entry.getValue());
        }
        m6442w.f4996c = this.f4996c;
        return m6442w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1206u) {
            return this.f4994a.equals(((C1206u) obj).f4994a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Iterator<Map.Entry<T, Object>> m6447g() {
        return this.f4996c ? new C1156d0.c(this.f4994a.m6000i().iterator()) : this.f4994a.m6000i().iterator();
    }

    public int hashCode() {
        return this.f4994a.hashCode();
    }

    /* renamed from: i */
    public Object m6448i(T t10) {
        Object obj = this.f4994a.get(t10);
        return obj instanceof C1156d0 ? ((C1156d0) obj).m5685f() : obj;
    }

    /* renamed from: j */
    public int m6449j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f4994a.m6002l(); i11++) {
            i10 += m6437k(this.f4994a.m6001k(i11));
        }
        Iterator<Map.Entry<T, Object>> it = this.f4994a.m6004n().iterator();
        while (it.hasNext()) {
            i10 += m6437k(it.next());
        }
        return i10;
    }

    /* renamed from: l */
    public int m6450l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f4994a.m6002l(); i11++) {
            Map.Entry<T, Object> m6001k = this.f4994a.m6001k(i11);
            i10 += m6435f(m6001k.getKey(), m6001k.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f4994a.m6004n()) {
            i10 += m6435f(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m6451n() {
        return this.f4994a.isEmpty();
    }

    /* renamed from: o */
    public boolean m6452o() {
        return this.f4995b;
    }

    /* renamed from: p */
    public boolean m6453p() {
        for (int i10 = 0; i10 < this.f4994a.m6002l(); i10++) {
            if (!m6439q(this.f4994a.m6001k(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f4994a.m6004n().iterator();
        while (it.hasNext()) {
            if (!m6439q(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public Iterator<Map.Entry<T, Object>> m6454s() {
        return this.f4996c ? new C1156d0.c(this.f4994a.entrySet().iterator()) : this.f4994a.entrySet().iterator();
    }

    /* renamed from: t */
    public void m6455t() {
        if (this.f4995b) {
            return;
        }
        this.f4994a.mo6006q();
        this.f4995b = true;
    }

    /* renamed from: u */
    public void m6456u(C1206u<T> c1206u) {
        for (int i10 = 0; i10 < c1206u.f4994a.m6002l(); i10++) {
            m6441v(c1206u.f4994a.m6001k(i10));
        }
        Iterator<Map.Entry<T, Object>> it = c1206u.f4994a.m6004n().iterator();
        while (it.hasNext()) {
            m6441v(it.next());
        }
    }

    /* renamed from: x */
    public void m6457x(T t10, Object obj) {
        if (!t10.mo6459c()) {
            m6443y(t10.mo6460d(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m6443y(t10.mo6460d(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C1156d0) {
            this.f4996c = true;
        }
        this.f4994a.put(t10, obj);
    }
}
