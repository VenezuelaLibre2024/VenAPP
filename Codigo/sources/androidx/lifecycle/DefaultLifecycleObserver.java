package androidx.lifecycle;

/* loaded from: classes.dex */
public interface DefaultLifecycleObserver extends j {
    default void onCreate(k owner) {
        kotlin.jvm.internal.n.e(owner, "owner");
    }

    default void onDestroy(k owner) {
        kotlin.jvm.internal.n.e(owner, "owner");
    }

    default void onPause(k owner) {
        kotlin.jvm.internal.n.e(owner, "owner");
    }

    default void onResume(k owner) {
        kotlin.jvm.internal.n.e(owner, "owner");
    }

    default void onStart(k owner) {
        kotlin.jvm.internal.n.e(owner, "owner");
    }

    default void onStop(k owner) {
        kotlin.jvm.internal.n.e(owner, "owner");
    }
}
