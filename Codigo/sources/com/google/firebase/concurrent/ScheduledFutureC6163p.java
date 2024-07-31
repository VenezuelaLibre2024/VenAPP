package com.google.firebase.concurrent;

import androidx.concurrent.futures.AbstractC0740a;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.p */
/* loaded from: classes.dex */
class ScheduledFutureC6163p<V> extends AbstractC0740a<V> implements ScheduledFuture<V> {

    /* renamed from: s */
    private final ScheduledFuture<?> f13073s;

    /* renamed from: com.google.firebase.concurrent.p$a */
    /* loaded from: classes.dex */
    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.ScheduledFutureC6163p.b
        /* renamed from: a */
        public void mo16690a(Throwable th2) {
            ScheduledFutureC6163p.this.mo3742x(th2);
        }

        @Override // com.google.firebase.concurrent.ScheduledFutureC6163p.b
        public void set(V v10) {
            ScheduledFutureC6163p.this.mo3741w(v10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.concurrent.p$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        /* renamed from: a */
        void mo16690a(Throwable th2);

        void set(T t10);
    }

    /* renamed from: com.google.firebase.concurrent.p$c */
    /* loaded from: classes.dex */
    interface c<T> {
        /* renamed from: a */
        ScheduledFuture<?> mo16662a(b<T> bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScheduledFutureC6163p(c<V> cVar) {
        this.f13073s = cVar.mo16662a(new a());
    }

    @Override // java.lang.Comparable
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f13073s.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f13073s.getDelay(timeUnit);
    }

    @Override // androidx.concurrent.futures.AbstractC0740a
    /* renamed from: h */
    protected void mo3738h() {
        this.f13073s.cancel(m3743z());
    }
}
