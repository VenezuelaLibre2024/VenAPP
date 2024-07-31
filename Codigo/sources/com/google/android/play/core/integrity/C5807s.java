package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5831i;
import com.google.android.play.integrity.internal.C5835k;
import com.google.android.play.integrity.internal.InterfaceC5833j;
import com.google.android.play.integrity.internal.InterfaceC5839m;

/* renamed from: com.google.android.play.core.integrity.s */
/* loaded from: classes2.dex */
final class C5807s {

    /* renamed from: a */
    private final C5807s f12194a = this;

    /* renamed from: b */
    private final InterfaceC5839m f12195b;

    /* renamed from: c */
    private final InterfaceC5839m f12196c;

    /* renamed from: d */
    private final InterfaceC5839m f12197d;

    /* renamed from: e */
    private final InterfaceC5839m f12198e;

    /* renamed from: f */
    private final InterfaceC5839m f12199f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5807s(Context context, C5806r c5806r) {
        C5770ao c5770ao;
        InterfaceC5833j m14690b = C5835k.m14690b(context);
        this.f12195b = m14690b;
        c5770ao = C5769an.f12140a;
        InterfaceC5839m m14688b = C5831i.m14688b(c5770ao);
        this.f12196c = m14688b;
        InterfaceC5839m m14688b2 = C5831i.m14688b(new C5781az(m14690b, m14688b));
        this.f12197d = m14688b2;
        InterfaceC5839m m14688b3 = C5831i.m14688b(new C5787be(m14688b2));
        this.f12198e = m14688b3;
        this.f12199f = C5831i.m14688b(new C5768am(m14688b2, m14688b3));
    }

    /* renamed from: a */
    public final StandardIntegrityManager m14649a() {
        return (StandardIntegrityManager) this.f12199f.mo14622a();
    }
}
