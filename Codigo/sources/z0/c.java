package z0;

import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ok.l;
import zk.k0;

/* loaded from: classes.dex */
public final class c implements rk.a<Context, x0.f<a1.d>> {

    /* renamed from: a, reason: collision with root package name */
    private final String f32240a;

    /* renamed from: b, reason: collision with root package name */
    private final l<Context, List<x0.d<a1.d>>> f32241b;

    /* renamed from: c, reason: collision with root package name */
    private final k0 f32242c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f32243d;

    /* renamed from: e, reason: collision with root package name */
    private volatile x0.f<a1.d> f32244e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends o implements ok.a<File> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f32245a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f32246b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, c cVar) {
            super(0);
            this.f32245a = context;
            this.f32246b = cVar;
        }

        @Override // ok.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f32245a;
            n.d(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f32246b.f32240a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(String name, y0.b<a1.d> bVar, l<? super Context, ? extends List<? extends x0.d<a1.d>>> produceMigrations, k0 scope) {
        n.e(name, "name");
        n.e(produceMigrations, "produceMigrations");
        n.e(scope, "scope");
        this.f32240a = name;
        this.f32241b = produceMigrations;
        this.f32242c = scope;
        this.f32243d = new Object();
    }

    @Override // rk.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public x0.f<a1.d> a(Context thisRef, vk.h<?> property) {
        x0.f<a1.d> fVar;
        n.e(thisRef, "thisRef");
        n.e(property, "property");
        x0.f<a1.d> fVar2 = this.f32244e;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (this.f32243d) {
            if (this.f32244e == null) {
                Context applicationContext = thisRef.getApplicationContext();
                a1.c cVar = a1.c.f43a;
                l<Context, List<x0.d<a1.d>>> lVar = this.f32241b;
                n.d(applicationContext, "applicationContext");
                this.f32244e = cVar.a(null, lVar.invoke(applicationContext), this.f32242c, new a(applicationContext, this));
            }
            fVar = this.f32244e;
            n.b(fVar);
        }
        return fVar;
    }
}
