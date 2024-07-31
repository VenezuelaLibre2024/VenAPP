package a1;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import mk.k;
import zk.k0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f43a = new c();

    /* loaded from: classes.dex */
    static final class a extends o implements ok.a<File> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ok.a<File> f44a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ok.a<? extends File> aVar) {
            super(0);
            this.f44a = aVar;
        }

        @Override // ok.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            String e10;
            File invoke = this.f44a.invoke();
            e10 = k.e(invoke);
            h hVar = h.f51a;
            if (n.a(e10, hVar.f())) {
                return invoke;
            }
            throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + hVar.f()).toString());
        }
    }

    private c() {
    }

    public final x0.f<d> a(y0.b<d> bVar, List<? extends x0.d<d>> migrations, k0 scope, ok.a<? extends File> produceFile) {
        n.e(migrations, "migrations");
        n.e(scope, "scope");
        n.e(produceFile, "produceFile");
        return new b(x0.g.f30245a.a(h.f51a, bVar, migrations, scope, new a(produceFile)));
    }
}
