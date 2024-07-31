package d4;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final g<Object> f13768a = new C0204a();

    /* renamed from: d4.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0204a implements g<Object> {
        C0204a() {
        }

        @Override // d4.a.g
        public void a(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public class b<T> implements d<List<T>> {
        b() {
        }

        @Override // d4.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public class c<T> implements g<List<T>> {
        c() {
        }

        @Override // d4.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List<T> list) {
            list.clear();
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e<T> implements androidx.core.util.e<T> {

        /* renamed from: a, reason: collision with root package name */
        private final d<T> f13769a;

        /* renamed from: b, reason: collision with root package name */
        private final g<T> f13770b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.core.util.e<T> f13771c;

        e(androidx.core.util.e<T> eVar, d<T> dVar, g<T> gVar) {
            this.f13771c = eVar;
            this.f13769a = dVar;
            this.f13770b = gVar;
        }

        @Override // androidx.core.util.e
        public boolean a(T t10) {
            if (t10 instanceof f) {
                ((f) t10).h().b(true);
            }
            this.f13770b.a(t10);
            return this.f13771c.a(t10);
        }

        @Override // androidx.core.util.e
        public T b() {
            T b10 = this.f13771c.b();
            if (b10 == null) {
                b10 = this.f13769a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b10.getClass());
                }
            }
            if (b10 instanceof f) {
                b10.h().b(false);
            }
            return (T) b10;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        d4.c h();
    }

    /* loaded from: classes.dex */
    public interface g<T> {
        void a(T t10);
    }

    private static <T extends f> androidx.core.util.e<T> a(androidx.core.util.e<T> eVar, d<T> dVar) {
        return b(eVar, dVar, c());
    }

    private static <T> androidx.core.util.e<T> b(androidx.core.util.e<T> eVar, d<T> dVar, g<T> gVar) {
        return new e(eVar, dVar, gVar);
    }

    private static <T> g<T> c() {
        return (g<T>) f13768a;
    }

    public static <T extends f> androidx.core.util.e<T> d(int i10, d<T> dVar) {
        return a(new androidx.core.util.g(i10), dVar);
    }

    public static <T> androidx.core.util.e<List<T>> e() {
        return f(20);
    }

    public static <T> androidx.core.util.e<List<T>> f(int i10) {
        return b(new androidx.core.util.g(i10), new b(), new c());
    }
}
