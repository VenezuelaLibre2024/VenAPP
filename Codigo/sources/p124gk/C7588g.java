package p124gk;

import java.io.Serializable;
import kotlin.jvm.internal.C9322n;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;

/* renamed from: gk.g */
/* loaded from: classes3.dex */
public final class C7588g implements InterfaceC7587f, Serializable {

    /* renamed from: a */
    public static final C7588g f17931a = new C7588g();
    private static final long serialVersionUID = 0;

    private C7588g() {
    }

    private final Object readResolve() {
        return f17931a;
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: Q */
    public InterfaceC7587f mo20645Q(InterfaceC7587f.c<?> key) {
        C9322n.m27781e(key, "key");
        return this;
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: U */
    public InterfaceC7587f mo20646U(InterfaceC7587f context) {
        C9322n.m27781e(context, "context");
        return context;
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: b */
    public <E extends InterfaceC7587f.b> E mo20647b(InterfaceC7587f.c<E> key) {
        C9322n.m27781e(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p124gk.InterfaceC7587f
    /* renamed from: z0 */
    public <R> R mo20648z0(R r10, InterfaceC10002p<? super R, ? super InterfaceC7587f.b, ? extends R> operation) {
        C9322n.m27781e(operation, "operation");
        return r10;
    }
}
