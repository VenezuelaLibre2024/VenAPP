package g5;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.internal.n0;
import i4.i0;
import i4.o0;
import i4.r;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15770a = new a();

    private a() {
    }

    public static final i0 a(i4.a aVar, Uri imageUri, i0.b bVar) {
        n.e(imageUri, "imageUri");
        String path = imageUri.getPath();
        if (n0.b0(imageUri) && path != null) {
            return b(aVar, new File(path), bVar);
        }
        if (!n0.Y(imageUri)) {
            throw new r("The image Uri must be either a file:// or content:// Uri");
        }
        i0.g gVar = new i0.g(imageUri, "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(Constants.FILE, gVar);
        return new i0(aVar, "me/staging_resources", bundle, o0.POST, bVar, null, 32, null);
    }

    public static final i0 b(i4.a aVar, File file, i0.b bVar) {
        i0.g gVar = new i0.g(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(Constants.FILE, gVar);
        return new i0(aVar, "me/staging_resources", bundle, o0.POST, bVar, null, 32, null);
    }
}
