package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.f;
import androidx.savedstate.a;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* renamed from: a, reason: collision with root package name */
    public static final LegacySavedStateHandleController f4877a = new LegacySavedStateHandleController();

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0083a {
        @Override // androidx.savedstate.a.InterfaceC0083a
        public void a(u1.d owner) {
            kotlin.jvm.internal.n.e(owner, "owner");
            if (!(owner instanceof k0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            j0 viewModelStore = ((k0) owner).getViewModelStore();
            androidx.savedstate.a savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                g0 b10 = viewModelStore.b(it.next());
                kotlin.jvm.internal.n.b(b10);
                LegacySavedStateHandleController.a(b10, savedStateRegistry, owner.getLifecycle());
            }
            if (!viewModelStore.c().isEmpty()) {
                savedStateRegistry.i(a.class);
            }
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(g0 viewModel, androidx.savedstate.a registry, f lifecycle) {
        kotlin.jvm.internal.n.e(viewModel, "viewModel");
        kotlin.jvm.internal.n.e(registry, "registry");
        kotlin.jvm.internal.n.e(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.c()) {
            return;
        }
        savedStateHandleController.a(registry, lifecycle);
        f4877a.c(registry, lifecycle);
    }

    public static final SavedStateHandleController b(androidx.savedstate.a registry, f lifecycle, String str, Bundle bundle) {
        kotlin.jvm.internal.n.e(registry, "registry");
        kotlin.jvm.internal.n.e(lifecycle, "lifecycle");
        kotlin.jvm.internal.n.b(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, z.f4986f.a(registry.b(str), bundle));
        savedStateHandleController.a(registry, lifecycle);
        f4877a.c(registry, lifecycle);
        return savedStateHandleController;
    }

    private final void c(final androidx.savedstate.a aVar, final f fVar) {
        f.b b10 = fVar.b();
        if (b10 == f.b.INITIALIZED || b10.h(f.b.STARTED)) {
            aVar.i(a.class);
        } else {
            fVar.a(new i() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.i
                public void onStateChanged(k source, f.a event) {
                    kotlin.jvm.internal.n.e(source, "source");
                    kotlin.jvm.internal.n.e(event, "event");
                    if (event == f.a.ON_START) {
                        f.this.c(this);
                        aVar.i(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
