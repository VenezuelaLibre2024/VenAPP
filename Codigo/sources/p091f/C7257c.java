package p091f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.activity.result.C0213f;
import com.google.android.gms.common.api.C5101a;
import dk.C7031r;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p091f.AbstractC7255a;
import p091f.C7258d;

/* renamed from: f.c */
/* loaded from: classes.dex */
public class C7257c extends AbstractC7255a<C0213f, List<Uri>> {

    /* renamed from: b */
    public static final a f16257b = new a(null);

    /* renamed from: a */
    private final int f16258a;

    /* renamed from: f.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final int m21710a() {
            return C7258d.f16259a.m21719f() ? MediaStore.getPickImagesMaxLimit() : C5101a.e.API_PRIORITY_OTHER;
        }
    }

    public C7257c() {
        this(0, 1, null);
    }

    public C7257c(int i10) {
        this.f16258a = i10;
        if (!(i10 > 1)) {
            throw new IllegalArgumentException("Max items must be higher than 1".toString());
        }
    }

    public /* synthetic */ C7257c(int i10, int i11, C9315g c9315g) {
        this((i11 & 1) != 0 ? f16257b.m21710a() : i10);
    }

    @Override // p091f.AbstractC7255a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo7118a(Context context, C0213f input) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(input, "input");
        C7258d.a aVar = C7258d.f16259a;
        if (aVar.m21719f()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.m21716c(input.m846a()));
            if (!(this.f16258a <= MediaStore.getPickImagesMaxLimit())) {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f16258a);
            return intent;
        }
        if (aVar.m21718e(context)) {
            ResolveInfo m21715b = aVar.m21715b(context);
            if (m21715b == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ActivityInfo activityInfo = m21715b.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(aVar.m21716c(input.m846a()));
            intent2.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f16258a);
            return intent2;
        }
        if (aVar.m21717d(context)) {
            ResolveInfo m21714a = aVar.m21714a(context);
            if (m21714a == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ActivityInfo activityInfo2 = m21714a.activityInfo;
            Intent intent3 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent3.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f16258a);
            return intent3;
        }
        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent4.setType(aVar.m21716c(input.m846a()));
        intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (intent4.getType() != null) {
            return intent4;
        }
        intent4.setType("*/*");
        intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        return intent4;
    }

    @Override // p091f.AbstractC7255a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC7255a.a<List<Uri>> mo21704b(Context context, C0213f input) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(input, "input");
        return null;
    }

    @Override // p091f.AbstractC7255a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final List<Uri> mo7119c(int i10, Intent intent) {
        List<Uri> m20582j;
        List<Uri> m21706a;
        if (!(i10 == -1)) {
            intent = null;
        }
        if (intent != null && (m21706a = C7256b.f16256a.m21706a(intent)) != null) {
            return m21706a;
        }
        m20582j = C7031r.m20582j();
        return m20582j;
    }
}
