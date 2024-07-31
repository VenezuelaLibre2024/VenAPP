package p117g5;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.internal.C4634n0;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import kotlin.jvm.internal.C9322n;
import p152i4.C7787a;
import p152i4.C7807i0;
import p152i4.C7824r;
import p152i4.EnumC7819o0;

/* renamed from: g5.a */
/* loaded from: classes.dex */
public final class C7448a {

    /* renamed from: a */
    public static final C7448a f17352a = new C7448a();

    private C7448a() {
    }

    /* renamed from: a */
    public static final C7807i0 m22498a(C7787a c7787a, Uri imageUri, C7807i0.b bVar) {
        C9322n.m27781e(imageUri, "imageUri");
        String path = imageUri.getPath();
        if (C4634n0.m11296b0(imageUri) && path != null) {
            return m22499b(c7787a, new File(path), bVar);
        }
        if (!C4634n0.m11291Y(imageUri)) {
            throw new C7824r("The image Uri must be either a file:// or content:// Uri");
        }
        C7807i0.g gVar = new C7807i0.g(imageUri, "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(Constants.FILE, gVar);
        return new C7807i0(c7787a, "me/staging_resources", bundle, EnumC7819o0.POST, bVar, null, 32, null);
    }

    /* renamed from: b */
    public static final C7807i0 m22499b(C7787a c7787a, File file, C7807i0.b bVar) {
        C7807i0.g gVar = new C7807i0.g(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(Constants.FILE, gVar);
        return new C7807i0(c7787a, "me/staging_resources", bundle, EnumC7819o0.POST, bVar, null, 32, null);
    }
}
