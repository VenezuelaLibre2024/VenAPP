package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.crypto.tink.shaded.protobuf.u.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u<T extends b<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final u f11525d = new u(true);

    /* renamed from: a, reason: collision with root package name */
    private final j1<T, Object> f11526a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11527b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11528c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11529a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11530b;

        static {
            int[] iArr = new int[t1.b.values().length];
            f11530b = iArr;
            try {
                iArr[t1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11530b[t1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11530b[t1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11530b[t1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11530b[t1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11530b[t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11530b[t1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11530b[t1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11530b[t1.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11530b[t1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11530b[t1.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11530b[t1.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11530b[t1.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11530b[t1.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11530b[t1.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11530b[t1.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11530b[t1.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f11530b[t1.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[t1.c.values().length];
            f11529a = iArr2;
            try {
                iArr2[t1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f11529a[t1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f11529a[t1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f11529a[t1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f11529a[t1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f11529a[t1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f11529a[t1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f11529a[t1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f11529a[t1.c.MESSAGE.ordinal()] = 9;
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

        r0.a j(r0.a aVar, r0 r0Var);
    }

    private u() {
        this.f11526a = j1.r(16);
    }

    private u(j1<T, Object> j1Var) {
        this.f11526a = j1Var;
        t();
    }

    private u(boolean z10) {
        this(j1.r(0));
        t();
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

    static int d(t1.b bVar, int i10, Object obj) {
        int T = k.T(i10);
        if (bVar == t1.b.GROUP) {
            T *= 2;
        }
        return T + e(bVar, obj);
    }

    static int e(t1.b bVar, Object obj) {
        switch (a.f11530b[bVar.ordinal()]) {
            case 1:
                return k.j(((Double) obj).doubleValue());
            case 2:
                return k.r(((Float) obj).floatValue());
            case 3:
                return k.y(((Long) obj).longValue());
            case 4:
                return k.X(((Long) obj).longValue());
            case 5:
                return k.w(((Integer) obj).intValue());
            case 6:
                return k.p(((Long) obj).longValue());
            case 7:
                return k.n(((Integer) obj).intValue());
            case 8:
                return k.e(((Boolean) obj).booleanValue());
            case 9:
                return k.t((r0) obj);
            case 10:
                return obj instanceof d0 ? k.B((d0) obj) : k.G((r0) obj);
            case 11:
                return obj instanceof h ? k.h((h) obj) : k.S((String) obj);
            case 12:
                return obj instanceof h ? k.h((h) obj) : k.f((byte[]) obj);
            case 13:
                return k.V(((Integer) obj).intValue());
            case 14:
                return k.K(((Integer) obj).intValue());
            case 15:
                return k.M(((Long) obj).longValue());
            case 16:
                return k.O(((Integer) obj).intValue());
            case 17:
                return k.Q(((Long) obj).longValue());
            case 18:
                return obj instanceof a0.c ? k.l(((a0.c) obj).a()) : k.l(((Integer) obj).intValue());
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
            return k.T(a10) + i10 + k.V(i10);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i10 += d(d10, a10, it2.next());
        }
        return i10;
    }

    public static <T extends b<T>> u<T> h() {
        return f11525d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.e() != t1.c.MESSAGE || key.c() || key.f()) {
            return f(key, value);
        }
        boolean z10 = value instanceof d0;
        int a10 = entry.getKey().a();
        return z10 ? k.z(a10, (d0) value) : k.D(a10, (r0) value);
    }

    private static <T extends b<T>> boolean p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.e() != t1.c.MESSAGE) {
            return true;
        }
        boolean c10 = key.c();
        Object value = entry.getValue();
        if (!c10) {
            return q(value);
        }
        Iterator it = ((List) value).iterator();
        while (it.hasNext()) {
            if (!q(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean q(Object obj) {
        if (obj instanceof s0) {
            return ((s0) obj).isInitialized();
        }
        if (obj instanceof d0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean r(t1.b bVar, Object obj) {
        a0.a(obj);
        switch (a.f11529a[bVar.b().ordinal()]) {
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
                return (obj instanceof h) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof a0.c);
            case 9:
                return (obj instanceof r0) || (obj instanceof d0);
            default:
                return false;
        }
    }

    private void v(Map.Entry<T, Object> entry) {
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
            this.f11526a.put(key, i11);
            return;
        }
        if (key.e() != t1.c.MESSAGE || (i10 = i(key)) == null) {
            j1Var = this.f11526a;
            c10 = c(value);
        } else {
            c10 = key.j(((r0) i10).a(), (r0) value).build();
            j1Var = this.f11526a;
        }
        j1Var.put(key, c10);
    }

    public static <T extends b<T>> u<T> w() {
        return new u<>();
    }

    private void y(T t10, Object obj) {
        if (!r(t10.d(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.a()), t10.d().b(), obj.getClass().getName()));
        }
    }

    public void a(T t10, Object obj) {
        List list;
        if (!t10.c()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        y(t10, obj);
        Object i10 = i(t10);
        if (i10 == null) {
            list = new ArrayList();
            this.f11526a.put(t10, list);
        } else {
            list = (List) i10;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u<T> clone() {
        u<T> w10 = w();
        for (int i10 = 0; i10 < this.f11526a.l(); i10++) {
            Map.Entry<T, Object> k10 = this.f11526a.k(i10);
            w10.x(k10.getKey(), k10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f11526a.n()) {
            w10.x(entry.getKey(), entry.getValue());
        }
        w10.f11528c = this.f11528c;
        return w10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f11526a.equals(((u) obj).f11526a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        return this.f11528c ? new d0.c(this.f11526a.i().iterator()) : this.f11526a.i().iterator();
    }

    public int hashCode() {
        return this.f11526a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f11526a.get(t10);
        return obj instanceof d0 ? ((d0) obj).f() : obj;
    }

    public int j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f11526a.l(); i11++) {
            i10 += k(this.f11526a.k(i11));
        }
        Iterator<Map.Entry<T, Object>> it = this.f11526a.n().iterator();
        while (it.hasNext()) {
            i10 += k(it.next());
        }
        return i10;
    }

    public int l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f11526a.l(); i11++) {
            Map.Entry<T, Object> k10 = this.f11526a.k(i11);
            i10 += f(k10.getKey(), k10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f11526a.n()) {
            i10 += f(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f11526a.isEmpty();
    }

    public boolean n() {
        return this.f11527b;
    }

    public boolean o() {
        for (int i10 = 0; i10 < this.f11526a.l(); i10++) {
            if (!p(this.f11526a.k(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f11526a.n().iterator();
        while (it.hasNext()) {
            if (!p(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        return this.f11528c ? new d0.c(this.f11526a.entrySet().iterator()) : this.f11526a.entrySet().iterator();
    }

    public void t() {
        if (this.f11527b) {
            return;
        }
        for (int i10 = 0; i10 < this.f11526a.l(); i10++) {
            Map.Entry<T, Object> k10 = this.f11526a.k(i10);
            if (k10.getValue() instanceof y) {
                ((y) k10.getValue()).G();
            }
        }
        this.f11526a.q();
        this.f11527b = true;
    }

    public void u(u<T> uVar) {
        for (int i10 = 0; i10 < uVar.f11526a.l(); i10++) {
            v(uVar.f11526a.k(i10));
        }
        Iterator<Map.Entry<T, Object>> it = uVar.f11526a.n().iterator();
        while (it.hasNext()) {
            v(it.next());
        }
    }

    public void x(T t10, Object obj) {
        if (!t10.c()) {
            y(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y(t10, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof d0) {
            this.f11528c = true;
        }
        this.f11526a.put(t10, obj);
    }
}
