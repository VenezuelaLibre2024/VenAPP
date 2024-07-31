package p234m6;

/* renamed from: m6.b */
/* loaded from: classes.dex */
public final class C9548b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m28435a(int i10, TInput tinput, InterfaceC9547a<TInput, TResult, TException> interfaceC9547a, InterfaceC9549c<TInput, TResult> interfaceC9549c) {
        TResult apply;
        if (i10 < 1) {
            return interfaceC9547a.apply(tinput);
        }
        do {
            apply = interfaceC9547a.apply(tinput);
            tinput = interfaceC9549c.mo11788a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return apply;
    }
}
