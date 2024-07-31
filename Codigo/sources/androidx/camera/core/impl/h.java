package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.b2;

/* loaded from: classes.dex */
final class h extends b2 {

    /* renamed from: b, reason: collision with root package name */
    private final Size f2485b;

    /* renamed from: c, reason: collision with root package name */
    private final w.y f2486c;

    /* renamed from: d, reason: collision with root package name */
    private final Range<Integer> f2487d;

    /* renamed from: e, reason: collision with root package name */
    private final n0 f2488e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends b2.a {

        /* renamed from: a, reason: collision with root package name */
        private Size f2489a;

        /* renamed from: b, reason: collision with root package name */
        private w.y f2490b;

        /* renamed from: c, reason: collision with root package name */
        private Range<Integer> f2491c;

        /* renamed from: d, reason: collision with root package name */
        private n0 f2492d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(b2 b2Var) {
            this.f2489a = b2Var.e();
            this.f2490b = b2Var.b();
            this.f2491c = b2Var.c();
            this.f2492d = b2Var.d();
        }

        @Override // androidx.camera.core.impl.b2.a
        public b2 a() {
            String str = "";
            if (this.f2489a == null) {
                str = " resolution";
            }
            if (this.f2490b == null) {
                str = str + " dynamicRange";
            }
            if (this.f2491c == null) {
                str = str + " expectedFrameRateRange";
            }
            if (str.isEmpty()) {
                return new h(this.f2489a, this.f2490b, this.f2491c, this.f2492d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.b2.a
        public b2.a b(w.y yVar) {
            if (yVar == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f2490b = yVar;
            return this;
        }

        @Override // androidx.camera.core.impl.b2.a
        public b2.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f2491c = range;
            return this;
        }

        @Override // androidx.camera.core.impl.b2.a
        public b2.a d(n0 n0Var) {
            this.f2492d = n0Var;
            return this;
        }

        @Override // androidx.camera.core.impl.b2.a
        public b2.a e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f2489a = size;
            return this;
        }
    }

    private h(Size size, w.y yVar, Range<Integer> range, n0 n0Var) {
        this.f2485b = size;
        this.f2486c = yVar;
        this.f2487d = range;
        this.f2488e = n0Var;
    }

    @Override // androidx.camera.core.impl.b2
    public w.y b() {
        return this.f2486c;
    }

    @Override // androidx.camera.core.impl.b2
    public Range<Integer> c() {
        return this.f2487d;
    }

    @Override // androidx.camera.core.impl.b2
    public n0 d() {
        return this.f2488e;
    }

    @Override // androidx.camera.core.impl.b2
    public Size e() {
        return this.f2485b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        if (this.f2485b.equals(b2Var.e()) && this.f2486c.equals(b2Var.b()) && this.f2487d.equals(b2Var.c())) {
            n0 n0Var = this.f2488e;
            n0 d10 = b2Var.d();
            if (n0Var == null) {
                if (d10 == null) {
                    return true;
                }
            } else if (n0Var.equals(d10)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.b2
    public b2.a f() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (((((this.f2485b.hashCode() ^ 1000003) * 1000003) ^ this.f2486c.hashCode()) * 1000003) ^ this.f2487d.hashCode()) * 1000003;
        n0 n0Var = this.f2488e;
        return hashCode ^ (n0Var == null ? 0 : n0Var.hashCode());
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f2485b + ", dynamicRange=" + this.f2486c + ", expectedFrameRateRange=" + this.f2487d + ", implementationOptions=" + this.f2488e + "}";
    }
}
