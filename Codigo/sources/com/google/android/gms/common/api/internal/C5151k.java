package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.C5276s;
import java.util.concurrent.Executor;
import ma.ExecutorC9559a;

/* renamed from: com.google.android.gms.common.api.internal.k */
/* loaded from: classes.dex */
public final class C5151k<L> {

    /* renamed from: a */
    private final Executor f10502a;

    /* renamed from: b */
    private volatile Object f10503b;

    /* renamed from: c */
    private volatile a f10504c;

    /* renamed from: com.google.android.gms.common.api.internal.k$a */
    /* loaded from: classes.dex */
    public static final class a<L> {

        /* renamed from: a */
        private final Object f10505a;

        /* renamed from: b */
        private final String f10506b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(L l10, String str) {
            this.f10505a = l10;
            this.f10506b = str;
        }

        /* renamed from: a */
        public String m13085a() {
            return this.f10506b + "@" + System.identityHashCode(this.f10505a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10505a == aVar.f10505a && this.f10506b.equals(aVar.f10506b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f10505a) * 31) + this.f10506b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.k$b */
    /* loaded from: classes.dex */
    public interface b<L> {
        void notifyListener(L l10);

        void onNotifyListenerFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5151k(Looper looper, L l10, String str) {
        this.f10502a = new ExecutorC9559a(looper);
        this.f10503b = C5276s.m13325k(l10, "Listener must not be null");
        this.f10504c = new a(l10, C5276s.m13320f(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5151k(Executor executor, L l10, String str) {
        this.f10502a = (Executor) C5276s.m13325k(executor, "Executor must not be null");
        this.f10503b = C5276s.m13325k(l10, "Listener must not be null");
        this.f10504c = new a(l10, C5276s.m13320f(str));
    }

    /* renamed from: a */
    public void m13081a() {
        this.f10503b = null;
        this.f10504c = null;
    }

    /* renamed from: b */
    public a<L> m13082b() {
        return this.f10504c;
    }

    /* renamed from: c */
    public void m13083c(final b<? super L> bVar) {
        C5276s.m13325k(bVar, "Notifier must not be null");
        this.f10502a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.v0
            @Override // java.lang.Runnable
            public final void run() {
                C5151k.this.m13084d(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final void m13084d(b bVar) {
        Object obj = this.f10503b;
        if (obj == null) {
            bVar.onNotifyListenerFailed();
            return;
        }
        try {
            bVar.notifyListener(obj);
        } catch (RuntimeException e10) {
            bVar.onNotifyListenerFailed();
            throw e10;
        }
    }
}
