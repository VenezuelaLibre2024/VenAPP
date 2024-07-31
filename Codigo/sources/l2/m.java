package l2;

import androidx.lifecycle.LiveData;

/* loaded from: classes.dex */
public class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [In] */
    /* loaded from: classes.dex */
    public class a<In> implements androidx.lifecycle.s<In> {

        /* renamed from: a, reason: collision with root package name */
        Out f20855a = null;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m2.b f20856b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f20857c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m.a f20858d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.p f20859e;

        /* renamed from: l2.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0326a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f20860a;

            RunnableC0326a(Object obj) {
                this.f20860a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, Out] */
            @Override // java.lang.Runnable
            public void run() {
                androidx.lifecycle.p pVar;
                synchronized (a.this.f20857c) {
                    ?? apply = a.this.f20858d.apply(this.f20860a);
                    a aVar = a.this;
                    Out out = aVar.f20855a;
                    if (out == 0 && apply != 0) {
                        aVar.f20855a = apply;
                        pVar = aVar.f20859e;
                    } else if (out != 0 && !out.equals(apply)) {
                        a aVar2 = a.this;
                        aVar2.f20855a = apply;
                        pVar = aVar2.f20859e;
                    }
                    pVar.postValue(apply);
                }
            }
        }

        a(m2.b bVar, Object obj, m.a aVar, androidx.lifecycle.p pVar) {
            this.f20856b = bVar;
            this.f20857c = obj;
            this.f20858d = aVar;
            this.f20859e = pVar;
        }

        @Override // androidx.lifecycle.s
        public void a(In in) {
            this.f20856b.c(new RunnableC0326a(in));
        }
    }

    public static <In, Out> LiveData<Out> a(LiveData<In> liveData, m.a<In, Out> aVar, m2.b bVar) {
        Object obj = new Object();
        androidx.lifecycle.p pVar = new androidx.lifecycle.p();
        pVar.b(liveData, new a(bVar, obj, aVar, pVar));
        return pVar;
    }
}
