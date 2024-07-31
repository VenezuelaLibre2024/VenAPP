package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.Map;

/* loaded from: classes.dex */
public final class b0 implements a.c {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.savedstate.a f4908a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4909b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f4910c;

    /* renamed from: d, reason: collision with root package name */
    private final ck.h f4911d;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.o implements ok.a<c0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0 f4912a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k0 k0Var) {
            super(0);
            this.f4912a = k0Var;
        }

        @Override // ok.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c0 invoke() {
            return a0.e(this.f4912a);
        }
    }

    public b0(androidx.savedstate.a savedStateRegistry, k0 viewModelStoreOwner) {
        ck.h a10;
        kotlin.jvm.internal.n.e(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.n.e(viewModelStoreOwner, "viewModelStoreOwner");
        this.f4908a = savedStateRegistry;
        a10 = ck.j.a(new a(viewModelStoreOwner));
        this.f4911d = a10;
    }

    private final c0 c() {
        return (c0) this.f4911d.getValue();
    }

    @Override // androidx.savedstate.a.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4910c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, z> entry : c().f().entrySet()) {
            String key = entry.getKey();
            Bundle a10 = entry.getValue().c().a();
            if (!kotlin.jvm.internal.n.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(key, a10);
            }
        }
        this.f4909b = false;
        return bundle;
    }

    public final Bundle b(String key) {
        kotlin.jvm.internal.n.e(key, "key");
        d();
        Bundle bundle = this.f4910c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f4910c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f4910c;
        boolean z10 = false;
        if (bundle4 != null && bundle4.isEmpty()) {
            z10 = true;
        }
        if (z10) {
            this.f4910c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.f4909b) {
            return;
        }
        Bundle b10 = this.f4908a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4910c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (b10 != null) {
            bundle.putAll(b10);
        }
        this.f4910c = bundle;
        this.f4909b = true;
        c();
    }
}
