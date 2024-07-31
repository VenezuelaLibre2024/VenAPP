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
import md.InterfaceC9569d;
import p181jd.C9038b;
import p181jd.C9039c;
import p181jd.InterfaceC9040d;
import p181jd.InterfaceC9041e;
import p181jd.InterfaceC9042f;

/* renamed from: md.f */
/* loaded from: classes.dex */
final class C9571f implements InterfaceC9041e {

    /* renamed from: f */
    private static final Charset f23279f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C9039c f23280g = C9039c.m26547a(Constants.KEY).m26552b(C9566a.m28451b().m28453c(1).m28452a()).m26551a();

    /* renamed from: h */
    private static final C9039c f23281h = C9039c.m26547a("value").m26552b(C9566a.m28451b().m28453c(2).m28452a()).m26551a();

    /* renamed from: i */
    private static final InterfaceC9040d<Map.Entry<Object, Object>> f23282i = new InterfaceC9040d() { // from class: md.e
        @Override // p181jd.InterfaceC9040d
        public final void encode(Object obj, Object obj2) {
            C9571f.m28462r((Map.Entry) obj, (InterfaceC9041e) obj2);
        }
    };

    /* renamed from: a */
    private OutputStream f23283a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC9040d<?>> f23284b;

    /* renamed from: c */
    private final Map<Class<?>, InterfaceC9042f<?>> f23285c;

    /* renamed from: d */
    private final InterfaceC9040d<Object> f23286d;

    /* renamed from: e */
    private final C9574i f23287e = new C9574i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: md.f$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23288a;

