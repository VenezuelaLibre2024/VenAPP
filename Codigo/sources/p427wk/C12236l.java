package p427wk;

import dk.C7029q;
import dk.C7031r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9998l;
import p450xk.C12516h;
import pk.InterfaceC10201a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wk.l */
/* loaded from: classes3.dex */
public class C12236l extends C12235k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: wk.l$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Iterable<T>, InterfaceC10201a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC12228d f32705a;

        public a(InterfaceC12228d interfaceC12228d) {
            this.f32705a = interfaceC12228d;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f32705a.iterator();
        }
    }

    /* renamed from: e */
    public static <T> Iterable<T> m39381e(InterfaceC12228d<? extends T> interfaceC12228d) {
        C9322n.m27781e(interfaceC12228d, "<this>");
        return new a(interfaceC12228d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static <T> InterfaceC12228d<T> m39382f(InterfaceC12228d<? extends T> interfaceC12228d, int i10) {
        C9322n.m27781e(interfaceC12228d, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? interfaceC12228d : interfaceC12228d instanceof InterfaceC12227c ? ((InterfaceC12227c) interfaceC12228d).mo39363a(i10) : new C12226b(interfaceC12228d, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: g */
    public static final <T, A extends Appendable> A m39383g(InterfaceC12228d<? extends T> interfaceC12228d, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super T, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(interfaceC12228d, "<this>");
        C9322n.m27781e(buffer, "buffer");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : interfaceC12228d) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            C12516h.m41013a(buffer, t10, interfaceC9998l);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: h */
    public static final <T> String m39384h(InterfaceC12228d<? extends T> interfaceC12228d, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC9998l<? super T, ? extends CharSequence> interfaceC9998l) {
        C9322n.m27781e(interfaceC12228d, "<this>");
        C9322n.m27781e(separator, "separator");
        C9322n.m27781e(prefix, "prefix");
        C9322n.m27781e(postfix, "postfix");
        C9322n.m27781e(truncated, "truncated");
        String sb2 = ((StringBuilder) m39383g(interfaceC12228d, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC9998l)).toString();
        C9322n.m27780d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: i */
    public static /* synthetic */ String m39385i(InterfaceC12228d interfaceC12228d, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC9998l interfaceC9998l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC9998l = null;
        }
        return m39384h(interfaceC12228d, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC9998l);
    }

    /* renamed from: j */
    public static <T, R> InterfaceC12228d<R> m39386j(InterfaceC12228d<? extends T> interfaceC12228d, InterfaceC9998l<? super T, ? extends R> transform) {
        C9322n.m27781e(interfaceC12228d, "<this>");
        C9322n.m27781e(transform, "transform");
        return new C12237m(interfaceC12228d, transform);
    }

    /* renamed from: k */
    public static <T> List<T> m39387k(InterfaceC12228d<? extends T> interfaceC12228d) {
        List<T> m20572e;
        List<T> m20582j;
        C9322n.m27781e(interfaceC12228d, "<this>");
        Iterator<? extends T> it = interfaceC12228d.iterator();
        if (!it.hasNext()) {
            m20582j = C7031r.m20582j();
            return m20582j;
        }
        T next = it.next();
        if (!it.hasNext()) {
            m20572e = C7029q.m20572e(next);
            return m20572e;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }
}
