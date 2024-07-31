package x0;

import ck.v;
import gk.Continuation;
import java.util.List;
import ok.p;

/* loaded from: classes.dex */
public final class e<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f30227a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {

        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
        /* renamed from: x0.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0489a extends kotlin.coroutines.jvm.internal.l implements p<i<T>, Continuation<? super v>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f30228a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f30229b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<d<T>> f30230c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0489a(List<? extends d<T>> list, Continuation<? super C0489a> continuation) {
                super(2, continuation);
                this.f30230c = list;
            }

            @Override // ok.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i<T> iVar, Continuation<? super v> continuation) {
                return ((C0489a) create(iVar, continuation)).invokeSuspend(v.f7137a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<v> create(Object obj, Continuation<?> continuation) {
                C0489a c0489a = new C0489a(this.f30230c, continuation);
                c0489a.f30229b = obj;
                return c0489a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object c10;
                c10 = hk.d.c();
                int i10 = this.f30228a;
                if (i10 == 0) {
                    ck.o.b(obj);
                    i iVar = (i) this.f30229b;
                    a aVar = e.f30227a;
                    List<d<T>> list = this.f30230c;
                    this.f30228a = 1;
                    if (aVar.c(list, iVar, this) == c10) {
                        return c10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ck.o.b(obj);
                }
                return v.f7137a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
        /* loaded from: classes.dex */
        public static final class b<T> extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f30231a;

            /* renamed from: b, reason: collision with root package name */
            Object f30232b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f30233c;

            /* renamed from: e, reason: collision with root package name */
            int f30235e;

            b(Continuation<? super b> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f30233c = obj;
                this.f30235e |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements p<T, Continuation<? super T>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f30236a;

            /* renamed from: b, reason: collision with root package name */
            Object f30237b;

            /* renamed from: c, reason: collision with root package name */
            Object f30238c;

            /* renamed from: d, reason: collision with root package name */
            int f30239d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f30240e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<d<T>> f30241f;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ List<ok.l<Continuation<? super v>, Object>> f30242r;

            /* JADX INFO: Access modifiers changed from: package-private */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
            /* renamed from: x0.e$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0490a extends kotlin.coroutines.jvm.internal.l implements ok.l<Continuation<? super v>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f30243a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ d<T> f30244b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0490a(d<T> dVar, Continuation<? super C0490a> continuation) {
                    super(1, continuation);
                    this.f30244b = dVar;
                }

                @Override // ok.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Continuation<? super v> continuation) {
                    return ((C0490a) create(continuation)).invokeSuspend(v.f7137a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<v> create(Continuation<?> continuation) {
                    return new C0490a(this.f30244b, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object c10;
                    c10 = hk.d.c();
                    int i10 = this.f30243a;
                    if (i10 == 0) {
                        ck.o.b(obj);
                        d<T> dVar = this.f30244b;
                        this.f30243a = 1;
                        if (dVar.c(this) == c10) {
                            return c10;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ck.o.b(obj);
                    }
                    return v.f7137a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends d<T>> list, List<ok.l<Continuation<? super v>, Object>> list2, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f30241f = list;
                this.f30242r = list2;
            }

            @Override // ok.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(T t10, Continuation<? super T> continuation) {
                return ((c) create(t10, continuation)).invokeSuspend(v.f7137a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<v> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f30241f, this.f30242r, continuation);
                cVar.f30240e = obj;
                return cVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0093 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = hk.b.c()
                    int r1 = r10.f30239d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L3a
                    if (r1 == r3) goto L24
                    if (r1 != r2) goto L1c
                    java.lang.Object r1 = r10.f30236a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r10.f30240e
                    java.util.List r4 = (java.util.List) r4
                    ck.o.b(r11)
                    r7 = r10
                    goto L8e
                L1c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L24:
                    java.lang.Object r1 = r10.f30238c
                    java.lang.Object r4 = r10.f30237b
                    x0.d r4 = (x0.d) r4
                    java.lang.Object r5 = r10.f30236a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r10.f30240e
                    java.util.List r6 = (java.util.List) r6
                    ck.o.b(r11)
                    r7 = r10
                    r9 = r6
                    r6 = r4
                    r4 = r9
                    goto L6c
                L3a:
                    ck.o.b(r11)
                    java.lang.Object r11 = r10.f30240e
                    java.util.List<x0.d<T>> r1 = r10.f30241f
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<ok.l<gk.Continuation<? super ck.v>, java.lang.Object>> r4 = r10.f30242r
                    java.util.Iterator r1 = r1.iterator()
                    r5 = r10
                L4a:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L93
                    java.lang.Object r6 = r1.next()
                    x0.d r6 = (x0.d) r6
                    r5.f30240e = r4
                    r5.f30236a = r1
                    r5.f30237b = r6
                    r5.f30238c = r11
                    r5.f30239d = r3
                    java.lang.Object r7 = r6.a(r11, r5)
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
                    r7.f30240e = r4
                    r7.f30236a = r5
                    r7.f30237b = r8
                    r7.f30238c = r8
                    r7.f30239d = r2
                    java.lang.Object r11 = r6.b(r1, r7)
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
                throw new UnsupportedOperationException("Method not decompiled: x0.e.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> java.lang.Object c(java.util.List<? extends x0.d<T>> r7, x0.i<T> r8, gk.Continuation<? super ck.v> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof x0.e.a.b
                if (r0 == 0) goto L13
                r0 = r9
                x0.e$a$b r0 = (x0.e.a.b) r0
                int r1 = r0.f30235e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f30235e = r1
                goto L18
            L13:
                x0.e$a$b r0 = new x0.e$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f30233c
                java.lang.Object r1 = hk.b.c()
                int r2 = r0.f30235e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f30232b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f30231a
                kotlin.jvm.internal.x r8 = (kotlin.jvm.internal.x) r8
                ck.o.b(r9)     // Catch: java.lang.Throwable -> L34
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
                java.lang.Object r7 = r0.f30231a
                java.util.List r7 = (java.util.List) r7
                ck.o.b(r9)
                goto L60
            L46:
                ck.o.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                x0.e$a$c r2 = new x0.e$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f30231a = r9
                r0.f30235e = r4
                java.lang.Object r7 = r8.a(r2, r0)
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
                ok.l r9 = (ok.l) r9
                r0.f30231a = r8     // Catch: java.lang.Throwable -> L34
                r0.f30232b = r7     // Catch: java.lang.Throwable -> L34
                r0.f30235e = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L6b
                return r1
            L84:
                T r2 = r8.f20759a
                if (r2 != 0) goto L8b
                r8.f20759a = r9
                goto L6b
            L8b:
                kotlin.jvm.internal.n.b(r2)
                T r2 = r8.f20759a
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                ck.a.a(r2, r9)
                goto L6b
            L96:
                T r7 = r8.f20759a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9f
                ck.v r7 = ck.v.f7137a
                return r7
            L9f:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.e.a.c(java.util.List, x0.i, gk.Continuation):java.lang.Object");
        }

        public final <T> p<i<T>, Continuation<? super v>, Object> b(List<? extends d<T>> migrations) {
            kotlin.jvm.internal.n.e(migrations, "migrations");
            return new C0489a(migrations, null);
        }
    }
}
