package com.facebook.appevents;

import com.facebook.appevents.d0;
import com.facebook.internal.n;
import com.facebook.internal.v;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f7613a = new d0();

    /* loaded from: classes.dex */
    public static final class a implements v.b {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(boolean z10) {
            if (z10) {
                j4.b.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(boolean z10) {
            if (z10) {
                t4.a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(boolean z10) {
            if (z10) {
                k4.d.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(boolean z10) {
            if (z10) {
                r4.f.f();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(boolean z10) {
            if (z10) {
                n4.a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(boolean z10) {
            if (z10) {
                o4.k.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(boolean z10) {
            if (z10) {
                p4.d.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(boolean z10) {
            if (z10) {
                p4.c.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(boolean z10) {
            if (z10) {
                p4.a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void w(boolean z10) {
            if (z10) {
                p4.e.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(boolean z10) {
            if (z10) {
                p4.f.a();
            }
        }

        @Override // com.facebook.internal.v.b
        public void a() {
        }

        @Override // com.facebook.internal.v.b
        public void b(com.facebook.internal.r rVar) {
            com.facebook.internal.n nVar = com.facebook.internal.n.f7774a;
            com.facebook.internal.n.a(n.b.AAM, new n.a() { // from class: com.facebook.appevents.s
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    d0.a.n(z10);
                }
            });
            com.facebook.internal.n.a(n.b.RestrictiveDataFiltering, new n.a() { // from class: com.facebook.appevents.v
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    d0.a.o(z10);
                }
            });
            com.facebook.internal.n.a(n.b.PrivacyProtection, new n.a() { // from class: com.facebook.appevents.w
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    d0.a.q(z10);
                }
            });
            com.facebook.internal.n.a(n.b.EventDeactivation, new n.a() { // from class: com.facebook.appevents.x
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    d0.a.r(z10);
                }
            });
            com.facebook.internal.n.a(n.b.IapLogging, new n.a() { // from class: com.facebook.appevents.y
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    d0.a.s(z10);
                }
            });
            com.facebook.internal.n.a(n.b.ProtectedMode, new n.a() { // from class: com.facebook.appevents.z
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    d0.a.t(z10);
                }
            });
            com.facebook.internal.n.a(n.b.MACARuleMatching, new n.a() { // from class: com.facebook.appevents.a0
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    d0.a.u(z10);
                }
            });
            com.facebook.internal.n.a(n.b.BlocklistEvents, new n.a() { // from class: com.facebook.appevents.b0
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    d0.a.v(z10);
                }
            });
            com.facebook.internal.n.a(n.b.FilterRedactedEvents, new n.a() { // from class: com.facebook.appevents.c0
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    d0.a.w(z10);
                }
            });
            com.facebook.internal.n.a(n.b.FilterSensitiveParams, new n.a() { // from class: com.facebook.appevents.t
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    d0.a.x(z10);
                }
            });
            com.facebook.internal.n.a(n.b.CloudBridge, new n.a() { // from class: com.facebook.appevents.u
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    d0.a.p(z10);
                }
            });
        }
    }

    private d0() {
    }

    public static final void a() {
        if (a5.a.d(d0.class)) {
            return;
        }
        try {
            com.facebook.internal.v vVar = com.facebook.internal.v.f7874a;
            com.facebook.internal.v.d(new a());
        } catch (Throwable th2) {
            a5.a.b(th2, d0.class);
        }
    }
}
