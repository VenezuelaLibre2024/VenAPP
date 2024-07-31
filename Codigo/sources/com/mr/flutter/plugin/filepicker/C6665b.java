package com.mr.flutter.plugin.filepicker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import androidx.core.app.C0777b;
import androidx.core.content.C0854a;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.mr.flutter.plugin.filepicker.b */
/* loaded from: classes3.dex */
public class C6665b implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: t */
    private static final int f14820t = (FilePickerPlugin.class.hashCode() + 43) & 65535;

    /* renamed from: a */
    private final Activity f14821a;

    /* renamed from: b */
    private final d f14822b;

    /* renamed from: c */
    private MethodChannel.Result f14823c;

    /* renamed from: d */
    private boolean f14824d;

    /* renamed from: e */
    private boolean f14825e;

    /* renamed from: f */
    private String f14826f;

    /* renamed from: r */
    private String[] f14827r;

    /* renamed from: s */
    private EventChannel.EventSink f14828s;

    /* renamed from: com.mr.flutter.plugin.filepicker.b$a */
    /* loaded from: classes3.dex */
    class a implements d {

        /* renamed from: a */
        final /* synthetic */ Activity f14829a;

        a(Activity activity) {
            this.f14829a = activity;
        }

        @Override // com.mr.flutter.plugin.filepicker.C6665b.d
        public void askForPermission(String str, int i10) {
            C0777b.m3916g(this.f14829a, new String[]{str}, i10);
        }

        @Override // com.mr.flutter.plugin.filepicker.C6665b.d
        public boolean isPermissionGranted(String str) {
            return C0854a.checkSelfPermission(this.f14829a, str) == 0;
        }
    }

    /* renamed from: com.mr.flutter.plugin.filepicker.b$b */
    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Intent f14830a;

        b(Intent intent) {
            this.f14830a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6665b c6665b;
            String str;
            Uri uri;
            C6664a m19533k;
            if (this.f14830a != null) {
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                if (this.f14830a.getClipData() != null) {
                    int itemCount = this.f14830a.getClipData().getItemCount();
                    while (i10 < itemCount) {
                        Uri uri2 = this.f14830a.getClipData().getItemAt(i10).getUri();
                        C6664a m19533k2 = C6666c.m19533k(C6665b.this.f14821a, uri2, C6665b.this.f14825e);
                        if (m19533k2 != null) {
                            arrayList.add(m19533k2);
                            Log.d("FilePickerDelegate", "[MultiFilePick] File #" + i10 + " - URI: " + uri2.getPath());
                        }
                        i10++;
                    }
                } else if (this.f14830a.getData() != null) {
                    Uri data = this.f14830a.getData();
                    if (C6665b.this.f14826f.equals("dir")) {
                        Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(data, DocumentsContract.getTreeDocumentId(data));
                        Log.d("FilePickerDelegate", "[SingleFilePick] File URI:" + buildDocumentUriUsingTree.toString());
                        String m19527e = C6666c.m19527e(buildDocumentUriUsingTree, C6665b.this.f14821a);
                        if (m19527e != null) {
                            C6665b.this.m19517l(m19527e);
                            return;
                        } else {
                            C6665b.this.m19516k("unknown_path", "Failed to retrieve directory path.");
                            return;
                        }
                    }
                    C6664a m19533k3 = C6666c.m19533k(C6665b.this.f14821a, data, C6665b.this.f14825e);
                    if (m19533k3 != null) {
                        arrayList.add(m19533k3);
                    }
                    if (arrayList.isEmpty()) {
                        c6665b = C6665b.this;
                        str = "Failed to retrieve path.";
                        c6665b.m19516k("unknown_path", str);
                        return;
                    } else {
                        Log.d("FilePickerDelegate", "File path:" + arrayList.toString());
                    }
                } else if (this.f14830a.getExtras() != null) {
                    Bundle extras = this.f14830a.getExtras();
                    if (!extras.keySet().contains("selectedItems")) {
                        c6665b = C6665b.this;
                        str = "Failed to retrieve path from bundle.";
                        c6665b.m19516k("unknown_path", str);
                        return;
                    }
                    ArrayList m19518m = C6665b.this.m19518m(extras);
                    if (m19518m != null) {
                        Iterator it = m19518m.iterator();
                        while (it.hasNext()) {
                            Parcelable parcelable = (Parcelable) it.next();
                            if ((parcelable instanceof Uri) && (m19533k = C6666c.m19533k(C6665b.this.f14821a, (uri = (Uri) parcelable), C6665b.this.f14825e)) != null) {
                                arrayList.add(m19533k);
                                Log.d("FilePickerDelegate", "[MultiFilePick] File #" + i10 + " - URI: " + uri.getPath());
                            }
                            i10++;
                        }
                    }
                }
                C6665b.this.m19517l(arrayList);
                return;
            }
            C6665b.this.m19516k("unknown_activity", "Unknown activity error, please fill an issue.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mr.flutter.plugin.filepicker.b$c */
    /* loaded from: classes3.dex */
    public class c extends Handler {

        /* renamed from: a */
        final /* synthetic */ boolean f14832a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Looper looper, boolean z10) {
            super(looper);
            this.f14832a = z10;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C6665b.this.f14828s.success(Boolean.valueOf(this.f14832a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mr.flutter.plugin.filepicker.b$d */
    /* loaded from: classes3.dex */
    public interface d {
        void askForPermission(String str, int i10);

        boolean isPermissionGranted(String str);
    }

    public C6665b(Activity activity) {
        this(activity, null, new a(activity));
    }

    C6665b(Activity activity, MethodChannel.Result result, d dVar) {
        this.f14824d = false;
        this.f14825e = false;
        this.f14821a = activity;
        this.f14823c = result;
        this.f14822b = dVar;
    }

    /* renamed from: h */
    private void m19513h() {
        this.f14823c = null;
    }

    /* renamed from: i */
    private void m19514i(boolean z10) {
        if (this.f14828s == null || this.f14826f.equals("dir")) {
            return;
        }
        new c(Looper.getMainLooper(), z10).obtainMessage().sendToTarget();
    }

    /* renamed from: j */
    private static void m19515j(MethodChannel.Result result) {
        result.error("already_active", "File picker is already active", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m19516k(String str, String str2) {
        if (this.f14823c == null) {
            return;
        }
        m19514i(false);
        this.f14823c.error(str, str2, null);
        m19513h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m19517l(Object obj) {
        m19514i(false);
        if (this.f14823c != null) {
            if (obj != null && !(obj instanceof String)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(((C6664a) it.next()).m19499a());
                }
                obj = arrayList;
            }
            this.f14823c.success(obj);
            m19513h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public ArrayList<Parcelable> m19518m(Bundle bundle) {
        return Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("selectedItems", Parcelable.class) : bundle.getParcelableArrayList("selectedItems");
    }

    /* renamed from: o */
    private boolean m19519o(MethodChannel.Result result) {
        if (this.f14823c != null) {
            return false;
        }
        this.f14823c = result;
        return true;
    }

    /* renamed from: p */
    private void m19520p() {
        Intent intent;
        String str = this.f14826f;
        if (str == null) {
            return;
        }
        if (str.equals("dir")) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        } else {
            if (this.f14826f.equals("image/*")) {
                intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            } else {
                intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
            }
            Uri parse = Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator);
            Log.d("FilePickerDelegate", "Selected type " + this.f14826f);
            intent.setDataAndType(parse, this.f14826f);
            intent.setType(this.f14826f);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f14824d);
            intent.putExtra("multi-pick", this.f14824d);
            if (this.f14826f.contains(",")) {
                this.f14827r = this.f14826f.split(",");
            }
            String[] strArr = this.f14827r;
            if (strArr != null) {
                intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
            }
        }
        if (intent.resolveActivity(this.f14821a.getPackageManager()) != null) {
            this.f14821a.startActivityForResult(intent, f14820t);
        } else {
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            m19516k("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    /* renamed from: n */
    public void m19521n(EventChannel.EventSink eventSink) {
        this.f14828s = eventSink;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (this.f14826f == null) {
            return false;
        }
        int i12 = f14820t;
        if (i10 == i12 && i11 == -1) {
            m19514i(true);
            new Thread(new b(intent)).start();
            return true;
        }
        if (i10 == i12 && i11 == 0) {
            Log.i("FilePickerDelegate", "User cancelled the picker request");
            m19517l(null);
            return true;
        }
        if (i10 == i12) {
            m19516k("unknown_activity", "Unknown activity error, please fill an issue.");
        }
        return false;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10 = false;
        if (f14820t != i10) {
            return false;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            z10 = true;
        }
        if (z10) {
            m19520p();
        } else {
            m19516k("read_external_storage_denied", "User did not allow reading external storage");
        }
        return true;
    }

    /* renamed from: q */
    public void m19522q(String str, boolean z10, boolean z11, String[] strArr, MethodChannel.Result result) {
        if (!m19519o(result)) {
            m19515j(result);
            return;
        }
        this.f14826f = str;
        this.f14824d = z10;
        this.f14825e = z11;
        this.f14827r = strArr;
        if (Build.VERSION.SDK_INT >= 33 || this.f14822b.isPermissionGranted("android.permission.READ_EXTERNAL_STORAGE")) {
            m19520p();
        } else {
            this.f14822b.askForPermission("android.permission.READ_EXTERNAL_STORAGE", f14820t);
        }
    }
}
