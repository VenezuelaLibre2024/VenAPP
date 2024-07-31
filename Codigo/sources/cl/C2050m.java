package cl;

import ck.C2037v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9322n;
import p069dl.AbstractC7044b;
import p069dl.C7050h;
import p089el.C7223h0;
import p124gk.Continuation;

/* renamed from: cl.m */
/* loaded from: classes3.dex */
final class C2050m<T> extends AbstractC7044b<C2052o> implements InterfaceC2048k<T>, InterfaceC2039b {

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f8126e = AtomicReferenceFieldUpdater.newUpdater(C2050m.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d */
    private int f8127d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "kotlinx.coroutines.flow.StateFlowImpl", m27743f = "StateFlow.kt", m27744l = {384, 396, 401}, m27745m = "collect")
    /* renamed from: cl.m$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC9298d {

        /* renamed from: a */
        Object f8128a;

        /* renamed from: b */
        Object f8129b;

        /* renamed from: c */
        Object f8130c;

        /* renamed from: d */
        Object f8131d;

        /* renamed from: e */
        Object f8132e;

        /* renamed from: f */
        /* synthetic */ Object f8133f;

        /* renamed from: r */
        final /* synthetic */ C2050m<T> f8134r;

        /* renamed from: s */
        int f8135s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2050m<T> c2050m, Continuation<? super a> continuation) {
            super(continuation);
            this.f8134r = c2050m;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f8133f = obj;
            this.f8135s |= Integer.MIN_VALUE;
            return this.f8134r.mo10355a(null, this);
        }
    }

    public C2050m(Object obj) {
        this._state = obj;
    }

    /* renamed from: i */
    private final boolean m10373i(Object obj, Object obj2) {
        int i10;
        C2052o[] m20644f;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8126e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !C9322n.m27777a(obj3, obj)) {
                return false;
            }
            if (C9322n.m27777a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f8127d;
            if ((i11 & 1) != 0) {
                this.f8127d = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f8127d = i12;
            C2052o[] m20644f2 = m20644f();
            C2037v c2037v = C2037v.f8089a;
            while (true) {
                C2052o[] c2052oArr = m20644f2;
                if (c2052oArr != null) {
                    for (C2052o c2052o : c2052oArr) {
                        if (c2052o != null) {
                            c2052o.m10387g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f8127d;
                    if (i10 == i12) {
                        this.f8127d = i12 + 1;
                        return true;
                    }
                    m20644f = m20644f();
                    C2037v c2037v2 = C2037v.f8089a;
                }
                m20644f2 = m20644f;
                i12 = i10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b7, code lost:
    
        if (kotlin.jvm.internal.C9322n.m27777a(r11, r12) == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ae A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:13:0x003e, B:14:0x00a6, B:16:0x00ae, B:18:0x00b3, B:20:0x00d4, B:22:0x00da, B:26:0x00b9, B:29:0x00c0, B:38:0x005c, B:40:0x006f, B:41:0x0097), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:13:0x003e, B:14:0x00a6, B:16:0x00ae, B:18:0x00b3, B:20:0x00d4, B:22:0x00da, B:26:0x00b9, B:29:0x00c0, B:38:0x005c, B:40:0x006f, B:41:0x0097), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00da A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:13:0x003e, B:14:0x00a6, B:16:0x00ae, B:18:0x00b3, B:20:0x00d4, B:22:0x00da, B:26:0x00b9, B:29:0x00c0, B:38:0x005c, B:40:0x006f, B:41:0x0097), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [dl.d] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00d8 -> B:14:0x00a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ea -> B:14:0x00a6). Please report as a decompilation issue!!! */
    @Override // cl.InterfaceC2039b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo10355a(cl.InterfaceC2040c<? super T> r11, p124gk.Continuation<?> r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.C2050m.mo10355a(cl.c, gk.Continuation):java.lang.Object");
    }

    @Override // cl.InterfaceC2040c
    public Object emit(T t10, Continuation<? super C2037v> continuation) {
        setValue(t10);
        return C2037v.f8089a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p069dl.AbstractC7044b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C2052o mo10374c() {
        return new C2052o();
    }

    @Override // cl.InterfaceC2048k
    public T getValue() {
        C7223h0 c7223h0 = C7050h.f15613a;
        T t10 = (T) f8126e.get(this);
        if (t10 == c7223h0) {
            return null;
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p069dl.AbstractC7044b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C2052o[] mo10375d(int i10) {
        return new C2052o[i10];
    }

    @Override // cl.InterfaceC2048k
    public void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) C7050h.f15613a;
        }
        m10373i(null, t10);
    }
}
