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
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class b implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: t, reason: collision with root package name */
    private static final int f13528t = (FilePickerPlugin.class.hashCode() + 43) & 65535;

    /* renamed from: a, reason: collision with root package name */
    private final Activity f13529a;

    /* renamed from: b, reason: collision with root package name */
    private final d f13530b;

    /* renamed from: c, reason: collision with root package name */
    private MethodChannel.Result f13531c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13532d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13533e;

    /* renamed from: f, reason: collision with root package name */
    private String f13534f;

    /* renamed from: r, reason: collision with root package name */
    private String[] f13535r;

    /* renamed from: s, reason: collision with root package name */
    private EventChannel.EventSink f13536s;

    /* loaded from: classes3.dex */
    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f13537a;

        a(Activity activity) {
            this.f13537a = activity;
        }

        @Override // com.mr.flutter.plugin.filepicker.b.d
        public void askForPermission(String str, int i10) {
            androidx.core.app.b.g(this.f13537a, new String[]{str}, i10);
        }

        @Override // com.mr.flutter.plugin.filepicker.b.d
        public boolean isPermissionGranted(String str) {
            return androidx.core.content.a.checkSelfPermission(this.f13537a, str) == 0;
        }
    }

    /* renamed from: com.mr.flutter.plugin.filepicker.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0195b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f13538a;

        RunnableC0195b(Intent intent) {
            this.f13538a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar;
            String str;
            Uri uri;
            com.mr.flutter.plugin.filepicker.a k10;
            if (this.f13538a != null) {
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                if (this.f13538a.getClipData() != null) {
                    int itemCount = this.f13538a.getClipData().getItemCount();
                    while (i10 < itemCount) {
                        Uri uri2 = this.f13538a.getClipData().getItemAt(i10).getUri();
                        com.mr.flutter.plugin.filepicker.a k11 = com.mr.flutter.plugin.filepicker.c.k(b.this.f13529a, uri2, b.this.f13533e);
                        if (k11 != null) {
                            arrayList.add(k11);
                            Log.d("FilePickerDelegate", "[MultiFilePick] File #" + i10 + " - URI: " + uri2.getPath());
                        }
                        i10++;
                    }
                } else if (this.f13538a.getData() != null) {
                    Uri data = this.f13538a.getData();
                    if (b.this.f13534f.equals("dir")) {
                        Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(data, DocumentsContract.getTreeDocumentId(data));
                        Log.d("FilePickerDelegate", "[SingleFilePick] File URI:" + buildDocumentUriUsingTree.toString());
                        String e10 = com.mr.flutter.plugin.filepicker.c.e(buildDocumentUriUsingTree, b.this.f13529a);
                        if (e10 != null) {
                            b.this.l(e10);
                            return;
                        } else {
                            b.this.k("unknown_path", "Failed to retrieve directory path.");
                            return;
                        }
                    }
                    com.mr.flutter.plugin.filepicker.a k12 = com.mr.flutter.plugin.filepicker.c.k(b.this.f13529a, data, b.this.f13533e);
                    if (k12 != null) {
                        arrayList.add(k12);
                    }
                    if (arrayList.isEmpty()) {
                        bVar = b.this;
                        str = "Failed to retrieve path.";
                        bVar.k("unknown_path", str);
                        return;
                    } else {
                        Log.d("FilePickerDelegate", "File path:" + arrayList.toString());
                    }
                } else if (this.f13538a.getExtras() != null) {
                    Bundle extras = this.f13538a.getExtras();
                    if (!extras.keySet().contains("selectedItems")) {
                        bVar = b.this;
                        str = "Failed to retrieve path from bundle.";
                        bVar.k("unknown_path", str);
                        return;
                    }
                    ArrayList m10 = b.this.m(extras);
                    if (m10 != null) {
                        Iterator it = m10.iterator();
                        while (it.hasNext()) {
                            Parcelable parcelable = (Parcelable) it.next();
                            if ((parcelable instanceof Uri) && (k10 = com.mr.flutter.plugin.filepicker.c.k(b.this.f13529a, (uri = (Uri) parcelable), b.this.f13533e)) != null) {
                                arrayList.add(k10);
                                Log.d("FilePickerDelegate", "[MultiFilePick] File #" + i10 + " - URI: " + uri.getPath());
                            }
                            i10++;
                        }
                    }
                }
                b.this.l(arrayList);
                return;
            }
            b.this.k("unknown_activity", "Unknown activity error, please fill an issue.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13540a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Looper looper, boolean z10) {
            super(looper);
            this.f13540a = z10;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            b.this.f13536s.success(Boolean.valueOf(this.f13540a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface d {
        void askForPermission(String str, int i10);

        boolean isPermissionGranted(String str);
    }

    public b(Activity activity) {
        this(activity, null, new a(activity));
    }

    b(Activity activity, MethodChannel.Result result, d dVar) {
        this.f13532d = false;
        this.f13533e = false;
        this.f13529a = activity;
        this.f13531c = result;
        this.f13530b = dVar;
    }

    private void h() {
        this.f13531c = null;
    }

    private void i(boolean z10) {
        if (this.f13536s == null || this.f13534f.equals("dir")) {
            return;
        }
        new c(Looper.getMainLooper(), z10).obtainMessage().sendToTarget();
    }

    private static void j(MethodChannel.Result result) {
        result.error("already_active", "File picker is already active", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str, String str2) {
        if (this.f13531c == null) {
            return;
        }
        i(false);
        this.f13531c.error(str, str2, null);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(Object obj) {
        i(false);
        if (this.f13531c != null) {
            if (obj != null && !(obj instanceof String)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.mr.flutter.plugin.filepicker.a) it.next()).a());
                }
                obj = arrayList;
            }
            this.f13531c.success(obj);
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<Parcelable> m(Bundle bundle) {
        return Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("selectedItems", Parcelable.class) : bundle.getParcelableArrayList("selectedItems");
    }

    private boolean o(MethodChannel.Result result) {
        if (this.f13531c != null) {
            return false;
        }
        this.f13531c = result;
        return true;
    }

    private void p() {
        Intent intent;
        String str = this.f13534f;
        if (str == null) {
            return;
        }
        if (str.equals("dir")) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        } else {
            if (this.f13534f.equals("image/*")) {
                intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            } else {
                intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
            }
            Uri parse = Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator);
            Log.d("FilePickerDelegate", "Selected type " + this.f13534f);
            intent.setDataAndType(parse, this.f13534f);
            intent.setType(this.f13534f);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f13532d);
            intent.putExtra("multi-pick", this.f13532d);
            if (this.f13534f.contains(",")) {
                this.f13535r = this.f13534f.split(",");
            }
            String[] strArr = this.f13535r;
            if (strArr != null) {
                intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
            }
        }
        if (intent.resolveActivity(this.f13529a.getPackageManager()) != null) {
            this.f13529a.startActivityForResult(intent, f13528t);
        } else {
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            k("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    public void n(EventChannel.EventSink eventSink) {
        this.f13536s = eventSink;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (this.f13534f == null) {
            return false;
        }
        int i12 = f13528t;
        if (i10 == i12 && i11 == -1) {
            i(true);
            new Thread(new RunnableC0195b(intent)).start();
            return true;
        }
        if (i10 == i12 && i11 == 0) {
            Log.i("FilePickerDelegate", "User cancelled the picker request");
            l(null);
            return true;
        }
        if (i10 == i12) {
            k("unknown_activity", "Unknown activity error, please fill an issue.");
        }
        return false;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10 = false;
        if (f13528t != i10) {
            return false;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            z10 = true;
        }
        if (z10) {
            p();
        } else {
            k("read_external_storage_denied", "User did not allow reading external storage");
        }
        return true;
    }

    public void q(String str, boolean z10, boolean z11, String[] strArr, MethodChannel.Result result) {
        if (!o(result)) {
            j(result);
            return;
        }
        this.f13534f = str;
        this.f13532d = z10;
        this.f13533e = z11;
        this.f13535r = strArr;
        if (Build.VERSION.SDK_INT >= 33 || this.f13530b.isPermissionGranted("android.permission.READ_EXTERNAL_STORAGE")) {
            p();
        } else {
            this.f13530b.askForPermission("android.permission.READ_EXTERNAL_STORAGE", f13528t);
        }
    }
}
