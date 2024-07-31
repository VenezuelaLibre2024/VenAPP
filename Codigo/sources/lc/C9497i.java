package lc;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import ec.AbstractC7173c;
import ec.InterfaceC7171a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p063dc.InterfaceC6880b;
import p063dc.InterfaceC6881c;
import p138hc.C7694a;
import p138hc.C7695b;
import p138hc.C7708o;
import p138hc.C7709p;
import p485zb.C12867g;

/* renamed from: lc.i */
/* loaded from: classes.dex */
public class C9497i implements InterfaceC7171a {

    /* renamed from: a */
    private final String f23044a;

    /* renamed from: b */
    private final IntegrityManager f23045b;

    /* renamed from: c */
    private final C7708o f23046c;

    /* renamed from: d */
    private final Executor f23047d;

    /* renamed from: e */
    private final Executor f23048e;

    /* renamed from: f */
    private final C7709p f23049f;

    C9497i(String str, IntegrityManager integrityManager, C7708o c7708o, Executor executor, Executor executor2, C7709p c7709p) {
        this.f23044a = str;
        this.f23045b = integrityManager;
        this.f23046c = c7708o;
        this.f23047d = executor;
        this.f23048e = executor2;
        this.f23049f = c7709p;
    }

    public C9497i(C12867g c12867g, @InterfaceC6881c Executor executor, @InterfaceC6880b Executor executor2) {
        this(c12867g.m42632r().m42647f(), IntegrityManagerFactory.create(c12867g.m42630m()), new C7708o(c12867g), executor, executor2, new C7709p());
    }

    /* renamed from: g */
    private Task<IntegrityTokenResponse> m28227g() {
        final C9490b c9490b = new C9490b();
        return Tasks.call(this.f23048e, new Callable() { // from class: lc.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C9491c m28228h;
                m28228h = C9497i.this.m28228h(c9490b);
                return m28228h;
            }
        }).onSuccessTask(this.f23047d, new SuccessContinuation() { // from class: lc.g
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m28229i;
                m28229i = C9497i.this.m28229i((C9491c) obj);
                return m28229i;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ C9491c m28228h(C9490b c9490b) {
        return C9491c.m28220a(this.f23046c.m23479c(c9490b.m28219a().getBytes("UTF-8"), this.f23049f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Task m28229i(C9491c c9491c) {
        return this.f23045b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(this.f23044a)).setNonce(c9491c.m28221b()).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ C7694a m28230j(C9489a c9489a) {
        return this.f23046c.m23478b(c9489a.m28218a().getBytes("UTF-8"), 3, this.f23049f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Task m28231k(IntegrityTokenResponse integrityTokenResponse) {
        final C9489a c9489a = new C9489a(integrityTokenResponse.token());
        return Tasks.call(this.f23048e, new Callable() { // from class: lc.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C7694a m28230j;
                m28230j = C9497i.this.m28230j(c9489a);
                return m28230j;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ Task m28232l(C7694a c7694a) {
        return Tasks.forResult(C7695b.m23432c(c7694a));
    }

    @Override // ec.InterfaceC7171a
    /* renamed from: a */
    public Task<AbstractC7173c> mo21365a() {
        return m28227g().onSuccessTask(this.f23047d, new SuccessContinuation() { // from class: lc.d
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m28231k;
                m28231k = C9497i.this.m28231k((IntegrityTokenResponse) obj);
                return m28231k;
            }
        }).onSuccessTask(this.f23047d, new SuccessContinuation() { // from class: lc.e
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m28232l;
                m28232l = C9497i.m28232l((C7694a) obj);
                return m28232l;
            }
        });
    }
}
