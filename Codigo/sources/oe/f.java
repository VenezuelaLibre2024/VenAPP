package oe;

import com.google.firebase.perf.application.a;

/* loaded from: classes.dex */
public final class f implements a.InterfaceC0178a {

    /* renamed from: a, reason: collision with root package name */
    private static final re.a f22531a = re.a.e();

    @Override // com.google.firebase.perf.application.a.InterfaceC0178a
    public void a() {
        try {
            e.c();
        } catch (IllegalStateException e10) {
            f22531a.k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e10);
        }
    }
}
