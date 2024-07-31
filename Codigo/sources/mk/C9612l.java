package mk;

import java.io.File;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: mk.l */
/* loaded from: classes3.dex */
public final class C9612l extends C9606f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9612l(File file, File file2, String str) {
        super(file, file2, str);
        C9322n.m27781e(file, "file");
    }

    public /* synthetic */ C9612l(File file, File file2, String str, int i10, C9315g c9315g) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }
}
