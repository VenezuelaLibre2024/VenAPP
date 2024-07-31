package md;

import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import md.d;

/* loaded from: classes.dex */
public final class f implements jd.e {

    /* renamed from: f */
    private static final Charset f21425f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final jd.c f21426g = jd.c.a(Constants.KEY).b(md.a.b().c(1).a()).a();

    /* renamed from: h */
    private static final jd.c f21427h = jd.c.a("value").b(md.a.b().c(2).a()).a();

    /* renamed from: i */
    private static final jd.d<Map.Entry<Object, Object>> f21428i = new jd.d() { // from class: md.e
        @Override // jd.d
        public final void encode(Object obj, Object obj2) {
            f.r((Map.Entry) obj, (jd.e) obj2);
        }
    };

    /* renamed from: a */
    private OutputStream f21429a;

    /* renamed from: b */
    private final Map<Class<?>, jd.d<?>> f21430b;

    /* renamed from: c */
    private final Map<Class<?>, jd.f<?>> f21431c;

    /* renamed from: d */
    private final jd.d<Object> f21432d;

    /* renamed from: e */
    private final i f21433e = new i(this);

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21434a;

        static {
            int[] iArr = new int[d.a.values().length];
            f21434a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21434a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21434a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(OutputStream outputStream, Map<Class<?>, jd.d<?>> map, Map<Class<?>, jd.f<?>> map2, jd.d<Object> dVar) {
        this.f21429a = outputStream;
        this.f21430b = map;
        this.f21431c = map2;
        this.f21432d = dVar;
    }

    private static ByteBuffer k(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long l(jd.d<T> dVar, T t10) {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f21429a;
            this.f21429a = bVar;
            try {
                dVar.encode(t10, this);
                this.f21429a = outputStream;
                long a10 = bVar.a();
                bVar.close();
                return a10;
            } catch (Throwable th2) {
                this.f21429a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private <T> f m(jd.d<T> dVar, jd.c cVar, T t10, boolean z10) {
        long l10 = l(dVar, t10);
        if (z10 && l10 == 0) {
            return this;
        }
        s((q(cVar) << 3) | 2);
        t(l10);
        dVar.encode(t10, this);
        return this;
    }

    private <T> f n(jd.f<T> fVar, jd.c cVar, T t10, boolean z10) {
        this.f21433e.b(cVar, z10);
        fVar.encode(t10, this.f21433e);
        return this;
    }

    private static d p(jd.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new jd.b("Field has no @Protobuf config");
    }

    private static int q(jd.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new jd.b("Field has no @Protobuf config");
    }

    public static /* synthetic */ void r(Map.Entry entry, jd.e eVar) {
        eVar.add(f21426g, entry.getKey());
        eVar.add(f21427h, entry.getValue());
    }

    private void s(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f21429a.write((i10 & 127) | RecognitionOptions.ITF);
            i10 >>>= 7;
        }
        this.f21429a.write(i10 & 127);
    }

    private void t(long j10) {
        while (((-128) & j10) != 0) {
            this.f21429a.write((((int) j10) & 127) | RecognitionOptions.ITF);
            j10 >>>= 7;
        }
        this.f21429a.write(((int) j10) & 127);
    }

    @Override // jd.e
    public jd.e add(jd.c cVar, double d10) {
        return b(cVar, d10, true);
    }

    @Override // jd.e
    public jd.e add(jd.c cVar, Object obj) {
        return d(cVar, obj, true);
    }

    jd.e b(jd.c cVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        s((q(cVar) << 3) | 1);
        this.f21429a.write(k(8).putDouble(d10).array());
        return this;
    }

    jd.e c(jd.c cVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        s((q(cVar) << 3) | 5);
        this.f21429a.write(k(4).putFloat(f10).array());
        return this;
    }

    public jd.e d(jd.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            s((q(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f21425f);
            s(bytes.length);
            this.f21429a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m(f21428i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return b(cVar, ((Double) obj).doubleValue(), z10);
        }
        if (obj instanceof Float) {
            return c(cVar, ((Float) obj).floatValue(), z10);
        }
        if (obj instanceof Number) {
            return h(cVar, ((Number) obj).longValue(), z10);
        }
        if (obj instanceof Boolean) {
            return j(cVar, ((Boolean) obj).booleanValue(), z10);
        }
        if (!(obj instanceof byte[])) {
            jd.d<?> dVar = this.f21430b.get(obj.getClass());
            if (dVar != null) {
                return m(dVar, cVar, obj, z10);
            }
            jd.f<?> fVar = this.f21431c.get(obj.getClass());
            return fVar != null ? n(fVar, cVar, obj, z10) : obj instanceof c ? add(cVar, ((c) obj).a()) : obj instanceof Enum ? add(cVar, ((Enum) obj).ordinal()) : m(this.f21432d, cVar, obj, z10);
        }
        byte[] bArr = (byte[]) obj;
        if (z10 && bArr.length == 0) {
            return this;
        }
        s((q(cVar) << 3) | 2);
        s(bArr.length);
        this.f21429a.write(bArr);
        return this;
    }

    @Override // jd.e
    /* renamed from: e */
    public f add(jd.c cVar, int i10) {
        return f(cVar, i10, true);
    }

    f f(jd.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        d p10 = p(cVar);
        int i11 = a.f21434a[p10.intEncoding().ordinal()];
        if (i11 == 1) {
            s(p10.tag() << 3);
            s(i10);
        } else if (i11 == 2) {
            s(p10.tag() << 3);
            s((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            s((p10.tag() << 3) | 5);
            this.f21429a.write(k(4).putInt(i10).array());
        }
        return this;
    }

    @Override // jd.e
    /* renamed from: g */
    public f add(jd.c cVar, long j10) {
        return h(cVar, j10, true);
    }

    f h(jd.c cVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        d p10 = p(cVar);
        int i10 = a.f21434a[p10.intEncoding().ordinal()];
        if (i10 == 1) {
            s(p10.tag() << 3);
            t(j10);
        } else if (i10 == 2) {
            s(p10.tag() << 3);
            t((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            s((p10.tag() << 3) | 1);
            this.f21429a.write(k(8).putLong(j10).array());
        }
        return this;
    }

    @Override // jd.e
    /* renamed from: i */
    public f add(jd.c cVar, boolean z10) {
        return j(cVar, z10, true);
    }

    public f j(jd.c cVar, boolean z10, boolean z11) {
        return f(cVar, z10 ? 1 : 0, z11);
    }

    public f o(Object obj) {
        if (obj == null) {
            return this;
        }
        jd.d<?> dVar = this.f21430b.get(obj.getClass());
        if (dVar != null) {
            dVar.encode(obj, this);
            return this;
        }
        throw new jd.b("No encoder for " + obj.getClass());
    }
}
