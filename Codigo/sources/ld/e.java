package ld;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import jd.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements jd.e, g {

    /* renamed from: a, reason: collision with root package name */
    private e f21207a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21208b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f21209c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, jd.d<?>> f21210d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, jd.f<?>> f21211e;

    /* renamed from: f, reason: collision with root package name */
    private final jd.d<Object> f21212f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f21213g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Writer writer, Map<Class<?>, jd.d<?>> map, Map<Class<?>, jd.f<?>> map2, jd.d<Object> dVar, boolean z10) {
        this.f21209c = new JsonWriter(writer);
        this.f21210d = map;
        this.f21211e = map2;
        this.f21212f = dVar;
        this.f21213g = z10;
    }

    private boolean m(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e p(String str, Object obj) {
        r();
        this.f21209c.name(str);
        if (obj != null) {
            return d(obj, false);
        }
        this.f21209c.nullValue();
        return this;
    }

    private e q(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        r();
        this.f21209c.name(str);
        return d(obj, false);
    }

    private void r() {
        if (!this.f21208b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f21207a;
        if (eVar != null) {
            eVar.r();
            this.f21207a.f21208b = false;
            this.f21207a = null;
            this.f21209c.endObject();
        }
    }

    public e a(double d10) {
        r();
        this.f21209c.value(d10);
        return this;
    }

    @Override // jd.e
    public jd.e add(jd.c cVar, double d10) {
        return f(cVar.b(), d10);
    }

    @Override // jd.e
    public jd.e add(jd.c cVar, int i10) {
        return g(cVar.b(), i10);
    }

    @Override // jd.e
    public jd.e add(jd.c cVar, long j10) {
        return h(cVar.b(), j10);
    }

    @Override // jd.e
    public jd.e add(jd.c cVar, Object obj) {
        return i(cVar.b(), obj);
    }

    @Override // jd.e
    public jd.e add(jd.c cVar, boolean z10) {
        return j(cVar.b(), z10);
    }

    public e b(int i10) {
        r();
        this.f21209c.value(i10);
        return this;
    }

    public e c(long j10) {
        r();
        this.f21209c.value(j10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e d(Object obj, boolean z10) {
        int i10 = 0;
        if (z10 && m(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new jd.b(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f21209c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f21209c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f21209c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    d(it.next(), false);
                }
                this.f21209c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f21209c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new jd.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f21209c.endObject();
                return this;
            }
            jd.d<?> dVar = this.f21210d.get(obj.getClass());
            if (dVar != null) {
                return o(dVar, obj, z10);
            }
            jd.f<?> fVar = this.f21211e.get(obj.getClass());
            if (fVar != null) {
                fVar.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return o(this.f21212f, obj, z10);
            }
            if (obj instanceof f) {
                b(((f) obj).a());
            } else {
                add(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return l((byte[]) obj);
        }
        this.f21209c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f21209c.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                c(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f21209c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f21209c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                d(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                d(obj2, false);
            }
        }
        this.f21209c.endArray();
        return this;
    }

    @Override // jd.g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public e add(String str) {
        r();
        this.f21209c.value(str);
        return this;
    }

    public e f(String str, double d10) {
        r();
        this.f21209c.name(str);
        return a(d10);
    }

    public e g(String str, int i10) {
        r();
        this.f21209c.name(str);
        return b(i10);
    }

    public e h(String str, long j10) {
        r();
        this.f21209c.name(str);
        return c(j10);
    }

    public e i(String str, Object obj) {
        return this.f21213g ? q(str, obj) : p(str, obj);
    }

    public e j(String str, boolean z10) {
        r();
        this.f21209c.name(str);
        return add(z10);
    }

    @Override // jd.g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e add(boolean z10) {
        r();
        this.f21209c.value(z10);
        return this;
    }

    public e l(byte[] bArr) {
        r();
        if (bArr == null) {
            this.f21209c.nullValue();
        } else {
            this.f21209c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        r();
        this.f21209c.flush();
    }

    e o(jd.d<Object> dVar, Object obj, boolean z10) {
        if (!z10) {
            this.f21209c.beginObject();
        }
        dVar.encode(obj, this);
        if (!z10) {
            this.f21209c.endObject();
        }
        return this;
    }
}
