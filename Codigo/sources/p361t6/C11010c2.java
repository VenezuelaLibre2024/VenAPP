package p361t6;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.AbstractC5911y;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p361t6.C11010c2;
import p361t6.InterfaceC11076o;
import p363t8.C11137a;
import p363t8.C11172r0;
import p377u7.C11446c;

/* renamed from: t6.c2 */
/* loaded from: classes.dex */
public final class C11010c2 implements InterfaceC11076o {

    /* renamed from: t */
    public static final C11010c2 f28016t = new c().m33728a();

    /* renamed from: u */
    private static final String f28017u = C11172r0.m34945r0(0);

    /* renamed from: v */
    private static final String f28018v = C11172r0.m34945r0(1);

    /* renamed from: w */
    private static final String f28019w = C11172r0.m34945r0(2);

    /* renamed from: x */
    private static final String f28020x = C11172r0.m34945r0(3);

    /* renamed from: y */
    private static final String f28021y = C11172r0.m34945r0(4);

    /* renamed from: z */
    public static final InterfaceC11076o.a<C11010c2> f28022z = new InterfaceC11076o.a() { // from class: t6.b2
        @Override // p361t6.InterfaceC11076o.a
        /* renamed from: a */
        public final InterfaceC11076o mo22759a(Bundle bundle) {
            C11010c2 m33724d;
            m33724d = C11010c2.m33724d(bundle);
            return m33724d;
        }
    };

    /* renamed from: a */
    public final String f28023a;

    /* renamed from: b */
    public final h f28024b;

    /* renamed from: c */
    @Deprecated
    public final i f28025c;

    /* renamed from: d */
    public final g f28026d;

    /* renamed from: e */
    public final C11040h2 f28027e;

    /* renamed from: f */
    public final d f28028f;

    /* renamed from: r */
    @Deprecated
    public final e f28029r;

    /* renamed from: s */
    public final j f28030s;

    /* renamed from: t6.c2$b */
    /* loaded from: classes.dex */
    public static final class b {
    }

    /* renamed from: t6.c2$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private String f28031a;

        /* renamed from: b */
        private Uri f28032b;

        /* renamed from: c */
        private String f28033c;

        /* renamed from: d */
        private d.a f28034d;

        /* renamed from: e */
        private f.a f28035e;

        /* renamed from: f */
        private List<C11446c> f28036f;

        /* renamed from: g */
        private String f28037g;

        /* renamed from: h */
        private AbstractC5907w<l> f28038h;

        /* renamed from: i */
        private Object f28039i;

        /* renamed from: j */
        private C11040h2 f28040j;

        /* renamed from: k */
        private g.a f28041k;

        /* renamed from: l */
        private j f28042l;

        public c() {
            this.f28034d = new d.a();
            this.f28035e = new f.a();
            this.f28036f = Collections.emptyList();
            this.f28038h = AbstractC5907w.m15081v();
            this.f28041k = new g.a();
            this.f28042l = j.f28105d;
        }

        private c(C11010c2 c11010c2) {
            this();
            this.f28034d = c11010c2.f28028f.m33738c();
            this.f28031a = c11010c2.f28023a;
            this.f28040j = c11010c2.f28027e;
            this.f28041k = c11010c2.f28026d.m33765c();
            this.f28042l = c11010c2.f28030s;
            h hVar = c11010c2.f28024b;
            if (hVar != null) {
                this.f28037g = hVar.f28101e;
                this.f28033c = hVar.f28098b;
                this.f28032b = hVar.f28097a;
                this.f28036f = hVar.f28100d;
                this.f28038h = hVar.f28102f;
                this.f28039i = hVar.f28104h;
                f fVar = hVar.f28099c;
                this.f28035e = fVar != null ? fVar.m33752b() : new f.a();
            }
        }

        /* renamed from: a */
        public C11010c2 m33728a() {
            i iVar;
            C11137a.m34605g(this.f28035e.f28073b == null || this.f28035e.f28072a != null);
            Uri uri = this.f28032b;
            if (uri != null) {
                iVar = new i(uri, this.f28033c, this.f28035e.f28072a != null ? this.f28035e.m33762i() : null, null, this.f28036f, this.f28037g, this.f28038h, this.f28039i);
            } else {
                iVar = null;
            }
            String str = this.f28031a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e m33745g = this.f28034d.m33745g();
            g m33771f = this.f28041k.m33771f();
            C11040h2 c11040h2 = this.f28040j;
            if (c11040h2 == null) {
                c11040h2 = C11040h2.f28306T;
            }
            return new C11010c2(str2, m33745g, iVar, m33771f, c11040h2, this.f28042l);
        }

