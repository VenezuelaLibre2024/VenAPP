package androidx.recyclerview.widget;

import androidx.collection.C0735e;
import androidx.collection.C0738h;
import androidx.core.util.C0982f;
import androidx.core.util.InterfaceC0981e;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
public class C1413m {

    /* renamed from: a */
    final C0738h<RecyclerView.AbstractC1370b0, a> f6260a = new C0738h<>();

    /* renamed from: b */
    final C0735e<RecyclerView.AbstractC1370b0> f6261b = new C0735e<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.m$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d */
        static InterfaceC0981e<a> f6262d = new C0982f(20);

        /* renamed from: a */
        int f6263a;

        /* renamed from: b */
        RecyclerView.AbstractC1379k.c f6264b;

        /* renamed from: c */
        RecyclerView.AbstractC1379k.c f6265c;

        private a() {
        }

        /* renamed from: a */
        static void m8101a() {
            do {
            } while (f6262d.mo4821b() != null);
        }

        /* renamed from: b */
        static a m8102b() {
            a mo4821b = f6262d.mo4821b();
            return mo4821b == null ? new a() : mo4821b;
        }

        /* renamed from: c */
        static void m8103c(a aVar) {
            aVar.f6263a = 0;
            aVar.f6264b = null;
            aVar.f6265c = null;
            f6262d.mo4820a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.m$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m8097a(long j10, RecyclerView.AbstractC1370b0 abstractC1370b0) {
        this.f6261b.m3687i(j10, abstractC1370b0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m8098b(RecyclerView.AbstractC1370b0 abstractC1370b0, RecyclerView.AbstractC1379k.c cVar) {
        a aVar = this.f6260a.get(abstractC1370b0);
        if (aVar == null) {
            aVar = a.m8102b();
            this.f6260a.put(abstractC1370b0, aVar);
        }
        aVar.f6264b = cVar;
        aVar.f6263a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m8099c() {
        a.m8101a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m8100d(RecyclerView.AbstractC1370b0 abstractC1370b0) {
        int m3690l = this.f6261b.m3690l() - 1;
        while (true) {
            if (m3690l < 0) {
                break;
            }
            if (abstractC1370b0 == this.f6261b.m3691m(m3690l)) {
                this.f6261b.m3689k(m3690l);
                break;
            }
            m3690l--;
        }
        a remove = this.f6260a.remove(abstractC1370b0);
        if (remove != null) {
            a.m8103c(remove);
        }
    }
}
