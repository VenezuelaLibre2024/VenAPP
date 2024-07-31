package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p208l.C9336b;

/* renamed from: androidx.lifecycle.p */
/* loaded from: classes.dex */
public class C1318p<T> extends C1320r<T> {

    /* renamed from: a */
    private C9336b<LiveData<?>, a<?>> f5719a = new C9336b<>();

    /* renamed from: androidx.lifecycle.p$a */
    /* loaded from: classes.dex */
    private static class a<V> implements InterfaceC1321s<V> {

        /* renamed from: a */
        final LiveData<V> f5720a;

        /* renamed from: b */
        final InterfaceC1321s<? super V> f5721b;

        /* renamed from: c */
        int f5722c = -1;

        a(LiveData<V> liveData, InterfaceC1321s<? super V> interfaceC1321s) {
            this.f5720a = liveData;
            this.f5721b = interfaceC1321s;
        }

        @Override // androidx.lifecycle.InterfaceC1321s
        /* renamed from: a */
        public void mo2553a(V v10) {
            if (this.f5722c != this.f5720a.getVersion()) {
                this.f5722c = this.f5720a.getVersion();
                this.f5721b.mo2553a(v10);
            }
        }

        /* renamed from: b */
        void m7376b() {
            this.f5720a.observeForever(this);
        }

        /* renamed from: c */
        void m7377c() {
            this.f5720a.removeObserver(this);
        }
    }

    /* renamed from: b */
    public <S> void mo2573b(LiveData<S> liveData, InterfaceC1321s<? super S> interfaceC1321s) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(liveData, interfaceC1321s);
        a<?> mo27811l = this.f5719a.mo27811l(liveData, aVar);
        if (mo27811l != null && mo27811l.f5721b != interfaceC1321s) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (mo27811l == null && hasActiveObservers()) {
            aVar.m7376b();
        }
    }

    /* renamed from: c */
    public <S> void m7375c(LiveData<S> liveData) {
        a<?> mo27812m = this.f5719a.mo27812m(liveData);
        if (mo27812m != null) {
            mo27812m.m7377c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f5719a.iterator();
        while (it.hasNext()) {
            it.next().getValue().m7376b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f5719a.iterator();
        while (it.hasNext()) {
            it.next().getValue().m7377c();
        }
    }
}
