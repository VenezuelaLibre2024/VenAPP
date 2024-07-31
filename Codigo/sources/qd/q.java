package qd;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import java.util.concurrent.Executor;
import zd.i2;
import zd.l2;
import zd.r2;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final i2 f23950a;

    /* renamed from: b, reason: collision with root package name */
    private final zd.n f23951b;

    /* renamed from: c, reason: collision with root package name */
    private final zd.t f23952c;

    /* renamed from: d, reason: collision with root package name */
    private final zd.s f23953d;

    /* renamed from: e, reason: collision with root package name */
    private final r2 f23954e;

    /* renamed from: f, reason: collision with root package name */
    private final fe.f f23955f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23956g = false;

    /* renamed from: h, reason: collision with root package name */
    private FirebaseInAppMessagingDisplay f23957h;

    /* renamed from: i, reason: collision with root package name */
    @dc.c
    private Executor f23958i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(i2 i2Var, r2 r2Var, zd.n nVar, fe.f fVar, zd.t tVar, zd.s sVar, @dc.c Executor executor) {
        this.f23950a = i2Var;
        this.f23954e = r2Var;
        this.f23951b = nVar;
        this.f23955f = fVar;
        this.f23952c = tVar;
        this.f23953d = sVar;
        this.f23958i = executor;
        fVar.getId().addOnSuccessListener(executor, new OnSuccessListener() { // from class: qd.o
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                q.f((String) obj);
            }
        });
        i2Var.K().F(new jj.d() { // from class: qd.p
            @Override // jj.d
            public final void accept(Object obj) {
                q.this.l((de.o) obj);
            }
        });
    }

    public static q e() {
        return (q) zb.g.o().k(q.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(String str) {
        l2.c("Starting InAppMessaging runtime with Installation ID " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(de.o oVar) {
        FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = this.f23957h;
        if (firebaseInAppMessagingDisplay != null) {
            firebaseInAppMessagingDisplay.displayMessage(oVar.a(), this.f23952c.a(oVar.a(), oVar.b()));
        }
    }

    public boolean c() {
        return this.f23956g;
    }

    public void d() {
        l2.c("Removing display event component");
        this.f23957h = null;
    }

    public void g() {
        this.f23953d.m();
    }

    public void h(Boolean bool) {
        this.f23951b.f(bool);
    }

    public void i(FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay) {
        l2.c("Setting display event component");
        this.f23957h = firebaseInAppMessagingDisplay;
    }

    public void j(Boolean bool) {
        this.f23956g = bool.booleanValue();
    }

    public void k(String str) {
        this.f23954e.b(str);
    }
}
