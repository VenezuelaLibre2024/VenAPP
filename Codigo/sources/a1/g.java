package a1;

import ck.o;
import ck.v;
import gk.Continuation;
import kotlin.coroutines.jvm.internal.l;
import ok.p;

/* loaded from: classes.dex */
public final class g {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends l implements p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f49b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<a1.a, Continuation<? super v>, Object> f50c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super a1.a, ? super Continuation<? super v>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f50c = pVar;
        }

        @Override // ok.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, Continuation<? super d> continuation) {
            return ((a) create(dVar, continuation)).invokeSuspend(v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<v> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f50c, continuation);
            aVar.f49b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c10;
            c10 = hk.d.c();
            int i10 = this.f48a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.a aVar = (a1.a) this.f49b;
                o.b(obj);
                return aVar;
            }
            o.b(obj);
            a1.a c11 = ((d) this.f49b).c();
            p<a1.a, Continuation<? super v>, Object> pVar = this.f50c;
            this.f49b = c11;
            this.f48a = 1;
            return pVar.invoke(c11, this) == c10 ? c10 : c11;
        }
    }

    public static final Object a(x0.f<d> fVar, p<? super a1.a, ? super Continuation<? super v>, ? extends Object> pVar, Continuation<? super d> continuation) {
        return fVar.a(new a(pVar, null), continuation);
    }
}