        /* renamed from: b */
        public c m33729b(String str) {
            this.f28037g = str;
            return this;
        }

        /* renamed from: c */
        public c m33730c(g gVar) {
            this.f28041k = gVar.m33765c();
            return this;
        }

        /* renamed from: d */
        public c m33731d(String str) {
            this.f28031a = (String) C11137a.m34603e(str);
            return this;
        }

        /* renamed from: e */
        public c m33732e(List<l> list) {
            this.f28038h = AbstractC5907w.m15079r(list);
            return this;
        }

        /* renamed from: f */
        public c m33733f(Object obj) {
            this.f28039i = obj;
            return this;
        }

        /* renamed from: g */
        public c m33734g(Uri uri) {
            this.f28032b = uri;
            return this;
        }

        /* renamed from: h */
        public c m33735h(String str) {
            return m33734g(str == null ? null : Uri.parse(str));
        }
    }

    /* renamed from: t6.c2$d */
    /* loaded from: classes.dex */
    public static class d implements InterfaceC11076o {

        /* renamed from: f */
        public static final d f28043f = new a().m33744f();

        /* renamed from: r */
        private static final String f28044r = C11172r0.m34945r0(0);

        /* renamed from: s */
        private static final String f28045s = C11172r0.m34945r0(1);

        /* renamed from: t */
        private static final String f28046t = C11172r0.m34945r0(2);

        /* renamed from: u */
        private static final String f28047u = C11172r0.m34945r0(3);

        /* renamed from: v */
        private static final String f28048v = C11172r0.m34945r0(4);

        /* renamed from: w */
        public static final InterfaceC11076o.a<e> f28049w = new InterfaceC11076o.a() { // from class: t6.d2
            @Override // p361t6.InterfaceC11076o.a
            /* renamed from: a */
            public final InterfaceC11076o mo22759a(Bundle bundle) {
                C11010c2.e m33737d;
                m33737d = C11010c2.d.m33737d(bundle);
                return m33737d;
            }
        };

        /* renamed from: a */
        public final long f28050a;

        /* renamed from: b */
        public final long f28051b;

        /* renamed from: c */
        public final boolean f28052c;

        /* renamed from: d */
        public final boolean f28053d;

        /* renamed from: e */
        public final boolean f28054e;

        /* renamed from: t6.c2$d$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private long f28055a;

            /* renamed from: b */
            private long f28056b;

            /* renamed from: c */
            private boolean f28057c;

            /* renamed from: d */
            private boolean f28058d;

            /* renamed from: e */
            private boolean f28059e;

            public a() {
                this.f28056b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f28055a = dVar.f28050a;
                this.f28056b = dVar.f28051b;
                this.f28057c = dVar.f28052c;
                this.f28058d = dVar.f28053d;
                this.f28059e = dVar.f28054e;
            }

            /* renamed from: f */
            public d m33744f() {
                return m33745g();
            }

            @Deprecated
            /* renamed from: g */
            public e m33745g() {
                return new e(this);
            }

            /* renamed from: h */
            public a m33746h(long j10) {
                C11137a.m34599a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f28056b = j10;
                return this;
            }

            /* renamed from: i */
            public a m33747i(boolean z10) {
                this.f28058d = z10;
                return this;
            }

            /* renamed from: j */
            public a m33748j(boolean z10) {
                this.f28057c = z10;
                return this;
            }

            /* renamed from: k */
            public a m33749k(long j10) {
                C11137a.m34599a(j10 >= 0);
                this.f28055a = j10;
                return this;
            }

            /* renamed from: l */
            public a m33750l(boolean z10) {
                this.f28059e = z10;
                return this;
            }
        }

        private d(a aVar) {
            this.f28050a = aVar.f28055a;
            this.f28051b = aVar.f28056b;
            this.f28052c = aVar.f28057c;
            this.f28053d = aVar.f28058d;
            this.f28054e = aVar.f28059e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ e m33737d(Bundle bundle) {
            a aVar = new a();
            String str = f28044r;
            d dVar = f28043f;
            return aVar.m33749k(bundle.getLong(str, dVar.f28050a)).m33746h(bundle.getLong(f28045s, dVar.f28051b)).m33748j(bundle.getBoolean(f28046t, dVar.f28052c)).m33747i(bundle.getBoolean(f28047u, dVar.f28053d)).m33750l(bundle.getBoolean(f28048v, dVar.f28054e)).m33745g();
        }

        @Override // p361t6.InterfaceC11076o
        /* renamed from: a */
        public Bundle mo22762a() {
            Bundle bundle = new Bundle();
            long j10 = this.f28050a;
            d dVar = f28043f;
            if (j10 != dVar.f28050a) {
                bundle.putLong(f28044r, j10);
            }
            long j11 = this.f28051b;
            if (j11 != dVar.f28051b) {
                bundle.putLong(f28045s, j11);
            }
            boolean z10 = this.f28052c;
            if (z10 != dVar.f28052c) {
                bundle.putBoolean(f28046t, z10);
            }
            boolean z11 = this.f28053d;
            if (z11 != dVar.f28053d) {
                bundle.putBoolean(f28047u, z11);
            }
            boolean z12 = this.f28054e;
            if (z12 != dVar.f28054e) {
                bundle.putBoolean(f28048v, z12);
            }
            return bundle;
        }

        /* renamed from: c */
        public a m33738c() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f28050a == dVar.f28050a && this.f28051b == dVar.f28051b && this.f28052c == dVar.f28052c && this.f28053d == dVar.f28053d && this.f28054e == dVar.f28054e;
        }

        public int hashCode() {
            long j10 = this.f28050a;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f28051b;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f28052c ? 1 : 0)) * 31) + (this.f28053d ? 1 : 0)) * 31) + (this.f28054e ? 1 : 0);
        }
    }

    @Deprecated
    /* renamed from: t6.c2$e */
    /* loaded from: classes.dex */
    public static final class e extends d {

        /* renamed from: x */
        public static final e f28060x = new d.a().m33745g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* renamed from: t6.c2$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        public final UUID f28061a;

        /* renamed from: b */
        @Deprecated
        public final UUID f28062b;

        /* renamed from: c */
        public final Uri f28063c;

        /* renamed from: d */
        @Deprecated
        public final AbstractC5911y<String, String> f28064d;

        /* renamed from: e */
        public final AbstractC5911y<String, String> f28065e;

        /* renamed from: f */
        public final boolean f28066f;

        /* renamed from: g */
        public final boolean f28067g;

        /* renamed from: h */
        public final boolean f28068h;

        /* renamed from: i */
        @Deprecated
        public final AbstractC5907w<Integer> f28069i;

        /* renamed from: j */
        public final AbstractC5907w<Integer> f28070j;

        /* renamed from: k */
        private final byte[] f28071k;

        /* renamed from: t6.c2$f$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private UUID f28072a;

            /* renamed from: b */
            private Uri f28073b;

            /* renamed from: c */
            private AbstractC5911y<String, String> f28074c;

            /* renamed from: d */
            private boolean f28075d;

            /* renamed from: e */
            private boolean f28076e;

            /* renamed from: f */
            private boolean f28077f;

            /* renamed from: g */
            private AbstractC5907w<Integer> f28078g;

            /* renamed from: h */
            private byte[] f28079h;

            @Deprecated
            private a() {
                this.f28074c = AbstractC5911y.m15111k();
                this.f28078g = AbstractC5907w.m15081v();
            }

            private a(f fVar) {
                this.f28072a = fVar.f28061a;
                this.f28073b = fVar.f28063c;
                this.f28074c = fVar.f28065e;
                this.f28075d = fVar.f28066f;
                this.f28076e = fVar.f28067g;
                this.f28077f = fVar.f28068h;
                this.f28078g = fVar.f28070j;
                this.f28079h = fVar.f28071k;
            }

            /* renamed from: i */
            public f m33762i() {
                return new f(this);
            }
        }

        private f(a aVar) {
            C11137a.m34605g((aVar.f28077f && aVar.f28073b == null) ? false : true);
            UUID uuid = (UUID) C11137a.m34603e(aVar.f28072a);
            this.f28061a = uuid;
            this.f28062b = uuid;
            this.f28063c = aVar.f28073b;
            this.f28064d = aVar.f28074c;
            this.f28065e = aVar.f28074c;
            this.f28066f = aVar.f28075d;
            this.f28068h = aVar.f28077f;
            this.f28067g = aVar.f28076e;
            this.f28069i = aVar.f28078g;
            this.f28070j = aVar.f28078g;
            this.f28071k = aVar.f28079h != null ? Arrays.copyOf(aVar.f28079h, aVar.f28079h.length) : null;
        }

        /* renamed from: b */
        public a m33752b() {
            return new a();
        }

        /* renamed from: c */
        public byte[] m33753c() {
            byte[] bArr = this.f28071k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f28061a.equals(fVar.f28061a) && C11172r0.m34914c(this.f28063c, fVar.f28063c) && C11172r0.m34914c(this.f28065e, fVar.f28065e) && this.f28066f == fVar.f28066f && this.f28068h == fVar.f28068h && this.f28067g == fVar.f28067g && this.f28070j.equals(fVar.f28070j) && Arrays.equals(this.f28071k, fVar.f28071k);
        }

        public int hashCode() {
            int hashCode = this.f28061a.hashCode() * 31;
            Uri uri = this.f28063c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f28065e.hashCode()) * 31) + (this.f28066f ? 1 : 0)) * 31) + (this.f28068h ? 1 : 0)) * 31) + (this.f28067g ? 1 : 0)) * 31) + this.f28070j.hashCode()) * 31) + Arrays.hashCode(this.f28071k);
        }
    }

    /* renamed from: t6.c2$g */
    /* loaded from: classes.dex */
    public static final class g implements InterfaceC11076o {

        /* renamed from: f */
        public static final g f28080f = new a().m33771f();

        /* renamed from: r */
        private static final String f28081r = C11172r0.m34945r0(0);

        /* renamed from: s */
        private static final String f28082s = C11172r0.m34945r0(1);

        /* renamed from: t */
        private static final String f28083t = C11172r0.m34945r0(2);

        /* renamed from: u */
        private static final String f28084u = C11172r0.m34945r0(3);

        /* renamed from: v */
        private static final String f28085v = C11172r0.m34945r0(4);

        /* renamed from: w */
        public static final InterfaceC11076o.a<g> f28086w = new InterfaceC11076o.a() { // from class: t6.e2
            @Override // p361t6.InterfaceC11076o.a
            /* renamed from: a */
            public final InterfaceC11076o mo22759a(Bundle bundle) {
                C11010c2.g m33764d;
                m33764d = C11010c2.g.m33764d(bundle);
                return m33764d;
            }
        };

        /* renamed from: a */
        public final long f28087a;

        /* renamed from: b */
        public final long f28088b;

        /* renamed from: c */
        public final long f28089c;

        /* renamed from: d */
        public final float f28090d;

        /* renamed from: e */
        public final float f28091e;

        /* renamed from: t6.c2$g$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private long f28092a;

            /* renamed from: b */
            private long f28093b;

            /* renamed from: c */
            private long f28094c;

            /* renamed from: d */
            private float f28095d;

            /* renamed from: e */
            private float f28096e;

            public a() {
                this.f28092a = -9223372036854775807L;
                this.f28093b = -9223372036854775807L;
                this.f28094c = -9223372036854775807L;
                this.f28095d = -3.4028235E38f;
                this.f28096e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f28092a = gVar.f28087a;
                this.f28093b = gVar.f28088b;
                this.f28094c = gVar.f28089c;
                this.f28095d = gVar.f28090d;
                this.f28096e = gVar.f28091e;
            }

            /* renamed from: f */
            public g m33771f() {
                return new g(this);
            }

            /* renamed from: g */
            public a m33772g(long j10) {
                this.f28094c = j10;
                return this;
            }

            /* renamed from: h */
            public a m33773h(float f10) {
                this.f28096e = f10;
                return this;
            }

            /* renamed from: i */
            public a m33774i(long j10) {
                this.f28093b = j10;
                return this;
            }

            /* renamed from: j */
            public a m33775j(float f10) {
                this.f28095d = f10;
                return this;
            }

            /* renamed from: k */
            public a m33776k(long j10) {
                this.f28092a = j10;
                return this;
            }
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f28087a = j10;
            this.f28088b = j11;
            this.f28089c = j12;
            this.f28090d = f10;
            this.f28091e = f11;
        }

        private g(a aVar) {
            this(aVar.f28092a, aVar.f28093b, aVar.f28094c, aVar.f28095d, aVar.f28096e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ g m33764d(Bundle bundle) {
            String str = f28081r;
            g gVar = f28080f;
            return new g(bundle.getLong(str, gVar.f28087a), bundle.getLong(f28082s, gVar.f28088b), bundle.getLong(f28083t, gVar.f28089c), bundle.getFloat(f28084u, gVar.f28090d), bundle.getFloat(f28085v, gVar.f28091e));
        }

        @Override // p361t6.InterfaceC11076o
        /* renamed from: a */
        public Bundle mo22762a() {
            Bundle bundle = new Bundle();
            long j10 = this.f28087a;
            g gVar = f28080f;
            if (j10 != gVar.f28087a) {
                bundle.putLong(f28081r, j10);
            }
            long j11 = this.f28088b;
            if (j11 != gVar.f28088b) {
                bundle.putLong(f28082s, j11);
            }
            long j12 = this.f28089c;
            if (j12 != gVar.f28089c) {
                bundle.putLong(f28083t, j12);
            }
            float f10 = this.f28090d;
            if (f10 != gVar.f28090d) {
                bundle.putFloat(f28084u, f10);
            }
            float f11 = this.f28091e;
            if (f11 != gVar.f28091e) {
                bundle.putFloat(f28085v, f11);
            }
            return bundle;
        }

        /* renamed from: c */
        public a m33765c() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f28087a == gVar.f28087a && this.f28088b == gVar.f28088b && this.f28089c == gVar.f28089c && this.f28090d == gVar.f28090d && this.f28091e == gVar.f28091e;
        }

        public int hashCode() {
            long j10 = this.f28087a;
            long j11 = this.f28088b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f28089c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f28090d;
            int floatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f28091e;
            return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }
    }

    /* renamed from: t6.c2$h */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a */
        public final Uri f28097a;

        /* renamed from: b */
        public final String f28098b;

        /* renamed from: c */
        public final f f28099c;

        /* renamed from: d */
        public final List<C11446c> f28100d;

        /* renamed from: e */
        public final String f28101e;

        /* renamed from: f */
        public final AbstractC5907w<l> f28102f;

        /* renamed from: g */
        @Deprecated
        public final List<k> f28103g;

        /* renamed from: h */
        public final Object f28104h;

        private h(Uri uri, String str, f fVar, b bVar, List<C11446c> list, String str2, AbstractC5907w<l> abstractC5907w, Object obj) {
            this.f28097a = uri;
            this.f28098b = str;
            this.f28099c = fVar;
            this.f28100d = list;
            this.f28101e = str2;
            this.f28102f = abstractC5907w;
            AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
            for (int i10 = 0; i10 < abstractC5907w.size(); i10++) {
                m15077p.mo14724a(abstractC5907w.get(i10).m33786a().m33795i());
            }
            this.f28103g = m15077p.m15094k();
            this.f28104h = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f28097a.equals(hVar.f28097a) && C11172r0.m34914c(this.f28098b, hVar.f28098b) && C11172r0.m34914c(this.f28099c, hVar.f28099c) && C11172r0.m34914c(null, null) && this.f28100d.equals(hVar.f28100d) && C11172r0.m34914c(this.f28101e, hVar.f28101e) && this.f28102f.equals(hVar.f28102f) && C11172r0.m34914c(this.f28104h, hVar.f28104h);
        }

        public int hashCode() {
            int hashCode = this.f28097a.hashCode() * 31;
            String str = this.f28098b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f28099c;
            int hashCode3 = (((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f28100d.hashCode()) * 31;
            String str2 = this.f28101e;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f28102f.hashCode()) * 31;
            Object obj = this.f28104h;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    @Deprecated
    /* renamed from: t6.c2$i */
    /* loaded from: classes.dex */
    public static final class i extends h {
        private i(Uri uri, String str, f fVar, b bVar, List<C11446c> list, String str2, AbstractC5907w<l> abstractC5907w, Object obj) {
            super(uri, str, fVar, bVar, list, str2, abstractC5907w, obj);
        }
    }

    /* renamed from: t6.c2$j */
    /* loaded from: classes.dex */
    public static final class j implements InterfaceC11076o {

        /* renamed from: d */
        public static final j f28105d = new a().m33782d();

        /* renamed from: e */
        private static final String f28106e = C11172r0.m34945r0(0);

        /* renamed from: f */
        private static final String f28107f = C11172r0.m34945r0(1);

        /* renamed from: r */
        private static final String f28108r = C11172r0.m34945r0(2);

        /* renamed from: s */
        public static final InterfaceC11076o.a<j> f28109s = new InterfaceC11076o.a() { // from class: t6.f2
            @Override // p361t6.InterfaceC11076o.a
            /* renamed from: a */
            public final InterfaceC11076o mo22759a(Bundle bundle) {
                C11010c2.j m33778c;
                m33778c = C11010c2.j.m33778c(bundle);
                return m33778c;
            }
        };

        /* renamed from: a */
        public final Uri f28110a;

        /* renamed from: b */
        public final String f28111b;

        /* renamed from: c */
        public final Bundle f28112c;

        /* renamed from: t6.c2$j$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private Uri f28113a;

            /* renamed from: b */
            private String f28114b;

            /* renamed from: c */
            private Bundle f28115c;

            /* renamed from: d */
            public j m33782d() {
                return new j(this);
            }

            /* renamed from: e */
            public a m33783e(Bundle bundle) {
                this.f28115c = bundle;
                return this;
            }

            /* renamed from: f */
            public a m33784f(Uri uri) {
                this.f28113a = uri;
                return this;
            }

            /* renamed from: g */
            public a m33785g(String str) {
                this.f28114b = str;
                return this;
            }
        }

        private j(a aVar) {
            this.f28110a = aVar.f28113a;
            this.f28111b = aVar.f28114b;
            this.f28112c = aVar.f28115c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static /* synthetic */ j m33778c(Bundle bundle) {
            return new a().m33784f((Uri) bundle.getParcelable(f28106e)).m33785g(bundle.getString(f28107f)).m33783e(bundle.getBundle(f28108r)).m33782d();
        }

        @Override // p361t6.InterfaceC11076o
        /* renamed from: a */
        public Bundle mo22762a() {
            Bundle bundle = new Bundle();
            Uri uri = this.f28110a;
            if (uri != null) {
                bundle.putParcelable(f28106e, uri);
            }
            String str = this.f28111b;
            if (str != null) {
                bundle.putString(f28107f, str);
            }
            Bundle bundle2 = this.f28112c;
            if (bundle2 != null) {
                bundle.putBundle(f28108r, bundle2);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return C11172r0.m34914c(this.f28110a, jVar.f28110a) && C11172r0.m34914c(this.f28111b, jVar.f28111b);
        }

        public int hashCode() {
            Uri uri = this.f28110a;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f28111b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    @Deprecated
    /* renamed from: t6.c2$k */
    /* loaded from: classes.dex */
    public static final class k extends l {
        private k(l.a aVar) {
            super(aVar);
        }
    }

    /* renamed from: t6.c2$l */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a */
        public final Uri f28116a;

        /* renamed from: b */
        public final String f28117b;

        /* renamed from: c */
        public final String f28118c;

        /* renamed from: d */
        public final int f28119d;

        /* renamed from: e */
        public final int f28120e;

        /* renamed from: f */
        public final String f28121f;

        /* renamed from: g */
        public final String f28122g;

        /* renamed from: t6.c2$l$a */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private Uri f28123a;

            /* renamed from: b */
            private String f28124b;

            /* renamed from: c */
            private String f28125c;

            /* renamed from: d */
            private int f28126d;

            /* renamed from: e */
            private int f28127e;

            /* renamed from: f */
            private String f28128f;

            /* renamed from: g */
            private String f28129g;

            private a(l lVar) {
                this.f28123a = lVar.f28116a;
                this.f28124b = lVar.f28117b;
                this.f28125c = lVar.f28118c;
                this.f28126d = lVar.f28119d;
                this.f28127e = lVar.f28120e;
                this.f28128f = lVar.f28121f;
                this.f28129g = lVar.f28122g;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: i */
            public k m33795i() {
                return new k(this);
            }
        }

        private l(a aVar) {
            this.f28116a = aVar.f28123a;
            this.f28117b = aVar.f28124b;
            this.f28118c = aVar.f28125c;
            this.f28119d = aVar.f28126d;
            this.f28120e = aVar.f28127e;
            this.f28121f = aVar.f28128f;
            this.f28122g = aVar.f28129g;
        }

        /* renamed from: a */
        public a m33786a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f28116a.equals(lVar.f28116a) && C11172r0.m34914c(this.f28117b, lVar.f28117b) && C11172r0.m34914c(this.f28118c, lVar.f28118c) && this.f28119d == lVar.f28119d && this.f28120e == lVar.f28120e && C11172r0.m34914c(this.f28121f, lVar.f28121f) && C11172r0.m34914c(this.f28122g, lVar.f28122g);
        }

        public int hashCode() {
            int hashCode = this.f28116a.hashCode() * 31;
            String str = this.f28117b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f28118c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f28119d) * 31) + this.f28120e) * 31;
            String str3 = this.f28121f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f28122g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    private C11010c2(String str, e eVar, i iVar, g gVar, C11040h2 c11040h2, j jVar) {
        this.f28023a = str;
        this.f28024b = iVar;
        this.f28025c = iVar;
        this.f28026d = gVar;
        this.f28027e = c11040h2;
        this.f28028f = eVar;
        this.f28029r = eVar;
        this.f28030s = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static C11010c2 m33724d(Bundle bundle) {
        String str = (String) C11137a.m34603e(bundle.getString(f28017u, ""));
        Bundle bundle2 = bundle.getBundle(f28018v);
        g mo22759a = bundle2 == null ? g.f28080f : g.f28086w.mo22759a(bundle2);
        Bundle bundle3 = bundle.getBundle(f28019w);
        C11040h2 mo22759a2 = bundle3 == null ? C11040h2.f28306T : C11040h2.f28305B0.mo22759a(bundle3);
        Bundle bundle4 = bundle.getBundle(f28020x);
        e mo22759a3 = bundle4 == null ? e.f28060x : d.f28049w.mo22759a(bundle4);
        Bundle bundle5 = bundle.getBundle(f28021y);
        return new C11010c2(str, mo22759a3, null, mo22759a, mo22759a2, bundle5 == null ? j.f28105d : j.f28109s.mo22759a(bundle5));
    }

    /* renamed from: e */
    public static C11010c2 m33725e(Uri uri) {
        return new c().m33734g(uri).m33728a();
    }

    /* renamed from: f */
    public static C11010c2 m33726f(String str) {
        return new c().m33735h(str).m33728a();
    }

    @Override // p361t6.InterfaceC11076o
    /* renamed from: a */
    public Bundle mo22762a() {
        Bundle bundle = new Bundle();
        if (!this.f28023a.equals("")) {
            bundle.putString(f28017u, this.f28023a);
        }
        if (!this.f28026d.equals(g.f28080f)) {
            bundle.putBundle(f28018v, this.f28026d.mo22762a());
        }
        if (!this.f28027e.equals(C11040h2.f28306T)) {
            bundle.putBundle(f28019w, this.f28027e.mo22762a());
        }
        if (!this.f28028f.equals(d.f28043f)) {
            bundle.putBundle(f28020x, this.f28028f.mo22762a());
        }
        if (!this.f28030s.equals(j.f28105d)) {
            bundle.putBundle(f28021y, this.f28030s.mo22762a());
        }
        return bundle;
    }

    /* renamed from: c */
    public c m33727c() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11010c2)) {
            return false;
        }
        C11010c2 c11010c2 = (C11010c2) obj;
        return C11172r0.m34914c(this.f28023a, c11010c2.f28023a) && this.f28028f.equals(c11010c2.f28028f) && C11172r0.m34914c(this.f28024b, c11010c2.f28024b) && C11172r0.m34914c(this.f28026d, c11010c2.f28026d) && C11172r0.m34914c(this.f28027e, c11010c2.f28027e) && C11172r0.m34914c(this.f28030s, c11010c2.f28030s);
    }

    public int hashCode() {
        int hashCode = this.f28023a.hashCode() * 31;
        h hVar = this.f28024b;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f28026d.hashCode()) * 31) + this.f28028f.hashCode()) * 31) + this.f28027e.hashCode()) * 31) + this.f28030s.hashCode();
    }
}
