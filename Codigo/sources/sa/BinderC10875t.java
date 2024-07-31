package sa;

import android.graphics.Bitmap;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
import p365ta.AbstractBinderC11232y;
import sa.C10858c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sa.t */
/* loaded from: classes2.dex */
public final class BinderC10875t extends AbstractBinderC11232y {

    /* renamed from: a */
    final /* synthetic */ C10858c.l f27568a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC10875t(C10858c c10858c, C10858c.l lVar) {
        this.f27568a = lVar;
    }

    @Override // p365ta.InterfaceC11233z
    /* renamed from: Q0 */
    public final void mo33188Q0(Bitmap bitmap) {
        this.f27568a.onSnapshotReady(bitmap);
    }

    @Override // p365ta.InterfaceC11233z
    public final void zzc(InterfaceC5312b interfaceC5312b) {
        this.f27568a.onSnapshotReady((Bitmap) BinderC5314d.m13411g2(interfaceC5312b));
    }
}
