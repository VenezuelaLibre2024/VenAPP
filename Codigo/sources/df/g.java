package df;

import android.util.Log;

/* loaded from: classes2.dex */
public final class g implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f14063b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ee.b<f6.g> f14064a;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public g(ee.b<f6.g> transportFactoryProvider) {
        kotlin.jvm.internal.n.e(transportFactoryProvider, "transportFactoryProvider");
        this.f14064a = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(z zVar) {
        String b10 = a0.f13963a.c().b(zVar);
        kotlin.jvm.internal.n.d(b10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + b10);
        byte[] bytes = b10.getBytes(xk.d.f31393b);
        kotlin.jvm.internal.n.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // df.h
    public void a(z sessionEvent) {
        kotlin.jvm.internal.n.e(sessionEvent, "sessionEvent");
        this.f14064a.get().b("FIREBASE_APPQUALITY_SESSION", z.class, f6.b.b("json"), new f6.e() { // from class: df.f
            @Override // f6.e
            public final Object apply(Object obj) {
                byte[] c10;
                c10 = g.this.c((z) obj);
                return c10;
            }
        }).b(f6.c.d(sessionEvent));
    }
}
