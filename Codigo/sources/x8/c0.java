package x8;

import com.google.android.gms.ads.internal.client.n4;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30661a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30662b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30663c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f30664a = true;

        /* renamed from: b, reason: collision with root package name */
        private boolean f30665b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f30666c = false;

        public c0 a() {
            return new c0(this, null);
        }

        public a b(boolean z10) {
            this.f30666c = z10;
            return this;
        }

        public a c(boolean z10) {
            this.f30665b = z10;
            return this;
        }

        public a d(boolean z10) {
            this.f30664a = z10;
            return this;
        }
    }

    public c0(n4 n4Var) {
        this.f30661a = n4Var.f8712a;
        this.f30662b = n4Var.f8713b;
        this.f30663c = n4Var.f8714c;
    }

    /* synthetic */ c0(a aVar, l0 l0Var) {
        this.f30661a = aVar.f30664a;
        this.f30662b = aVar.f30665b;
        this.f30663c = aVar.f30666c;
    }

    public boolean a() {
        return this.f30663c;
    }

    public boolean b() {
        return this.f30662b;
    }

    public boolean c() {
        return this.f30661a;
    }
}
