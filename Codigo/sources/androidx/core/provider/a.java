package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private final g.c f3807a;

    /* renamed from: b */
    private final Handler f3808b;

    /* renamed from: androidx.core.provider.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0048a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ g.c f3809a;

        /* renamed from: b */
        final /* synthetic */ Typeface f3810b;

        RunnableC0048a(g.c cVar, Typeface typeface) {
            this.f3809a = cVar;
            this.f3810b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3809a.b(this.f3810b);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ g.c f3812a;

        /* renamed from: b */
        final /* synthetic */ int f3813b;

        b(g.c cVar, int i10) {
            this.f3812a = cVar;
            this.f3813b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3812a.a(this.f3813b);
        }
    }

    public a(g.c cVar, Handler handler) {
        this.f3807a = cVar;
        this.f3808b = handler;
    }

    private void a(int i10) {
        this.f3808b.post(new b(this.f3807a, i10));
    }

    private void c(Typeface typeface) {
        this.f3808b.post(new RunnableC0048a(this.f3807a, typeface));
    }

    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f3836a);
        } else {
            a(eVar.f3837b);
        }
    }
}
