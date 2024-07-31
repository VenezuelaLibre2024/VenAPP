package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.journeyapps.barcodescanner.a;
import com.journeyapps.barcodescanner.e;
import dg.r;
import dg.s;
import ig.h;
import ig.n;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: o, reason: collision with root package name */
    private static final String f13462o = "e";

    /* renamed from: p, reason: collision with root package name */
    private static int f13463p = 250;

    /* renamed from: a, reason: collision with root package name */
    private Activity f13464a;

    /* renamed from: b, reason: collision with root package name */
    private DecoratedBarcodeView f13465b;

    /* renamed from: h, reason: collision with root package name */
    private h f13471h;

    /* renamed from: i, reason: collision with root package name */
    private ig.e f13472i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f13473j;

    /* renamed from: m, reason: collision with root package name */
    private final a.f f13476m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f13477n;

    /* renamed from: c, reason: collision with root package name */
    private int f13466c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13467d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13468e = true;

    /* renamed from: f, reason: collision with root package name */
    private String f13469f = "";

    /* renamed from: g, reason: collision with root package name */
    private boolean f13470g = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f13474k = false;

    /* renamed from: l, reason: collision with root package name */
    private ih.a f13475l = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ih.a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(ih.b bVar) {
            e.this.B(bVar);
        }

        @Override // ih.a
        public void a(List<s> list) {
        }

        @Override // ih.a
        public void b(final ih.b bVar) {
            e.this.f13465b.e();
            e.this.f13472i.f();
            e.this.f13473j.post(new Runnable() { // from class: com.journeyapps.barcodescanner.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.a.this.d(bVar);
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    class b implements a.f {
        b() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void a() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void b() {
            if (e.this.f13474k) {
                Log.d(e.f13462o, "Camera closed; finishing activity");
                e.this.n();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void c(Exception exc) {
            e eVar = e.this;
            eVar.m(eVar.f13464a.getString(n.f17747c));
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void d() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void e() {
        }
    }

    public e(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        b bVar = new b();
        this.f13476m = bVar;
        this.f13477n = false;
        this.f13464a = activity;
        this.f13465b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().i(bVar);
        this.f13473j = new Handler();
        this.f13471h = new h(activity, new Runnable() { // from class: ih.c
            @Override // java.lang.Runnable
            public final void run() {
                com.journeyapps.barcodescanner.e.this.s();
            }
        });
        this.f13472i = new ig.e(activity);
    }

    public static Intent A(ih.b bVar, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", bVar.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", bVar.a().toString());
        byte[] c10 = bVar.c();
        if (c10 != null && c10.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", c10);
        }
        Map<r, Object> d10 = bVar.d();
        if (d10 != null) {
            r rVar = r.UPC_EAN_EXTENSION;
            if (d10.containsKey(rVar)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", d10.get(rVar).toString());
            }
            Number number = (Number) d10.get(r.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str2 = (String) d10.get(r.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
            }
            Iterable iterable = (Iterable) d10.get(r.BYTE_SEGMENTS);
            if (iterable != null) {
                Iterator it = iterable.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i10, (byte[]) it.next());
                    i10++;
                }
            }
        }
        if (str != null) {
            intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
        }
        return intent;
    }

    private void D() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("MISSING_CAMERA_PERMISSION", true);
        this.f13464a.setResult(0, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.f13464a.finish();
    }

    private String o(ih.b bVar) {
        if (this.f13467d) {
            Bitmap b10 = bVar.b();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.f13464a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                b10.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException e10) {
                Log.w(f13462o, "Unable to create temporary file and store bitmap! " + e10);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(DialogInterface dialogInterface, int i10) {
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(DialogInterface dialogInterface) {
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        Log.d(f13462o, "Finishing due to inactivity");
        n();
    }

    private void z() {
        if (androidx.core.content.a.checkSelfPermission(this.f13464a, "android.permission.CAMERA") == 0) {
            this.f13465b.g();
        } else {
            if (this.f13477n) {
                return;
            }
            androidx.core.app.b.g(this.f13464a, new String[]{"android.permission.CAMERA"}, f13463p);
            this.f13477n = true;
        }
    }

    protected void B(ih.b bVar) {
        this.f13464a.setResult(-1, A(bVar, o(bVar)));
        k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void C() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f13464a.setResult(0, intent);
        k();
    }

    public void E(boolean z10, String str) {
        this.f13468e = z10;
        if (str == null) {
            str = "";
        }
        this.f13469f = str;
    }

    protected void k() {
        if (this.f13465b.getBarcodeView().s()) {
            n();
        } else {
            this.f13474k = true;
        }
        this.f13465b.e();
        this.f13471h.d();
    }

    public void l() {
        this.f13465b.b(this.f13475l);
    }

    protected void m(String str) {
        if (this.f13464a.isFinishing() || this.f13470g || this.f13474k) {
            return;
        }
        if (str.isEmpty()) {
            str = this.f13464a.getString(n.f17747c);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f13464a);
        builder.setTitle(this.f13464a.getString(n.f17745a));
        builder.setMessage(str);
        builder.setPositiveButton(n.f17746b, new DialogInterface.OnClickListener() { // from class: ih.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                com.journeyapps.barcodescanner.e.this.q(dialogInterface, i10);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ih.e
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.journeyapps.barcodescanner.e.this.r(dialogInterface);
            }
        });
        builder.show();
    }

    public void p(Intent intent, Bundle bundle) {
        this.f13464a.getWindow().addFlags(RecognitionOptions.ITF);
        if (bundle != null) {
            this.f13466c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                t();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f13465b.d(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f13472i.g(false);
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                E(intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true), intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE"));
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.f13473j.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.C();
                    }
                }, intent.getLongExtra("TIMEOUT", 0L));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                this.f13467d = true;
            }
        }
    }

    protected void t() {
        if (this.f13466c == -1) {
            int rotation = this.f13464a.getWindowManager().getDefaultDisplay().getRotation();
            int i10 = this.f13464a.getResources().getConfiguration().orientation;
            int i11 = 0;
            if (i10 == 2) {
                if (rotation != 0 && rotation != 1) {
                    i11 = 8;
                }
            } else if (i10 == 1) {
                i11 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f13466c = i11;
        }
        this.f13464a.setRequestedOrientation(this.f13466c);
    }

    public void u() {
        this.f13470g = true;
        this.f13471h.d();
        this.f13473j.removeCallbacksAndMessages(null);
    }

    public void v() {
        this.f13471h.d();
        this.f13465b.f();
    }

    public void w(int i10, String[] strArr, int[] iArr) {
        if (i10 == f13463p) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f13465b.g();
                return;
            }
            D();
            if (this.f13468e) {
                m(this.f13469f);
            } else {
                k();
            }
        }
    }

    public void x() {
        z();
        this.f13471h.h();
    }

    public void y(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f13466c);
    }
}
