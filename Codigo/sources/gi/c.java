package gi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import io.flutter.plugin.common.MethodCall;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f16272a;

    /* renamed from: b, reason: collision with root package name */
    private MethodCall f16273b;

    public c(Context context) {
        this.f16272a = context;
    }

    private boolean a() {
        return androidx.core.content.a.checkSelfPermission(this.f16272a, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    private void b() {
        Context context = this.f16272a;
        if (context instanceof Activity) {
            androidx.core.app.b.g((Activity) context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 100);
        }
    }

    private void e(Intent intent, String str, ArrayList<Uri> arrayList) {
        Intent createChooser = Intent.createChooser(intent, str);
        e.b(this.f16272a, arrayList, createChooser);
        Context context = this.f16272a;
        if (!(context instanceof Activity)) {
            createChooser.addFlags(268435456);
            context = this.f16272a;
        }
        context.startActivity(createChooser);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        d(this.f16273b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(MethodCall methodCall) {
        if (methodCall == null) {
            return;
        }
        this.f16273b = methodCall;
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
            if (e.e(list) && !a()) {
                b();
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(e.a(this.f16272a, new File((String) it.next())));
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
        e(intent, str2, arrayList2);
    }
}
