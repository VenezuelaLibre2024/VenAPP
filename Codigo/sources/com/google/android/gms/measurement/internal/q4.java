package com.google.android.gms.measurement.internal;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f10534a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10535b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Object f10536c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Object f10537d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Object f10538e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ n4 f10539f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q4(n4 n4Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f10539f = n4Var;
        this.f10534a = i10;
        this.f10535b = str;
        this.f10536c = obj;
        this.f10537d = obj2;
        this.f10538e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        long j10;
        char c11;
        long j11;
        n4 n4Var;
        char c12;
        y4 A = this.f10539f.f10701a.A();
        if (!A.m()) {
            this.f10539f.t(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c10 = this.f10539f.f10424c;
        if (c10 == 0) {
            if (this.f10539f.a().O()) {
                n4Var = this.f10539f;
                c12 = 'C';
            } else {
                n4Var = this.f10539f;
                c12 = 'c';
            }
            n4Var.f10424c = c12;
        }
        j10 = this.f10539f.f10425d;
        if (j10 < 0) {
            this.f10539f.f10425d = 82001L;
        }
        char charAt = "01VDIWEA?".charAt(this.f10534a);
        c11 = this.f10539f.f10424c;
        j11 = this.f10539f.f10425d;
        String str = "2" + charAt + c11 + j11 + ":" + n4.s(true, this.f10535b, this.f10536c, this.f10537d, this.f10538e);
        if (str.length() > 1024) {
            str = this.f10535b.substring(0, RecognitionOptions.UPC_E);
        }
        c5 c5Var = A.f10838d;
        if (c5Var != null) {
            c5Var.b(str, 1L);
        }
    }
}
