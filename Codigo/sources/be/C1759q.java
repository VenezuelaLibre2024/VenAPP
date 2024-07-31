package be;

import java.util.concurrent.Executor;
import p063dc.InterfaceC6879a;
import p063dc.InterfaceC6880b;
import p063dc.InterfaceC6881c;

/* renamed from: be.q */
/* loaded from: classes.dex */
public class C1759q {

    /* renamed from: a */
    private final Executor f7388a;

    /* renamed from: b */
    private final Executor f7389b;

    /* renamed from: c */
    private final Executor f7390c;

    public C1759q(@InterfaceC6881c Executor executor, @InterfaceC6879a Executor executor2, @InterfaceC6880b Executor executor3) {
        this.f7390c = executor;
        this.f7388a = executor2;
        this.f7389b = executor3;
    }

    @InterfaceC6879a
    /* renamed from: a */
    public Executor m9444a() {
        return this.f7388a;
    }

    @InterfaceC6880b
    /* renamed from: b */
    public Executor m9445b() {
        return this.f7389b;
    }

    @InterfaceC6881c
    /* renamed from: c */
    public Executor m9446c() {
        return this.f7390c;
    }
}
