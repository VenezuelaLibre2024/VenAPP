package t6;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.w;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import t6.c2;
import t6.o;

/* loaded from: classes.dex */
public final class c2 implements o {

    /* renamed from: t, reason: collision with root package name */
    public static final c2 f25872t = new c().a();

    /* renamed from: u, reason: collision with root package name */
    private static final String f25873u = t8.r0.r0(0);

    /* renamed from: v, reason: collision with root package name */
    private static final String f25874v = t8.r0.r0(1);

    /* renamed from: w, reason: collision with root package name */
    private static final String f25875w = t8.r0.r0(2);

    /* renamed from: x, reason: collision with root package name */
    private static final String f25876x = t8.r0.r0(3);

    /* renamed from: y, reason: collision with root package name */
    private static final String f25877y = t8.r0.r0(4);

    /* renamed from: z, reason: collision with root package name */
    public static final o.a<c2> f25878z = new o.a() { // from class: t6.b2
        @Override // t6.o.a
        public final o a(Bundle bundle) {
            c2 d10;
            d10 = c2.d(bundle);
            return d10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f25879a;

    /* renamed from: b, reason: collision with root package name */
    public final h f25880b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final i f25881c;

    /* renamed from: d, reason: collision with root package name */
    public final g f25882d;

    /* renamed from: e, reason: collision with root package name */
    public final h2 f25883e;

    /* renamed from: f, reason: collision with root package name */
    public final d f25884f;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public final e f25885r;

    /* renamed from: s, reason: collision with root package name */
    public final j f25886s;

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private String f25887a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f25888b;

        /* renamed from: c, reason: collision with root package name */
        private String f25889c;

        /* renamed from: d, reason: collision with root package name */
        private d.a f25890d;

        /* renamed from: e, reason: collision with root package name */
        private f.a f25891e;

        /* renamed from: f, reason: collision with root package name */
        private List<u7.c> f25892f;

        /* renamed from: g, reason: collision with root package name */
        private String f25893g;

        /* renamed from: h, reason: collision with root package name */
        private com.google.common.collect.w<l> f25894h;

        /* renamed from: i, reason: collision with root package name */
        private Object f25895i;

        /* renamed from: j, reason: collision with root package name */
        private h2 f25896j;

        /* renamed from: k, reason: collision with root package name */
        private g.a f25897k;

        /* renamed from: l, reason: collision with root package name */
        private j f25898l;

        public c() {
            this.f25890d = new d.a();
            this.f25891e = new f.a();
            this.f25892f = Collections.emptyList();
            this.f25894h = com.google.common.collect.w.v();
            this.f25897k = new g.a();
            this.f25898l = j.f25961d;
        }

        private c(c2 c2Var) {
            this();
            this.f25890d = c2Var.f25884f.c();
            this.f25887a = c2Var.f25879a;
            this.f25896j = c2Var.f25883e;
            this.f25897k = c2Var.f25882d.c();
            this.f25898l = c2Var.f25886s;
            h hVar = c2Var.f25880b;
            if (hVar != null) {
                this.f25893g = hVar.f25957e;
                this.f25889c = hVar.f25954b;
                this.f25888b = hVar.f25953a;
                this.f25892f = hVar.f25956d;
                this.f25894h = hVar.f25958f;
                this.f25895i = hVar.f25960h;
                f fVar = hVar.f25955c;
                this.f25891e = fVar != null ? fVar.b() : new f.a();
            }
        }

        public c2 a() {
            i iVar;
            t8.a.g(this.f25891e.f25929b == null || this.f25891e.f25928a != null);
            Uri uri = this.f25888b;
            if (uri != null) {
                iVar = new i(uri, this.f25889c, this.f25891e.f25928a != null ? this.f25891e.i() : null, null, this.f25892f, this.f25893g, this.f25894h, this.f25895i);
            } else {
                iVar = null;
            }
            String str = this.f25887a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e g10 = this.f25890d.g();
            g f10 = this.f25897k.f();
            h2 h2Var = this.f25896j;
            if (h2Var == null) {
                h2Var = h2.T;
            }
            return new c2(str2, g10, iVar, f10, h2Var, this.f25898l);
        }

        public c b(String str) {
            this.f25893g = str;
            return this;
        }

        public c c(g gVar) {
            this.f25897k = gVar.c();
            return this;
        }

        public c d(String str) {
            this.f25887a = (String) t8.a.e(str);
            return this;
        }

        public c e(List<l> list) {
            this.f25894h = com.google.common.collect.w.r(list);
            return this;
        }

        public c f(Object obj) {
            this.f25895i = obj;
            return this;
        }

        public c g(Uri uri) {
            this.f25888b = uri;
            return this;
        }

        public c h(String str) {
            return g(str == null ? null : Uri.parse(str));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements o {

        /* renamed from: f, reason: collision with root package name */
        public static final d f25899f = new a().f();

        /* renamed from: r, reason: collision with root package name */
        private static final String f25900r = t8.r0.r0(0);

        /* renamed from: s, reason: collision with root package name */
        private static final String f25901s = t8.r0.r0(1);

        /* renamed from: t, reason: collision with root package name */
        private static final String f25902t = t8.r0.r0(2);

        /* renamed from: u, reason: collision with root package name */
        private static final String f25903u = t8.r0.r0(3);

        /* renamed from: v, reason: collision with root package name */
        private static final String f25904v = t8.r0.r0(4);

        /* renamed from: w, reason: collision with root package name */
        public static final o.a<e> f25905w = new o.a() { // from class: t6.d2
            @Override // t6.o.a
            public final o a(Bundle bundle) {
                c2.e d10;
                d10 = c2.d.d(bundle);
                return d10;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final long f25906a;

        /* renamed from: b, reason: collision with root package name */
        public final long f25907b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f25908c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f25909d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f25910e;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f25911a;

            /* renamed from: b, reason: collision with root package name */
            private long f25912b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f25913c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f25914d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f25915e;

            public a() {
                this.f25912b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f25911a = dVar.f25906a;
                this.f25912b = dVar.f25907b;
                this.f25913c = dVar.f25908c;
                this.f25914d = dVar.f25909d;
                this.f25915e = dVar.f25910e;
            }

            public d f() {
                return g();
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            public a h(long j10) {
                t8.a.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f25912b = j10;
                return this;
            }

            public a i(boolean z10) {
                this.f25914d = z10;
                return this;
            }

            public a j(boolean z10) {
                this.f25913c = z10;
                return this;
            }

            public a k(long j10) {
                t8.a.a(j10 >= 0);
                this.f25911a = j10;
                return this;
            }

            public a l(boolean z10) {
                this.f25915e = z10;
                return this;
            }
        }

        private d(a aVar) {
            this.f25906a = aVar.f25911a;
            this.f25907b = aVar.f25912b;
            this.f25908c = aVar.f25913c;
            this.f25909d = aVar.f25914d;
            this.f25910e = aVar.f25915e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e d(Bundle bundle) {
            a aVar = new a();
            String str = f25900r;
            d dVar = f25899f;
            return aVar.k(bundle.getLong(str, dVar.f25906a)).h(bundle.getLong(f25901s, dVar.f25907b)).j(bundle.getBoolean(f25902t, dVar.f25908c)).i(bundle.getBoolean(f25903u, dVar.f25909d)).l(bundle.getBoolean(f25904v, dVar.f25910e)).g();
        }

        @Override // t6.o
        public Bundle a() {
            Bundle bundle = new Bundle();
            long j10 = this.f25906a;
            d dVar = f25899f;
            if (j10 != dVar.f25906a) {
                bundle.putLong(f25900r, j10);
            }
            long j11 = this.f25907b;
            if (j11 != dVar.f25907b) {
                bundle.putLong(f25901s, j11);
            }
            boolean z10 = this.f25908c;
            if (z10 != dVar.f25908c) {
                bundle.putBoolean(f25902t, z10);
            }
            boolean z11 = this.f25909d;
            if (z11 != dVar.f25909d) {
                bundle.putBoolean(f25903u, z11);
            }
            boolean z12 = this.f25910e;
            if (z12 != dVar.f25910e) {
                bundle.putBoolean(f25904v, z12);
            }
            return bundle;
        }

        public a c() {
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
            return this.f25906a == dVar.f25906a && this.f25907b == dVar.f25907b && this.f25908c == dVar.f25908c && this.f25909d == dVar.f25909d && this.f25910e == dVar.f25910e;
        }

        public int hashCode() {
            long j10 = this.f25906a;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f25907b;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f25908c ? 1 : 0)) * 31) + (this.f25909d ? 1 : 0)) * 31) + (this.f25910e ? 1 : 0);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class e extends d {

        /* renamed from: x, reason: collision with root package name */
        public static final e f25916x = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f25917a;

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final UUID f25918b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f25919c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public final com.google.common.collect.y<String, String> f25920d;

        /* renamed from: e, reason: collision with root package name */
        public final com.google.common.collect.y<String, String> f25921e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f25922f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f25923g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f25924h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public final com.google.common.collect.w<Integer> f25925i;

        /* renamed from: j, reason: collision with root package name */
        public final com.google.common.collect.w<Integer> f25926j;

        /* renamed from: k, reason: collision with root package name */
        private final byte[] f25927k;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private UUID f25928a;

            /* renamed from: b, reason: collision with root package name */
            private Uri f25929b;

            /* renamed from: c, reason: collision with root package name */
            private com.google.common.collect.y<String, String> f25930c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f25931d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f25932e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f25933f;

            /* renamed from: g, reason: collision with root package name */
            private com.google.common.collect.w<Integer> f25934g;

            /* renamed from: h, reason: collision with root package name */
            private byte[] f25935h;

            @Deprecated
            private a() {
                this.f25930c = com.google.common.collect.y.k();
                this.f25934g = com.google.common.collect.w.v();
            }

            private a(f fVar) {
                this.f25928a = fVar.f25917a;
                this.f25929b = fVar.f25919c;
                this.f25930c = fVar.f25921e;
                this.f25931d = fVar.f25922f;
                this.f25932e = fVar.f25923g;
                this.f25933f = fVar.f25924h;
                this.f25934g = fVar.f25926j;
                this.f25935h = fVar.f25927k;
            }

            public f i() {
                return new f(this);
            }
        }

        private f(a aVar) {
            t8.a.g((aVar.f25933f && aVar.f25929b == null) ? false : true);
            UUID uuid = (UUID) t8.a.e(aVar.f25928a);
            this.f25917a = uuid;
            this.f25918b = uuid;
            this.f25919c = aVar.f25929b;
            this.f25920d = aVar.f25930c;
            this.f25921e = aVar.f25930c;
            this.f25922f = aVar.f25931d;
            this.f25924h = aVar.f25933f;
            this.f25923g = aVar.f25932e;
            this.f25925i = aVar.f25934g;
            this.f25926j = aVar.f25934g;
            this.f25927k = aVar.f25935h != null ? Arrays.copyOf(aVar.f25935h, aVar.f25935h.length) : null;
        }

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f25927k;
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
            return this.f25917a.equals(fVar.f25917a) && t8.r0.c(this.f25919c, fVar.f25919c) && t8.r0.c(this.f25921e, fVar.f25921e) && this.f25922f == fVar.f25922f && this.f25924h == fVar.f25924h && this.f25923g == fVar.f25923g && this.f25926j.equals(fVar.f25926j) && Arrays.equals(this.f25927k, fVar.f25927k);
        }

        public int hashCode() {
            int hashCode = this.f25917a.hashCode() * 31;
            Uri uri = this.f25919c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f25921e.hashCode()) * 31) + (this.f25922f ? 1 : 0)) * 31) + (this.f25924h ? 1 : 0)) * 31) + (this.f25923g ? 1 : 0)) * 31) + this.f25926j.hashCode()) * 31) + Arrays.hashCode(this.f25927k);
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements o {

        /* renamed from: f, reason: collision with root package name */
        public static final g f25936f = new a().f();

        /* renamed from: r, reason: collision with root package name */
        private static final String f25937r = t8.r0.r0(0);

        /* renamed from: s, reason: collision with root package name */
        private static final String f25938s = t8.r0.r0(1);

        /* renamed from: t, reason: collision with root package name */
        private static final String f25939t = t8.r0.r0(2);

        /* renamed from: u, reason: collision with root package name */
        private static final String f25940u = t8.r0.r0(3);

        /* renamed from: v, reason: collision with root package name */
        private static final String f25941v = t8.r0.r0(4);

        /* renamed from: w, reason: collision with root package name */
        public static final o.a<g> f25942w = new o.a() { // from class: t6.e2
            @Override // t6.o.a
            public final o a(Bundle bundle) {
                c2.g d10;
                d10 = c2.g.d(bundle);
                return d10;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final long f25943a;

        /* renamed from: b, reason: collision with root package name */
        public final long f25944b;

        /* renamed from: c, reason: collision with root package name */
        public final long f25945c;

        /* renamed from: d, reason: collision with root package name */
        public final float f25946d;

        /* renamed from: e, reason: collision with root package name */
        public final float f25947e;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f25948a;

            /* renamed from: b, reason: collision with root package name */
            private long f25949b;

            /* renamed from: c, reason: collision with root package name */
            private long f25950c;

            /* renamed from: d, reason: collision with root package name */
            private float f25951d;

            /* renamed from: e, reason: collision with root package name */
            private float f25952e;

            public a() {
                this.f25948a = -9223372036854775807L;
                this.f25949b = -9223372036854775807L;
                this.f25950c = -9223372036854775807L;
                this.f25951d = -3.4028235E38f;
                this.f25952e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f25948a = gVar.f25943a;
                this.f25949b = gVar.f25944b;
                this.f25950c = gVar.f25945c;
                this.f25951d = gVar.f25946d;
                this.f25952e = gVar.f25947e;
            }

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f25950c = j10;
                return this;
            }

            public a h(float f10) {
                this.f25952e = f10;
                return this;
            }

            public a i(long j10) {
                this.f25949b = j10;
                return this;
            }

            public a j(float f10) {
                this.f25951d = f10;
                return this;
            }

            public a k(long j10) {
                this.f25948a = j10;
                return this;
            }
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f25943a = j10;
            this.f25944b = j11;
            this.f25945c = j12;
            this.f25946d = f10;
            this.f25947e = f11;
        }

        private g(a aVar) {
            this(aVar.f25948a, aVar.f25949b, aVar.f25950c, aVar.f25951d, aVar.f25952e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ g d(Bundle bundle) {
            String str = f25937r;
            g gVar = f25936f;
            return new g(bundle.getLong(str, gVar.f25943a), bundle.getLong(f25938s, gVar.f25944b), bundle.getLong(f25939t, gVar.f25945c), bundle.getFloat(f25940u, gVar.f25946d), bundle.getFloat(f25941v, gVar.f25947e));
        }

        @Override // t6.o
        public Bundle a() {
            Bundle bundle = new Bundle();
            long j10 = this.f25943a;
            g gVar = f25936f;
            if (j10 != gVar.f25943a) {
                bundle.putLong(f25937r, j10);
            }
            long j11 = this.f25944b;
            if (j11 != gVar.f25944b) {
                bundle.putLong(f25938s, j11);
            }
            long j12 = this.f25945c;
            if (j12 != gVar.f25945c) {
                bundle.putLong(f25939t, j12);
            }
            float f10 = this.f25946d;
            if (f10 != gVar.f25946d) {
                bundle.putFloat(f25940u, f10);
            }
            float f11 = this.f25947e;
            if (f11 != gVar.f25947e) {
                bundle.putFloat(f25941v, f11);
            }
            return bundle;
        }

        public a c() {
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
            return this.f25943a == gVar.f25943a && this.f25944b == gVar.f25944b && this.f25945c == gVar.f25945c && this.f25946d == gVar.f25946d && this.f25947e == gVar.f25947e;
        }

        public int hashCode() {
            long j10 = this.f25943a;
            long j11 = this.f25944b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f25945c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f25946d;
            int floatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f25947e;
            return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f25953a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25954b;

        /* renamed from: c, reason: collision with root package name */
        public final f f25955c;

        /* renamed from: d, reason: collision with root package name */
        public final List<u7.c> f25956d;

        /* renamed from: e, reason: collision with root package name */
        public final String f25957e;

        /* renamed from: f, reason: collision with root package name */
        public final com.google.common.collect.w<l> f25958f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public final List<k> f25959g;

        /* renamed from: h, reason: collision with root package name */
        public final Object f25960h;

        private h(Uri uri, String str, f fVar, b bVar, List<u7.c> list, String str2, com.google.common.collect.w<l> wVar, Object obj) {
            this.f25953a = uri;
            this.f25954b = str;
            this.f25955c = fVar;
            this.f25956d = list;
            this.f25957e = str2;
            this.f25958f = wVar;
            w.a p10 = com.google.common.collect.w.p();
            for (int i10 = 0; i10 < wVar.size(); i10++) {
                p10.a(wVar.get(i10).a().i());
            }
            this.f25959g = p10.k();
            this.f25960h = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f25953a.equals(hVar.f25953a) && t8.r0.c(this.f25954b, hVar.f25954b) && t8.r0.c(this.f25955c, hVar.f25955c) && t8.r0.c(null, null) && this.f25956d.equals(hVar.f25956d) && t8.r0.c(this.f25957e, hVar.f25957e) && this.f25958f.equals(hVar.f25958f) && t8.r0.c(this.f25960h, hVar.f25960h);
        }

        public int hashCode() {
            int hashCode = this.f25953a.hashCode() * 31;
            String str = this.f25954b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f25955c;
            int hashCode3 = (((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f25956d.hashCode()) * 31;
            String str2 = this.f25957e;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25958f.hashCode()) * 31;
            Object obj = this.f25960h;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class i extends h {
        private i(Uri uri, String str, f fVar, b bVar, List<u7.c> list, String str2, com.google.common.collect.w<l> wVar, Object obj) {
            super(uri, str, fVar, bVar, list, str2, wVar, obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements o {

        /* renamed from: d, reason: collision with root package name */
        public static final j f25961d = new a().d();

        /* renamed from: e, reason: collision with root package name */
        private static final String f25962e = t8.r0.r0(0);

        /* renamed from: f, reason: collision with root package name */
        private static final String f25963f = t8.r0.r0(1);

        /* renamed from: r, reason: collision with root package name */
        private static final String f25964r = t8.r0.r0(2);

        /* renamed from: s, reason: collision with root package name */
        public static final o.a<j> f25965s = new o.a() { // from class: t6.f2
            @Override // t6.o.a
            public final o a(Bundle bundle) {
                c2.j c10;
                c10 = c2.j.c(bundle);
                return c10;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final Uri f25966a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25967b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f25968c;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f25969a;

            /* renamed from: b, reason: collision with root package name */
            private String f25970b;

            /* renamed from: c, reason: collision with root package name */
            private Bundle f25971c;

            public j d() {
                return new j(this);
            }

            public a e(Bundle bundle) {
                this.f25971c = bundle;
                return this;
            }

            public a f(Uri uri) {
                this.f25969a = uri;
                return this;
            }

            public a g(String str) {
                this.f25970b = str;
                return this;
            }
        }

        private j(a aVar) {
            this.f25966a = aVar.f25969a;
            this.f25967b = aVar.f25970b;
            this.f25968c = aVar.f25971c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ j c(Bundle bundle) {
            return new a().f((Uri) bundle.getParcelable(f25962e)).g(bundle.getString(f25963f)).e(bundle.getBundle(f25964r)).d();
        }

        @Override // t6.o
        public Bundle a() {
            Bundle bundle = new Bundle();
            Uri uri = this.f25966a;
            if (uri != null) {
                bundle.putParcelable(f25962e, uri);
            }
            String str = this.f25967b;
            if (str != null) {
                bundle.putString(f25963f, str);
            }
            Bundle bundle2 = this.f25968c;
            if (bundle2 != null) {
                bundle.putBundle(f25964r, bundle2);
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
            return t8.r0.c(this.f25966a, jVar.f25966a) && t8.r0.c(this.f25967b, jVar.f25967b);
        }

        public int hashCode() {
            Uri uri = this.f25966a;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f25967b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class k extends l {
        private k(l.a aVar) {
            super(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f25972a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25973b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25974c;

        /* renamed from: d, reason: collision with root package name */
        public final int f25975d;

        /* renamed from: e, reason: collision with root package name */
        public final int f25976e;

        /* renamed from: f, reason: collision with root package name */
        public final String f25977f;

        /* renamed from: g, reason: collision with root package name */
        public final String f25978g;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f25979a;

            /* renamed from: b, reason: collision with root package name */
            private String f25980b;

            /* renamed from: c, reason: collision with root package name */
            private String f25981c;

            /* renamed from: d, reason: collision with root package name */
            private int f25982d;

            /* renamed from: e, reason: collision with root package name */
            private int f25983e;

            /* renamed from: f, reason: collision with root package name */
            private String f25984f;

            /* renamed from: g, reason: collision with root package name */
            private String f25985g;

            private a(l lVar) {
                this.f25979a = lVar.f25972a;
                this.f25980b = lVar.f25973b;
                this.f25981c = lVar.f25974c;
                this.f25982d = lVar.f25975d;
                this.f25983e = lVar.f25976e;
                this.f25984f = lVar.f25977f;
                this.f25985g = lVar.f25978g;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public k i() {
                return new k(this);
            }
        }

        private l(a aVar) {
            this.f25972a = aVar.f25979a;
            this.f25973b = aVar.f25980b;
            this.f25974c = aVar.f25981c;
            this.f25975d = aVar.f25982d;
            this.f25976e = aVar.f25983e;
            this.f25977f = aVar.f25984f;
            this.f25978g = aVar.f25985g;
        }

        public a a() {
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
            return this.f25972a.equals(lVar.f25972a) && t8.r0.c(this.f25973b, lVar.f25973b) && t8.r0.c(this.f25974c, lVar.f25974c) && this.f25975d == lVar.f25975d && this.f25976e == lVar.f25976e && t8.r0.c(this.f25977f, lVar.f25977f) && t8.r0.c(this.f25978g, lVar.f25978g);
        }

        public int hashCode() {
            int hashCode = this.f25972a.hashCode() * 31;
            String str = this.f25973b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25974c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25975d) * 31) + this.f25976e) * 31;
            String str3 = this.f25977f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25978g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    private c2(String str, e eVar, i iVar, g gVar, h2 h2Var, j jVar) {
        this.f25879a = str;
        this.f25880b = iVar;
        this.f25881c = iVar;
        this.f25882d = gVar;
        this.f25883e = h2Var;
        this.f25884f = eVar;
        this.f25885r = eVar;
        this.f25886s = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c2 d(Bundle bundle) {
        String str = (String) t8.a.e(bundle.getString(f25873u, ""));
        Bundle bundle2 = bundle.getBundle(f25874v);
        g a10 = bundle2 == null ? g.f25936f : g.f25942w.a(bundle2);
        Bundle bundle3 = bundle.getBundle(f25875w);
        h2 a11 = bundle3 == null ? h2.T : h2.B0.a(bundle3);
        Bundle bundle4 = bundle.getBundle(f25876x);
        e a12 = bundle4 == null ? e.f25916x : d.f25905w.a(bundle4);
        Bundle bundle5 = bundle.getBundle(f25877y);
        return new c2(str, a12, null, a10, a11, bundle5 == null ? j.f25961d : j.f25965s.a(bundle5));
    }

    public static c2 e(Uri uri) {
        return new c().g(uri).a();
    }

    public static c2 f(String str) {
        return new c().h(str).a();
    }

    @Override // t6.o
    public Bundle a() {
        Bundle bundle = new Bundle();
        if (!this.f25879a.equals("")) {
            bundle.putString(f25873u, this.f25879a);
        }
        if (!this.f25882d.equals(g.f25936f)) {
            bundle.putBundle(f25874v, this.f25882d.a());
        }
        if (!this.f25883e.equals(h2.T)) {
            bundle.putBundle(f25875w, this.f25883e.a());
        }
        if (!this.f25884f.equals(d.f25899f)) {
            bundle.putBundle(f25876x, this.f25884f.a());
        }
        if (!this.f25886s.equals(j.f25961d)) {
            bundle.putBundle(f25877y, this.f25886s.a());
        }
        return bundle;
    }

    public c c() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return t8.r0.c(this.f25879a, c2Var.f25879a) && this.f25884f.equals(c2Var.f25884f) && t8.r0.c(this.f25880b, c2Var.f25880b) && t8.r0.c(this.f25882d, c2Var.f25882d) && t8.r0.c(this.f25883e, c2Var.f25883e) && t8.r0.c(this.f25886s, c2Var.f25886s);
    }

    public int hashCode() {
        int hashCode = this.f25879a.hashCode() * 31;
        h hVar = this.f25880b;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f25882d.hashCode()) * 31) + this.f25884f.hashCode()) * 31) + this.f25883e.hashCode()) * 31) + this.f25886s.hashCode();
    }
}
