package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.lifecycle.f */
/* loaded from: classes.dex */
public abstract class AbstractC1300f {

    /* renamed from: a */
    private AtomicReference<Object> f5675a = new AtomicReference<>();

    /* renamed from: androidx.lifecycle.f$a */
    /* loaded from: classes.dex */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C13164a Companion = new C13164a(null);

        /* renamed from: androidx.lifecycle.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13164a {

            /* renamed from: androidx.lifecycle.f$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C13165a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f5676a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f5676a = iArr;
                }
            }

            private C13164a() {
            }

            public /* synthetic */ C13164a(C9315g c9315g) {
                this();
            }

            /* renamed from: a */
            public final a m7321a(b state) {
                C9322n.m27781e(state, "state");
                int i10 = C13165a.f5676a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            /* renamed from: b */
            public final a m7322b(b state) {
                C9322n.m27781e(state, "state");
                int i10 = C13165a.f5676a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            /* renamed from: c */
            public final a m7323c(b state) {
                C9322n.m27781e(state, "state");
                int i10 = C13165a.f5676a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        /* renamed from: androidx.lifecycle.f$a$b */
        /* loaded from: classes.dex */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f5677a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f5677a = iArr;
            }
        }

        /* renamed from: h */
        public static final a m7318h(b bVar) {
            return Companion.m7321a(bVar);
        }

        /* renamed from: l */
        public static final a m7319l(b bVar) {
            return Companion.m7323c(bVar);
        }

        /* renamed from: i */
        public final b m7320i() {
            switch (b.f5677a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.f$b */
    /* loaded from: classes.dex */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: h */
        public final boolean m7325h(b state) {
            C9322n.m27781e(state, "state");
            return compareTo(state) >= 0;
        }
    }

    /* renamed from: a */
    public abstract void mo7314a(InterfaceC1308j interfaceC1308j);

    /* renamed from: b */
    public abstract b mo7315b();

    /* renamed from: c */
    public abstract void mo7316c(InterfaceC1308j interfaceC1308j);
}
