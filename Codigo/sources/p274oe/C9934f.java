package p274oe;

import com.google.firebase.perf.application.C6273a;
import re.C10696a;

/* renamed from: oe.f */
/* loaded from: classes.dex */
public final class C9934f implements C6273a.a {

    /* renamed from: a */
    private static final C10696a f24464a = C10696a.m32565e();

    @Override // com.google.firebase.perf.application.C6273a.a
    /* renamed from: a */
    public void mo17243a() {
        try {
            C9933e.m29662c();
        } catch (IllegalStateException e10) {
            f24464a.m32575k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e10);
        }
    }
}
