package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.C1418a;
import ck.C2025j;
import ck.InterfaceC2023h;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9987a;

/* renamed from: androidx.lifecycle.b0 */
/* loaded from: classes.dex */
public final class C1293b0 implements C1418a.c {

    /* renamed from: a */
    private final C1418a f5662a;

    /* renamed from: b */
    private boolean f5663b;

    /* renamed from: c */
    private Bundle f5664c;

    /* renamed from: d */
    private final InterfaceC2023h f5665d;

    /* renamed from: androidx.lifecycle.b0$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC9323o implements InterfaceC9987a<C1295c0> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC1311k0 f5666a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1311k0 interfaceC1311k0) {
            super(0);
            this.f5666a = interfaceC1311k0;
        }

        @Override // p280ok.InterfaceC9987a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1295c0 invoke() {
            return C1291a0.m7291e(this.f5666a);
        }
    }

    public C1293b0(C1418a savedStateRegistry, InterfaceC1311k0 viewModelStoreOwner) {
        InterfaceC2023h m10334a;
        C9322n.m27781e(savedStateRegistry, "savedStateRegistry");
        C9322n.m27781e(viewModelStoreOwner, "viewModelStoreOwner");
        this.f5662a = savedStateRegistry;
        m10334a = C2025j.m10334a(new a(viewModelStoreOwner));
        this.f5665d = m10334a;
    }

    /* renamed from: c */
    private final C1295c0 m7301c() {
        return (C1295c0) this.f5665d.getValue();
    }

    @Override // androidx.savedstate.C1418a.c
    /* renamed from: a */
    public Bundle mo804a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5664c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, C1328z> entry : m7301c().m7305f().entrySet()) {
            String key = entry.getKey();
            Bundle mo804a = entry.getValue().m7407c().mo804a();
            if (!C9322n.m27777a(mo804a, Bundle.EMPTY)) {
                bundle.putBundle(key, mo804a);
            }
        }
        this.f5663b = false;
        return bundle;
    }

    /* renamed from: b */
    public final Bundle m7302b(String key) {
        C9322n.m27781e(key, "key");
        m7303d();
        Bundle bundle = this.f5664c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f5664c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f5664c;
        boolean z10 = false;
        if (bundle4 != null && bundle4.isEmpty()) {
            z10 = true;
        }
        if (z10) {
            this.f5664c = null;
        }
        return bundle2;
    }

    /* renamed from: d */
    public final void m7303d() {
        if (this.f5663b) {
            return;
        }
        Bundle m8116b = this.f5662a.m8116b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5664c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (m8116b != null) {
            bundle.putAll(m8116b);
        }
        this.f5664c = bundle;
        this.f5663b = true;
        m7301c();
    }
}
