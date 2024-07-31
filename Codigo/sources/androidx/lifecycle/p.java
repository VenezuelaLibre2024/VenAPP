package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class p<T> extends r<T> {

    /* renamed from: a, reason: collision with root package name */
    private l.b<LiveData<?>, a<?>> f4965a = new l.b<>();

    /* loaded from: classes.dex */
    private static class a<V> implements s<V> {

        /* renamed from: a, reason: collision with root package name */
        final LiveData<V> f4966a;

        /* renamed from: b, reason: collision with root package name */
        final s<? super V> f4967b;

        /* renamed from: c, reason: collision with root package name */
        int f4968c = -1;

        a(LiveData<V> liveData, s<? super V> sVar) {
            this.f4966a = liveData;
            this.f4967b = sVar;
        }

        @Override // androidx.lifecycle.s
        public void a(V v10) {
            if (this.f4968c != this.f4966a.getVersion()) {
                this.f4968c = this.f4966a.getVersion();
                this.f4967b.a(v10);
            }
        }

        void b() {
            this.f4966a.observeForever(this);
        }

        void c() {
            this.f4966a.removeObserver(this);
        }
    }

    public <S> void b(LiveData<S> liveData, s<? super S> sVar) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(liveData, sVar);
        a<?> l10 = this.f4965a.l(liveData, aVar);
        if (l10 != null && l10.f4967b != sVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (l10 == null && hasActiveObservers()) {
            aVar.b();
        }
    }

    public <S> void c(LiveData<S> liveData) {
        a<?> m10 = this.f4965a.m(liveData);
        if (m10 != null) {
            m10.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f4965a.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f4965a.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }
}
