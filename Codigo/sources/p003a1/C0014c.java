package p003a1;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import mk.C9611k;
import p280ok.InterfaceC9987a;
import p430x0.C12256g;
import p430x0.InterfaceC12253d;
import p430x0.InterfaceC12255f;
import p453y0.C12579b;
import p494zk.InterfaceC13076k0;

/* renamed from: a1.c */
/* loaded from: classes.dex */
public final class C0014c {

    /* renamed from: a */
    public static final C0014c f43a = new C0014c();

    /* renamed from: a1.c$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC9323o implements InterfaceC9987a<File> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC9987a<File> f44a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC9987a<? extends File> interfaceC9987a) {
            super(0);
            this.f44a = interfaceC9987a;
        }

        @Override // p280ok.InterfaceC9987a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            String m28605e;
            File invoke = this.f44a.invoke();
            m28605e = C9611k.m28605e(invoke);
            C0019h c0019h = C0019h.f51a;
            if (C9322n.m27777a(m28605e, c0019h.m73f())) {
                return invoke;
            }
            throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + c0019h.m73f()).toString());
        }
    }

    private C0014c() {
    }

    /* renamed from: a */
    public final InterfaceC12255f<AbstractC0015d> m49a(C12579b<AbstractC0015d> c12579b, List<? extends InterfaceC12253d<AbstractC0015d>> migrations, InterfaceC13076k0 scope, InterfaceC9987a<? extends File> produceFile) {
        C9322n.m27781e(migrations, "migrations");
        C9322n.m27781e(scope, "scope");
        C9322n.m27781e(produceFile, "produceFile");
        return new C0013b(C12256g.f32757a.m39446a(C0019h.f51a, c12579b, migrations, scope, new a(produceFile)));
    }
}
