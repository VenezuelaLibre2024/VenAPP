package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C1305h0;
import androidx.savedstate.C1418a;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.C9322n;
import p149i1.AbstractC7768a;
import p371u1.InterfaceC11300d;

/* renamed from: androidx.lifecycle.d0 */
/* loaded from: classes.dex */
public final class C1297d0 extends C1305h0.d implements C1305h0.b {

    /* renamed from: b */
    private Application f5668b;

    /* renamed from: c */
    private final C1305h0.b f5669c;

    /* renamed from: d */
    private Bundle f5670d;

    /* renamed from: e */
    private AbstractC1300f f5671e;

    /* renamed from: f */
    private C1418a f5672f;

    public C1297d0(Application application, InterfaceC11300d owner, Bundle bundle) {
        C9322n.m27781e(owner, "owner");
        this.f5672f = owner.getSavedStateRegistry();
        this.f5671e = owner.getLifecycle();
        this.f5670d = bundle;
        this.f5668b = application;
        this.f5669c = application != null ? C1305h0.a.f5692f.m7342a(application) : new C1305h0.a();
    }

    @Override // androidx.lifecycle.C1305h0.b
    /* renamed from: a */
    public <T extends AbstractC1303g0> T mo7307a(Class<T> modelClass, AbstractC7768a extras) {
        C9322n.m27781e(modelClass, "modelClass");
        C9322n.m27781e(extras, "extras");
        String str = (String) extras.mo23719a(C1305h0.c.f5701d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.mo23719a(C1291a0.f5651a) == null || extras.mo23719a(C1291a0.f5652b) == null) {
            if (this.f5671e != null) {
                return (T) m7309d(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.mo23719a(C1305h0.a.f5694h);
        boolean isAssignableFrom = C1290a.class.isAssignableFrom(modelClass);
        Constructor m7312c = C1299e0.m7312c(modelClass, (!isAssignableFrom || application == null) ? C1299e0.f5674b : C1299e0.f5673a);
        return m7312c == null ? (T) this.f5669c.mo7307a(modelClass, extras) : (!isAssignableFrom || application == null) ? (T) C1299e0.m7313d(modelClass, m7312c, C1291a0.m7287a(extras)) : (T) C1299e0.m7313d(modelClass, m7312c, application, C1291a0.m7287a(extras));
    }

    @Override // androidx.lifecycle.C1305h0.b
    /* renamed from: b */
    public <T extends AbstractC1303g0> T mo7155b(Class<T> modelClass) {
        C9322n.m27781e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) m7309d(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C1305h0.d
    /* renamed from: c */
    public void mo7308c(AbstractC1303g0 viewModel) {
        C9322n.m27781e(viewModel, "viewModel");
        if (this.f5671e != null) {
            C1418a c1418a = this.f5672f;
            C9322n.m27778b(c1418a);
            AbstractC1300f abstractC1300f = this.f5671e;
            C9322n.m27778b(abstractC1300f);
            LegacySavedStateHandleController.m7273a(viewModel, c1418a, abstractC1300f);
        }
    }

    /* renamed from: d */
    public final <T extends AbstractC1303g0> T m7309d(String key, Class<T> modelClass) {
        T t10;
        Application application;
        C9322n.m27781e(key, "key");
        C9322n.m27781e(modelClass, "modelClass");
        AbstractC1300f abstractC1300f = this.f5671e;
        if (abstractC1300f == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = C1290a.class.isAssignableFrom(modelClass);
        Constructor m7312c = C1299e0.m7312c(modelClass, (!isAssignableFrom || this.f5668b == null) ? C1299e0.f5674b : C1299e0.f5673a);
        if (m7312c == null) {
            return this.f5668b != null ? (T) this.f5669c.mo7155b(modelClass) : (T) C1305h0.c.f5699b.m7345a().mo7155b(modelClass);
        }
        C1418a c1418a = this.f5672f;
        C9322n.m27778b(c1418a);
        SavedStateHandleController m7274b = LegacySavedStateHandleController.m7274b(c1418a, abstractC1300f, key, this.f5670d);
        if (!isAssignableFrom || (application = this.f5668b) == null) {
            t10 = (T) C1299e0.m7313d(modelClass, m7312c, m7274b.m7285b());
        } else {
            C9322n.m27778b(application);
            t10 = (T) C1299e0.m7313d(modelClass, m7312c, application, m7274b.m7285b());
        }
        t10.m7335e("androidx.lifecycle.savedstate.vm.tag", m7274b);
        return t10;
    }
}
