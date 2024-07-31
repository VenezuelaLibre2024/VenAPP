package p261o1;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.AbstractC1336d;
import androidx.privacysandbox.ads.adservices.topics.C1333a;
import androidx.privacysandbox.ads.adservices.topics.C1334b;
import ck.C2030o;
import ck.C2037v;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import hk.C7752d;
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p124gk.Continuation;
import p229m1.C9534b;
import p280ok.InterfaceC10002p;
import p494zk.C13034a1;
import p494zk.C13063h;
import p494zk.C13080l0;
import p494zk.InterfaceC13076k0;

/* renamed from: o1.a */
/* loaded from: classes.dex */
public abstract class AbstractC9769a {

    /* renamed from: a */
    public static final b f24070a = new b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC9769a {

        /* renamed from: b */
        private final AbstractC1336d f24071b;

        @InterfaceC9300f(m27742c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", m27743f = "TopicsManagerFutures.kt", m27744l = {56}, m27745m = "invokeSuspend")
        /* renamed from: o1.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C13227a extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C1334b>, Object> {

            /* renamed from: a */
            int f24072a;

            /* renamed from: c */
            final /* synthetic */ C1333a f24074c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13227a(C1333a c1333a, Continuation<? super C13227a> continuation) {
                super(2, continuation);
                this.f24074c = c1333a;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
                return new C13227a(this.f24074c, continuation);
            }

            @Override // p280ok.InterfaceC10002p
            public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C1334b> continuation) {
                return ((C13227a) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                Object m23655c;
                m23655c = C7752d.m23655c();
                int i10 = this.f24072a;
                if (i10 == 0) {
                    C2030o.m10349b(obj);
                    AbstractC1336d abstractC1336d = a.this.f24071b;
                    C1333a c1333a = this.f24074c;
                    this.f24072a = 1;
                    obj = abstractC1336d.mo7457a(c1333a, this);
                    if (obj == m23655c) {
                        return m23655c;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2030o.m10349b(obj);
                }
                return obj;
            }
        }

        public a(AbstractC1336d mTopicsManager) {
            C9322n.m27781e(mTopicsManager, "mTopicsManager");
            this.f24071b = mTopicsManager;
        }

        @Override // p261o1.AbstractC9769a
        /* renamed from: b */
        public InterfaceFutureC5920f<C1334b> mo29307b(C1333a request) {
            C9322n.m27781e(request, "request");
            return C9534b.m28360c(C13063h.m43186b(C13080l0.m43227a(C13034a1.m43041c()), null, null, new C13227a(request, null), 3, null), null, 1, null);
        }
    }

    /* renamed from: o1.a$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC9769a m29309a(Context context) {
            C9322n.m27781e(context, "context");
            AbstractC1336d m7458a = AbstractC1336d.f5782a.m7458a(context);
            if (m7458a != null) {
                return new a(m7458a);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final AbstractC9769a m29306a(Context context) {
        return f24070a.m29309a(context);
    }

    /* renamed from: b */
    public abstract InterfaceFutureC5920f<C1334b> mo29307b(C1333a c1333a);
}
