package sa;

import com.google.android.gms.internal.maps.zzad;
import p365ta.AbstractBinderC11221o;
import sa.C10858c;
import ua.C11500m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sa.j */
/* loaded from: classes2.dex */
public final class BinderC10865j extends AbstractBinderC11221o {

    /* renamed from: a */
    final /* synthetic */ C10858c.h f27552a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC10865j(C10858c c10858c, C10858c.h hVar) {
        this.f27552a = hVar;
    }

    @Override // p365ta.InterfaceC11223p
    /* renamed from: a */
    public final boolean mo33175a(zzad zzadVar) {
        return this.f27552a.onMarkerClick(new C11500m(zzadVar));
    }
}
