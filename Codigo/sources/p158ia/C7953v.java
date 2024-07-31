package p158ia;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.C5102b;
import com.google.android.gms.common.api.InterfaceC5107g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC5188w;
import com.google.android.gms.common.api.internal.C5151k;
import com.google.android.gms.common.api.internal.C5155l;
import com.google.android.gms.common.api.internal.C5170q;
import com.google.android.gms.common.api.internal.InterfaceC5173r;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.base.zav;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p136ha.C7674b;
import p136ha.C7678f;
import p136ha.C7679g;
import p136ha.InterfaceC7673a;
import p136ha.InterfaceC7676d;

/* renamed from: ia.v */
/* loaded from: classes.dex */
public final class C7953v extends AbstractC5105e implements InterfaceC7676d {

    /* renamed from: a */
    private static final C5101a.g f19321a;

    /* renamed from: b */
    private static final C5101a.a f19322b;

    /* renamed from: c */
    private static final C5101a f19323c;

    /* renamed from: d */
    public static final /* synthetic */ int f19324d = 0;

    static {
        C5101a.g gVar = new C5101a.g();
        f19321a = gVar;
        C7948q c7948q = new C7948q();
        f19322b = c7948q;
        f19323c = new C5101a("ModuleInstall.API", c7948q, gVar);
    }

    public C7953v(Context context) {
        super(context, (C5101a<C5101a.d.c>) f19323c, C5101a.d.f10415l, AbstractC5105e.a.f10417c);
    }

    /* renamed from: d */
    static final C7932a m24440d(boolean z10, InterfaceC5107g... interfaceC5107gArr) {
        C5276s.m13325k(interfaceC5107gArr, "Requested APIs must not be null.");
        C5276s.m13316b(interfaceC5107gArr.length > 0, "Please provide at least one OptionalModuleApi.");
        for (InterfaceC5107g interfaceC5107g : interfaceC5107gArr) {
            C5276s.m13325k(interfaceC5107g, "Requested API must not be null.");
        }
        return C7932a.m24430w1(Arrays.asList(interfaceC5107gArr), z10);
    }

    @Override // p136ha.InterfaceC7676d
    /* renamed from: b */
    public final Task<C7679g> mo23389b(C7678f c7678f) {
        final C7932a m24429u1 = C7932a.m24429u1(c7678f);
        final InterfaceC7673a m23394b = c7678f.m23394b();
        Executor m23395c = c7678f.m23395c();
        boolean m23396e = c7678f.m23396e();
        if (m24429u1.m24431v1().isEmpty()) {
            return Tasks.forResult(new C7679g(0));
        }
        if (m23394b == null) {
            AbstractC5188w.a m13190a = AbstractC5188w.m13190a();
            m13190a.m13198d(zav.zaa);
            m13190a.m13197c(m23396e);
            m13190a.m13199e(27304);
            m13190a.m13196b(new InterfaceC5173r() { // from class: ia.o
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
                public final void accept(Object obj, Object obj2) {
                    C7953v c7953v = C7953v.this;
                    C7932a c7932a = m24429u1;
                    ((C7940i) ((C7954w) obj).getService()).m24438g2(new BinderC7950s(c7953v, (TaskCompletionSource) obj2), c7932a, null);
                }
            });
            return doRead(m13190a.m13195a());
        }
        C5276s.m13324j(m23394b);
        C5151k registerListener = m23395c == null ? registerListener(m23394b, InterfaceC7673a.class.getSimpleName()) : C5155l.m13091b(m23394b, m23395c, InterfaceC7673a.class.getSimpleName());
        final BinderC7935d binderC7935d = new BinderC7935d(registerListener);
        final AtomicReference atomicReference = new AtomicReference();
        InterfaceC5173r interfaceC5173r = new InterfaceC5173r() { // from class: ia.l
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                C7953v c7953v = C7953v.this;
                AtomicReference atomicReference2 = atomicReference;
                InterfaceC7673a interfaceC7673a = m23394b;
                C7932a c7932a = m24429u1;
                BinderC7935d binderC7935d2 = binderC7935d;
                ((C7940i) ((C7954w) obj).getService()).m24438g2(new BinderC7951t(c7953v, atomicReference2, (TaskCompletionSource) obj2, interfaceC7673a), c7932a, binderC7935d2);
            }
        };
        InterfaceC5173r interfaceC5173r2 = new InterfaceC5173r() { // from class: ia.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                C7953v c7953v = C7953v.this;
                BinderC7935d binderC7935d2 = binderC7935d;
                ((C7940i) ((C7954w) obj).getService()).m24439h2(new BinderC7952u(c7953v, (TaskCompletionSource) obj2), binderC7935d2);
            }
        };
        C5170q.a m13156a = C5170q.m13156a();
        m13156a.m13165g(registerListener);
        m13156a.m13162d(zav.zaa);
        m13156a.m13161c(m23396e);
        m13156a.m13160b(interfaceC5173r);
        m13156a.m13164f(interfaceC5173r2);
        m13156a.m13163e(27305);
        return doRegisterEventListener(m13156a.m13159a()).onSuccessTask(new SuccessContinuation() { // from class: ia.n
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                AtomicReference atomicReference2 = atomicReference;
                int i10 = C7953v.f19324d;
                return atomicReference2.get() != null ? Tasks.forResult((C7679g) atomicReference2.get()) : Tasks.forException(new C5102b(Status.f10402t));
            }
        });
    }

    @Override // p136ha.InterfaceC7676d
    /* renamed from: c */
    public final Task<C7674b> mo23390c(InterfaceC5107g... interfaceC5107gArr) {
        final C7932a m24440d = m24440d(false, interfaceC5107gArr);
        if (m24440d.m24431v1().isEmpty()) {
            return Tasks.forResult(new C7674b(true, 0));
        }
        AbstractC5188w.a m13190a = AbstractC5188w.m13190a();
        m13190a.m13198d(zav.zaa);
        m13190a.m13199e(27301);
        m13190a.m13197c(false);
        m13190a.m13196b(new InterfaceC5173r() { // from class: ia.p
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC5173r
            public final void accept(Object obj, Object obj2) {
                C7953v c7953v = C7953v.this;
                C7932a c7932a = m24440d;
                ((C7940i) ((C7954w) obj).getService()).m24437f2(new BinderC7949r(c7953v, (TaskCompletionSource) obj2), c7932a);
            }
        });
        return doRead(m13190a.m13195a());
    }
}
