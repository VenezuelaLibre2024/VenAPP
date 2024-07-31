package xh;

import ck.o;
import ck.v;
import gk.Continuation;
import hk.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import ok.p;
import zk.i;
import zk.k0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31315a = new a();

    @f(c = "com.techandpeople.techchat.app.features.install_ping.domain.usecases.InstallPingUseCase$invoke$1", f = "InstallPingUseCase.kt", l = {12}, m = "invokeSuspend")
    /* renamed from: xh.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0525a extends l implements p<k0, Continuation<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f31316a;

        C0525a(Continuation<? super C0525a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            return new C0525a(continuation);
        }

        @Override // ok.p
        public final Object invoke(k0 k0Var, Continuation<? super v> continuation) {
            return ((C0525a) create(k0Var, continuation)).invokeSuspend(v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = d.c();
            int i10 = this.f31316a;
            if (i10 == 0) {
                o.b(obj);
                wh.a aVar = wh.a.f30009a;
                this.f31316a = 1;
                if (aVar.a(this) == c10) {
                    return c10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return v.f7137a;
        }
    }

    private a() {
    }

    public final void a() {
        try {
            i.b(null, new C0525a(null), 1, null);
        } catch (Exception e10) {
            com.google.firebase.crashlytics.a.d().g(e10);
        }
    }
}
