package androidx.activity;

import ck.C2037v;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9987a;

/* renamed from: androidx.activity.l */
/* loaded from: classes.dex */
public abstract class AbstractC0197l {
    private final CopyOnWriteArrayList<InterfaceC0186a> cancellables = new CopyOnWriteArrayList<>();
    private InterfaceC9987a<C2037v> enabledChangedCallback;
    private boolean isEnabled;

    public AbstractC0197l(boolean z10) {
        this.isEnabled = z10;
    }

    public final void addCancellable(InterfaceC0186a cancellable) {
        C9322n.m27781e(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final InterfaceC9987a<C2037v> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((InterfaceC0186a) it.next()).cancel();
        }
    }

    public final void removeCancellable(InterfaceC0186a cancellable) {
        C9322n.m27781e(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
        InterfaceC9987a<C2037v> interfaceC9987a = this.enabledChangedCallback;
        if (interfaceC9987a != null) {
            interfaceC9987a.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(InterfaceC9987a<C2037v> interfaceC9987a) {
        this.enabledChangedCallback = interfaceC9987a;
    }
}
