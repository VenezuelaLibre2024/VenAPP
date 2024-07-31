package com.google.protobuf;

import com.google.protobuf.d0;
import com.google.protobuf.r0;
import com.google.protobuf.t.b;
import com.google.protobuf.t1;
import com.google.protobuf.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t<T extends b<T>> {

    /* renamed from: d */
    private static final t f13342d = new t(true);

    /* renamed from: a */
    private final j1<T, Object> f13343a;

    /* renamed from: b */
    private boolean f13344b;

    /* renamed from: c */
    private boolean f13345c;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13346a;

        /* renamed from: b */
        static final /* synthetic */ int[] f13347b;

        static {
            int[] iArr = new int[t1.b.values().length];
            f13347b = iArr;
            try {
                iArr[t1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13347b[t1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13347b[t1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13347b[t1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13347b[t1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13347b[t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13347b[t1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13347b[t1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13347b[t1.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13347b[t1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13347b[t1.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13347b[t1.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13347b[t1.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13347b[t1.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13347b[t1.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13347b[t1.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f13347b[t1.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f13347b[t1.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[t1.c.values().length];
            f13346a = iArr2;
            try {
                iArr2[t1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f13346a[t1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f13346a[t1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f13346a[t1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f13346a[t1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f13346a[t1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f13346a[t1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f13346a[t1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f13346a[t1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        int a();

        boolean c();

        t1.b d();

        t1.c e();

        boolean f();

        r0.a g(r0.a aVar, r0 r0Var);
    }

    private t() {
        this.f13343a = j1.r(16);
    }

    private t(j1<T, Object> j1Var) {
        this.f13343a = j1Var;
        u();
    }

    private t(boolean z10) {
        this(j1.r(0));
        u();
    }

    public static void A(j jVar, t1.b bVar, int i10, Object obj) {
        if (bVar == t1.b.GROUP) {
            jVar.z0(i10, (r0) obj);
        } else {
            jVar.V0(i10, m(bVar, false));
            B(jVar, bVar, obj);
        }
    }

    static void B(j jVar, t1.b bVar, Object obj) {
        switch (a.f13347b[bVar.ordinal()]) {
            case 1:
                jVar.q0(((Double) obj).doubleValue());
                return;
            case 2:
                jVar.y0(((Float) obj).floatValue());
                return;
            case 3:
                jVar.G0(((Long) obj).longValue());
                return;
            case 4:
                jVar.Z0(((Long) obj).longValue());
                return;
            case 5:
                jVar.E0(((Integer) obj).intValue());
                return;
            case 6:
                jVar.w0(((Long) obj).longValue());
                return;
            case 7:
                jVar.u0(((Integer) obj).intValue());
                return;
            case 8:
                jVar.k0(((Boolean) obj).booleanValue());
                return;
            case 9:
                jVar.B0((r0) obj);
                return;
            case 10:
                jVar.I0((r0) obj);
                return;
            case 11:
                if (!(obj instanceof g)) {
                    jVar.U0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof g)) {
                    jVar.l0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                jVar.X0(((Integer) obj).intValue());
                return;
            case 14:
                jVar.M0(((Integer) obj).intValue());
                return;
            case 15:
                jVar.O0(((Long) obj).longValue());
                return;
            case 16:
                jVar.Q0(((Integer) obj).intValue());
                return;
            case 17:
                jVar.S0(((Long) obj).longValue());
                return;
            case 18:
                jVar.s0(obj instanceof z.c ? ((z.c) obj).a() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        jVar.o0((g) obj);
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int d(t1.b bVar, int i10, Object obj) {
        int U = j.U(i10);
        if (bVar == t1.b.GROUP) {
            U *= 2;
        }
        return U + e(bVar, obj);
    }

    static int e(t1.b bVar, Object obj) {
        switch (a.f13347b[bVar.ordinal()]) {
            case 1:
                return j.j(((Double) obj).doubleValue());
            case 2:
                return j.r(((Float) obj).floatValue());
            case 3:
                return j.y(((Long) obj).longValue());
            case 4:
                return j.Y(((Long) obj).longValue());
            case 5:
                return j.w(((Integer) obj).intValue());
            case 6:
                return j.p(((Long) obj).longValue());
            case 7:
                return j.n(((Integer) obj).intValue());
            case 8:
                return j.e(((Boolean) obj).booleanValue());
            case 9:
                return j.t((r0) obj);
            case 10:
                return obj instanceof d0 ? j.B((d0) obj) : j.G((r0) obj);
            case 11:
                return obj instanceof g ? j.h((g) obj) : j.T((String) obj);
            case 12:
                return obj instanceof g ? j.h((g) obj) : j.f((byte[]) obj);
            case 13:
                return j.W(((Integer) obj).intValue());
            case 14:
                return j.L(((Integer) obj).intValue());
            case 15:
                return j.N(((Long) obj).longValue());
            case 16:
                return j.P(((Integer) obj).intValue());
            case 17:
                return j.R(((Long) obj).longValue());
            case 18:
                return obj instanceof z.c ? j.l(((z.c) obj).a()) : j.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        t1.b d10 = bVar.d();
        int a10 = bVar.a();
        if (!bVar.c()) {
            return d(d10, a10, obj);
        }
        int i10 = 0;
        List list = (List) obj;
        if (bVar.f()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i10 += e(d10, it.next());
            }
            return j.U(a10) + i10 + j.W(i10);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i10 += d(d10, a10, it2.next());
        }
        return i10;
    }

    public static <T extends b<T>> t<T> h() {
        return f13342d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.e() != t1.c.MESSAGE || key.c() || key.f()) {
            return f(key, value);
        }
        boolean z10 = value instanceof d0;
        int a10 = entry.getKey().a();
        return z10 ? j.z(a10, (d0) value) : j.D(a10, (r0) value);
    }

    static int m(t1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.i();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.e() != t1.c.MESSAGE) {
            return true;
        }
        boolean c10 = key.c();
        Object value = entry.getValue();
        if (!c10) {
            return r(value);
        }
        Iterator it = ((List) value).iterator();
        while (it.hasNext()) {
            if (!r(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean r(Object obj) {
        if (obj instanceof s0) {
            return ((s0) obj).isInitialized();
        }
        if (obj instanceof d0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean s(t1.b bVar, Object obj) {
        z.a(obj);
        switch (a.f13346a[bVar.h().ordinal()]) {
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
                return (obj instanceof g) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof z.c);
            case 9:
                return (obj instanceof r0) || (obj instanceof d0);
            default:
                return false;
        }
    }

    private void w(Map.Entry<T, Object> entry) {
        j1<T, Object> j1Var;
        Object c10;
        Object i10;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof d0) {
            value = ((d0) value).f();
        }
        if (key.c()) {
            Object i11 = i(key);
            if (i11 == null) {
                i11 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) i11).add(c(it.next()));
            }
            this.f13343a.put(key, i11);
            return;
        }
        if (key.e() != t1.c.MESSAGE || (i10 = i(key)) == null) {
            j1Var = this.f13343a;
            c10 = c(value);
        } else {
            c10 = key.g(((r0) i10).a(), (r0) value).build();
            j1Var = this.f13343a;
        }
        j1Var.put(key, c10);
    }

    public static <T extends b<T>> t<T> x() {
        return new t<>();
    }

    private void z(T t10, Object obj) {
        if (!s(t10.d(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.a()), t10.d().h(), obj.getClass().getName()));
        }
    }

    public void a(T t10, Object obj) {
        List list;
        if (!t10.c()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        z(t10, obj);
        Object i10 = i(t10);
        if (i10 == null) {
            list = new ArrayList();
            this.f13343a.put(t10, list);
        } else {
            list = (List) i10;
        }
        list.add(obj);
    }

    /* renamed from: b */
    public t<T> clone() {
        t<T> x10 = x();
        for (int i10 = 0; i10 < this.f13343a.l(); i10++) {
            Map.Entry<T, Object> k10 = this.f13343a.k(i10);
            x10.y(k10.getKey(), k10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f13343a.n()) {
            x10.y(entry.getKey(), entry.getValue());
        }
        x10.f13345c = this.f13345c;
        return x10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f13343a.equals(((t) obj).f13343a);
        }
        return false;
    }

    public Iterator<Map.Entry<T, Object>> g() {
        return this.f13345c ? new d0.c(this.f13343a.i().iterator()) : this.f13343a.i().iterator();
    }

    public int hashCode() {
        return this.f13343a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f13343a.get(t10);
        return obj instanceof d0 ? ((d0) obj).f() : obj;
    }

    public int j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f13343a.l(); i11++) {
            i10 += k(this.f13343a.k(i11));
        }
        Iterator<Map.Entry<T, Object>> it = this.f13343a.n().iterator();
        while (it.hasNext()) {
            i10 += k(it.next());
        }
        return i10;
    }

    public int l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f13343a.l(); i11++) {
            Map.Entry<T, Object> k10 = this.f13343a.k(i11);
            i10 += f(k10.getKey(), k10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f13343a.n()) {
            i10 += f(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public boolean n() {
        return this.f13343a.isEmpty();
    }

    public boolean o() {
        return this.f13344b;
    }

    public boolean p() {
        for (int i10 = 0; i10 < this.f13343a.l(); i10++) {
            if (!q(this.f13343a.k(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f13343a.n().iterator();
        while (it.hasNext()) {
            if (!q(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> t() {
        return this.f13345c ? new d0.c(this.f13343a.entrySet().iterator()) : this.f13343a.entrySet().iterator();
    }

    public void u() {
        if (this.f13344b) {
            return;
        }
        for (int i10 = 0; i10 < this.f13343a.l(); i10++) {
            Map.Entry<T, Object> k10 = this.f13343a.k(i10);
            if (k10.getValue() instanceof x) {
                ((x) k10.getValue()).O();
            }
        }
        this.f13343a.q();
        this.f13344b = true;
    }

    public void v(t<T> tVar) {
        for (int i10 = 0; i10 < tVar.f13343a.l(); i10++) {
            w(tVar.f13343a.k(i10));
        }
        Iterator<Map.Entry<T, Object>> it = tVar.f13343a.n().iterator();
        while (it.hasNext()) {
            w(it.next());
        }
    }

    public void y(T t10, Object obj) {
        if (!t10.c()) {
            z(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z(t10, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof d0) {
            this.f13345c = true;
        }
        this.f13343a.put(t10, obj);
    }
}
