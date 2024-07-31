package vi;

import eb.i;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import vi.k;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: k */
    public static final c f29047k;

    /* renamed from: a */
    private final t f29048a;

    /* renamed from: b */
    private final Executor f29049b;

    /* renamed from: c */
    private final String f29050c;

    /* renamed from: d */
    private final vi.b f29051d;

    /* renamed from: e */
    private final String f29052e;

    /* renamed from: f */
    private final Object[][] f29053f;

    /* renamed from: g */
    private final List<k.a> f29054g;

    /* renamed from: h */
    private final Boolean f29055h;

    /* renamed from: i */
    private final Integer f29056i;

    /* renamed from: j */
    private final Integer f29057j;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        t f29058a;

        /* renamed from: b */
        Executor f29059b;

        /* renamed from: c */
        String f29060c;

        /* renamed from: d */
        vi.b f29061d;

        /* renamed from: e */
        String f29062e;

        /* renamed from: f */
        Object[][] f29063f;

        /* renamed from: g */
        List<k.a> f29064g;

        /* renamed from: h */
        Boolean f29065h;

        /* renamed from: i */
        Integer f29066i;

        /* renamed from: j */
        Integer f29067j;

        b() {
        }

        public c b() {
            return new c(this);
        }
    }

    /* renamed from: vi.c$c */
    /* loaded from: classes3.dex */
    public static final class C0470c<T> {

        /* renamed from: a */
        private final String f29068a;

        /* renamed from: b */
        private final T f29069b;

        private C0470c(String str, T t10) {
            this.f29068a = str;
            this.f29069b = t10;
        }

        public static <T> C0470c<T> b(String str) {
            eb.o.p(str, "debugString");
            return new C0470c<>(str, null);
        }

        public String toString() {
            return this.f29068a;
        }
    }

    static {
        b bVar = new b();
        bVar.f29063f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        bVar.f29064g = Collections.emptyList();
        f29047k = bVar.b();
    }

    private c(b bVar) {
        this.f29048a = bVar.f29058a;
        this.f29049b = bVar.f29059b;
        this.f29050c = bVar.f29060c;
        this.f29051d = bVar.f29061d;
        this.f29052e = bVar.f29062e;
        this.f29053f = bVar.f29063f;
        this.f29054g = bVar.f29064g;
        this.f29055h = bVar.f29065h;
        this.f29056i = bVar.f29066i;
        this.f29057j = bVar.f29067j;
    }

    /* synthetic */ c(b bVar, a aVar) {
        this(bVar);
    }

    private static b k(c cVar) {
        b bVar = new b();
        bVar.f29058a = cVar.f29048a;
        bVar.f29059b = cVar.f29049b;
        bVar.f29060c = cVar.f29050c;
        bVar.f29061d = cVar.f29051d;
        bVar.f29062e = cVar.f29052e;
        bVar.f29063f = cVar.f29053f;
        bVar.f29064g = cVar.f29054g;
        bVar.f29065h = cVar.f29055h;
        bVar.f29066i = cVar.f29056i;
        bVar.f29067j = cVar.f29057j;
        return bVar;
    }

    public String a() {
        return this.f29050c;
    }

    public String b() {
        return this.f29052e;
    }

    public vi.b c() {
        return this.f29051d;
    }

    public t d() {
        return this.f29048a;
    }

    public Executor e() {
        return this.f29049b;
    }

    public Integer f() {
        return this.f29056i;
    }

    public Integer g() {
        return this.f29057j;
    }

    public <T> T h(C0470c<T> c0470c) {
        eb.o.p(c0470c, Constants.KEY);
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f29053f;
            if (i10 >= objArr.length) {
                return (T) ((C0470c) c0470c).f29069b;
            }
            if (c0470c.equals(objArr[i10][0])) {
                return (T) this.f29053f[i10][1];
            }
            i10++;
        }
    }

    public List<k.a> i() {
        return this.f29054g;
    }

    public boolean j() {
        return Boolean.TRUE.equals(this.f29055h);
    }

    public c l(t tVar) {
        b k10 = k(this);
        k10.f29058a = tVar;
        return k10.b();
    }

    public c m(long j10, TimeUnit timeUnit) {
        return l(t.b(j10, timeUnit));
    }

    public c n(Executor executor) {
        b k10 = k(this);
        k10.f29059b = executor;
        return k10.b();
    }

    public c o(int i10) {
        eb.o.h(i10 >= 0, "invalid maxsize %s", i10);
        b k10 = k(this);
        k10.f29066i = Integer.valueOf(i10);
        return k10.b();
    }

    public c p(int i10) {
        eb.o.h(i10 >= 0, "invalid maxsize %s", i10);
        b k10 = k(this);
        k10.f29067j = Integer.valueOf(i10);
        return k10.b();
    }

    public <T> c q(C0470c<T> c0470c, T t10) {
        eb.o.p(c0470c, Constants.KEY);
        eb.o.p(t10, "value");
        b k10 = k(this);
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f29053f;
            if (i10 >= objArr.length) {
                i10 = -1;
                break;
            }
            if (c0470c.equals(objArr[i10][0])) {
                break;
            }
            i10++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f29053f.length + (i10 == -1 ? 1 : 0), 2);
        k10.f29063f = objArr2;
        Object[][] objArr3 = this.f29053f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i10 == -1) {
            Object[][] objArr4 = k10.f29063f;
            int length = this.f29053f.length;
            Object[] objArr5 = new Object[2];
            objArr5[0] = c0470c;
            objArr5[1] = t10;
            objArr4[length] = objArr5;
        } else {
            Object[][] objArr6 = k10.f29063f;
            Object[] objArr7 = new Object[2];
            objArr7[0] = c0470c;
            objArr7[1] = t10;
            objArr6[i10] = objArr7;
        }
        return k10.b();
    }

    public c r(k.a aVar) {
        ArrayList arrayList = new ArrayList(this.f29054g.size() + 1);
        arrayList.addAll(this.f29054g);
        arrayList.add(aVar);
        b k10 = k(this);
        k10.f29064g = Collections.unmodifiableList(arrayList);
        return k10.b();
    }

    public c s() {
        b k10 = k(this);
        k10.f29065h = Boolean.TRUE;
        return k10.b();
    }

    public c t() {
        b k10 = k(this);
        k10.f29065h = Boolean.FALSE;
        return k10.b();
    }

    public String toString() {
        i.b d10 = eb.i.c(this).d("deadline", this.f29048a).d("authority", this.f29050c).d("callCredentials", this.f29051d);
        Executor executor = this.f29049b;
        return d10.d("executor", executor != null ? executor.getClass() : null).d("compressorName", this.f29052e).d("customOptions", Arrays.deepToString(this.f29053f)).e("waitForReady", j()).d("maxInboundMessageSize", this.f29056i).d("maxOutboundMessageSize", this.f29057j).d("streamTracerFactories", this.f29054g).toString();
    }
}
