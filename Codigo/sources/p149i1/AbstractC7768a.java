package p149i1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C9322n;

/* renamed from: i1.a */
/* loaded from: classes.dex */
public abstract class AbstractC7768a {

    /* renamed from: a */
    private final Map<b<?>, Object> f18522a = new LinkedHashMap();

    /* renamed from: i1.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC7768a {

        /* renamed from: b */
        public static final a f18523b = new a();

        private a() {
        }

        @Override // p149i1.AbstractC7768a
        /* renamed from: a */
        public <T> T mo23719a(b<T> key) {
            C9322n.m27781e(key, "key");
            return null;
        }
    }

    /* renamed from: i1.a$b */
    /* loaded from: classes.dex */
    public interface b<T> {
    }

    /* renamed from: a */
    public abstract <T> T mo23719a(b<T> bVar);

    /* renamed from: b */
    public final Map<b<?>, Object> m23720b() {
        return this.f18522a;
    }
}
