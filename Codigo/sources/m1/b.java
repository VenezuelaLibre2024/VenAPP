package m1;

import androidx.concurrent.futures.c;
import ck.v;
import com.google.common.util.concurrent.f;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ok.l;
import zk.r0;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static final class a extends o implements l<Throwable, v> {

        /* renamed from: a */
        final /* synthetic */ c.a<T> f21333a;

        /* renamed from: b */
        final /* synthetic */ r0<T> f21334b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c.a<T> aVar, r0<? extends T> r0Var) {
            super(1);
            this.f21333a = aVar;
            this.f21334b = r0Var;
        }

        public final void a(Throwable th2) {
            if (th2 == null) {
                this.f21333a.c(this.f21334b.g());
            } else if (th2 instanceof CancellationException) {
                this.f21333a.d();
            } else {
                this.f21333a.f(th2);
            }
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
            a(th2);
            return v.f7137a;
        }
    }

    public static final <T> f<T> b(final r0<? extends T> r0Var, final Object obj) {
        n.e(r0Var, "<this>");
        f<T> a10 = c.a(new c.InterfaceC0032c() { // from class: m1.a
            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object d10;
                d10 = b.d(r0.this, obj, aVar);
                return d10;
            }
        });
        n.d(a10, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a10;
    }

    public static /* synthetic */ f c(r0 r0Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(r0Var, obj);
    }

    public static final Object d(r0 this_asListenableFuture, Object obj, c.a completer) {
        n.e(this_asListenableFuture, "$this_asListenableFuture");
        n.e(completer, "completer");
        this_asListenableFuture.R(new a(completer, this_asListenableFuture));
        return obj;
    }
}
