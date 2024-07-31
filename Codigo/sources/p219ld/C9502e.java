package p219ld;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import p181jd.C9038b;
import p181jd.C9039c;
import p181jd.InterfaceC9040d;
import p181jd.InterfaceC9041e;
import p181jd.InterfaceC9042f;
import p181jd.InterfaceC9043g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ld.e */
/* loaded from: classes.dex */
public final class C9502e implements InterfaceC9041e, InterfaceC9043g {

    /* renamed from: a */
    private C9502e f23060a = null;

    /* renamed from: b */
    private boolean f23061b = true;

    /* renamed from: c */
    private final JsonWriter f23062c;

    /* renamed from: d */
    private final Map<Class<?>, InterfaceC9040d<?>> f23063d;

    /* renamed from: e */
    private final Map<Class<?>, InterfaceC9042f<?>> f23064e;

    /* renamed from: f */
    private final InterfaceC9040d<Object> f23065f;

    /* renamed from: g */
    private final boolean f23066g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9502e(Writer writer, Map<Class<?>, InterfaceC9040d<?>> map, Map<Class<?>, InterfaceC9042f<?>> map2, InterfaceC9040d<Object> interfaceC9040d, boolean z10) {
        this.f23062c = new JsonWriter(writer);
        this.f23063d = map;
        this.f23064e = map2;
        this.f23065f = interfaceC9040d;
        this.f23066g = z10;
    }

    /* renamed from: m */
    private boolean m28249m(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: p */
    private C9502e m28250p(String str, Object obj) {
        m28252r();
        this.f23062c.name(str);
        if (obj != null) {
            return m28256d(obj, false);
        }
        this.f23062c.nullValue();
        return this;
    }

    /* renamed from: q */
    private C9502e m28251q(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        m28252r();
        this.f23062c.name(str);
        return m28256d(obj, false);
    }

    /* renamed from: r */
    private void m28252r() {
        if (!this.f23061b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C9502e c9502e = this.f23060a;
        if (c9502e != null) {
            c9502e.m28252r();
            this.f23060a.f23061b = false;
            this.f23060a = null;
            this.f23062c.endObject();
        }
    }

    /* renamed from: a */
    public C9502e m28253a(double d10) {
        m28252r();
        this.f23062c.value(d10);
        return this;
    }

    @Override // p181jd.InterfaceC9041e
    public InterfaceC9041e add(C9039c c9039c, double d10) {
        return m28258f(c9039c.m26549b(), d10);
    }

    @Override // p181jd.InterfaceC9041e
    public InterfaceC9041e add(C9039c c9039c, int i10) {
        return m28259g(c9039c.m26549b(), i10);
    }

    @Override // p181jd.InterfaceC9041e
    public InterfaceC9041e add(C9039c c9039c, long j10) {
        return m28260h(c9039c.m26549b(), j10);
    }

    @Override // p181jd.InterfaceC9041e
    public InterfaceC9041e add(C9039c c9039c, Object obj) {
        return m28261i(c9039c.m26549b(), obj);
    }

    @Override // p181jd.InterfaceC9041e
    public InterfaceC9041e add(C9039c c9039c, boolean z10) {
        return m28262j(c9039c.m26549b(), z10);
    }

    /* renamed from: b */
    public C9502e m28254b(int i10) {
        m28252r();
        this.f23062c.value(i10);
        return this;
    }

    /* renamed from: c */
    public C9502e m28255c(long j10) {
        m28252r();
        this.f23062c.value(j10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C9502e m28256d(Object obj, boolean z10) {
        int i10 = 0;
        if (z10 && m28249m(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new C9038b(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f23062c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f23062c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f23062c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m28256d(it.next(), false);
                }
                this.f23062c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f23062c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m28261i((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new C9038b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f23062c.endObject();
                return this;
            }
            InterfaceC9040d<?> interfaceC9040d = this.f23063d.get(obj.getClass());
            if (interfaceC9040d != null) {
                return m28266o(interfaceC9040d, obj, z10);
            }
            InterfaceC9042f<?> interfaceC9042f = this.f23064e.get(obj.getClass());
            if (interfaceC9042f != null) {
                interfaceC9042f.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return m28266o(this.f23065f, obj, z10);
            }
            if (obj instanceof InterfaceC9503f) {
                m28254b(((InterfaceC9503f) obj).mo19997a());
            } else {
                add(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return m28264l((byte[]) obj);
        }
        this.f23062c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f23062c.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                m28255c(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f23062c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f23062c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                m28256d(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                m28256d(obj2, false);
            }
        }
        this.f23062c.endArray();
        return this;
    }

    @Override // p181jd.InterfaceC9043g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C9502e add(String str) {
        m28252r();
        this.f23062c.value(str);
        return this;
    }

    /* renamed from: f */
    public C9502e m28258f(String str, double d10) {
        m28252r();
        this.f23062c.name(str);
        return m28253a(d10);
    }

    /* renamed from: g */
    public C9502e m28259g(String str, int i10) {
        m28252r();
        this.f23062c.name(str);
        return m28254b(i10);
    }

    /* renamed from: h */
    public C9502e m28260h(String str, long j10) {
        m28252r();
        this.f23062c.name(str);
        return m28255c(j10);
    }

    /* renamed from: i */
    public C9502e m28261i(String str, Object obj) {
        return this.f23066g ? m28251q(str, obj) : m28250p(str, obj);
    }

    /* renamed from: j */
    public C9502e m28262j(String str, boolean z10) {
        m28252r();
        this.f23062c.name(str);
        return add(z10);
    }

    @Override // p181jd.InterfaceC9043g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C9502e add(boolean z10) {
        m28252r();
        this.f23062c.value(z10);
        return this;
    }

    /* renamed from: l */
    public C9502e m28264l(byte[] bArr) {
        m28252r();
        if (bArr == null) {
            this.f23062c.nullValue();
        } else {
            this.f23062c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m28265n() {
        m28252r();
        this.f23062c.flush();
    }

    /* renamed from: o */
    C9502e m28266o(InterfaceC9040d<Object> interfaceC9040d, Object obj, boolean z10) {
        if (!z10) {
            this.f23062c.beginObject();
        }
        interfaceC9040d.encode(obj, this);
        if (!z10) {
            this.f23062c.endObject();
        }
        return this;
    }
}
