package a1;

import ck.o;
import ck.v;
import gk.Continuation;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import ok.p;

/* loaded from: classes.dex */
public final class b implements x0.f<d> {

    /* renamed from: a, reason: collision with root package name */
    private final x0.f<d> f39a;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends l implements p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f40a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<d, Continuation<? super d>, Object> f42c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super d, ? super Continuation<? super d>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f42c = pVar;
        }

        @Override // ok.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, Continuation<? super d> continuation) {
            return ((a) create(dVar, continuation)).invokeSuspend(v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f42c, continuation);
            aVar.f41b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = hk.d.c();
            int i10 = this.f40a;
            if (i10 == 0) {
                o.b(obj);
                d dVar = (d) this.f41b;
                p<d, Continuation<? super d>, Object> pVar = this.f42c;
                this.f40a = 1;
                obj = pVar.invoke(dVar, this);
                if (obj == c10) {
                    return c10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            d dVar2 = (d) obj;
            ((a1.a) dVar2).f();
            return dVar2;
        }
    }

    public b(x0.f<d> delegate) {
        n.e(delegate, "delegate");
        this.f39a = delegate;
    }

    @Override // x0.f
    public Object a(p<? super d, ? super Continuation<? super d>, ? extends Object> pVar, Continuation<? super d> continuation) {
        return this.f39a.a(new a(pVar, null), continuation);
    }

    @Override // x0.f
    public cl.b<d> getData() {
        return this.f39a.getData();
    }
}
