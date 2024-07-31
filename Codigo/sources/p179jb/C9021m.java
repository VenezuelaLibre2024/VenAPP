package p179jb;

import java.security.GeneralSecurityException;

/* renamed from: jb.m */
/* loaded from: classes2.dex */
public final class C9021m {
    /* renamed from: a */
    public static C9020l m26459a(String str) {
        C9020l c9020l = C9032x.m26532i().get(str);
        if (c9020l != null) {
            return c9020l;
        }
        throw new GeneralSecurityException("cannot find key template: " + str);
    }
}
