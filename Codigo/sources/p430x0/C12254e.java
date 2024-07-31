package p430x0;

import ck.C2030o;
import ck.C2037v;
import hk.C7752d;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;
import p280ok.InterfaceC9998l;

/* renamed from: x0.e */
/* loaded from: classes.dex */
public final class C12254e<T> {

    /* renamed from: a */
    public static final a f32739a = new a(null);

    /* renamed from: x0.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        @InterfaceC9300f(m27742c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", m27743f = "DataMigrationInitializer.kt", m27744l = {33}, m27745m = "invokeSuspend")
        /* renamed from: x0.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C13265a extends AbstractC9306l implements InterfaceC10002p<InterfaceC12258i<T>, Continuation<? super C2037v>, Object> {

            /* renamed from: a */
            int f32740a;

            /* renamed from: b */
            /* synthetic */ Object f32741b;

            /* renamed from: c */
            final /* synthetic */ List<InterfaceC12253d<T>> f32742c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C13265a(List<? extends InterfaceC12253d<T>> list, Continuation<? super C13265a> continuation) {
                super(2, continuation);
                this.f32742c = list;
            }

            @Override // p280ok.InterfaceC10002p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC12258i<T> interfaceC12258i, Continuation<? super C2037v> continuation) {
                return ((C13265a) create(interfaceC12258i, continuation)).invokeSuspend(C2037v.f8089a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
                C13265a c13265a = new C13265a(this.f32742c, continuation);
                c13265a.f32741b = obj;
                return c13265a;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                Object m23655c;
                m23655c = C7752d.m23655c();
                int i10 = this.f32740a;
                if (i10 == 0) {
                    C2030o.m10349b(obj);
                    InterfaceC12258i interfaceC12258i = (InterfaceC12258i) this.f32741b;
                    a aVar = C12254e.f32739a;
                    List<InterfaceC12253d<T>> list = this.f32742c;
                    this.f32740a = 1;
                    if (aVar.m39441c(list, interfaceC12258i, this) == m23655c) {
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

        /* JADX INFO: Access modifiers changed from: package-private */
        @InterfaceC9300f(m27742c = "androidx.datastore.core.DataMigrationInitializer$Companion", m27743f = "DataMigrationInitializer.kt", m27744l = {42, 57}, m27745m = "runMigrations")
        /* renamed from: x0.e$a$b */
        /* loaded from: classes.dex */
        public static final class b<T> extends AbstractC9298d {

            /* renamed from: a */
            Object f32743a;

            /* renamed from: b */
            Object f32744b;

            /* renamed from: c */
            /* synthetic */ Object f32745c;

            /* renamed from: e */
            int f32747e;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                this.f32745c = obj;
                this.f32747e |= Integer.MIN_VALUE;
                return a.this.m39441c(null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @InterfaceC9300f(m27742c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", m27743f = "DataMigrationInitializer.kt", m27744l = {44, 46}, m27745m = "invokeSuspend")
        /* renamed from: x0.e$a$c */
        /* loaded from: classes.dex */
        public static final class c extends AbstractC9306l implements InterfaceC10002p<T, Continuation<? super T>, Object> {

            /* renamed from: a */
            Object f32748a;

            /* renamed from: b */
            Object f32749b;

            /* renamed from: c */
            Object f32750c;

            /* renamed from: d */
            int f32751d;

            /* renamed from: e */
            /* synthetic */ Object f32752e;

            /* renamed from: f */
            final /* synthetic */ List<InterfaceC12253d<T>> f32753f;

            /* renamed from: r */
            final /* synthetic */ List<InterfaceC9998l<Continuation<? super C2037v>, Object>> f32754r;

            /* JADX INFO: Access modifiers changed from: package-private */
            @InterfaceC9300f(m27742c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m27743f = "DataMigrationInitializer.kt", m27744l = {45}, m27745m = "invokeSuspend")
            /* renamed from: x0.e$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C13266a extends AbstractC9306l implements InterfaceC9998l<Continuation<? super C2037v>, Object> {

                /* renamed from: a */
                int f32755a;

                /* renamed from: b */
                final /* synthetic */ InterfaceC12253d<T> f32756b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C13266a(InterfaceC12253d<T> interfaceC12253d, Continuation<? super C13266a> continuation) {
                    super(1, continuation);
                    this.f32756b = interfaceC12253d;
                }

                @Override // p280ok.InterfaceC9998l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Continuation<? super C2037v> continuation) {
                    return ((C13266a) create(continuation)).invokeSuspend(C2037v.f8089a);
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
                public final Continuation<C2037v> create(Continuation<?> continuation) {
                    return new C13266a(this.f32756b, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
                public final Object invokeSuspend(Object obj) {
                    Object m23655c;
                    m23655c = C7752d.m23655c();
                    int i10 = this.f32755a;
                    if (i10 == 0) {
                        C2030o.m10349b(obj);
                        InterfaceC12253d<T> interfaceC12253d = this.f32756b;
                        this.f32755a = 1;
                        if (interfaceC12253d.m39439c(this) == m23655c) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends InterfaceC12253d<T>> list, List<InterfaceC9998l<Continuation<? super C2037v>, Object>> list2, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f32753f = list;
                this.f32754r = list2;
            }

            @Override // p280ok.InterfaceC10002p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t10, Continuation<? super T> continuation) {
                return ((c) create(t10, continuation)).invokeSuspend(C2037v.f8089a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f32753f, this.f32754r, continuation);
                cVar.f32752e = obj;
                return cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0093 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = hk.C7750b.m23652c()
                    int r1 = r10.f32751d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L3a
                    if (r1 == r3) goto L24
                    if (r1 != r2) goto L1c
                    java.lang.Object r1 = r10.f32748a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r10.f32752e
                    java.util.List r4 = (java.util.List) r4
                    ck.C2030o.m10349b(r11)
                    r7 = r10
                    goto L8e
                L1c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L24:
                    java.lang.Object r1 = r10.f32750c
                    java.lang.Object r4 = r10.f32749b
                    x0.d r4 = (p430x0.InterfaceC12253d) r4
                    java.lang.Object r5 = r10.f32748a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r10.f32752e
                    java.util.List r6 = (java.util.List) r6
                    ck.C2030o.m10349b(r11)
                    r7 = r10
                    r9 = r6
                    r6 = r4
                    r4 = r9
                    goto L6c
                L3a:
                    ck.C2030o.m10349b(r11)
                    java.lang.Object r11 = r10.f32752e
                    java.util.List<x0.d<T>> r1 = r10.f32753f
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<ok.l<gk.Continuation<? super ck.v>, java.lang.Object>> r4 = r10.f32754r
                    java.util.Iterator r1 = r1.iterator()
                    r5 = r10
                L4a:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L93
                    java.lang.Object r6 = r1.next()
                    x0.d r6 = (p430x0.InterfaceC12253d) r6
                    r5.f32752e = r4
                    r5.f32748a = r1
                    r5.f32749b = r6
                    r5.f32750c = r11
                    r5.f32751d = r3
                    java.lang.Object r7 = r6.m39437a(r11, r5)
                    if (r7 != r0) goto L67
                    return r0
                L67:
                    r9 = r1
                    r1 = r11
                    r11 = r7
                    r7 = r5
                    r5 = r9
                L6c:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L90
                    x0.e$a$c$a r11 = new x0.e$a$c$a
                    r8 = 0
                    r11.<init>(r6, r8)
                    r4.add(r11)
                    r7.f32752e = r4
                    r7.f32748a = r5
                    r7.f32749b = r8
                    r7.f32750c = r8
                    r7.f32751d = r2
                    java.lang.Object r11 = r6.m39438b(r1, r7)
                    if (r11 != r0) goto L91
                    return r0
                L8e:
                    r5 = r7
                    goto L4a
                L90:
                    r11 = r1
                L91:
                    r1 = r5
                    goto L8e
                L93:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: p430x0.C12254e.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Throwable, T] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:13:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008b -> B:13:0x006b). Please report as a decompilation issue!!! */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> java.lang.Object m39441c(java.util.List<? extends p430x0.InterfaceC12253d<T>> r7, p430x0.InterfaceC12258i<T> r8, p124gk.Continuation<? super ck.C2037v> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof p430x0.C12254e.a.b
                if (r0 == 0) goto L13
                r0 = r9
                x0.e$a$b r0 = (p430x0.C12254e.a.b) r0
                int r1 = r0.f32747e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f32747e = r1
                goto L18
            L13:
                x0.e$a$b r0 = new x0.e$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f32745c
                java.lang.Object r1 = hk.C7750b.m23652c()
                int r2 = r0.f32747e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f32744b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f32743a
                kotlin.jvm.internal.x r8 = (kotlin.jvm.internal.C9332x) r8
                ck.C2030o.m10349b(r9)     // Catch: java.lang.Throwable -> L34
                goto L6b
            L34:
                r9 = move-exception
                goto L84
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f32743a
                java.util.List r7 = (java.util.List) r7
                ck.C2030o.m10349b(r9)
                goto L60
            L46:
                ck.C2030o.m10349b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                x0.e$a$c r2 = new x0.e$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f32743a = r9
                r0.f32747e = r4
                java.lang.Object r7 = r8.mo39448a(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                kotlin.jvm.internal.x r8 = new kotlin.jvm.internal.x
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L6b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L96
                java.lang.Object r9 = r7.next()
                ok.l r9 = (p280ok.InterfaceC9998l) r9
                r0.f32743a = r8     // Catch: java.lang.Throwable -> L34
                r0.f32744b = r7     // Catch: java.lang.Throwable -> L34
                r0.f32747e = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L6b
                return r1
            L84:
                T r2 = r8.f22581a
                if (r2 != 0) goto L8b
                r8.f22581a = r9
                goto L6b
            L8b:
                kotlin.jvm.internal.C9322n.m27778b(r2)
                T r2 = r8.f22581a
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                ck.C2016a.m10326a(r2, r9)
                goto L6b
            L96:
                T r7 = r8.f22581a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9f
                ck.v r7 = ck.C2037v.f8089a
                return r7
            L9f:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p430x0.C12254e.a.m39441c(java.util.List, x0.i, gk.Continuation):java.lang.Object");
        }

        /* renamed from: b */
        public final <T> InterfaceC10002p<InterfaceC12258i<T>, Continuation<? super C2037v>, Object> m39442b(List<? extends InterfaceC12253d<T>> migrations) {
            C9322n.m27781e(migrations, "migrations");
            return new C13265a(migrations, null);
        }
    }
}
