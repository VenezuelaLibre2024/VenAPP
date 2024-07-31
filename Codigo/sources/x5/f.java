package x5;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.MediaStore;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f30425a = new f();

    private f() {
    }

    public final int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 3;
    }

    public final Uri b(int i10) {
        Uri EXTERNAL_CONTENT_URI;
        if (i10 == 1) {
            EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (i10 == 2) {
            EXTERNAL_CONTENT_URI = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        } else {
            if (i10 != 3) {
                return e.f30417a.a();
            }
            EXTERNAL_CONTENT_URI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        n.d(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        return EXTERNAL_CONTENT_URI;
    }

    public final Uri c(long j10, int i10) {
        Uri withAppendedId = ContentUris.withAppendedId(b(i10), j10);
        n.d(withAppendedId, "withAppendedId(...)");
        return withAppendedId;
    }
}
