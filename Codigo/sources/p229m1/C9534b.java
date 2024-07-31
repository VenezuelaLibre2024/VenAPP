package p229m1;

import androidx.concurrent.futures.C0742c;
import ck.C2037v;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;
import p494zk.InterfaceC13104r0;

/* renamed from: m1.b */
/* loaded from: classes.dex */
public final class C9534b {

    /* renamed from: m1.b$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC9323o implements InterfaceC9998l<Throwable, C2037v> {

        /* renamed from: a */
        final /* synthetic */ C0742c.a<T> f23186a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC13104r0<T> f23187b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(C0742c.a<T> aVar, InterfaceC13104r0<? extends T> interfaceC13104r0) {
            super(1);
            this.f23186a = aVar;
            this.f23187b = interfaceC13104r0;
        }

        /* renamed from: a */
        public final void m28362a(Throwable th2) {
            if (th2 == null) {
                this.f23186a.m3756c(this.f23187b.mo43291g());
            } else if (th2 instanceof CancellationException) {
                this.f23186a.m3757d();
            } else {
                this.f23186a.m3758f(th2);
            }
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
            m28362a(th2);
            return C2037v.f8089a;
        }
    }

    /* renamed from: b */
    public static final <T> InterfaceFutureC5920f<T> m28359b(final InterfaceC13104r0<? extends T> interfaceC13104r0, final Object obj) {
        C9322n.m27781e(interfaceC13104r0, "<this>");
        InterfaceFutureC5920f<T> m3752a = C0742c.m3752a(new C0742c.c() { // from class: m1.a
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m28361d;
                m28361d = C9534b.m28361d(InterfaceC13104r0.this, obj, aVar);
                return m28361d;
            }
        });
        C9322n.m27780d(m3752a, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return m3752a;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceFutureC5920f m28360c(InterfaceC13104r0 interfaceC13104r0, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return m28359b(interfaceC13104r0, obj);
    }

    /* renamed from: d */
    public static final Object m28361d(InterfaceC13104r0 this_asListenableFuture, Object obj, C0742c.a completer) {
        C9322n.m27781e(this_asListenableFuture, "$this_asListenableFuture");
        C9322n.m27781e(completer, "completer");
        this_asListenableFuture.mo43109R(new a(completer, this_asListenableFuture));
        return obj;
    }
}