        static {
            int[] iArr = new int[InterfaceC9569d.a.values().length];
            f23288a = iArr;
            try {
                iArr[InterfaceC9569d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23288a[InterfaceC9569d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23288a[InterfaceC9569d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9571f(OutputStream outputStream, Map<Class<?>, InterfaceC9040d<?>> map, Map<Class<?>, InterfaceC9042f<?>> map2, InterfaceC9040d<Object> interfaceC9040d) {
        this.f23283a = outputStream;
        this.f23284b = map;
        this.f23285c = map2;
        this.f23286d = interfaceC9040d;
    }

    /* renamed from: k */
    private static ByteBuffer m28456k(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: l */
    private <T> long m28457l(InterfaceC9040d<T> interfaceC9040d, T t10) {
        C9567b c9567b = new C9567b();
        try {
            OutputStream outputStream = this.f23283a;
            this.f23283a = c9567b;
            try {
                interfaceC9040d.encode(t10, this);
                this.f23283a = outputStream;
                long m28454a = c9567b.m28454a();
                c9567b.close();
                return m28454a;
            } catch (Throwable th2) {
                this.f23283a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c9567b.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: m */
    private <T> C9571f m28458m(InterfaceC9040d<T> interfaceC9040d, C9039c c9039c, T t10, boolean z10) {
        long m28457l = m28457l(interfaceC9040d, t10);
        if (z10 && m28457l == 0) {
            return this;
        }
        m28463s((m28461q(c9039c) << 3) | 2);
        m28464t(m28457l);
        interfaceC9040d.encode(t10, this);
        return this;
    }

    /* renamed from: n */
    private <T> C9571f m28459n(InterfaceC9042f<T> interfaceC9042f, C9039c c9039c, T t10, boolean z10) {
        this.f23287e.m28484b(c9039c, z10);
        interfaceC9042f.encode(t10, this.f23287e);
        return this;
    }

    /* renamed from: p */
    private static InterfaceC9569d m28460p(C9039c c9039c) {
        InterfaceC9569d interfaceC9569d = (InterfaceC9569d) c9039c.m26550c(InterfaceC9569d.class);
        if (interfaceC9569d != null) {
            return interfaceC9569d;
        }
        throw new C9038b("Field has no @Protobuf config");
    }

    /* renamed from: q */
    private static int m28461q(C9039c c9039c) {
        InterfaceC9569d interfaceC9569d = (InterfaceC9569d) c9039c.m26550c(InterfaceC9569d.class);
        if (interfaceC9569d != null) {
            return interfaceC9569d.tag();
        }
        throw new C9038b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m28462r(Map.Entry entry, InterfaceC9041e interfaceC9041e) {
        interfaceC9041e.add(f23280g, entry.getKey());
        interfaceC9041e.add(f23281h, entry.getValue());
    }

    /* renamed from: s */
    private void m28463s(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f23283a.write((i10 & 127) | RecognitionOptions.ITF);
            i10 >>>= 7;
        }
        this.f23283a.write(i10 & 127);
    }

    /* renamed from: t */
    private void m28464t(long j10) {
        while (((-128) & j10) != 0) {
            this.f23283a.write((((int) j10) & 127) | RecognitionOptions.ITF);
            j10 >>>= 7;
        }
        this.f23283a.write(((int) j10) & 127);
    }

    @Override // p181jd.InterfaceC9041e
    public InterfaceC9041e add(C9039c c9039c, double d10) {
        return m28465b(c9039c, d10, true);
    }

    @Override // p181jd.InterfaceC9041e
    public InterfaceC9041e add(C9039c c9039c, Object obj) {
        return m28467d(c9039c, obj, true);
    }

    /* renamed from: b */
    InterfaceC9041e m28465b(C9039c c9039c, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        m28463s((m28461q(c9039c) << 3) | 1);
        this.f23283a.write(m28456k(8).putDouble(d10).array());
        return this;
    }

    /* renamed from: c */
    InterfaceC9041e m28466c(C9039c c9039c, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        m28463s((m28461q(c9039c) << 3) | 5);
        this.f23283a.write(m28456k(4).putFloat(f10).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC9041e m28467d(C9039c c9039c, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            m28463s((m28461q(c9039c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f23279f);
            m28463s(bytes.length);
            this.f23283a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m28467d(c9039c, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m28458m(f23282i, c9039c, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return m28465b(c9039c, ((Double) obj).doubleValue(), z10);
        }
        if (obj instanceof Float) {
            return m28466c(c9039c, ((Float) obj).floatValue(), z10);
        }
        if (obj instanceof Number) {
            return m28471h(c9039c, ((Number) obj).longValue(), z10);
        }
        if (obj instanceof Boolean) {
            return m28473j(c9039c, ((Boolean) obj).booleanValue(), z10);
        }
        if (!(obj instanceof byte[])) {
            InterfaceC9040d<?> interfaceC9040d = this.f23284b.get(obj.getClass());
            if (interfaceC9040d != null) {
                return m28458m(interfaceC9040d, c9039c, obj, z10);
            }
            InterfaceC9042f<?> interfaceC9042f = this.f23285c.get(obj.getClass());
            return interfaceC9042f != null ? m28459n(interfaceC9042f, c9039c, obj, z10) : obj instanceof InterfaceC9568c ? add(c9039c, ((InterfaceC9568c) obj).mo27105a()) : obj instanceof Enum ? add(c9039c, ((Enum) obj).ordinal()) : m28458m(this.f23286d, c9039c, obj, z10);
        }
        byte[] bArr = (byte[]) obj;
        if (z10 && bArr.length == 0) {
            return this;
        }
        m28463s((m28461q(c9039c) << 3) | 2);
        m28463s(bArr.length);
        this.f23283a.write(bArr);
        return this;
    }

    @Override // p181jd.InterfaceC9041e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C9571f add(C9039c c9039c, int i10) {
        return m28469f(c9039c, i10, true);
    }

    /* renamed from: f */
    C9571f m28469f(C9039c c9039c, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        InterfaceC9569d m28460p = m28460p(c9039c);
        int i11 = a.f23288a[m28460p.intEncoding().ordinal()];
        if (i11 == 1) {
            m28463s(m28460p.tag() << 3);
            m28463s(i10);
        } else if (i11 == 2) {
            m28463s(m28460p.tag() << 3);
            m28463s((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            m28463s((m28460p.tag() << 3) | 5);
            this.f23283a.write(m28456k(4).putInt(i10).array());
        }
        return this;
    }

    @Override // p181jd.InterfaceC9041e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C9571f add(C9039c c9039c, long j10) {
        return m28471h(c9039c, j10, true);
    }

    /* renamed from: h */
    C9571f m28471h(C9039c c9039c, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        InterfaceC9569d m28460p = m28460p(c9039c);
        int i10 = a.f23288a[m28460p.intEncoding().ordinal()];
        if (i10 == 1) {
            m28463s(m28460p.tag() << 3);
            m28464t(j10);
        } else if (i10 == 2) {
            m28463s(m28460p.tag() << 3);
            m28464t((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            m28463s((m28460p.tag() << 3) | 1);
            this.f23283a.write(m28456k(8).putLong(j10).array());
        }
        return this;
    }

    @Override // p181jd.InterfaceC9041e
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C9571f add(C9039c c9039c, boolean z10) {
        return m28473j(c9039c, z10, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C9571f m28473j(C9039c c9039c, boolean z10, boolean z11) {
        return m28469f(c9039c, z10 ? 1 : 0, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C9571f m28474o(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC9040d<?> interfaceC9040d = this.f23284b.get(obj.getClass());
        if (interfaceC9040d != null) {
            interfaceC9040d.encode(obj, this);
            return this;
        }
        throw new C9038b("No encoder for " + obj.getClass());
    }
}
