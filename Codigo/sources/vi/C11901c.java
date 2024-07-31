package vi;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p082eb.C7153i;
import p082eb.C7159o;
import vi.AbstractC11925k;

/* renamed from: vi.c */
/* loaded from: classes3.dex */
public final class C11901c {

    /* renamed from: k */
    public static final C11901c f31481k;

    /* renamed from: a */
    private final C11946t f31482a;

    /* renamed from: b */
    private final Executor f31483b;

    /* renamed from: c */
    private final String f31484c;

    /* renamed from: d */
    private final AbstractC11898b f31485d;

    /* renamed from: e */
    private final String f31486e;

    /* renamed from: f */
    private final Object[][] f31487f;

    /* renamed from: g */
    private final List<AbstractC11925k.a> f31488g;

    /* renamed from: h */
    private final Boolean f31489h;

    /* renamed from: i */
    private final Integer f31490i;

    /* renamed from: j */
    private final Integer f31491j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vi.c$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        C11946t f31492a;

        /* renamed from: b */
        Executor f31493b;

        /* renamed from: c */
        String f31494c;

        /* renamed from: d */
        AbstractC11898b f31495d;

        /* renamed from: e */
        String f31496e;

        /* renamed from: f */
        Object[][] f31497f;

        /* renamed from: g */
        List<AbstractC11925k.a> f31498g;

        /* renamed from: h */
        Boolean f31499h;

        /* renamed from: i */
        Integer f31500i;

