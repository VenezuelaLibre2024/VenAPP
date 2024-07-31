package p042cb;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* renamed from: cb.d */
/* loaded from: classes2.dex */
public class C1935d {

    /* renamed from: a */
    private final boolean f7964a;

    /* renamed from: b */
    private final String f7965b;

    /* renamed from: c */
    private final C1932a f7966c;

    /* renamed from: cb.d$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f7967a;

        /* renamed from: b */
        private String f7968b;

        /* renamed from: c */
        private C1932a f7969c;

        @RecentlyNonNull
        /* renamed from: a */
        public C1935d m10137a() {
            return new C1935d(this, null);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public a m10138b(C1932a c1932a) {
            this.f7969c = c1932a;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public a m10139c(boolean z10) {
            this.f7967a = z10;
            return this;
        }
    }

    /* synthetic */ C1935d(a aVar, C1939h c1939h) {
        this.f7964a = aVar.f7967a;
        this.f7965b = aVar.f7968b;
        this.f7966c = aVar.f7969c;
    }

    @RecentlyNullable
    /* renamed from: a */
    public C1932a m10131a() {
        return this.f7966c;
    }

    /* renamed from: b */
    public boolean m10132b() {
        return this.f7964a;
    }

    @RecentlyNullable
    /* renamed from: c */
    public final String m10133c() {
        return this.f7965b;
    }
}
