package mk;

import java.io.File;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class l extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(File file, File file2, String str) {
        super(file, file2, str);
        n.e(file, "file");
    }

    public /* synthetic */ l(File file, File file2, String str, int i10, kotlin.jvm.internal.g gVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }
}
