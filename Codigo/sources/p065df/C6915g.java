package p065df;

import android.util.Log;
import ee.InterfaceC7183b;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p098f6.AbstractC7299c;
import p098f6.C7298b;
import p098f6.InterfaceC7301e;
import p098f6.InterfaceC7303g;
import p450xk.C12512d;

/* renamed from: df.g */
/* loaded from: classes2.dex */
public final class C6915g implements InterfaceC6917h {

    /* renamed from: b */
    public static final a f15417b = new a(null);

    /* renamed from: a */
    private final InterfaceC7183b<InterfaceC7303g> f15418a;

    /* renamed from: df.g$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C6915g(InterfaceC7183b<InterfaceC7303g> transportFactoryProvider) {
        C9322n.m27781e(transportFactoryProvider, "transportFactoryProvider");
        this.f15418a = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final byte[] m20030c(C6939z c6939z) {
        String mo26546b = C6904a0.f15317a.m19972c().mo26546b(c6939z);
        C9322n.m27780d(mo26546b, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + mo26546b);
        byte[] bytes = mo26546b.getBytes(C12512d.f33913b);
        C9322n.m27780d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // p065df.InterfaceC6917h
    /* renamed from: a */
    public void mo20031a(C6939z sessionEvent) {
        C9322n.m27781e(sessionEvent, "sessionEvent");
        this.f15418a.get().mo21886b("FIREBASE_APPQUALITY_SESSION", C6939z.class, C7298b.m21878b("json"), new InterfaceC7301e() { // from class: df.f
            @Override // p098f6.InterfaceC7301e
            public final Object apply(Object obj) {
                byte[] m20030c;
                m20030c = C6915g.this.m20030c((C6939z) obj);
                return m20030c;
            }
        }).mo21884b(AbstractC7299c.m21880d(sessionEvent));
    }
}
