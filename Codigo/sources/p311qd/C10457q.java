package p311qd;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import de.C6902o;
import java.util.concurrent.Executor;
import p063dc.InterfaceC6881c;
import p106fe.InterfaceC7337f;
import p186jj.InterfaceC9076d;
import p485zb.C12867g;
import p487zd.C12925i2;
import p487zd.C12940l2;
import p487zd.C12947n;
import p487zd.C12970r2;
import p487zd.C12972s;
import p487zd.C12976t;

/* renamed from: qd.q */
/* loaded from: classes.dex */
public class C10457q {

    /* renamed from: a */
    private final C12925i2 f25992a;

    /* renamed from: b */
    private final C12947n f25993b;

    /* renamed from: c */
    private final C12976t f25994c;

    /* renamed from: d */
    private final C12972s f25995d;

    /* renamed from: e */
    private final C12970r2 f25996e;

    /* renamed from: f */
    private final InterfaceC7337f f25997f;

    /* renamed from: g */
    private boolean f25998g = false;

    /* renamed from: h */
    private FirebaseInAppMessagingDisplay f25999h;

    /* renamed from: i */
    @InterfaceC6881c
    private Executor f26000i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10457q(C12925i2 c12925i2, C12970r2 c12970r2, C12947n c12947n, InterfaceC7337f interfaceC7337f, C12976t c12976t, C12972s c12972s, @InterfaceC6881c Executor executor) {
        this.f25992a = c12925i2;
        this.f25996e = c12970r2;
        this.f25993b = c12947n;
        this.f25997f = interfaceC7337f;
        this.f25994c = c12976t;
        this.f25995d = c12972s;
        this.f26000i = executor;
        interfaceC7337f.getId().addOnSuccessListener(executor, new OnSuccessListener() { // from class: qd.o
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C10457q.m31371f((String) obj);
            }
        });
        c12925i2.m42816K().m20226F(new InterfaceC9076d() { // from class: qd.p
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C10457q.this.m31372l((C6902o) obj);
            }
        });
    }

    /* renamed from: e */
    public static C10457q m31370e() {
        return (C10457q) C12867g.m42617o().m42629k(C10457q.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m31371f(String str) {
        C12940l2.m42842c("Starting InAppMessaging runtime with Installation ID " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m31372l(C6902o c6902o) {
        FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = this.f25999h;
        if (firebaseInAppMessagingDisplay != null) {
            firebaseInAppMessagingDisplay.displayMessage(c6902o.m19961a(), this.f25994c.m42942a(c6902o.m19961a(), c6902o.m19962b()));
        }
    }

    /* renamed from: c */
    public boolean m31373c() {
        return this.f25998g;
    }

    /* renamed from: d */
    public void m31374d() {
        C12940l2.m42842c("Removing display event component");
        this.f25999h = null;
    }

    /* renamed from: g */
    public void m31375g() {
        this.f25995d.m42936m();
    }

    /* renamed from: h */
    public void m31376h(Boolean bool) {
        this.f25993b.m42877f(bool);
    }

    /* renamed from: i */
    public void m31377i(FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay) {
        C12940l2.m42842c("Setting display event component");
        this.f25999h = firebaseInAppMessagingDisplay;
    }

    /* renamed from: j */
    public void m31378j(Boolean bool) {
        this.f25998g = bool.booleanValue();
    }

    /* renamed from: k */
    public void m31379k(String str) {
        this.f25996e.m42915b(str);
    }
}
