package androidx.activity;

import ck.C2037v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9987a;

/* renamed from: androidx.activity.j */
/* loaded from: classes.dex */
public final class C0195j {

    /* renamed from: a */
    private final Executor f709a;

    /* renamed from: b */
    private final InterfaceC9987a<C2037v> f710b;

    /* renamed from: c */
    private final Object f711c;

    /* renamed from: d */
    private int f712d;

    /* renamed from: e */
    private boolean f713e;

    /* renamed from: f */
    private boolean f714f;

    /* renamed from: g */
    private final List<InterfaceC9987a<C2037v>> f715g;

    /* renamed from: h */
    private final Runnable f716h;

    public C0195j(Executor executor, InterfaceC9987a<C2037v> reportFullyDrawn) {
        C9322n.m27781e(executor, "executor");
        C9322n.m27781e(reportFullyDrawn, "reportFullyDrawn");
        this.f709a = executor;
        this.f710b = reportFullyDrawn;
        this.f711c = new Object();
        this.f715g = new ArrayList();
        this.f716h = new Runnable() { // from class: androidx.activity.i
            @Override // java.lang.Runnable
            public final void run() {
                C0195j.m810d(C0195j.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m810d(C0195j this$0) {
        C9322n.m27781e(this$0, "this$0");
        synchronized (this$0.f711c) {
            this$0.f713e = false;
            if (this$0.f712d == 0 && !this$0.f714f) {
                this$0.f710b.invoke();
                this$0.m811b();
            }
            C2037v c2037v = C2037v.f8089a;
        }
    }

    /* renamed from: b */
    public final void m811b() {
        synchronized (this.f711c) {
            this.f714f = true;
            Iterator<T> it = this.f715g.iterator();
            while (it.hasNext()) {
                ((InterfaceC9987a) it.next()).invoke();
            }
            this.f715g.clear();
            C2037v c2037v = C2037v.f8089a;
        }
    }

    /* renamed from: c */
    public final boolean m812c() {
        boolean z10;
        synchronized (this.f711c) {
            z10 = this.f714f;
        }
        return z10;
    }
}
