package androidx.lifecycle;

import androidx.lifecycle.f;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements i {

    /* renamed from: a, reason: collision with root package name */
    private final DefaultLifecycleObserver f4874a;

    /* renamed from: b, reason: collision with root package name */
    private final i f4875b;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4876a;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f4876a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, i iVar) {
        kotlin.jvm.internal.n.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f4874a = defaultLifecycleObserver;
        this.f4875b = iVar;
    }

    @Override // androidx.lifecycle.i
    public void onStateChanged(k source, f.a event) {
        kotlin.jvm.internal.n.e(source, "source");
        kotlin.jvm.internal.n.e(event, "event");
        switch (a.f4876a[event.ordinal()]) {
            case 1:
                this.f4874a.onCreate(source);
                break;
            case 2:
                this.f4874a.onStart(source);
                break;
            case 3:
                this.f4874a.onResume(source);
                break;
            case 4:
                this.f4874a.onPause(source);
                break;
            case 5:
                this.f4874a.onStop(source);
                break;
            case 6:
                this.f4874a.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        i iVar = this.f4875b;
        if (iVar != null) {
            iVar.onStateChanged(source, event);
        }
    }
}
