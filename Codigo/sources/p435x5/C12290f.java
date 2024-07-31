package p435x5;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.MediaStore;
import kotlin.jvm.internal.C9322n;

/* renamed from: x5.f */
/* loaded from: classes.dex */
public final class C12290f {

    /* renamed from: a */
    public static final C12290f f32937a = new C12290f();

    private C12290f() {
    }

    /* renamed from: a */
    public final int m39679a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 3;
    }

    /* renamed from: b */
    public final Uri m39680b(int i10) {
        Uri EXTERNAL_CONTENT_URI;
        if (i10 == 1) {
            EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (i10 == 2) {
            EXTERNAL_CONTENT_URI = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else {
            if (i10 != 3) {
                return InterfaceC12289e.f32929a.m39634a();
            }
            EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        C9322n.m27780d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        return EXTERNAL_CONTENT_URI;
    }

    /* renamed from: c */
    public final Uri m39681c(long j10, int i10) {
        Uri withAppendedId = ContentUris.withAppendedId(m39680b(i10), j10);
        C9322n.m27780d(withAppendedId, "withAppendedId(...)");
        return withAppendedId;
    }
}
