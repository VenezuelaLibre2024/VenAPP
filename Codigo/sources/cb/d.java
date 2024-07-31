package cb;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7012a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7013b;

    /* renamed from: c, reason: collision with root package name */
    private final cb.a f7014c;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f7015a;

        /* renamed from: b, reason: collision with root package name */
        private String f7016b;

        /* renamed from: c, reason: collision with root package name */
        private cb.a f7017c;

        @RecentlyNonNull
        public d a() {
            return new d(this, null);
        }

        @RecentlyNonNull
        public a b(cb.a aVar) {
            this.f7017c = aVar;
            return this;
        }

        @RecentlyNonNull
        public a c(boolean z10) {
            this.f7015a = z10;
            return this;
        }
    }

    /* synthetic */ d(a aVar, h hVar) {
        this.f7012a = aVar.f7015a;
        this.f7013b = aVar.f7016b;
        this.f7014c = aVar.f7017c;
    }

    @RecentlyNullable
    public cb.a a() {
        return this.f7014c;
    }

    public boolean b() {
        return this.f7012a;
    }

    @RecentlyNullable
    public final String c() {
        return this.f7013b;
    }
}
