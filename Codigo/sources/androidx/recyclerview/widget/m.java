package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    final androidx.collection.h<RecyclerView.b0, a> f5435a = new androidx.collection.h<>();

    /* renamed from: b, reason: collision with root package name */
    final androidx.collection.e<RecyclerView.b0> f5436b = new androidx.collection.e<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        static androidx.core.util.e<a> f5437d = new androidx.core.util.f(20);

        /* renamed from: a, reason: collision with root package name */
        int f5438a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView.k.c f5439b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.k.c f5440c;

        private a() {
        }

        static void a() {
            do {
            } while (f5437d.b() != null);
        }

        static a b() {
            a b10 = f5437d.b();
            return b10 == null ? new a() : b10;
        }

        static void c(a aVar) {
            aVar.f5438a = 0;
            aVar.f5439b = null;
            aVar.f5440c = null;
            f5437d.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j10, RecyclerView.b0 b0Var) {
        this.f5436b.i(j10, b0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RecyclerView.b0 b0Var, RecyclerView.k.c cVar) {
        a aVar = this.f5435a.get(b0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f5435a.put(b0Var, aVar);
        }
        aVar.f5439b = cVar;
        aVar.f5438a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RecyclerView.b0 b0Var) {
        int l10 = this.f5436b.l() - 1;
        while (true) {
            if (l10 < 0) {
                break;
            }
            if (b0Var == this.f5436b.m(l10)) {
                this.f5436b.k(l10);
                break;
            }
            l10--;
        }
        a remove = this.f5435a.remove(b0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
