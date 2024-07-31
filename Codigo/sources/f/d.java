package f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import ck.l;
import dk.z;
import f.a;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public class d extends f.a<androidx.activity.result.f, Uri> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14836a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final ResolveInfo a(Context context) {
            n.e(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        public final ResolveInfo b(Context context) {
            n.e(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public final String c(f input) {
            n.e(input, "input");
            if (input instanceof c) {
                return "image/*";
            }
            if (input instanceof e) {
                return "video/*";
            }
            if (input instanceof C0233d) {
                return ((C0233d) input).a();
            }
            if (input instanceof b) {
                return null;
            }
            throw new l();
        }

        public final boolean d(Context context) {
            n.e(context, "context");
            return a(context) != null;
        }

        public final boolean e(Context context) {
            n.e(context, "context");
            return b(context) != null;
        }

        public final boolean f() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                return true;
            }
            return i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f14837a = new b();

        private b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f14838a = new c();

        private c() {
        }
    }

    /* renamed from: f.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0233d implements f {

        /* renamed from: a, reason: collision with root package name */
        private final String f14839a;

        public final String a() {
            return this.f14839a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        public static final e f14840a = new e();

        private e() {
        }
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    @Override // f.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, androidx.activity.result.f input) {
        ActivityInfo activityInfo;
        Intent intent;
        n.e(context, "context");
        n.e(input, "input");
        a aVar = f14836a;
        if (aVar.f()) {
            Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
            intent2.setType(aVar.c(input.a()));
            return intent2;
        }
        if (aVar.e(context)) {
            ResolveInfo b10 = aVar.b(context);
            if (b10 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            activityInfo = b10.activityInfo;
            intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        } else {
            if (!aVar.d(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(aVar.c(input.a()));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            ResolveInfo a10 = aVar.a(context);
            if (a10 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            activityInfo = a10.activityInfo;
            intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
        }
        intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent.setType(aVar.c(input.a()));
        return intent;
    }

    @Override // f.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final a.C0232a<Uri> b(Context context, androidx.activity.result.f input) {
        n.e(context, "context");
        n.e(input, "input");
        return null;
    }

    @Override // f.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Uri c(int i10, Intent intent) {
        Object H;
        if (!(i10 == -1)) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            H = z.H(f.b.f14833a.a(intent));
            data = (Uri) H;
        }
        return data;
    }
}
