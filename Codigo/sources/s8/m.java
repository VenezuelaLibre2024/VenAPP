package s8;

import java.io.IOException;

/* loaded from: classes.dex */
public final class m {
    public static void a(j jVar) {
        if (jVar != null) {
            try {
                jVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
