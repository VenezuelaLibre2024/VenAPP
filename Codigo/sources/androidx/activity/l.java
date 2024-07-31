package androidx.activity;

import ck.v;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class l {
    private final CopyOnWriteArrayList<a> cancellables = new CopyOnWriteArrayList<>();
    private ok.a<v> enabledChangedCallback;
    private boolean isEnabled;

    public l(boolean z10) {
        this.isEnabled = z10;
    }

    public final void addCancellable(a cancellable) {
        kotlin.jvm.internal.n.e(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final ok.a<v> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((a) it.next()).cancel();
        }
    }

    public final void removeCancellable(a cancellable) {
        kotlin.jvm.internal.n.e(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
        ok.a<v> aVar = this.enabledChangedCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(ok.a<v> aVar) {
        this.enabledChangedCallback = aVar;
    }
}
