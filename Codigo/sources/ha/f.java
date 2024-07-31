package ha;

import com.google.android.gms.common.internal.s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final List f16629a;

    /* renamed from: b, reason: collision with root package name */
    private final ha.a f16630b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f16631c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16632d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f16633a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private boolean f16634b = true;

        /* renamed from: c, reason: collision with root package name */
        private ha.a f16635c;

        /* renamed from: d, reason: collision with root package name */
        private Executor f16636d;

        public a a(com.google.android.gms.common.api.g gVar) {
            this.f16633a.add(gVar);
            return this;
        }

        public f b() {
            return new f(this.f16633a, this.f16635c, this.f16636d, this.f16634b, null);
        }
    }

    /* synthetic */ f(List list, ha.a aVar, Executor executor, boolean z10, k kVar) {
        s.k(list, "APIs must not be null.");
        s.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            s.k(aVar, "Listener must not be null when listener executor is set.");
        }
        this.f16629a = list;
        this.f16630b = aVar;
        this.f16631c = executor;
        this.f16632d = z10;
    }

    public static a d() {
        return new a();
    }

    public List<com.google.android.gms.common.api.g> a() {
        return this.f16629a;
    }

    public ha.a b() {
        return this.f16630b;
    }

    public Executor c() {
        return this.f16631c;
    }

    public final boolean e() {
        return this.f16632d;
    }
}
