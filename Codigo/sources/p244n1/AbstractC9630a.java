package p244n1;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
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
import p284p1.AbstractC10036c;
import p284p1.C10034a;
import p284p1.C10037d;
import p284p1.C10038e;
import p494zk.C13034a1;
import p494zk.C13063h;
import p494zk.C13080l0;
import p494zk.InterfaceC13076k0;

/* renamed from: n1.a */
/* loaded from: classes.dex */
public abstract class AbstractC9630a {

    /* renamed from: a */
    public static final b f23599a = new b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC9630a {

        /* renamed from: b */
        private final AbstractC10036c f23600b;

        @InterfaceC9300f(m27742c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", m27743f = "MeasurementManagerFutures.kt", m27744l = {122}, m27745m = "invokeSuspend")
        /* renamed from: n1.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C13224a extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

            /* renamed from: a */
            int f23601a;

            C13224a(C10034a c10034a, Continuation<? super C13224a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
                return new C13224a(null, continuation);
            }

            @Override // p280ok.InterfaceC10002p
            public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
                return ((C13224a) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                Object m23655c;
                m23655c = C7752d.m23655c();
                int i10 = this.f23601a;
                if (i10 == 0) {
                    C2030o.m10349b(obj);
                    AbstractC10036c abstractC10036c = a.this.f23600b;
                    this.f23601a = 1;
                    if (abstractC10036c.mo29946a(null, this) == m23655c) {
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

        @InterfaceC9300f(m27742c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", m27743f = "MeasurementManagerFutures.kt", m27744l = {169}, m27745m = "invokeSuspend")
        /* renamed from: n1.a$a$b */
        /* loaded from: classes.dex */
        static final class b extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super Integer>, Object> {

            /* renamed from: a */
            int f23603a;

            b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
                return new b(continuation);
            }

            @Override // p280ok.InterfaceC10002p
            public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super Integer> continuation) {
                return ((b) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                Object m23655c;
                m23655c = C7752d.m23655c();
                int i10 = this.f23603a;
                if (i10 == 0) {
                    C2030o.m10349b(obj);
                    AbstractC10036c abstractC10036c = a.this.f23600b;
                    this.f23603a = 1;
                    obj = abstractC10036c.mo29947b(this);
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

        @InterfaceC9300f(m27742c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", m27743f = "MeasurementManagerFutures.kt", m27744l = {133}, m27745m = "invokeSuspend")
        /* renamed from: n1.a$a$c */
        /* loaded from: classes.dex */
        static final class c extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

            /* renamed from: a */
            int f23605a;

            /* renamed from: c */
            final /* synthetic */ Uri f23607c;

            /* renamed from: d */
            final /* synthetic */ InputEvent f23608d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f23607c = uri;
                this.f23608d = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
                return new c(this.f23607c, this.f23608d, continuation);
            }

            @Override // p280ok.InterfaceC10002p
            public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
                return ((c) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                Object m23655c;
                m23655c = C7752d.m23655c();
                int i10 = this.f23605a;
                if (i10 == 0) {
                    C2030o.m10349b(obj);
                    AbstractC10036c abstractC10036c = a.this.f23600b;
                    Uri uri = this.f23607c;
                    InputEvent inputEvent = this.f23608d;
                    this.f23605a = 1;
                    if (abstractC10036c.mo29948c(uri, inputEvent, this) == m23655c) {
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

        @InterfaceC9300f(m27742c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", m27743f = "MeasurementManagerFutures.kt", m27744l = {141}, m27745m = "invokeSuspend")
        /* renamed from: n1.a$a$d */
        /* loaded from: classes.dex */
        static final class d extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

            /* renamed from: a */
            int f23609a;

            /* renamed from: c */
            final /* synthetic */ Uri f23611c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Uri uri, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f23611c = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
                return new d(this.f23611c, continuation);
            }

            @Override // p280ok.InterfaceC10002p
            public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
                return ((d) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                Object m23655c;
                m23655c = C7752d.m23655c();
                int i10 = this.f23609a;
                if (i10 == 0) {
                    C2030o.m10349b(obj);
                    AbstractC10036c abstractC10036c = a.this.f23600b;
                    Uri uri = this.f23611c;
                    this.f23609a = 1;
                    if (abstractC10036c.mo29949d(uri, this) == m23655c) {
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

        @InterfaceC9300f(m27742c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", m27743f = "MeasurementManagerFutures.kt", m27744l = {151}, m27745m = "invokeSuspend")
        /* renamed from: n1.a$a$e */
        /* loaded from: classes.dex */
        static final class e extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

            /* renamed from: a */
            int f23612a;

            e(C10037d c10037d, Continuation<? super e> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
                return new e(null, continuation);
            }

            @Override // p280ok.InterfaceC10002p
            public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
                return ((e) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                Object m23655c;
                m23655c = C7752d.m23655c();
                int i10 = this.f23612a;
                if (i10 == 0) {
                    C2030o.m10349b(obj);
                    AbstractC10036c abstractC10036c = a.this.f23600b;
                    this.f23612a = 1;
                    if (abstractC10036c.mo29950e(null, this) == m23655c) {
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

        @InterfaceC9300f(m27742c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", m27743f = "MeasurementManagerFutures.kt", m27744l = {161}, m27745m = "invokeSuspend")
        /* renamed from: n1.a$a$f */
        /* loaded from: classes.dex */
        static final class f extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

            /* renamed from: a */
            int f23614a;

            f(C10038e c10038e, Continuation<? super f> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
                return new f(null, continuation);
            }

            @Override // p280ok.InterfaceC10002p
            public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
                return ((f) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                Object m23655c;
                m23655c = C7752d.m23655c();
                int i10 = this.f23614a;
                if (i10 == 0) {
                    C2030o.m10349b(obj);
                    AbstractC10036c abstractC10036c = a.this.f23600b;
                    this.f23614a = 1;
                    if (abstractC10036c.mo29951f(null, this) == m23655c) {
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

        public a(AbstractC10036c mMeasurementManager) {
            C9322n.m27781e(mMeasurementManager, "mMeasurementManager");
            this.f23600b = mMeasurementManager;
        }

        @Override // p244n1.AbstractC9630a
        /* renamed from: b */
        public InterfaceFutureC5920f<Integer> mo28830b() {
            return C9534b.m28360c(C13063h.m43186b(C13080l0.m43227a(C13034a1.m43039a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // p244n1.AbstractC9630a
        /* renamed from: c */
        public InterfaceFutureC5920f<C2037v> mo28831c(Uri attributionSource, InputEvent inputEvent) {
            C9322n.m27781e(attributionSource, "attributionSource");
            return C9534b.m28360c(C13063h.m43186b(C13080l0.m43227a(C13034a1.m43039a()), null, null, new c(attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // p244n1.AbstractC9630a
        /* renamed from: d */
        public InterfaceFutureC5920f<C2037v> mo28832d(Uri trigger) {
            C9322n.m27781e(trigger, "trigger");
            return C9534b.m28360c(C13063h.m43186b(C13080l0.m43227a(C13034a1.m43039a()), null, null, new d(trigger, null), 3, null), null, 1, null);
        }

        /* renamed from: f */
        public InterfaceFutureC5920f<C2037v> m28834f(C10034a deletionRequest) {
            C9322n.m27781e(deletionRequest, "deletionRequest");
            return C9534b.m28360c(C13063h.m43186b(C13080l0.m43227a(C13034a1.m43039a()), null, null, new C13224a(deletionRequest, null), 3, null), null, 1, null);
        }

        /* renamed from: g */
        public InterfaceFutureC5920f<C2037v> m28835g(C10037d request) {
            C9322n.m27781e(request, "request");
            return C9534b.m28360c(C13063h.m43186b(C13080l0.m43227a(C13034a1.m43039a()), null, null, new e(request, null), 3, null), null, 1, null);
        }

        /* renamed from: h */
        public InterfaceFutureC5920f<C2037v> m28836h(C10038e request) {
            C9322n.m27781e(request, "request");
            return C9534b.m28360c(C13063h.m43186b(C13080l0.m43227a(C13034a1.m43039a()), null, null, new f(request, null), 3, null), null, 1, null);
        }
    }

    /* renamed from: n1.a$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC9630a m28837a(Context context) {
            C9322n.m27781e(context, "context");
            AbstractC10036c m29959a = AbstractC10036c.f24676a.m29959a(context);
            if (m29959a != null) {
                return new a(m29959a);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final AbstractC9630a m28829a(Context context) {
        return f23599a.m28837a(context);
    }

    /* renamed from: b */
    public abstract InterfaceFutureC5920f<Integer> mo28830b();

    /* renamed from: c */
    public abstract InterfaceFutureC5920f<C2037v> mo28831c(Uri uri, InputEvent inputEvent);

    /* renamed from: d */
    public abstract InterfaceFutureC5920f<C2037v> mo28832d(Uri uri);
}
