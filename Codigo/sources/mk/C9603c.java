package mk;

import java.io.File;
import kotlin.jvm.internal.C9322n;

/* renamed from: mk.c */
/* loaded from: classes3.dex */
public final class C9603c {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m28595b(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": " + str);
        }
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "sb.toString()");
        return sb3;
    }
}
