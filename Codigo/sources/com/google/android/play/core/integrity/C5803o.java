package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5831i;
import com.google.android.play.integrity.internal.C5835k;
import com.google.android.play.integrity.internal.InterfaceC5833j;
import com.google.android.play.integrity.internal.InterfaceC5839m;

/* renamed from: com.google.android.play.core.integrity.o */
/* loaded from: classes2.dex */
final class C5803o {

    /* renamed from: a */
    private final C5803o f12188a = this;

    /* renamed from: b */
    private final InterfaceC5839m f12189b;

    /* renamed from: c */
    private final InterfaceC5839m f12190c;

    /* renamed from: d */
    private final InterfaceC5839m f12191d;

    /* renamed from: e */
    private final InterfaceC5839m f12192e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5803o(Context context, C5802n c5802n) {
        C5814z c5814z;
        InterfaceC5833j m14690b = C5835k.m14690b(context);
        this.f12189b = m14690b;
        c5814z = C5813y.f12205a;
        InterfaceC5839m m14688b = C5831i.m14688b(c5814z);
        this.f12190c = m14688b;
        InterfaceC5839m m14688b2 = C5831i.m14688b(new C5761af(m14690b, m14688b));
        this.f12191d = m14688b2;
        this.f12192e = C5831i.m14688b(new C5812x(m14688b2));
    }

    /* renamed from: a */
    public final IntegrityManager m14647a() {
        return (IntegrityManager) this.f12192e.mo14622a();
    }
}
