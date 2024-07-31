package androidx.window.java.layout;

import androidx.core.util.a;
import ck.o;
import ck.v;
import cl.b;
import cl.c;
import gk.Continuation;
import hk.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import ok.p;
import zk.k0;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends l implements p<k0, Continuation<? super v>, Object> {
    final /* synthetic */ a<T> $consumer;
    final /* synthetic */ b<T> $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WindowInfoTrackerCallbackAdapter$addListener$1$1(b<? extends T> bVar, a<T> aVar, Continuation<? super WindowInfoTrackerCallbackAdapter$addListener$1$1> continuation) {
        super(2, continuation);
        this.$flow = bVar;
        this.$consumer = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<v> create(Object obj, Continuation<?> continuation) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, continuation);
    }

    @Override // ok.p
    public final Object invoke(k0 k0Var, Continuation<? super v> continuation) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(k0Var, continuation)).invokeSuspend(v.f7137a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            o.b(obj);
            b<T> bVar = this.$flow;
            WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 = new c<T>() { // from class: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1
                public WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1() {
                }

                @Override // cl.c
                public Object emit(T t10, Continuation<? super v> continuation) {
                    a.this.accept(t10);
                    return v.f7137a;
                }
            };
            this.label = 1;
            if (bVar.a(windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1, this) == c10) {
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
