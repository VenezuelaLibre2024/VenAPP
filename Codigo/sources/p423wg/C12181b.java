package p423wg;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import kg.C9263a;

/* renamed from: wg.b */
/* loaded from: classes2.dex */
final class C12181b extends AbstractC12185f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C12181b(C9263a c9263a) {
        super(c9263a);
    }

    @Override // p423wg.AbstractC12188i
    /* renamed from: h */
    protected void mo39098h(StringBuilder sb2, int i10) {
        sb2.append(i10 < 10000 ? "(3202)" : "(3203)");
    }

    @Override // p423wg.AbstractC12188i
    /* renamed from: i */
    protected int mo39099i(int i10) {
        return i10 < 10000 ? i10 : i10 - ModuleDescriptor.MODULE_VERSION;
    }
}
