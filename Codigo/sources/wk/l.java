package wk;

import dk.q;
import dk.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public class l extends k {

    /* loaded from: classes3.dex */
    public static final class a<T> implements Iterable<T>, pk.a {

        /* renamed from: a */
        final /* synthetic */ d f30193a;

        public a(d dVar) {
            this.f30193a = dVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f30193a.iterator();
        }
    }

    public static <T> Iterable<T> e(d<? extends T> dVar) {
        n.e(dVar, "<this>");
        return new a(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> d<T> f(d<? extends T> dVar, int i10) {
        n.e(dVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? dVar : dVar instanceof c ? ((c) dVar).a(i10) : new b(dVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T, A extends Appendable> A g(d<? extends T> dVar, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super T, ? extends CharSequence> lVar) {
        n.e(dVar, "<this>");
        n.e(buffer, "buffer");
        n.e(separator, "separator");
        n.e(prefix, "prefix");
        n.e(postfix, "postfix");
        n.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : dVar) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            xk.h.a(buffer, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String h(d<? extends T> dVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, ok.l<? super T, ? extends CharSequence> lVar) {
        n.e(dVar, "<this>");
        n.e(separator, "separator");
        n.e(prefix, "prefix");
        n.e(postfix, "postfix");
        n.e(truncated, "truncated");
        String sb2 = ((StringBuilder) g(dVar, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
        n.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String i(d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ok.l lVar, int i11, Object obj) {
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
            lVar = null;
        }
        return h(dVar, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static <T, R> d<R> j(d<? extends T> dVar, ok.l<? super T, ? extends R> transform) {
        n.e(dVar, "<this>");
        n.e(transform, "transform");
        return new m(dVar, transform);
    }

    public static <T> List<T> k(d<? extends T> dVar) {
        List<T> e10;
        List<T> j10;
        n.e(dVar, "<this>");
        Iterator<? extends T> it = dVar.iterator();
        if (!it.hasNext()) {
            j10 = r.j();
            return j10;
        }
        T next = it.next();
        if (!it.hasNext()) {
            e10 = q.e(next);
            return e10;
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
