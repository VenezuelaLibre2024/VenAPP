package dk;

import gk.Continuation;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a<T> extends kotlin.coroutines.jvm.internal.k implements ok.p<wk.f<? super List<? extends T>>, Continuation<? super ck.v>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f14234b;

        /* renamed from: c, reason: collision with root package name */
        Object f14235c;

        /* renamed from: d, reason: collision with root package name */
        int f14236d;

        /* renamed from: e, reason: collision with root package name */
        int f14237e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f14238f;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f14239r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f14240s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Iterator<T> f14241t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f14242u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ boolean f14243v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14239r = i10;
            this.f14240s = i11;
            this.f14241t = it;
            this.f14242u = z10;
            this.f14243v = z11;
        }

        @Override // ok.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(wk.f<? super List<? extends T>> fVar, Continuation<? super ck.v> continuation) {
            return ((a) create(fVar, continuation)).invokeSuspend(ck.v.f7137a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<ck.v> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f14239r, this.f14240s, this.f14241t, this.f14242u, this.f14243v, continuation);
            aVar.f14238f = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00dc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00b1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x014b -> B:12:0x014e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x011d -> B:30:0x0120). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00a6 -> B:50:0x0058). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 365
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: dk.s0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i10, int i11) {
        String str;
        if (i10 > 0 && i11 > 0) {
            return;
        }
        if (i10 != i11) {
            str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
        } else {
            str = "size " + i10 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static final <T> Iterator<List<T>> b(Iterator<? extends T> iterator, int i10, int i11, boolean z10, boolean z11) {
        Iterator<List<T>> a10;
        kotlin.jvm.internal.n.e(iterator, "iterator");
        if (!iterator.hasNext()) {
            return a0.f14206a;
        }
        a10 = wk.h.a(new a(i10, i11, iterator, z11, z10, null));
        return a10;
    }
}
