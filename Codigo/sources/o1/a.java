package o1;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.d;
import ck.o;
import ck.v;
import gk.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import ok.p;
import zk.a1;
import zk.j;
import zk.k0;
import zk.l0;
import zk.r0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a */
    public static final b f22137a = new b(null);

    /* renamed from: o1.a$a */
    /* loaded from: classes.dex */
    public static final class C0363a extends a {

        /* renamed from: b */
        private final d f22138b;

        @f(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", l = {56}, m = "invokeSuspend")
        /* renamed from: o1.a$a$a */
        /* loaded from: classes.dex */
        static final class C0364a extends l implements p<k0, Continuation<? super androidx.privacysandbox.ads.adservices.topics.b>, Object> {

            /* renamed from: a */
            int f22139a;

            /* renamed from: c */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.a f22141c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0364a(androidx.privacysandbox.ads.adservices.topics.a aVar, Continuation<? super C0364a> continuation) {
                super(2, continuation);
                this.f22141c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<v> create(Object obj, Continuation<?> continuation) {
                return new C0364a(this.f22141c, continuation);
            }

            @Override // ok.p
            public final Object invoke(k0 k0Var, Continuation<? super androidx.privacysandbox.ads.adservices.topics.b> continuation) {
                return ((C0364a) create(k0Var, continuation)).invokeSuspend(v.f7137a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = hk.d.c();
                int i10 = this.f22139a;
                if (i10 == 0) {
                    o.b(obj);
                    d dVar = C0363a.this.f22138b;
                    androidx.privacysandbox.ads.adservices.topics.a aVar = this.f22141c;
                    this.f22139a = 1;
                    obj = dVar.a(aVar, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return obj;
            }
        }

        public C0363a(d mTopicsManager) {
            n.e(mTopicsManager, "mTopicsManager");
            this.f22138b = mTopicsManager;
        }

        @Override // o1.a
        public com.google.common.util.concurrent.f<androidx.privacysandbox.ads.adservices.topics.b> b(androidx.privacysandbox.ads.adservices.topics.a request) {
            r0 b10;
            n.e(request, "request");
            b10 = j.b(l0.a(a1.c()), null, null, new C0364a(request, null), 3, null);
            return m1.b.c(b10, null, 1, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final a a(Context context) {
            n.e(context, "context");
            d a10 = d.f5028a.a(context);
            if (a10 != null) {
                return new C0363a(a10);
            }
            return null;
        }
    }

    public static final a a(Context context) {
        return f22137a.a(context);
    }

    public abstract com.google.common.util.concurrent.f<androidx.privacysandbox.ads.adservices.topics.b> b(androidx.privacysandbox.ads.adservices.topics.a aVar);
}
