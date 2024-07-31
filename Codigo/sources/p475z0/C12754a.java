package p475z0;

import android.content.Context;
import dk.C7031r;
import java.util.List;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p003a1.AbstractC0015d;
import p280ok.InterfaceC9998l;
import p340rk.InterfaceC10723a;
import p430x0.InterfaceC12253d;
import p430x0.InterfaceC12255f;
import p453y0.C12579b;
import p494zk.C13034a1;
import p494zk.C13080l0;
import p494zk.C13102q2;
import p494zk.InterfaceC13076k0;

/* renamed from: z0.a */
/* loaded from: classes.dex */
public final class C12754a {

    /* renamed from: z0.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC9323o implements InterfaceC9998l<Context, List<? extends InterfaceC12253d<AbstractC0015d>>> {

        /* renamed from: a */
        public static final a f34790a = new a();

        a() {
            super(1);
        }

        @Override // p280ok.InterfaceC9998l
        /* renamed from: a */
        public final List<InterfaceC12253d<AbstractC0015d>> invoke(Context it) {
            List<InterfaceC12253d<AbstractC0015d>> m20582j;
            C9322n.m27781e(it, "it");
            m20582j = C7031r.m20582j();
            return m20582j;
        }
    }

    /* renamed from: a */
    public static final InterfaceC10723a<Context, InterfaceC12255f<AbstractC0015d>> m42296a(String name, C12579b<AbstractC0015d> c12579b, InterfaceC9998l<? super Context, ? extends List<? extends InterfaceC12253d<AbstractC0015d>>> produceMigrations, InterfaceC13076k0 scope) {
        C9322n.m27781e(name, "name");
        C9322n.m27781e(produceMigrations, "produceMigrations");
        C9322n.m27781e(scope, "scope");
        return new C12756c(name, c12579b, produceMigrations, scope);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10723a m42297b(String str, C12579b c12579b, InterfaceC9998l interfaceC9998l, InterfaceC13076k0 interfaceC13076k0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c12579b = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC9998l = a.f34790a;
        }
        if ((i10 & 8) != 0) {
            interfaceC13076k0 = C13080l0.m43227a(C13034a1.m43040b().mo20646U(C13102q2.m43290b(null, 1, null)));
        }
        return m42296a(str, c12579b, interfaceC9998l, interfaceC13076k0);
    }
}
