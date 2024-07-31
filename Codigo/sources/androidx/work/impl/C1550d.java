package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.C0948g;
import p094f2.InterfaceC7284q;

/* renamed from: androidx.work.impl.d */
/* loaded from: classes.dex */
public class C1550d implements InterfaceC7284q {

    /* renamed from: a */
    private final Handler f6649a = C0948g.m4712a(Looper.getMainLooper());

    @Override // p094f2.InterfaceC7284q
    /* renamed from: a */
    public void mo8673a(Runnable runnable) {
        this.f6649a.removeCallbacks(runnable);
    }

    @Override // p094f2.InterfaceC7284q
    /* renamed from: b */
    public void mo8674b(long j10, Runnable runnable) {
        this.f6649a.postDelayed(runnable, j10);
    }
}
