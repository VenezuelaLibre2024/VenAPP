package f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.gms.common.api.a;
import dk.r;
import f.a;
import f.d;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public class c extends f.a<androidx.activity.result.f, List<Uri>> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f14834b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f14835a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final int a() {
            return d.f14836a.f() ? MediaStore.getPickImagesMaxLimit() : a.e.API_PRIORITY_OTHER;
        }
    }

    public c() {
        this(0, 1, null);
    }

    public c(int i10) {
        this.f14835a = i10;
        if (!(i10 > 1)) {
            throw new IllegalArgumentException("Max items must be higher than 1".toString());
        }
    }

    public /* synthetic */ c(int i10, int i11, g gVar) {
        this((i11 & 1) != 0 ? f14834b.a() : i10);
    }

    @Override // f.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, androidx.activity.result.f input) {
        n.e(context, "context");
        n.e(input, "input");
        d.a aVar = d.f14836a;
        if (aVar.f()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.c(input.a()));
            if (!(this.f14835a <= MediaStore.getPickImagesMaxLimit())) {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f14835a);
            return intent;
        }
        if (aVar.e(context)) {
            ResolveInfo b10 = aVar.b(context);
            if (b10 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ActivityInfo activityInfo = b10.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(aVar.c(input.a()));
            intent2.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f14835a);
            return intent2;
        }
        if (aVar.d(context)) {
            ResolveInfo a10 = aVar.a(context);
            if (a10 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ActivityInfo activityInfo2 = a10.activityInfo;
            Intent intent3 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent3.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f14835a);
            return intent3;
        }
        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent4.setType(aVar.c(input.a()));
        intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (intent4.getType() != null) {
            return intent4;
        }
        intent4.setType("*/*");
        intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        return intent4;
    }

    @Override // f.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final a.C0232a<List<Uri>> b(Context context, androidx.activity.result.f input) {
        n.e(context, "context");
        n.e(input, "input");
        return null;
    }

    @Override // f.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final List<Uri> c(int i10, Intent intent) {
        List<Uri> j10;
        List<Uri> a10;
        if (!(i10 == -1)) {
            intent = null;
        }
        if (intent != null && (a10 = b.f14833a.a(intent)) != null) {
            return a10;
        }
        j10 = r.j();
        return j10;
    }
}
