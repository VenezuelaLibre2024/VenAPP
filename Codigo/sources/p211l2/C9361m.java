package p211l2;

import androidx.lifecycle.C1318p;
import androidx.lifecycle.InterfaceC1321s;
import androidx.lifecycle.LiveData;
import p227m.InterfaceC9531a;
import p230m2.InterfaceC9536b;

/* renamed from: l2.m */
/* loaded from: classes.dex */
public class C9361m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [In] */
    /* renamed from: l2.m$a */
    /* loaded from: classes.dex */
    public class a<In> implements InterfaceC1321s<In> {

        /* renamed from: a */
        Out f22677a = null;

        /* renamed from: b */
        final /* synthetic */ InterfaceC9536b f22678b;

        /* renamed from: c */
        final /* synthetic */ Object f22679c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC9531a f22680d;

        /* renamed from: e */
        final /* synthetic */ C1318p f22681e;

        /* renamed from: l2.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC13221a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Object f22682a;

            RunnableC13221a(Object obj) {
                this.f22682a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, Out] */
            @Override // java.lang.Runnable
            public void run() {
                C1318p c1318p;
                synchronized (a.this.f22679c) {
                    ?? apply = a.this.f22680d.apply(this.f22682a);
                    a aVar = a.this;
                    Out out = aVar.f22677a;
                    if (out == 0 && apply != 0) {
                        aVar.f22677a = apply;
                        c1318p = aVar.f22681e;
                    } else if (out != 0 && !out.equals(apply)) {
                        a aVar2 = a.this;
                        aVar2.f22677a = apply;
                        c1318p = aVar2.f22681e;
                    }
                    c1318p.postValue(apply);
                }
            }
        }

        a(InterfaceC9536b interfaceC9536b, Object obj, InterfaceC9531a interfaceC9531a, C1318p c1318p) {
            this.f22678b = interfaceC9536b;
            this.f22679c = obj;
            this.f22680d = interfaceC9531a;
            this.f22681e = c1318p;
        }

        @Override // androidx.lifecycle.InterfaceC1321s
        /* renamed from: a */
        public void mo2553a(In in) {
            this.f22678b.m28365c(new RunnableC13221a(in));
        }
    }

    /* renamed from: a */
    public static <In, Out> LiveData<Out> m27872a(LiveData<In> liveData, InterfaceC9531a<In, Out> interfaceC9531a, InterfaceC9536b interfaceC9536b) {
        Object obj = new Object();
        C1318p c1318p = new C1318p();
        c1318p.mo2573b(liveData, new a(interfaceC9536b, obj, interfaceC9531a, c1318p));
        return c1318p;
    }
}