        /* renamed from: j */
        Integer f31501j;

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public C11901c m38098b() {
            return new C11901c(this);
        }
    }

    /* renamed from: vi.c$c */
    /* loaded from: classes3.dex */
    public static final class c<T> {

        /* renamed from: a */
        private final String f31502a;

        /* renamed from: b */
        private final T f31503b;

        private c(String str, T t10) {
            this.f31502a = str;
            this.f31503b = t10;
        }

        /* renamed from: b */
        public static <T> c<T> m38100b(String str) {
            C7159o.m21313p(str, "debugString");
            return new c<>(str, null);
        }

        public String toString() {
            return this.f31502a;
        }
    }

    static {
        b bVar = new b();
        bVar.f31497f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        bVar.f31498g = Collections.emptyList();
        f31481k = bVar.m38098b();
    }

    private C11901c(b bVar) {
        this.f31482a = bVar.f31492a;
        this.f31483b = bVar.f31493b;
        this.f31484c = bVar.f31494c;
        this.f31485d = bVar.f31495d;
        this.f31486e = bVar.f31496e;
        this.f31487f = bVar.f31497f;
        this.f31488g = bVar.f31498g;
        this.f31489h = bVar.f31499h;
        this.f31490i = bVar.f31500i;
        this.f31491j = bVar.f31501j;
    }

    /* renamed from: k */
    private static b m38077k(C11901c c11901c) {
        b bVar = new b();
        bVar.f31492a = c11901c.f31482a;
        bVar.f31493b = c11901c.f31483b;
        bVar.f31494c = c11901c.f31484c;
        bVar.f31495d = c11901c.f31485d;
        bVar.f31496e = c11901c.f31486e;
        bVar.f31497f = c11901c.f31487f;
        bVar.f31498g = c11901c.f31488g;
        bVar.f31499h = c11901c.f31489h;
        bVar.f31500i = c11901c.f31490i;
        bVar.f31501j = c11901c.f31491j;
        return bVar;
    }

    /* renamed from: a */
    public String m38078a() {
        return this.f31484c;
    }

    /* renamed from: b */
    public String m38079b() {
        return this.f31486e;
    }

    /* renamed from: c */
    public AbstractC11898b m38080c() {
        return this.f31485d;
    }

    /* renamed from: d */
    public C11946t m38081d() {
        return this.f31482a;
    }

    /* renamed from: e */
    public Executor m38082e() {
        return this.f31483b;
    }

    /* renamed from: f */
    public Integer m38083f() {
        return this.f31490i;
    }

    /* renamed from: g */
    public Integer m38084g() {
        return this.f31491j;
    }

    /* renamed from: h */
    public <T> T m38085h(c<T> cVar) {
        C7159o.m21313p(cVar, Constants.KEY);
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f31487f;
            if (i10 >= objArr.length) {
                return (T) ((c) cVar).f31503b;
            }
            if (cVar.equals(objArr[i10][0])) {
                return (T) this.f31487f[i10][1];
            }
            i10++;
        }
    }

    /* renamed from: i */
    public List<AbstractC11925k.a> m38086i() {
        return this.f31488g;
    }

    /* renamed from: j */
    public boolean m38087j() {
        return Boolean.TRUE.equals(this.f31489h);
    }

    /* renamed from: l */
    public C11901c m38088l(C11946t c11946t) {
        b m38077k = m38077k(this);
        m38077k.f31492a = c11946t;
        return m38077k.m38098b();
    }

    /* renamed from: m */
    public C11901c m38089m(long j10, TimeUnit timeUnit) {
        return m38088l(C11946t.m38262b(j10, timeUnit));
    }

    /* renamed from: n */
    public C11901c m38090n(Executor executor) {
        b m38077k = m38077k(this);
        m38077k.f31493b = executor;
        return m38077k.m38098b();
    }

    /* renamed from: o */
    public C11901c m38091o(int i10) {
        C7159o.m21305h(i10 >= 0, "invalid maxsize %s", i10);
        b m38077k = m38077k(this);
        m38077k.f31500i = Integer.valueOf(i10);
        return m38077k.m38098b();
    }

    /* renamed from: p */
    public C11901c m38092p(int i10) {
        C7159o.m21305h(i10 >= 0, "invalid maxsize %s", i10);
        b m38077k = m38077k(this);
        m38077k.f31501j = Integer.valueOf(i10);
        return m38077k.m38098b();
    }

    /* renamed from: q */
    public <T> C11901c m38093q(c<T> cVar, T t10) {
        C7159o.m21313p(cVar, Constants.KEY);
        C7159o.m21313p(t10, "value");
        b m38077k = m38077k(this);
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f31487f;
            if (i10 >= objArr.length) {
                i10 = -1;
                break;
            }
            if (cVar.equals(objArr[i10][0])) {
                break;
            }
            i10++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f31487f.length + (i10 == -1 ? 1 : 0), 2);
        m38077k.f31497f = objArr2;
        Object[][] objArr3 = this.f31487f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i10 == -1) {
            Object[][] objArr4 = m38077k.f31497f;
            int length = this.f31487f.length;
            Object[] objArr5 = new Object[2];
            objArr5[0] = cVar;
            objArr5[1] = t10;
            objArr4[length] = objArr5;
        } else {
            Object[][] objArr6 = m38077k.f31497f;
            Object[] objArr7 = new Object[2];
            objArr7[0] = cVar;
            objArr7[1] = t10;
            objArr6[i10] = objArr7;
        }
        return m38077k.m38098b();
    }

    /* renamed from: r */
    public C11901c m38094r(AbstractC11925k.a aVar) {
        ArrayList arrayList = new ArrayList(this.f31488g.size() + 1);
        arrayList.addAll(this.f31488g);
        arrayList.add(aVar);
        b m38077k = m38077k(this);
        m38077k.f31498g = Collections.unmodifiableList(arrayList);
        return m38077k.m38098b();
    }

    /* renamed from: s */
    public C11901c m38095s() {
        b m38077k = m38077k(this);
        m38077k.f31499h = Boolean.TRUE;
        return m38077k.m38098b();
    }

    /* renamed from: t */
    public C11901c m38096t() {
        b m38077k = m38077k(this);
        m38077k.f31499h = Boolean.FALSE;
        return m38077k.m38098b();
    }

    public String toString() {
        C7153i.b m21284d = C7153i.m21274c(this).m21284d("deadline", this.f31482a).m21284d("authority", this.f31484c).m21284d("callCredentials", this.f31485d);
        Executor executor = this.f31483b;
        return m21284d.m21284d("executor", executor != null ? executor.getClass() : null).m21284d("compressorName", this.f31486e).m21284d("customOptions", Arrays.deepToString(this.f31487f)).m21285e("waitForReady", m38087j()).m21284d("maxInboundMessageSize", this.f31490i).m21284d("maxOutboundMessageSize", this.f31491j).m21284d("streamTracerFactories", this.f31488g).toString();
    }
}
