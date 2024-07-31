package p112g0;

import androidx.core.util.InterfaceC0977a;
import kotlin.jvm.internal.C9322n;

/* renamed from: g0.v */
/* loaded from: classes.dex */
public class C7429v<T> implements InterfaceC0977a<T> {

    /* renamed from: a */
    private InterfaceC0977a<T> f17258a;

    /* renamed from: a */
    public void m22409a(InterfaceC0977a<T> interfaceC0977a) {
        this.f17258a = interfaceC0977a;
    }

    @Override // androidx.core.util.InterfaceC0977a
    public void accept(T t10) {
        C9322n.m27779c(this.f17258a, "Listener is not set.");
        this.f17258a.accept(t10);
    }
}
