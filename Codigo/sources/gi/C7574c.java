package gi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.core.app.C0777b;
import androidx.core.content.C0854a;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import io.flutter.plugin.common.MethodCall;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: gi.c */
/* loaded from: classes3.dex */
public class C7574c {

    /* renamed from: a */
    private Context f17909a;

    /* renamed from: b */
    private MethodCall f17910b;

    public C7574c(Context context) {
        this.f17909a = context;
    }

    /* renamed from: a */
    private boolean m23008a() {
        return C0854a.checkSelfPermission(this.f17909a, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: b */
    private void m23009b() {
        Context context = this.f17909a;
        if (context instanceof Activity) {
            C0777b.m3916g((Activity) context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 100);
        }
    }

    /* renamed from: e */
    private void m23010e(Intent intent, String str, ArrayList<Uri> arrayList) {
        Intent createChooser = Intent.createChooser(intent, str);
        C7576e.m23016b(this.f17909a, arrayList, createChooser);
        Context context = this.f17909a;
        if (!(context instanceof Activity)) {
            createChooser.addFlags(268435456);
            context = this.f17909a;
        }
        context.startActivity(createChooser);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m23011c() {
        m23012d(this.f17910b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m23012d(MethodCall methodCall) {
        if (methodCall == null) {
            return;
        }
        this.f17910b = methodCall;
        List list = (List) methodCall.argument("list");
        String str = (String) methodCall.argument("type");
        String str2 = (String) methodCall.argument("sharePanelTitle");
        String str3 = (String) methodCall.argument("subject");
        ArrayList arrayList = (ArrayList) methodCall.argument("extraTexts");
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Non-empty list expected");
        }
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        Intent intent = new Intent();
        intent.addFlags(1);
        intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str3);
        if ("text".equals(str)) {
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", (String) list.get(0));
            intent.setType("text/plain");
        } else {
            if (C7576e.m23019e(list) && !m23008a()) {
                m23009b();
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(C7576e.m23015a(this.f17909a, new File((String) it.next())));
            }
            intent.setType("image".equals(str) ? "image/*" : "video".equals(str) ? "video/*" : "audio".equals(str) ? "audio/*" : "application/*");
            if (arrayList2.size() == 1) {
                intent.putExtra("android.intent.extra.TEXT", (arrayList == null || arrayList.isEmpty()) ? null : (String) arrayList.get(0));
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", arrayList2.get(0));
            } else {
                intent.putExtra("android.intent.extra.TEXT", arrayList);
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList2);
            }
        }
        m23010e(intent, str2, arrayList2);
    }
}
