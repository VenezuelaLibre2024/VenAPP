package ia;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.base.zav;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v extends com.google.android.gms.common.api.e implements ha.d {

    /* renamed from: a, reason: collision with root package name */
    private static final a.g f17660a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.AbstractC0146a f17661b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f17662c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f17663d = 0;

    static {
        a.g gVar = new a.g();
        f17660a = gVar;
        q qVar = new q();
        f17661b = qVar;
        f17662c = new com.google.android.gms.common.api.a("ModuleInstall.API", qVar, gVar);
    }

    public v(Context context) {
        super(context, (com.google.android.gms.common.api.a<a.d.c>) f17662c, a.d.f9307l, e.a.f9309c);
    }

    static final a d(boolean z10, com.google.android.gms.common.api.g... gVarArr) {
        com.google.android.gms.common.internal.s.k(gVarArr, "Requested APIs must not be null.");
        com.google.android.gms.common.internal.s.b(gVarArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (com.google.android.gms.common.api.g gVar : gVarArr) {
            com.google.android.gms.common.internal.s.k(gVar, "Requested API must not be null.");
        }
        return a.w1(Arrays.asList(gVarArr), z10);
    }

    @Override // ha.d
    public final Task<ha.g> b(ha.f fVar) {
        final a u12 = a.u1(fVar);
        final ha.a b10 = fVar.b();
        Executor c10 = fVar.c();
        boolean e10 = fVar.e();
        if (u12.v1().isEmpty()) {
            return Tasks.forResult(new ha.g(0));
        }
        if (b10 == null) {
            w.a a10 = com.google.android.gms.common.api.internal.w.a();
            a10.d(zav.zaa);
            a10.c(e10);
            a10.e(27304);
            a10.b(new com.google.android.gms.common.api.internal.r() { // from class: ia.o
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.common.api.internal.r
                public final void accept(Object obj, Object obj2) {
                    v vVar = v.this;
                    a aVar = u12;
                    ((i) ((w) obj).getService()).g2(new s(vVar, (TaskCompletionSource) obj2), aVar, null);
                }
            });
            return doRead(a10.a());
        }
        com.google.android.gms.common.internal.s.j(b10);
        com.google.android.gms.common.api.internal.k registerListener = c10 == null ? registerListener(b10, ha.a.class.getSimpleName()) : com.google.android.gms.common.api.internal.l.b(b10, c10, ha.a.class.getSimpleName());
        final d dVar = new d(registerListener);
        final AtomicReference atomicReference = new AtomicReference();
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r() { // from class: ia.l
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                v vVar = v.this;
                AtomicReference atomicReference2 = atomicReference;
                ha.a aVar = b10;
                a aVar2 = u12;
                d dVar2 = dVar;
                ((i) ((w) obj).getService()).g2(new t(vVar, atomicReference2, (TaskCompletionSource) obj2, aVar), aVar2, dVar2);
            }
        };
        com.google.android.gms.common.api.internal.r rVar2 = new com.google.android.gms.common.api.internal.r() { // from class: ia.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                v vVar = v.this;
                d dVar2 = dVar;
                ((i) ((w) obj).getService()).h2(new u(vVar, (TaskCompletionSource) obj2), dVar2);
            }
        };
        q.a a11 = com.google.android.gms.common.api.internal.q.a();
        a11.g(registerListener);
        a11.d(zav.zaa);
        a11.c(e10);
        a11.b(rVar);
        a11.f(rVar2);
        a11.e(27305);
        return doRegisterEventListener(a11.a()).onSuccessTask(new SuccessContinuation() { // from class: ia.n
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                AtomicReference atomicReference2 = atomicReference;
                int i10 = v.f17663d;
                return atomicReference2.get() != null ? Tasks.forResult((ha.g) atomicReference2.get()) : Tasks.forException(new com.google.android.gms.common.api.b(Status.f9294t));
            }
        });
    }

    @Override // ha.d
    public final Task<ha.b> c(com.google.android.gms.common.api.g... gVarArr) {
        final a d10 = d(false, gVarArr);
        if (d10.v1().isEmpty()) {
            return Tasks.forResult(new ha.b(true, 0));
        }
        w.a a10 = com.google.android.gms.common.api.internal.w.a();
        a10.d(zav.zaa);
        a10.e(27301);
        a10.c(false);
        a10.b(new com.google.android.gms.common.api.internal.r() { // from class: ia.p
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.r
            public final void accept(Object obj, Object obj2) {
                v vVar = v.this;
                a aVar = d10;
                ((i) ((w) obj).getService()).f2(new r(vVar, (TaskCompletionSource) obj2), aVar);
            }
        });
        return doRead(a10.a());
    }
}
