package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k<L> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f9388a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f9389b;

    /* renamed from: c, reason: collision with root package name */
    private volatile a f9390c;

    /* loaded from: classes.dex */
    public static final class a<L> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f9391a;

        /* renamed from: b, reason: collision with root package name */
        private final String f9392b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(L l10, String str) {
            this.f9391a = l10;
            this.f9392b = str;
        }

        public String a() {
            return this.f9392b + "@" + System.identityHashCode(this.f9391a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9391a == aVar.f9391a && this.f9392b.equals(aVar.f9392b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f9391a) * 31) + this.f9392b.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public interface b<L> {
        void notifyListener(L l10);

        void onNotifyListenerFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Looper looper, L l10, String str) {
        this.f9388a = new ma.a(looper);
        this.f9389b = com.google.android.gms.common.internal.s.k(l10, "Listener must not be null");
        this.f9390c = new a(l10, com.google.android.gms.common.internal.s.f(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Executor executor, L l10, String str) {
        this.f9388a = (Executor) com.google.android.gms.common.internal.s.k(executor, "Executor must not be null");
        this.f9389b = com.google.android.gms.common.internal.s.k(l10, "Listener must not be null");
        this.f9390c = new a(l10, com.google.android.gms.common.internal.s.f(str));
    }

    public void a() {
        this.f9389b = null;
        this.f9390c = null;
    }

    public a<L> b() {
        return this.f9390c;
    }

    public void c(final b<? super L> bVar) {
        com.google.android.gms.common.internal.s.k(bVar, "Notifier must not be null");
        this.f9388a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.v0
            @Override // java.lang.Runnable
            public final void run() {
                k.this.d(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(b bVar) {
        Object obj = this.f9389b;
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
