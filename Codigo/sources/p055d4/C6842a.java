package p055d4;

import android.util.Log;
import androidx.core.util.C0983g;
import androidx.core.util.InterfaceC0981e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d4.a */
/* loaded from: classes.dex */
public final class C6842a {

    /* renamed from: a */
    private static final g<Object> f15122a = new a();

    /* renamed from: d4.a$a */
    /* loaded from: classes.dex */
    class a implements g<Object> {
        a() {
        }

        @Override // p055d4.C6842a.g
        /* renamed from: a */
        public void mo19769a(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: d4.a$b */
    /* loaded from: classes.dex */
    public class b<T> implements d<List<T>> {
        b() {
        }

        @Override // p055d4.C6842a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> mo19770a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: d4.a$c */
    /* loaded from: classes.dex */
    public class c<T> implements g<List<T>> {
        c() {
        }

        @Override // p055d4.C6842a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo19769a(List<T> list) {
            list.clear();
        }
    }

    /* renamed from: d4.a$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        /* renamed from: a */
        T mo19770a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d4.a$e */
    /* loaded from: classes.dex */
    public static final class e<T> implements InterfaceC0981e<T> {

        /* renamed from: a */
        private final d<T> f15123a;

        /* renamed from: b */
        private final g<T> f15124b;

        /* renamed from: c */
        private final InterfaceC0981e<T> f15125c;

        e(InterfaceC0981e<T> interfaceC0981e, d<T> dVar, g<T> gVar) {
            this.f15125c = interfaceC0981e;
            this.f15123a = dVar;
            this.f15124b = gVar;
        }

        @Override // androidx.core.util.InterfaceC0981e
        /* renamed from: a */
        public boolean mo4820a(T t10) {
            if (t10 instanceof f) {
                ((f) t10).mo19773h().mo19781b(true);
            }
            this.f15124b.mo19769a(t10);
            return this.f15125c.mo4820a(t10);
        }

        @Override // androidx.core.util.InterfaceC0981e
        /* renamed from: b */
        public T mo4821b() {
            T mo4821b = this.f15125c.mo4821b();
            if (mo4821b == null) {
                mo4821b = this.f15123a.mo19770a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + mo4821b.getClass());
                }
            }
            if (mo4821b instanceof f) {
                mo4821b.mo19773h().mo19781b(false);
            }
            return (T) mo4821b;
        }
    }

    /* renamed from: d4.a$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: h */
        AbstractC6844c mo19773h();
    }

    /* renamed from: d4.a$g */
    /* loaded from: classes.dex */
    public interface g<T> {
        /* renamed from: a */
        void mo19769a(T t10);
    }

    /* renamed from: a */
    private static <T extends f> InterfaceC0981e<T> m19763a(InterfaceC0981e<T> interfaceC0981e, d<T> dVar) {
        return m19764b(interfaceC0981e, dVar, m19765c());
    }

    /* renamed from: b */
    private static <T> InterfaceC0981e<T> m19764b(InterfaceC0981e<T> interfaceC0981e, d<T> dVar, g<T> gVar) {
        return new e(interfaceC0981e, dVar, gVar);
    }

    /* renamed from: c */
    private static <T> g<T> m19765c() {
        return (g<T>) f15122a;
    }

    /* renamed from: d */
    public static <T extends f> InterfaceC0981e<T> m19766d(int i10, d<T> dVar) {
        return m19763a(new C0983g(i10), dVar);
    }

    /* renamed from: e */
    public static <T> InterfaceC0981e<List<T>> m19767e() {
        return m19768f(20);
    }

    /* renamed from: f */
    public static <T> InterfaceC0981e<List<T>> m19768f(int i10) {
        return m19764b(new C0983g(i10), new b(), new c());
    }
}
