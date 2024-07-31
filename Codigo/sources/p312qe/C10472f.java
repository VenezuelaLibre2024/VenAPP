package p312qe;

import com.google.firebase.perf.config.RemoteConfigManager;
import p029bk.InterfaceC1806a;
import p144hi.C7742b;

/* renamed from: qe.f */
/* loaded from: classes.dex */
public final class C10472f implements InterfaceC1806a {

    /* renamed from: a */
    private final C10467a f26018a;

    public C10472f(C10467a c10467a) {
        this.f26018a = c10467a;
    }

    /* renamed from: a */
    public static C10472f m31409a(C10467a c10467a) {
        return new C10472f(c10467a);
    }

    /* renamed from: c */
    public static RemoteConfigManager m31410c(C10467a c10467a) {
        return (RemoteConfigManager) C7742b.m23640c(c10467a.m31394e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteConfigManager get() {
        return m31410c(this.f26018a);
    }
}
