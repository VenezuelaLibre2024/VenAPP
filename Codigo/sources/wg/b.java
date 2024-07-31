package wg;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b extends f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(kg.a aVar) {
        super(aVar);
    }

    @Override // wg.i
    protected void h(StringBuilder sb2, int i10) {
        sb2.append(i10 < 10000 ? "(3202)" : "(3203)");
    }

    @Override // wg.i
    protected int i(int i10) {
        return i10 < 10000 ? i10 : i10 - ModuleDescriptor.MODULE_VERSION;
    }
}
