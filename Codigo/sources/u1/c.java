package u1;

import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f27015d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final d f27016a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.savedstate.a f27017b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27018c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a(d owner) {
            n.e(owner, "owner");
            return new c(owner, null);
        }
    }

    private c(d dVar) {
        this.f27016a = dVar;
        this.f27017b = new androidx.savedstate.a();
    }

    public /* synthetic */ c(d dVar, g gVar) {
        this(dVar);
    }

    public static final c a(d dVar) {
        return f27015d.a(dVar);
    }

    public final androidx.savedstate.a b() {
        return this.f27017b;
    }

    public final void c() {
        f lifecycle = this.f27016a.getLifecycle();
        if (!(lifecycle.b() == f.b.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new Recreator(this.f27016a));
        this.f27017b.e(lifecycle);
        this.f27018c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f27018c) {
            c();
        }
        f lifecycle = this.f27016a.getLifecycle();
        if (!lifecycle.b().h(f.b.STARTED)) {
            this.f27017b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle outBundle) {
        n.e(outBundle, "outBundle");
        this.f27017b.g(outBundle);
    }
}
