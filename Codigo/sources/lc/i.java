package lc;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import hc.o;
import hc.p;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class i implements ec.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f21191a;

    /* renamed from: b, reason: collision with root package name */
    private final IntegrityManager f21192b;

    /* renamed from: c, reason: collision with root package name */
    private final o f21193c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f21194d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f21195e;

    /* renamed from: f, reason: collision with root package name */
    private final p f21196f;

    i(String str, IntegrityManager integrityManager, o oVar, Executor executor, Executor executor2, p pVar) {
        this.f21191a = str;
        this.f21192b = integrityManager;
        this.f21193c = oVar;
        this.f21194d = executor;
        this.f21195e = executor2;
        this.f21196f = pVar;
    }

    public i(zb.g gVar, @dc.c Executor executor, @dc.b Executor executor2) {
        this(gVar.r().f(), IntegrityManagerFactory.create(gVar.m()), new o(gVar), executor, executor2, new p());
    }

    private Task<IntegrityTokenResponse> g() {
        final b bVar = new b();
        return Tasks.call(this.f21195e, new Callable() { // from class: lc.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                c h10;
                h10 = i.this.h(bVar);
                return h10;
            }
        }).onSuccessTask(this.f21194d, new SuccessContinuation() { // from class: lc.g
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task i10;
                i10 = i.this.i((c) obj);
                return i10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c h(b bVar) {
        return c.a(this.f21193c.c(bVar.a().getBytes("UTF-8"), this.f21196f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task i(c cVar) {
        return this.f21192b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(this.f21191a)).setNonce(cVar.b()).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ hc.a j(a aVar) {
        return this.f21193c.b(aVar.a().getBytes("UTF-8"), 3, this.f21196f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task k(IntegrityTokenResponse integrityTokenResponse) {
        final a aVar = new a(integrityTokenResponse.token());
        return Tasks.call(this.f21195e, new Callable() { // from class: lc.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hc.a j10;
                j10 = i.this.j(aVar);
                return j10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task l(hc.a aVar) {
        return Tasks.forResult(hc.b.c(aVar));
    }

    @Override // ec.a
    public Task<ec.c> a() {
        return g().onSuccessTask(this.f21194d, new SuccessContinuation() { // from class: lc.d
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task k10;
                k10 = i.this.k((IntegrityTokenResponse) obj);
                return k10;
            }
        }).onSuccessTask(this.f21194d, new SuccessContinuation() { // from class: lc.e
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task l10;
                l10 = i.l((hc.a) obj);
                return l10;
            }
        });
    }
}
