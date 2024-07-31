package n1;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import ck.o;
import ck.v;
import com.google.common.util.concurrent.f;
import gk.Continuation;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import ok.p;
import p1.c;
import zk.a1;
import zk.j;
import zk.k0;
import zk.l0;
import zk.r0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a */
    public static final b f21666a = new b(null);

    /* renamed from: n1.a$a */
    /* loaded from: classes.dex */
    public static final class C0349a extends a {

        /* renamed from: b */
        private final p1.c f21667b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {122}, m = "invokeSuspend")
        /* renamed from: n1.a$a$a */
        /* loaded from: classes.dex */
        static final class C0350a extends l implements p<k0, Continuation<? super v>, Object> {

            /* renamed from: a */
            int f21668a;

            C0350a(p1.a aVar, Continuation<? super C0350a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<v> create(Object obj, Continuation<?> continuation) {
                return new C0350a(null, continuation);
            }

            @Override // ok.p
            public final Object invoke(k0 k0Var, Continuation<? super v> continuation) {
                return ((C0350a) create(k0Var, continuation)).invokeSuspend(v.f7137a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = hk.d.c();
                int i10 = this.f21668a;
                if (i10 == 0) {
                    o.b(obj);
                    p1.c cVar = C0349a.this.f21667b;
                    this.f21668a = 1;
                    if (cVar.a(null, this) == c10) {
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

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {169}, m = "invokeSuspend")
        /* renamed from: n1.a$a$b */
        /* loaded from: classes.dex */
        static final class b extends l implements p<k0, Continuation<? super Integer>, Object> {

            /* renamed from: a */
            int f21670a;

            b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<v> create(Object obj, Continuation<?> continuation) {
                return new b(continuation);
            }

            @Override // ok.p
            public final Object invoke(k0 k0Var, Continuation<? super Integer> continuation) {
                return ((b) create(k0Var, continuation)).invokeSuspend(v.f7137a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = hk.d.c();
                int i10 = this.f21670a;
                if (i10 == 0) {
                    o.b(obj);
                    p1.c cVar = C0349a.this.f21667b;
                    this.f21670a = 1;
                    obj = cVar.b(this);
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

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {133}, m = "invokeSuspend")
        /* renamed from: n1.a$a$c */
        /* loaded from: classes.dex */
        static final class c extends l implements p<k0, Continuation<? super v>, Object> {

            /* renamed from: a */
            int f21672a;

            /* renamed from: c */
            final /* synthetic */ Uri f21674c;

            /* renamed from: d */
            final /* synthetic */ InputEvent f21675d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f21674c = uri;
                this.f21675d = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<v> create(Object obj, Continuation<?> continuation) {
                return new c(this.f21674c, this.f21675d, continuation);
            }

            @Override // ok.p
            public final Object invoke(k0 k0Var, Continuation<? super v> continuation) {
                return ((c) create(k0Var, continuation)).invokeSuspend(v.f7137a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = hk.d.c();
                int i10 = this.f21672a;
                if (i10 == 0) {
                    o.b(obj);
                    p1.c cVar = C0349a.this.f21667b;
                    Uri uri = this.f21674c;
                    InputEvent inputEvent = this.f21675d;
                    this.f21672a = 1;
                    if (cVar.c(uri, inputEvent, this) == c10) {
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

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {141}, m = "invokeSuspend")
        /* renamed from: n1.a$a$d */
        /* loaded from: classes.dex */
        static final class d extends l implements p<k0, Continuation<? super v>, Object> {

            /* renamed from: a */
            int f21676a;

            /* renamed from: c */
            final /* synthetic */ Uri f21678c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Uri uri, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f21678c = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<v> create(Object obj, Continuation<?> continuation) {
                return new d(this.f21678c, continuation);
            }

            @Override // ok.p
            public final Object invoke(k0 k0Var, Continuation<? super v> continuation) {
                return ((d) create(k0Var, continuation)).invokeSuspend(v.f7137a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = hk.d.c();
                int i10 = this.f21676a;
                if (i10 == 0) {
                    o.b(obj);
                    p1.c cVar = C0349a.this.f21667b;
                    Uri uri = this.f21678c;
                    this.f21676a = 1;
                    if (cVar.d(uri, this) == c10) {
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

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {151}, m = "invokeSuspend")
        /* renamed from: n1.a$a$e */
        /* loaded from: classes.dex */
        static final class e extends l implements p<k0, Continuation<? super v>, Object> {

            /* renamed from: a */
            int f21679a;

            e(p1.d dVar, Continuation<? super e> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<v> create(Object obj, Continuation<?> continuation) {
                return new e(null, continuation);
            }

            @Override // ok.p
            public final Object invoke(k0 k0Var, Continuation<? super v> continuation) {
                return ((e) create(k0Var, continuation)).invokeSuspend(v.f7137a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = hk.d.c();
                int i10 = this.f21679a;
                if (i10 == 0) {
                    o.b(obj);
                    p1.c cVar = C0349a.this.f21667b;
                    this.f21679a = 1;
                    if (cVar.e(null, this) == c10) {
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

        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {161}, m = "invokeSuspend")
        /* renamed from: n1.a$a$f */
        /* loaded from: classes.dex */
        static final class f extends l implements p<k0, Continuation<? super v>, Object> {

            /* renamed from: a */
            int f21681a;

            f(p1.e eVar, Continuation<? super f> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<v> create(Object obj, Continuation<?> continuation) {
                return new f(null, continuation);
            }

            @Override // ok.p
            public final Object invoke(k0 k0Var, Continuation<? super v> continuation) {
                return ((f) create(k0Var, continuation)).invokeSuspend(v.f7137a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = hk.d.c();
                int i10 = this.f21681a;
                if (i10 == 0) {
                    o.b(obj);
                    p1.c cVar = C0349a.this.f21667b;
                    this.f21681a = 1;
                    if (cVar.f(null, this) == c10) {
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

        public C0349a(p1.c mMeasurementManager) {
            n.e(mMeasurementManager, "mMeasurementManager");
            this.f21667b = mMeasurementManager;
        }

        @Override // n1.a
        public com.google.common.util.concurrent.f<Integer> b() {
            r0 b10;
            b10 = j.b(l0.a(a1.a()), null, null, new b(null), 3, null);
            return m1.b.c(b10, null, 1, null);
        }

        @Override // n1.a
        public com.google.common.util.concurrent.f<v> c(Uri attributionSource, InputEvent inputEvent) {
            r0 b10;
            n.e(attributionSource, "attributionSource");
            b10 = j.b(l0.a(a1.a()), null, null, new c(attributionSource, inputEvent, null), 3, null);
            return m1.b.c(b10, null, 1, null);
        }

        @Override // n1.a
        public com.google.common.util.concurrent.f<v> d(Uri trigger) {
            r0 b10;
            n.e(trigger, "trigger");
            b10 = j.b(l0.a(a1.a()), null, null, new d(trigger, null), 3, null);
            return m1.b.c(b10, null, 1, null);
        }

        public com.google.common.util.concurrent.f<v> f(p1.a deletionRequest) {
            r0 b10;
            n.e(deletionRequest, "deletionRequest");
            b10 = j.b(l0.a(a1.a()), null, null, new C0350a(deletionRequest, null), 3, null);
            return m1.b.c(b10, null, 1, null);
        }

        public com.google.common.util.concurrent.f<v> g(p1.d request) {
            r0 b10;
            n.e(request, "request");
            b10 = j.b(l0.a(a1.a()), null, null, new e(request, null), 3, null);
            return m1.b.c(b10, null, 1, null);
        }

        public com.google.common.util.concurrent.f<v> h(p1.e request) {
            r0 b10;
            n.e(request, "request");
            b10 = j.b(l0.a(a1.a()), null, null, new f(request, null), 3, null);
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
            c a10 = c.f22743a.a(context);
            if (a10 != null) {
                return new C0349a(a10);
            }
            return null;
        }
    }

    public static final a a(Context context) {
        return f21666a.a(context);
    }

    public abstract f<Integer> b();

    public abstract f<v> c(Uri uri, InputEvent inputEvent);

    public abstract f<v> d(Uri uri);
}
