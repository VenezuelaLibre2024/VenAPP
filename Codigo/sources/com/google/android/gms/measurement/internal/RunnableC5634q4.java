package com.google.android.gms.measurement.internal;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q4 */
/* loaded from: classes2.dex */
public final class RunnableC5634q4 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f11721a;

    /* renamed from: b */
    private final /* synthetic */ String f11722b;

    /* renamed from: c */
    private final /* synthetic */ Object f11723c;

    /* renamed from: d */
    private final /* synthetic */ Object f11724d;

    /* renamed from: e */
    private final /* synthetic */ Object f11725e;

    /* renamed from: f */
    private final /* synthetic */ C5595n4 f11726f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5634q4(C5595n4 c5595n4, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f11726f = c5595n4;
        this.f11721a = i10;
        this.f11722b = str;
        this.f11723c = obj;
        this.f11724d = obj2;
        this.f11725e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        long j10;
        char c11;
        long j11;
        C5595n4 c5595n4;
        char c12;
        C5735y4 m14494A = this.f11726f.f11899a.m14494A();
        if (!m14494A.m14359m()) {
            this.f11726f.m14191t(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c10 = this.f11726f.f11611c;
        if (c10 == 0) {
            if (this.f11726f.mo13672a().m13895O()) {
                c5595n4 = this.f11726f;
                c12 = 'C';
            } else {
                c5595n4 = this.f11726f;
                c12 = 'c';
            }
            c5595n4.f11611c = c12;
        }
        j10 = this.f11726f.f11612d;
        if (j10 < 0) {
            this.f11726f.f11612d = 82001L;
        }
        char charAt = "01VDIWEA?".charAt(this.f11721a);
        c11 = this.f11726f.f11611c;
        j11 = this.f11726f.f11612d;
        String str = "2" + charAt + c11 + j11 + ":" + C5595n4.m14176s(true, this.f11722b, this.f11723c, this.f11724d, this.f11725e);
        if (str.length() > 1024) {
            str = this.f11722b.substring(0, RecognitionOptions.UPC_E);
        }
        C5453c5 c5453c5 = m14494A.f12053d;
        if (c5453c5 != null) {
            c5453c5.m13718b(str, 1L);
        }
    }
}
