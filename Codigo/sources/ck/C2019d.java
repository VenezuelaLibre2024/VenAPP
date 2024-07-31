package ck;

import java.io.Serializable;

/* renamed from: ck.d */
/* loaded from: classes3.dex */
public final class C2019d<T> implements InterfaceC2023h<T>, Serializable {

    /* renamed from: a */
    private final T f8068a;

    public C2019d(T t10) {
        this.f8068a = t10;
    }

    @Override // ck.InterfaceC2023h
    public T getValue() {
        return this.f8068a;
    }

    @Override // ck.InterfaceC2023h
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
