package g0;

import androidx.concurrent.futures.c;
import java.util.Objects;
import java.util.concurrent.Executor;
import w.k0;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f15696a;

    /* renamed from: b, reason: collision with root package name */
    private final w.k0 f15697b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.core.util.a<Throwable> f15698c;

    public z(w.k kVar) {
        androidx.core.util.h.a(kVar.f() == 4);
        this.f15696a = kVar.c();
        w.k0 d10 = kVar.d();
        Objects.requireNonNull(d10);
        this.f15697b = d10;
        this.f15698c = kVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(k0.a aVar, c.a aVar2) {
        aVar2.c(this.f15697b.a(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(final k0.a aVar, final c.a aVar2) {
        this.f15696a.execute(new Runnable() { // from class: g0.y
            @Override // java.lang.Runnable
            public final void run() {
                z.this.c(aVar, aVar2);
            }
        });
        return "InternalImageProcessor#process " + aVar.hashCode();
    }

    public k0.b e(final k0.a aVar) {
        try {
            return (k0.b) androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: g0.x
                @Override // androidx.concurrent.futures.c.InterfaceC0032c
                public final Object a(c.a aVar2) {
                    Object d10;
                    d10 = z.this.d(aVar, aVar2);
                    return d10;
                }
            }).get();
        } catch (Exception e10) {
            e = e10;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new w.g0(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
