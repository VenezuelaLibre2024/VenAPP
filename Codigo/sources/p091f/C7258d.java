package p091f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.activity.result.C0213f;
import ck.C2027l;
import dk.C7042z;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p091f.AbstractC7255a;

/* renamed from: f.d */
/* loaded from: classes.dex */
public class C7258d extends AbstractC7255a<C0213f, Uri> {

    /* renamed from: a */
    public static final a f16259a = new a(null);

    /* renamed from: f.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final ResolveInfo m21714a(Context context) {
            C9322n.m27781e(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        /* renamed from: b */
        public final ResolveInfo m21715b(Context context) {
            C9322n.m27781e(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        /* renamed from: c */
        public final String m21716c(f input) {
            C9322n.m27781e(input, "input");
            if (input instanceof c) {
                return "image/*";
            }
            if (input instanceof e) {
                return "video/*";
            }
            if (input instanceof d) {
                return ((d) input).m21720a();
            }
            if (input instanceof b) {
                return null;
            }
            throw new C2027l();
        }

        /* renamed from: d */
        public final boolean m21717d(Context context) {
            C9322n.m27781e(context, "context");
            return m21714a(context) != null;
        }

        /* renamed from: e */
        public final boolean m21718e(Context context) {
            C9322n.m27781e(context, "context");
            return m21715b(context) != null;
        }

        /* renamed from: f */
        public final boolean m21719f() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                return true;
            }
            return i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
        }
    }

    /* renamed from: f.d$b */
    /* loaded from: classes.dex */
    public static final class b implements f {

        /* renamed from: a */
        public static final b f16260a = new b();

        private b() {
        }
    }

    /* renamed from: f.d$c */
    /* loaded from: classes.dex */
    public static final class c implements f {

        /* renamed from: a */
        public static final c f16261a = new c();

        private c() {
        }
    }

    /* renamed from: f.d$d */
    /* loaded from: classes.dex */
    public static final class d implements f {

        /* renamed from: a */
        private final String f16262a;

        /* renamed from: a */
        public final String m21720a() {
            return this.f16262a;
        }
    }

    /* renamed from: f.d$e */
    /* loaded from: classes.dex */
    public static final class e implements f {

        /* renamed from: a */
        public static final e f16263a = new e();

        private e() {
        }
    }

    /* renamed from: f.d$f */
    /* loaded from: classes.dex */
    public interface f {
    }

    @Override // p091f.AbstractC7255a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo7118a(Context context, C0213f input) {
        ActivityInfo activityInfo;
        Intent intent;
        C9322n.m27781e(context, "context");
        C9322n.m27781e(input, "input");
        a aVar = f16259a;
        if (aVar.m21719f()) {
            Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
            intent2.setType(aVar.m21716c(input.m846a()));
            return intent2;
        }
        if (aVar.m21718e(context)) {
            ResolveInfo m21715b = aVar.m21715b(context);
            if (m21715b == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            activityInfo = m21715b.activityInfo;
            intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        } else {
            if (!aVar.m21717d(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(aVar.m21716c(input.m846a()));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            ResolveInfo m21714a = aVar.m21714a(context);
            if (m21714a == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            activityInfo = m21714a.activityInfo;
            intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
        }
        intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent.setType(aVar.m21716c(input.m846a()));
        return intent;
    }

    @Override // p091f.AbstractC7255a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC7255a.a<Uri> mo21704b(Context context, C0213f input) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(input, "input");
        return null;
    }

    @Override // p091f.AbstractC7255a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Uri mo7119c(int i10, Intent intent) {
        Object m20606H;
        if (!(i10 == -1)) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            m20606H = C7042z.m20606H(C7256b.f16256a.m21706a(intent));
            data = (Uri) m20606H;
        }
        return data;
    }
}
