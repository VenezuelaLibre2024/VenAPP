package p447xh;

import ck.C2030o;
import ck.C2037v;
import com.google.firebase.crashlytics.C6165a;
import hk.C7752d;
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;
import p424wh.C12199a;
import p494zk.C13067i;
import p494zk.InterfaceC13076k0;

/* renamed from: xh.a */
/* loaded from: classes3.dex */
public final class C12487a {

    /* renamed from: a */
    public static final C12487a f33835a = new C12487a();

    @InterfaceC9300f(m27742c = "com.techandpeople.techchat.app.features.install_ping.domain.usecases.InstallPingUseCase$invoke$1", m27743f = "InstallPingUseCase.kt", m27744l = {12}, m27745m = "invokeSuspend")
    /* renamed from: xh.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        int f33836a;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // p280ok.InterfaceC10002p
        public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
            return ((a) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            Object m23655c;
            m23655c = C7752d.m23655c();
            int i10 = this.f33836a;
            if (i10 == 0) {
                C2030o.m10349b(obj);
                C12199a c12199a = C12199a.f32478a;
                this.f33836a = 1;
                if (c12199a.m39151a(this) == m23655c) {
                    return m23655c;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2030o.m10349b(obj);
            }
            return C2037v.f8089a;
        }
    }

    private C12487a() {
    }

    /* renamed from: a */
    public final void m40841a() {
        try {
            C13067i.m43212b(null, new a(null), 1, null);
        } catch (Exception e10) {
            C6165a.m16693d().m16699g(e10);
        }
    }
}
