package w;

import android.graphics.Rect;
import android.util.Size;
import w.e;

/* loaded from: classes.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    private final a f29554a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w.u0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0473a {
            abstract a a();

            abstract AbstractC0473a b(Rect rect);

            abstract AbstractC0473a c(int i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Rect a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Size b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int c();
    }

    public u0(Size size, Rect rect, int i10) {
        this.f29554a = new e.b().d(size).b(rect).c(i10).a();
    }

    public Size a() {
        return this.f29554a.b();
    }

    public boolean equals(Object obj) {
        return this.f29554a.equals(obj);
    }

    public int hashCode() {
        return this.f29554a.hashCode();
    }

    public String toString() {
        return this.f29554a.toString();
    }
}
