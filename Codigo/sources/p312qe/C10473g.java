package p312qe;

import com.google.firebase.perf.session.SessionManager;
import p029bk.InterfaceC1806a;
import p144hi.C7742b;

/* renamed from: qe.g */
/* loaded from: classes.dex */
public final class C10473g implements InterfaceC1806a {

    /* renamed from: a */
    private final C10467a f26019a;

    public C10473g(C10467a c10467a) {
        this.f26019a = c10467a;
    }

    /* renamed from: a */
    public static C10473g m31412a(C10467a c10467a) {
        return new C10473g(c10467a);
    }

    /* renamed from: c */
    public static SessionManager m31413c(C10467a c10467a) {
        return (SessionManager) C7742b.m23640c(c10467a.m31395f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p029bk.InterfaceC1806a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SessionManager get() {
        return m31413c(this.f26019a);
    }
}
