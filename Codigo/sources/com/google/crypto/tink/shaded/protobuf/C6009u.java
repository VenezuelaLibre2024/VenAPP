package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5950a0;
import com.google.crypto.tink.shaded.protobuf.C5959d0;
import com.google.crypto.tink.shaded.protobuf.C6008t1;
import com.google.crypto.tink.shaded.protobuf.C6009u.b;
import com.google.crypto.tink.shaded.protobuf.InterfaceC6001r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.u */
/* loaded from: classes2.dex */
public final class C6009u<T extends b<T>> {

    /* renamed from: d */
    private static final C6009u f12740d = new C6009u(true);

    /* renamed from: a */
    private final C5978j1<T, Object> f12741a;

    /* renamed from: b */
    private boolean f12742b;

    /* renamed from: c */
    private boolean f12743c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.u$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12744a;

        /* renamed from: b */
        static final /* synthetic */ int[] f12745b;

        static {
            int[] iArr = new int[C6008t1.b.values().length];
            f12745b = iArr;
            try {
                iArr[C6008t1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12745b[C6008t1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12745b[C6008t1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12745b[C6008t1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12745b[C6008t1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12745b[C6008t1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12745b[C6008t1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12745b[C6008t1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12745b[C6008t1.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12745b[C6008t1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12745b[C6008t1.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12745b[C6008t1.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12745b[C6008t1.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12745b[C6008t1.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12745b[C6008t1.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12745b[C6008t1.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12745b[C6008t1.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f12745b[C6008t1.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C6008t1.c.values().length];
            f12744a = iArr2;
            try {
                iArr2[C6008t1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f12744a[C6008t1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f12744a[C6008t1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f12744a[C6008t1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f12744a[C6008t1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f12744a[C6008t1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f12744a[C6008t1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f12744a[C6008t1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f12744a[C6008t1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.u$b */
    /* loaded from: classes2.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        /* renamed from: a */
        int mo16121a();

        /* renamed from: c */
        boolean mo16122c();

        /* renamed from: d */
        C6008t1.b mo16123d();

        /* renamed from: e */
        C6008t1.c mo16124e();

        /* renamed from: f */
        boolean mo16125f();

        /* renamed from: j */
        InterfaceC6001r0.a mo16126j(InterfaceC6001r0.a aVar, InterfaceC6001r0 interfaceC6001r0);
    }

    private C6009u() {
        this.f12741a = C5978j1.m15682r(16);
    }

    private C6009u(C5978j1<T, Object> c5978j1) {
        this.f12741a = c5978j1;
        m16118t();
    }

    private C6009u(boolean z10) {
        this(C5978j1.m15682r(0));
        m16118t();
    }

    /* renamed from: c */
    private static Object m16096c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: d */
    static int m16097d(C6008t1.b bVar, int i10, Object obj) {
        int m15721T = AbstractC5979k.m15721T(i10);
        if (bVar == C6008t1.b.GROUP) {
            m15721T *= 2;
        }
        return m15721T + m16098e(bVar, obj);
    }

    /* renamed from: e */
    static int m16098e(C6008t1.b bVar, Object obj) {
        switch (a.f12745b[bVar.ordinal()]) {
            case 1:
                return AbstractC5979k.m15737j(((Double) obj).doubleValue());
            case 2:
                return AbstractC5979k.m15745r(((Float) obj).floatValue());
            case 3:
                return AbstractC5979k.m15752y(((Long) obj).longValue());
            case 4:
                return AbstractC5979k.m15725X(((Long) obj).longValue());
            case 5:
                return AbstractC5979k.m15750w(((Integer) obj).intValue());
            case 6:
                return AbstractC5979k.m15743p(((Long) obj).longValue());
            case 7:
                return AbstractC5979k.m15741n(((Integer) obj).intValue());
            case 8:
                return AbstractC5979k.m15732e(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC5979k.m15747t((InterfaceC6001r0) obj);
            case 10:
                return obj instanceof C5959d0 ? AbstractC5979k.m15703B((C5959d0) obj) : AbstractC5979k.m15708G((InterfaceC6001r0) obj);
            case 11:
                return obj instanceof AbstractC5970h ? AbstractC5979k.m15735h((AbstractC5970h) obj) : AbstractC5979k.m15720S((String) obj);
            case 12:
                return obj instanceof AbstractC5970h ? AbstractC5979k.m15735h((AbstractC5970h) obj) : AbstractC5979k.m15733f((byte[]) obj);
            case 13:
                return AbstractC5979k.m15723V(((Integer) obj).intValue());
            case 14:
                return AbstractC5979k.m15712K(((Integer) obj).intValue());
            case 15:
                return AbstractC5979k.m15714M(((Long) obj).longValue());
            case 16:
                return AbstractC5979k.m15716O(((Integer) obj).intValue());
            case 17:
                return AbstractC5979k.m15718Q(((Long) obj).longValue());
            case 18:
                return obj instanceof C5950a0.c ? AbstractC5979k.m15739l(((C5950a0.c) obj).mo15312a()) : AbstractC5979k.m15739l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m16099f(b<?> bVar, Object obj) {
        C6008t1.b mo16123d = bVar.mo16123d();
        int mo16121a = bVar.mo16121a();
        if (!bVar.mo16122c()) {
            return m16097d(mo16123d, mo16121a, obj);
        }
        int i10 = 0;
        List list = (List) obj;
        if (bVar.mo16125f()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i10 += m16098e(mo16123d, it.next());
            }
            return AbstractC5979k.m15721T(mo16121a) + i10 + AbstractC5979k.m15723V(i10);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i10 += m16097d(mo16123d, mo16121a, it2.next());
        }
        return i10;
    }

    /* renamed from: h */
    public static <T extends b<T>> C6009u<T> m16100h() {
        return f12740d;
    }

    /* renamed from: k */
    private int m16101k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo16124e() != C6008t1.c.MESSAGE || key.mo16122c() || key.mo16125f()) {
            return m16099f(key, value);
        }
        boolean z10 = value instanceof C5959d0;
        int mo16121a = entry.getKey().mo16121a();
        return z10 ? AbstractC5979k.m15753z(mo16121a, (C5959d0) value) : AbstractC5979k.m15705D(mo16121a, (InterfaceC6001r0) value);
    }

    /* renamed from: p */
    private static <T extends b<T>> boolean m16102p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo16124e() != C6008t1.c.MESSAGE) {
            return true;
        }
        boolean mo16122c = key.mo16122c();
        Object value = entry.getValue();
        if (!mo16122c) {
            return m16103q(value);
        }
        Iterator it = ((List) value).iterator();
        while (it.hasNext()) {
            if (!m16103q(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    private static boolean m16103q(Object obj) {
        if (obj instanceof InterfaceC6004s0) {
            return ((InterfaceC6004s0) obj).isInitialized();
        }
        if (obj instanceof C5959d0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: r */
    private static boolean m16104r(C6008t1.b bVar, Object obj) {
        C5950a0.m15302a(obj);
        switch (a.f12744a[bVar.m16095b().ordinal()]) {
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
                return (obj instanceof AbstractC5970h) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof C5950a0.c);
            case 9:
                return (obj instanceof InterfaceC6001r0) || (obj instanceof C5959d0);
            default:
                return false;
        }
    }

    /* renamed from: v */
    private void m16105v(Map.Entry<T, Object> entry) {
        C5978j1<T, Object> c5978j1;
        Object m16096c;
        Object m16111i;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C5959d0) {
            value = ((C5959d0) value).m15345f();
        }
        if (key.mo16122c()) {
            Object m16111i2 = m16111i(key);
            if (m16111i2 == null) {
                m16111i2 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) m16111i2).add(m16096c(it.next()));
            }
            this.f12741a.put(key, m16111i2);
            return;
        }
        if (key.mo16124e() != C6008t1.c.MESSAGE || (m16111i = m16111i(key)) == null) {
            c5978j1 = this.f12741a;
            m16096c = m16096c(value);
        } else {
            m16096c = key.mo16126j(((InterfaceC6001r0) m16111i).mo15967a(), (InterfaceC6001r0) value).build();
            c5978j1 = this.f12741a;
        }
        c5978j1.put(key, m16096c);
    }

    /* renamed from: w */
    public static <T extends b<T>> C6009u<T> m16106w() {
        return new C6009u<>();
    }

    /* renamed from: y */
    private void m16107y(T t10, Object obj) {
        if (!m16104r(t10.mo16123d(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.mo16121a()), t10.mo16123d().m16095b(), obj.getClass().getName()));
        }
    }

    /* renamed from: a */
    public void m16108a(T t10, Object obj) {
        List list;
        if (!t10.mo16122c()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m16107y(t10, obj);
        Object m16111i = m16111i(t10);
        if (m16111i == null) {
            list = new ArrayList();
            this.f12741a.put(t10, list);
        } else {
            list = (List) m16111i;
        }
        list.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6009u<T> clone() {
        C6009u<T> m16106w = m16106w();
        for (int i10 = 0; i10 < this.f12741a.m15686l(); i10++) {
            Map.Entry<T, Object> m15685k = this.f12741a.m15685k(i10);
            m16106w.m16120x(m15685k.getKey(), m15685k.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f12741a.m15688n()) {
            m16106w.m16120x(entry.getKey(), entry.getValue());
        }
        m16106w.f12743c = this.f12743c;
        return m16106w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6009u) {
            return this.f12741a.equals(((C6009u) obj).f12741a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Iterator<Map.Entry<T, Object>> m16110g() {
        return this.f12743c ? new C5959d0.c(this.f12741a.m15684i().iterator()) : this.f12741a.m15684i().iterator();
    }

    public int hashCode() {
        return this.f12741a.hashCode();
    }

    /* renamed from: i */
    public Object m16111i(T t10) {
        Object obj = this.f12741a.get(t10);
        return obj instanceof C5959d0 ? ((C5959d0) obj).m15345f() : obj;
    }

    /* renamed from: j */
    public int m16112j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12741a.m15686l(); i11++) {
            i10 += m16101k(this.f12741a.m15685k(i11));
        }
        Iterator<Map.Entry<T, Object>> it = this.f12741a.m15688n().iterator();
        while (it.hasNext()) {
            i10 += m16101k(it.next());
        }
        return i10;
    }

    /* renamed from: l */
    public int m16113l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12741a.m15686l(); i11++) {
            Map.Entry<T, Object> m15685k = this.f12741a.m15685k(i11);
            i10 += m16099f(m15685k.getKey(), m15685k.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f12741a.m15688n()) {
            i10 += m16099f(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean m16114m() {
        return this.f12741a.isEmpty();
    }

    /* renamed from: n */
    public boolean m16115n() {
        return this.f12742b;
    }

    /* renamed from: o */
    public boolean m16116o() {
        for (int i10 = 0; i10 < this.f12741a.m15686l(); i10++) {
            if (!m16102p(this.f12741a.m15685k(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f12741a.m15688n().iterator();
        while (it.hasNext()) {
            if (!m16102p(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public Iterator<Map.Entry<T, Object>> m16117s() {
        return this.f12743c ? new C5959d0.c(this.f12741a.entrySet().iterator()) : this.f12741a.entrySet().iterator();
    }

    /* renamed from: t */
    public void m16118t() {
        if (this.f12742b) {
            return;
        }
        for (int i10 = 0; i10 < this.f12741a.m15686l(); i10++) {
            Map.Entry<T, Object> m15685k = this.f12741a.m15685k(i10);
            if (m15685k.getValue() instanceof AbstractC6018y) {
                ((AbstractC6018y) m15685k.getValue()).m16238G();
            }
        }
        this.f12741a.mo15690q();
        this.f12742b = true;
    }

    /* renamed from: u */
    public void m16119u(C6009u<T> c6009u) {
        for (int i10 = 0; i10 < c6009u.f12741a.m15686l(); i10++) {
            m16105v(c6009u.f12741a.m15685k(i10));
        }
        Iterator<Map.Entry<T, Object>> it = c6009u.f12741a.m15688n().iterator();
        while (it.hasNext()) {
            m16105v(it.next());
        }
    }

    /* renamed from: x */
    public void m16120x(T t10, Object obj) {
        if (!t10.mo16122c()) {
            m16107y(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m16107y(t10, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C5959d0) {
            this.f12743c = true;
        }
        this.f12741a.put(t10, obj);
    }
}
