package p322r1;

import ck.C2025j;
import ck.InterfaceC2023h;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9987a;
import p391v1.InterfaceC11614m;

/* renamed from: r1.d0 */
/* loaded from: classes.dex */
public abstract class AbstractC10585d0 {

    /* renamed from: a */
    private final AbstractC10604u f26663a;

    /* renamed from: b */
    private final AtomicBoolean f26664b;

    /* renamed from: c */
    private final InterfaceC2023h f26665c;

    /* renamed from: r1.d0$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC9323o implements InterfaceC9987a<InterfaceC11614m> {
        a() {
            super(0);
        }

        @Override // p280ok.InterfaceC9987a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC11614m invoke() {
            return AbstractC10585d0.this.m32169d();
        }
    }

    public AbstractC10585d0(AbstractC10604u database) {
        InterfaceC2023h m10334a;
        C9322n.m27781e(database, "database");
        this.f26663a = database;
        this.f26664b = new AtomicBoolean(false);
        m10334a = C2025j.m10334a(new a());
        this.f26665c = m10334a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final InterfaceC11614m m32169d() {
        return this.f26663a.m32254f(mo26836e());
    }

    /* renamed from: f */
    private final InterfaceC11614m m32170f() {
        return (InterfaceC11614m) this.f26665c.getValue();
    }

    /* renamed from: g */
    private final InterfaceC11614m m32171g(boolean z10) {
        return z10 ? m32170f() : m32169d();
    }

    /* renamed from: b */
    public InterfaceC11614m m32172b() {
        m32173c();
        return m32171g(this.f26664b.compareAndSet(false, true));
    }

    /* renamed from: c */
    protected void m32173c() {
        this.f26663a.m32251c();
    }

    /* renamed from: e */
    protected abstract String mo26836e();

    /* renamed from: h */
    public void m32174h(InterfaceC11614m statement) {
        C9322n.m27781e(statement, "statement");
        if (statement == m32170f()) {
            this.f26664b.set(false);
        }
    }
}
