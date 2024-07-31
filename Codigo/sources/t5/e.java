package t5;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import dk.r;
import dk.z;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ok.l;

/* loaded from: classes.dex */
public final class e implements PluginRegistry.ActivityResultListener {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25791a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f25792b;

    /* renamed from: c, reason: collision with root package name */
    private int f25793c;

    /* renamed from: d, reason: collision with root package name */
    private b6.e f25794d;

    /* loaded from: classes.dex */
    static final class a extends o implements l<String, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25795a = new a();

        a() {
            super(1);
        }

        @Override // ok.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String it) {
            n.e(it, "it");
            return "?";
        }
    }

    public e(Context context, Activity activity) {
        n.e(context, "context");
        this.f25791a = context;
        this.f25792b = activity;
        this.f25793c = 40069;
    }

    private final ContentResolver d() {
        ContentResolver contentResolver = this.f25791a.getContentResolver();
        n.d(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    private final void e(int i10) {
        List j10;
        MethodCall d10;
        List list;
        if (i10 != -1) {
            b6.e eVar = this.f25794d;
            if (eVar != null) {
                j10 = r.j();
                eVar.g(j10);
                return;
            }
            return;
        }
        b6.e eVar2 = this.f25794d;
        if (eVar2 == null || (d10 = eVar2.d()) == null || (list = (List) d10.argument("ids")) == null) {
            return;
        }
        n.b(list);
        b6.e eVar3 = this.f25794d;
        if (eVar3 != null) {
            eVar3.g(list);
        }
    }

    public final void a(Activity activity) {
        this.f25792b = activity;
    }

    public final void b(List<String> ids) {
        String M;
        n.e(ids, "ids");
        M = z.M(ids, ",", null, null, 0, null, a.f25795a, 30, null);
        d().delete(x5.e.f30417a.a(), "_id in (" + M + ')', (String[]) ids.toArray(new String[0]));
    }

    public final void c(List<? extends Uri> uris, b6.e resultHandler) {
        PendingIntent createDeleteRequest;
        n.e(uris, "uris");
        n.e(resultHandler, "resultHandler");
        this.f25794d = resultHandler;
        ContentResolver d10 = d();
        ArrayList arrayList = new ArrayList();
        for (Uri uri : uris) {
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        createDeleteRequest = MediaStore.createDeleteRequest(d10, arrayList);
        n.d(createDeleteRequest, "createDeleteRequest(...)");
        Activity activity = this.f25792b;
        if (activity != null) {
            activity.startIntentSenderForResult(createDeleteRequest.getIntentSender(), this.f25793c, null, 0, 0, 0);
        }
    }

    public final void f(List<? extends Uri> uris, b6.e resultHandler) {
        PendingIntent createTrashRequest;
        n.e(uris, "uris");
        n.e(resultHandler, "resultHandler");
        this.f25794d = resultHandler;
        ContentResolver d10 = d();
        ArrayList arrayList = new ArrayList();
        for (Uri uri : uris) {
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        createTrashRequest = MediaStore.createTrashRequest(d10, arrayList, true);
        n.d(createTrashRequest, "createTrashRequest(...)");
        Activity activity = this.f25792b;
        if (activity != null) {
            activity.startIntentSenderForResult(createTrashRequest.getIntentSender(), this.f25793c, null, 0, 0, 0);
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == this.f25793c) {
            e(i11);
        }
        return true;
    }
}
