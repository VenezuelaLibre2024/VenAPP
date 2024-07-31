package androidx.core.util;

/* renamed from: androidx.core.util.g */
/* loaded from: classes.dex */
public class C0983g<T> extends C0982f<T> {

    /* renamed from: c */
    private final Object f4543c;

    public C0983g(int i10) {
        super(i10);
        this.f4543c = new Object();
    }

    @Override // androidx.core.util.C0982f, androidx.core.util.InterfaceC0981e
    /* renamed from: a */
    public boolean mo4820a(T t10) {
        boolean mo4820a;
        synchronized (this.f4543c) {
            mo4820a = super.mo4820a(t10);
        }
        return mo4820a;
    }

    @Override // androidx.core.util.C0982f, androidx.core.util.InterfaceC0981e
    /* renamed from: b */
    public T mo4821b() {
        T t10;
        synchronized (this.f4543c) {
            t10 = (T) super.mo4821b();
        }
        return t10;
    }
}
