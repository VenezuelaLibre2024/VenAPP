package p171j3;

import java.io.File;
import p129h3.C7624h;
import p129h3.InterfaceC7620d;
import p212l3.InterfaceC9375a;

/* renamed from: j3.e */
/* loaded from: classes.dex */
class C8958e<DataType> implements InterfaceC9375a.b {

    /* renamed from: a */
    private final InterfaceC7620d<DataType> f21319a;

    /* renamed from: b */
    private final DataType f21320b;

    /* renamed from: c */
    private final C7624h f21321c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8958e(InterfaceC7620d<DataType> interfaceC7620d, DataType datatype, C7624h c7624h) {
        this.f21319a = interfaceC7620d;
        this.f21320b = datatype;
        this.f21321c = c7624h;
    }

    @Override // p212l3.InterfaceC9375a.b
    /* renamed from: a */
    public boolean mo26189a(File file) {
        return this.f21319a.mo23137b(this.f21320b, file, this.f21321c);
    }
}
