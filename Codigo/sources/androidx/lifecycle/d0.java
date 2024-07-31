package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.h0;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class d0 extends h0.d implements h0.b {

    /* renamed from: b, reason: collision with root package name */
    private Application f4914b;

    /* renamed from: c, reason: collision with root package name */
    private final h0.b f4915c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f4916d;

    /* renamed from: e, reason: collision with root package name */
    private f f4917e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.savedstate.a f4918f;

    public d0(Application application, u1.d owner, Bundle bundle) {
        kotlin.jvm.internal.n.e(owner, "owner");
        this.f4918f = owner.getSavedStateRegistry();
        this.f4917e = owner.getLifecycle();
        this.f4916d = bundle;
        this.f4914b = application;
        this.f4915c = application != null ? h0.a.f4938f.a(application) : new h0.a();
    }

    @Override // androidx.lifecycle.h0.b
    public <T extends g0> T a(Class<T> modelClass, i1.a extras) {
        kotlin.jvm.internal.n.e(modelClass, "modelClass");
        kotlin.jvm.internal.n.e(extras, "extras");
        String str = (String) extras.a(h0.c.f4947d);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(a0.f4897a) == null || extras.a(a0.f4898b) == null) {
            if (this.f4917e != null) {
                return (T) d(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(h0.a.f4940h);
        boolean isAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor c10 = e0.c(modelClass, (!isAssignableFrom || application == null) ? e0.f4920b : e0.f4919a);
        return c10 == null ? (T) this.f4915c.a(modelClass, extras) : (!isAssignableFrom || application == null) ? (T) e0.d(modelClass, c10, a0.a(extras)) : (T) e0.d(modelClass, c10, application, a0.a(extras));
    }

    @Override // androidx.lifecycle.h0.b
    public <T extends g0> T b(Class<T> modelClass) {
        kotlin.jvm.internal.n.e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.h0.d
    public void c(g0 viewModel) {
        kotlin.jvm.internal.n.e(viewModel, "viewModel");
        if (this.f4917e != null) {
            androidx.savedstate.a aVar = this.f4918f;
            kotlin.jvm.internal.n.b(aVar);
            f fVar = this.f4917e;
            kotlin.jvm.internal.n.b(fVar);
            LegacySavedStateHandleController.a(viewModel, aVar, fVar);
        }
    }

    public final <T extends g0> T d(String key, Class<T> modelClass) {
        T t10;
        Application application;
        kotlin.jvm.internal.n.e(key, "key");
        kotlin.jvm.internal.n.e(modelClass, "modelClass");
        f fVar = this.f4917e;
        if (fVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor c10 = e0.c(modelClass, (!isAssignableFrom || this.f4914b == null) ? e0.f4920b : e0.f4919a);
        if (c10 == null) {
            return this.f4914b != null ? (T) this.f4915c.b(modelClass) : (T) h0.c.f4945b.a().b(modelClass);
        }
        androidx.savedstate.a aVar = this.f4918f;
        kotlin.jvm.internal.n.b(aVar);
        SavedStateHandleController b10 = LegacySavedStateHandleController.b(aVar, fVar, key, this.f4916d);
        if (!isAssignableFrom || (application = this.f4914b) == null) {
            t10 = (T) e0.d(modelClass, c10, b10.b());
        } else {
            kotlin.jvm.internal.n.b(application);
            t10 = (T) e0.d(modelClass, c10, application, b10.b());
        }
        t10.e("androidx.lifecycle.savedstate.vm.tag", b10);
        return t10;
    }
}
