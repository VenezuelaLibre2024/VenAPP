package p475z0;

import android.content.Context;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p003a1.AbstractC0015d;
import p003a1.C0014c;
import p280ok.InterfaceC9987a;
import p280ok.InterfaceC9998l;
import p340rk.InterfaceC10723a;
import p405vk.InterfaceC11971h;
import p430x0.InterfaceC12253d;
import p430x0.InterfaceC12255f;
import p453y0.C12579b;
import p494zk.InterfaceC13076k0;

/* renamed from: z0.c */
/* loaded from: classes.dex */
public final class C12756c implements InterfaceC10723a<Context, InterfaceC12255f<AbstractC0015d>> {

    /* renamed from: a */
    private final String f34791a;

    /* renamed from: b */
    private final InterfaceC9998l<Context, List<InterfaceC12253d<AbstractC0015d>>> f34792b;

    /* renamed from: c */
    private final InterfaceC13076k0 f34793c;

    /* renamed from: d */
    private final Object f34794d;

    /* renamed from: e */
    private volatile InterfaceC12255f<AbstractC0015d> f34795e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0.c$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC9323o implements InterfaceC9987a<File> {

        /* renamed from: a */
        final /* synthetic */ Context f34796a;

        /* renamed from: b */
        final /* synthetic */ C12756c f34797b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, C12756c c12756c) {
            super(0);
            this.f34796a = context;
            this.f34797b = c12756c;
        }

        @Override // p280ok.InterfaceC9987a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f34796a;
            C9322n.m27780d(applicationContext, "applicationContext");
            return C12755b.m42299a(applicationContext, this.f34797b.f34791a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12756c(String name, C12579b<AbstractC0015d> c12579b, InterfaceC9998l<? super Context, ? extends List<? extends InterfaceC12253d<AbstractC0015d>>> produceMigrations, InterfaceC13076k0 scope) {
        C9322n.m27781e(name, "name");
        C9322n.m27781e(produceMigrations, "produceMigrations");
        C9322n.m27781e(scope, "scope");
        this.f34791a = name;
        this.f34792b = produceMigrations;
        this.f34793c = scope;
        this.f34794d = new Object();
    }

    @Override // p340rk.InterfaceC10723a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC12255f<AbstractC0015d> mo32609a(Context thisRef, InterfaceC11971h<?> property) {
        InterfaceC12255f<AbstractC0015d> interfaceC12255f;
        C9322n.m27781e(thisRef, "thisRef");
        C9322n.m27781e(property, "property");
        InterfaceC12255f<AbstractC0015d> interfaceC12255f2 = this.f34795e;
        if (interfaceC12255f2 != null) {
            return interfaceC12255f2;
        }
        synchronized (this.f34794d) {
            if (this.f34795e == null) {
                Context applicationContext = thisRef.getApplicationContext();
                C0014c c0014c = C0014c.f43a;
                InterfaceC9998l<Context, List<InterfaceC12253d<AbstractC0015d>>> interfaceC9998l = this.f34792b;
                C9322n.m27780d(applicationContext, "applicationContext");
                this.f34795e = c0014c.m49a(null, interfaceC9998l.invoke(applicationContext), this.f34793c, new a(applicationContext, this));
            }
            interfaceC12255f = this.f34795e;
            C9322n.m27778b(interfaceC12255f);
        }
        return interfaceC12255f;
    }
}
