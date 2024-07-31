package p297pj;

import dj.AbstractC6981f;
import im.InterfaceC8014a;
import im.InterfaceC8015b;
import java.util.concurrent.Callable;
import p000.C0000a;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p224lj.C9513b;
import p426wj.C12222e;
import p426wj.EnumC12221d;
import p471yj.C12727a;

/* renamed from: pj.x */
/* loaded from: classes3.dex */
public final class C10198x {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pj.x$a */
    /* loaded from: classes3.dex */
    public static final class a<T, R> extends AbstractC6981f<R> {

        /* renamed from: b */
        final T f25207b;

        /* renamed from: c */
        final InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends R>> f25208c;

        a(T t10, InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends R>> interfaceC9077e) {
            this.f25207b = t10;
            this.f25208c = interfaceC9077e;
        }

        @Override // dj.AbstractC6981f
        /* renamed from: I */
        public void mo20229I(InterfaceC8015b<? super R> interfaceC8015b) {
            try {
                InterfaceC8014a interfaceC8014a = (InterfaceC8014a) C9513b.m28324d(this.f25208c.apply(this.f25207b), "The mapper returned a null Publisher");
                if (!(interfaceC8014a instanceof Callable)) {
                    interfaceC8014a.mo20231a(interfaceC8015b);
                    return;
                }
                try {
                    Object call = ((Callable) interfaceC8014a).call();
                    if (call == null) {
                        EnumC12221d.m39346b(interfaceC8015b);
                    } else {
                        interfaceC8015b.mo20249d(new C12222e(interfaceC8015b, call));
                    }
                } catch (Throwable th2) {
                    C7744b.m23648b(th2);
                    EnumC12221d.m39347h(th2, interfaceC8015b);
                }
            } catch (Throwable th3) {
                EnumC12221d.m39347h(th3, interfaceC8015b);
            }
        }
    }

    /* renamed from: a */
    public static <T, U> AbstractC6981f<U> m30516a(T t10, InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends U>> interfaceC9077e) {
        return C12727a.m41989k(new a(t10, interfaceC9077e));
    }

    /* renamed from: b */
    public static <T, R> boolean m30517b(InterfaceC8014a<T> interfaceC8014a, InterfaceC8015b<? super R> interfaceC8015b, InterfaceC9077e<? super T, ? extends InterfaceC8014a<? extends R>> interfaceC9077e) {
        if (!(interfaceC8014a instanceof Callable)) {
            return false;
        }
        try {
            C0000a c0000a = (Object) ((Callable) interfaceC8014a).call();
            if (c0000a == null) {
                EnumC12221d.m39346b(interfaceC8015b);
                return true;
            }
            InterfaceC8014a interfaceC8014a2 = (InterfaceC8014a) C9513b.m28324d(interfaceC9077e.apply(c0000a), "The mapper returned a null Publisher");
            if (interfaceC8014a2 instanceof Callable) {
                Object call = ((Callable) interfaceC8014a2).call();
                if (call == null) {
                    EnumC12221d.m39346b(interfaceC8015b);
                    return true;
                }
                interfaceC8015b.mo20249d(new C12222e(interfaceC8015b, call));
            } else {
                interfaceC8014a2.mo20231a(interfaceC8015b);
            }
            return true;
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            EnumC12221d.m39347h(th2, interfaceC8015b);
            return true;
        }
    }
}
