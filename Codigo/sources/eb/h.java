package eb;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f14600a;

    private h(String str) {
        this.f14600a = (String) o.o(str);
    }

    public static h f(char c10) {
        return new h(String.valueOf(c10));
    }

    public static h g(String str) {
        return new h(str);
    }

    public <A extends Appendable> A a(A a10, Iterator<? extends Object> it) {
        o.o(a10);
        if (it.hasNext()) {
            while (true) {
                a10.append(h(it.next()));
                if (!it.hasNext()) {
                    break;
                }
                a10.append(this.f14600a);
            }
        }
        return a10;
    }

    public final StringBuilder b(StringBuilder sb2, Iterable<? extends Object> iterable) {
        return c(sb2, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb2, Iterator<? extends Object> it) {
        try {
            a(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String d(Iterable<? extends Object> iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator<? extends Object> it) {
        return c(new StringBuilder(), it).toString();
    }

    CharSequence h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
