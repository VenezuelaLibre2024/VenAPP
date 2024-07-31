package sa;

import com.google.android.gms.internal.maps.zzad;
import sa.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j extends ta.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.h f25433a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(c cVar, c.h hVar) {
        this.f25433a = hVar;
    }

    @Override // ta.p
    public final boolean a(zzad zzadVar) {
        return this.f25433a.onMarkerClick(new ua.m(zzadVar));
    }
}
