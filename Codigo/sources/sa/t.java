package sa;

import android.graphics.Bitmap;
import sa.c;
import ta.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t extends y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.l f25449a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(c cVar, c.l lVar) {
        this.f25449a = lVar;
    }

    @Override // ta.z
    public final void Q0(Bitmap bitmap) {
        this.f25449a.onSnapshotReady(bitmap);
    }

    @Override // ta.z
    public final void zzc(com.google.android.gms.dynamic.b bVar) {
        this.f25449a.onSnapshotReady((Bitmap) com.google.android.gms.dynamic.d.g2(bVar));
    }
}
