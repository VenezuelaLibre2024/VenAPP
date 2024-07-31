package p450xk;

import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xk.h */
/* loaded from: classes3.dex */
public class C12516h {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* renamed from: a */
    public static <T> void m41013a(Appendable appendable, T t10, InterfaceC9998l<? super T, ? extends CharSequence> interfaceC9998l) {
        CharSequence valueOf;
        C9322n.m27781e(appendable, "<this>");
        if (interfaceC9998l != null) {
            t10 = (T) interfaceC9998l.invoke(t10);
        } else {
            if (!(t10 == 0 ? true : t10 instanceof CharSequence)) {
                if (t10 instanceof Character) {
                    appendable.append(((Character) t10).charValue());
                    return;
                } else {
                    valueOf = String.valueOf((Object) t10);
                    appendable.append(valueOf);
                }
            }
        }
        valueOf = (CharSequence) t10;
        appendable.append(valueOf);
    }
}
