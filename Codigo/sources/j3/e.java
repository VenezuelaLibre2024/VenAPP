package j3;

import java.io.File;
import l3.a;

/* loaded from: classes.dex */
class e<DataType> implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private final h3.d<DataType> f19568a;

    /* renamed from: b, reason: collision with root package name */
    private final DataType f19569b;

    /* renamed from: c, reason: collision with root package name */
    private final h3.h f19570c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(h3.d<DataType> dVar, DataType datatype, h3.h hVar) {
        this.f19568a = dVar;
        this.f19569b = datatype;
        this.f19570c = hVar;
    }

    @Override // l3.a.b
    public boolean a(File file) {
        return this.f19568a.b(this.f19569b, file, this.f19570c);
    }
}
