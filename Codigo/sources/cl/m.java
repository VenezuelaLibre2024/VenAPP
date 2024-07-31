package cl;

import ck.v;
import el.h0;
import gk.Continuation;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
final class m<T> extends dl.b<o> implements k<T>, b {

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f7174e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    private int f7175d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f7176a;

        /* renamed from: b, reason: collision with root package name */
        Object f7177b;

        /* renamed from: c, reason: collision with root package name */
        Object f7178c;

        /* renamed from: d, reason: collision with root package name */
        Object f7179d;

        /* renamed from: e, reason: collision with root package name */
        Object f7180e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f7181f;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ m<T> f7182r;

        /* renamed from: s, reason: collision with root package name */
        int f7183s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m<T> mVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f7182r = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7181f = obj;
            this.f7183s |= Integer.MIN_VALUE;
            return this.f7182r.a(null, this);
        }
    }

    public m(Object obj) {
        this._state = obj;
    }

    private final boolean i(Object obj, Object obj2) {
        int i10;
        o[] f10;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7174e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.n.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.n.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f7175d;
            if ((i11 & 1) != 0) {
                this.f7175d = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f7175d = i12;
            o[] f11 = f();
            v vVar = v.f7137a;
            while (true) {
                o[] oVarArr = f11;
                if (oVarArr != null) {
                    for (o oVar : oVarArr) {
                        if (oVar != null) {
                            oVar.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f7175d;
                    if (i10 == i12) {
                        this.f7175d = i12 + 1;
                        return true;
                    }
                    f10 = f();
                    v vVar2 = v.f7137a;
                }
                f11 = f10;
                i12 = i10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b7, code lost:
    
        if (kotlin.jvm.internal.n.a(r11, r12) == false) goto L40;
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
    @Override // cl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(cl.c<? super T> r11, gk.Continuation<?> r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.m.a(cl.c, gk.Continuation):java.lang.Object");
    }

    @Override // cl.c
    public Object emit(T t10, Continuation<? super v> continuation) {
        setValue(t10);
        return v.f7137a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dl.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public o c() {
        return new o();
    }

    @Override // cl.k
    public T getValue() {
        h0 h0Var = dl.h.f14255a;
        T t10 = (T) f7174e.get(this);
        if (t10 == h0Var) {
            return null;
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // dl.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public o[] d(int i10) {
        return new o[i10];
    }

    @Override // cl.k
    public void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) dl.h.f14255a;
        }
        i(null, t10);
    }
}
