package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.C0960f;
import androidx.core.provider.C0961g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.provider.a */
/* loaded from: classes.dex */
public class C0955a {

    /* renamed from: a */
    private final C0961g.c f4479a;

    /* renamed from: b */
    private final Handler f4480b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0961g.c f4481a;

        /* renamed from: b */
        final /* synthetic */ Typeface f4482b;

        a(C0961g.c cVar, Typeface typeface) {
            this.f4481a = cVar;
            this.f4482b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4481a.mo4611b(this.f4482b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.provider.a$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0961g.c f4484a;

        /* renamed from: b */
        final /* synthetic */ int f4485b;

        b(C0961g.c cVar, int i10) {
            this.f4484a = cVar;
            this.f4485b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4484a.mo4610a(this.f4485b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0955a(C0961g.c cVar, Handler handler) {
        this.f4479a = cVar;
        this.f4480b = handler;
    }

    /* renamed from: a */
    private void m4739a(int i10) {
        this.f4480b.post(new b(this.f4479a, i10));
    }

    /* renamed from: c */
    private void m4740c(Typeface typeface) {
        this.f4480b.post(new a(this.f4479a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m4741b(C0960f.e eVar) {
        if (eVar.m4768a()) {
            m4740c(eVar.f4508a);
        } else {
            m4739a(eVar.f4509b);
        }
    }
}
