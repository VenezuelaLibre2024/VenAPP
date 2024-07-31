package p136ha;

import com.google.android.gms.common.api.InterfaceC5107g;
import com.google.android.gms.common.internal.C5276s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ha.f */
/* loaded from: classes.dex */
public final class C7678f {

    /* renamed from: a */
    private final List f18279a;

    /* renamed from: b */
    private final InterfaceC7673a f18280b;

    /* renamed from: c */
    private final Executor f18281c;

    /* renamed from: d */
    private final boolean f18282d;

    /* renamed from: ha.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final List f18283a = new ArrayList();

        /* renamed from: b */
        private boolean f18284b = true;

        /* renamed from: c */
        private InterfaceC7673a f18285c;

        /* renamed from: d */
        private Executor f18286d;

        /* renamed from: a */
        public a m23397a(InterfaceC5107g interfaceC5107g) {
            this.f18283a.add(interfaceC5107g);
            return this;
        }

        /* renamed from: b */
        public C7678f m23398b() {
            return new C7678f(this.f18283a, this.f18285c, this.f18286d, this.f18284b, null);
        }
    }

    /* synthetic */ C7678f(List list, InterfaceC7673a interfaceC7673a, Executor executor, boolean z10, C7683k c7683k) {
        C5276s.m13325k(list, "APIs must not be null.");
        C5276s.m13316b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            C5276s.m13325k(interfaceC7673a, "Listener must not be null when listener executor is set.");
        }
        this.f18279a = list;
        this.f18280b = interfaceC7673a;
        this.f18281c = executor;
        this.f18282d = z10;
    }

    /* renamed from: d */
    public static a m23392d() {
        return new a();
    }

    /* renamed from: a */
    public List<InterfaceC5107g> m23393a() {
        return this.f18279a;
    }

    /* renamed from: b */
    public InterfaceC7673a m23394b() {
        return this.f18280b;
    }

    /* renamed from: c */
    public Executor m23395c() {
        return this.f18281c;
    }

    /* renamed from: e */
    public final boolean m23396e() {
        return this.f18282d;
    }
}
