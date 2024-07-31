package ck;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class p<T> implements h<T>, Serializable {

    /* renamed from: a */
    private ok.a<? extends T> f7129a;

    /* renamed from: b */
    private volatile Object f7130b;

    /* renamed from: c */
    private final Object f7131c;

    public p(ok.a<? extends T> initializer, Object obj) {
        kotlin.jvm.internal.n.e(initializer, "initializer");
        this.f7129a = initializer;
        this.f7130b = t.f7136a;
        this.f7131c = obj == null ? this : obj;
    }

    public /* synthetic */ p(ok.a aVar, Object obj, int i10, kotlin.jvm.internal.g gVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }

    private final Object writeReplace() {
        return new d(getValue());
    }

    @Override // ck.h
    public T getValue() {
        T t10;
        T t11 = (T) this.f7130b;
        t tVar = t.f7136a;
        if (t11 != tVar) {
            return t11;
        }
        synchronized (this.f7131c) {
            t10 = (T) this.f7130b;
            if (t10 == tVar) {
                ok.a<? extends T> aVar = this.f7129a;
                kotlin.jvm.internal.n.b(aVar);
                t10 = aVar.invoke();
                this.f7130b = t10;
                this.f7129a = null;
            }
        }
        return t10;
    }

    @Override // ck.h
    public boolean isInitialized() {
        return this.f7130b != t.f7136a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
