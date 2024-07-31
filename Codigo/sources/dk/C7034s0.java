package dk;

import ck.C2037v;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC9305k;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9322n;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;
import p427wk.AbstractC12230f;
import p427wk.C12232h;

/* renamed from: dk.s0 */
/* loaded from: classes3.dex */
public final class C7034s0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC9300f(m27742c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m27743f = "SlidingWindow.kt", m27744l = {34, 40, 49, 55, 58}, m27745m = "invokeSuspend")
    /* renamed from: dk.s0$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AbstractC9305k implements InterfaceC10002p<AbstractC12230f<? super List<? extends T>>, Continuation<? super C2037v>, Object> {

        /* renamed from: b */
        Object f15592b;

        /* renamed from: c */
        Object f15593c;

        /* renamed from: d */
        int f15594d;

        /* renamed from: e */
        int f15595e;

        /* renamed from: f */
        private /* synthetic */ Object f15596f;

        /* renamed from: r */
        final /* synthetic */ int f15597r;

        /* renamed from: s */
        final /* synthetic */ int f15598s;

        /* renamed from: t */
        final /* synthetic */ Iterator<T> f15599t;

        /* renamed from: u */
        final /* synthetic */ boolean f15600u;

        /* renamed from: v */
        final /* synthetic */ boolean f15601v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f15597r = i10;
            this.f15598s = i11;
            this.f15599t = it;
            this.f15600u = z10;
            this.f15601v = z11;
        }

        @Override // p280ok.InterfaceC10002p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC12230f<? super List<? extends T>> abstractC12230f, Continuation<? super C2037v> continuation) {
            return ((a) create(abstractC12230f, continuation)).invokeSuspend(C2037v.f8089a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f15597r, this.f15598s, this.f15599t, this.f15600u, this.f15601v, continuation);
            aVar.f15596f = obj;
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
        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 365
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: dk.C7034s0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final void m20591a(int i10, int i11) {
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

    /* renamed from: b */
    public static final <T> Iterator<List<T>> m20592b(Iterator<? extends T> iterator, int i10, int i11, boolean z10, boolean z11) {
        Iterator<List<T>> m39377a;
        C9322n.m27781e(iterator, "iterator");
        if (!iterator.hasNext()) {
            return C6998a0.f15564a;
        }
        m39377a = C12232h.m39377a(new a(i10, i11, iterator, z11, z10, null));
        return m39377a;
    }
}
