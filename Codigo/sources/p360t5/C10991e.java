package p360t5;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import dk.C7031r;
import dk.C7042z;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p024b6.C1666e;
import p280ok.InterfaceC9998l;
import p435x5.InterfaceC12289e;

/* renamed from: t5.e */
/* loaded from: classes.dex */
public final class C10991e implements PluginRegistry.ActivityResultListener {

    /* renamed from: a */
    private final Context f27935a;

    /* renamed from: b */
    private Activity f27936b;

    /* renamed from: c */
    private int f27937c;

    /* renamed from: d */
    private C1666e f27938d;

    /* renamed from: t5.e$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC9323o implements InterfaceC9998l<String, CharSequence> {

        /* renamed from: a */
        public static final a f27939a = new a();

        a() {
            super(1);
        }

        @Override // p280ok.InterfaceC9998l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(String it) {
            C9322n.m27781e(it, "it");
            return "?";
        }
    }

    public C10991e(Context context, Activity activity) {
        C9322n.m27781e(context, "context");
        this.f27935a = context;
        this.f27936b = activity;
        this.f27937c = 40069;
    }

    /* renamed from: d */
    private final ContentResolver m33577d() {
        ContentResolver contentResolver = this.f27935a.getContentResolver();
        C9322n.m27780d(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    /* renamed from: e */
    private final void m33578e(int i10) {
        List m20582j;
        MethodCall m9146d;
        List list;
        if (i10 != -1) {
            C1666e c1666e = this.f27938d;
            if (c1666e != null) {
                m20582j = C7031r.m20582j();
                c1666e.m9148g(m20582j);
                return;
            }
            return;
        }
        C1666e c1666e2 = this.f27938d;
        if (c1666e2 == null || (m9146d = c1666e2.m9146d()) == null || (list = (List) m9146d.argument("ids")) == null) {
            return;
        }
        C9322n.m27778b(list);
        C1666e c1666e3 = this.f27938d;
        if (c1666e3 != null) {
            c1666e3.m9148g(list);
        }
    }

    /* renamed from: a */
    public final void m33579a(Activity activity) {
        this.f27936b = activity;
    }

    /* renamed from: b */
    public final void m33580b(List<String> ids) {
        String m20611M;
        C9322n.m27781e(ids, "ids");
        m20611M = C7042z.m20611M(ids, ",", null, null, 0, null, a.f27939a, 30, null);
        m33577d().delete(InterfaceC12289e.f32929a.m39634a(), "_id in (" + m20611M + ')', (String[]) ids.toArray(new String[0]));
    }

    /* renamed from: c */
    public final void m33581c(List<? extends Uri> uris, C1666e resultHandler) {
        PendingIntent createDeleteRequest;
        C9322n.m27781e(uris, "uris");
        C9322n.m27781e(resultHandler, "resultHandler");
        this.f27938d = resultHandler;
        ContentResolver m33577d = m33577d();
        ArrayList arrayList = new ArrayList();
        for (Uri uri : uris) {
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        createDeleteRequest = MediaStore.createDeleteRequest(m33577d, arrayList);
        C9322n.m27780d(createDeleteRequest, "createDeleteRequest(...)");
        Activity activity = this.f27936b;
        if (activity != null) {
            activity.startIntentSenderForResult(createDeleteRequest.getIntentSender(), this.f27937c, null, 0, 0, 0);
        }
    }

    /* renamed from: f */
    public final void m33582f(List<? extends Uri> uris, C1666e resultHandler) {
        PendingIntent createTrashRequest;
        C9322n.m27781e(uris, "uris");
        C9322n.m27781e(resultHandler, "resultHandler");
        this.f27938d = resultHandler;
        ContentResolver m33577d = m33577d();
        ArrayList arrayList = new ArrayList();
        for (Uri uri : uris) {
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        createTrashRequest = MediaStore.createTrashRequest(m33577d, arrayList, true);
        C9322n.m27780d(createTrashRequest, "createTrashRequest(...)");
        Activity activity = this.f27936b;
        if (activity != null) {
            activity.startIntentSenderForResult(createTrashRequest.getIntentSender(), this.f27937c, null, 0, 0, 0);
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == this.f27937c) {
            m33578e(i11);
        }
        return true;
    }
}
