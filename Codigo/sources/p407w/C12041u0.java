package p407w;

import android.graphics.Rect;
import android.util.Size;
import p407w.C12001e;

/* renamed from: w.u0 */
/* loaded from: classes.dex */
public class C12041u0 {

    /* renamed from: a */
    private final a f32009a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w.u0$a */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w.u0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC13261a {
            /* renamed from: a */
            abstract a mo38578a();

            /* renamed from: b */
            abstract AbstractC13261a mo38579b(Rect rect);

            /* renamed from: c */
            abstract AbstractC13261a mo38580c(int i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Rect mo38575a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract Size mo38576b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo38577c();
    }

    public C12041u0(Size size, Rect rect, int i10) {
        this.f32009a = new C12001e.b().m38581d(size).mo38579b(rect).mo38580c(i10).mo38578a();
    }

    /* renamed from: a */
    public Size m38664a() {
        return this.f32009a.mo38576b();
    }

    public boolean equals(Object obj) {
        return this.f32009a.equals(obj);
    }

    public int hashCode() {
        return this.f32009a.hashCode();
    }

    public String toString() {
        return this.f32009a.toString();
    }
}
