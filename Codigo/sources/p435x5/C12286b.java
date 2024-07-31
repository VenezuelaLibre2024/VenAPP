package p435x5;

import java.io.File;
import kotlin.jvm.internal.C9322n;

/* renamed from: x5.b */
/* loaded from: classes.dex */
public final class C12286b {
    /* renamed from: a */
    public static final void m39615a(String str) {
        C9322n.m27781e(str, "<this>");
        File file = new File(str);
        File parentFile = file.getParentFile();
        C9322n.m27778b(parentFile);
        if (parentFile.exists()) {
            return;
        }
        File parentFile2 = file.getParentFile();
        C9322n.m27778b(parentFile2);
        parentFile2.mkdirs();
    }
}
