package i1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<b<?>, Object> f16870a = new LinkedHashMap();

    /* renamed from: i1.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0281a extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0281a f16871b = new C0281a();

        private C0281a() {
        }

        @Override // i1.a
        public <T> T a(b<T> key) {
            n.e(key, "key");
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
    }

    public abstract <T> T a(b<T> bVar);

    public final Map<b<?>, Object> b() {
        return this.f16870a;
    }
}
