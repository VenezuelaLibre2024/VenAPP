package sa;

import com.google.android.gms.internal.maps.zzaj;
import sa.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s extends ta.v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.k f25448a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(c cVar, c.k kVar) {
        this.f25448a = kVar;
    }

    @Override // ta.w
    public final void I0(zzaj zzajVar) {
        this.f25448a.onPolylineClick(new ua.s(zzajVar));
    }
}
