package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.core.app.C0777b;
import androidx.core.content.C0854a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.journeyapps.barcodescanner.C6655a;
import com.journeyapps.barcodescanner.C6659e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p066dg.C6958s;
import p066dg.EnumC6957r;
import p162ig.C7973e;
import p162ig.C7976h;
import p162ig.C7982n;
import p163ih.C7985b;
import p163ih.InterfaceC7984a;

/* renamed from: com.journeyapps.barcodescanner.e */
/* loaded from: classes3.dex */
public class C6659e {

    /* renamed from: o */
    private static final String f14754o = "e";

    /* renamed from: p */
    private static int f14755p = 250;

    /* renamed from: a */
    private Activity f14756a;

    /* renamed from: b */
    private DecoratedBarcodeView f14757b;

    /* renamed from: h */
    private C7976h f14763h;

    /* renamed from: i */
    private C7973e f14764i;

    /* renamed from: j */
    private Handler f14765j;

    /* renamed from: m */
    private final C6655a.f f14768m;

    /* renamed from: n */
    private boolean f14769n;

    /* renamed from: c */
    private int f14758c = -1;

    /* renamed from: d */
    private boolean f14759d = false;

    /* renamed from: e */
    private boolean f14760e = true;

    /* renamed from: f */
    private String f14761f = "";

    /* renamed from: g */
    private boolean f14762g = false;

    /* renamed from: k */
    private boolean f14766k = false;

    /* renamed from: l */
    private InterfaceC7984a f14767l = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.journeyapps.barcodescanner.e$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC7984a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m19482d(C7985b c7985b) {
            C6659e.this.m19468B(c7985b);
        }

        @Override // p163ih.InterfaceC7984a
        /* renamed from: a */
        public void mo19410a(List<C6958s> list) {
        }

        @Override // p163ih.InterfaceC7984a
        /* renamed from: b */
        public void mo19411b(final C7985b c7985b) {
            C6659e.this.f14757b.m19405e();
            C6659e.this.f14764i.m24512f();
            C6659e.this.f14765j.post(new Runnable() { // from class: com.journeyapps.barcodescanner.d
                @Override // java.lang.Runnable
                public final void run() {
                    C6659e.a.this.m19482d(c7985b);
                }
            });
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.e$b */
    /* loaded from: classes3.dex */
    class b implements C6655a.f {
        b() {
        }

        @Override // com.journeyapps.barcodescanner.C6655a.f
        /* renamed from: a */
        public void mo19414a() {
        }

        @Override // com.journeyapps.barcodescanner.C6655a.f
        /* renamed from: b */
        public void mo19415b() {
            if (C6659e.this.f14766k) {
                Log.d(C6659e.f14754o, "Camera closed; finishing activity");
                C6659e.this.m19462n();
            }
        }

        @Override // com.journeyapps.barcodescanner.C6655a.f
        /* renamed from: c */
        public void mo19416c(Exception exc) {
            C6659e c6659e = C6659e.this;
            c6659e.m19473m(c6659e.f14756a.getString(C7982n.f19410c));
        }

        @Override // com.journeyapps.barcodescanner.C6655a.f
        /* renamed from: d */
        public void mo19417d() {
        }

        @Override // com.journeyapps.barcodescanner.C6655a.f
        /* renamed from: e */
        public void mo19418e() {
        }
    }

    public C6659e(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        b bVar = new b();
        this.f14768m = bVar;
        this.f14769n = false;
        this.f14756a = activity;
        this.f14757b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().m19437i(bVar);
        this.f14765j = new Handler();
        this.f14763h = new C7976h(activity, new Runnable() { // from class: ih.c
            @Override // java.lang.Runnable
            public final void run() {
                C6659e.this.m19466s();
            }
        });
        this.f14764i = new C7973e(activity);
    }

    /* renamed from: A */
    public static Intent m19450A(C7985b c7985b, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", c7985b.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", c7985b.m24529a().toString());
        byte[] m24531c = c7985b.m24531c();
        if (m24531c != null && m24531c.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", m24531c);
        }
        Map<EnumC6957r, Object> m24532d = c7985b.m24532d();
        if (m24532d != null) {
            EnumC6957r enumC6957r = EnumC6957r.UPC_EAN_EXTENSION;
            if (m24532d.containsKey(enumC6957r)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", m24532d.get(enumC6957r).toString());
            }
            Number number = (Number) m24532d.get(EnumC6957r.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str2 = (String) m24532d.get(EnumC6957r.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
            }
            Iterable iterable = (Iterable) m24532d.get(EnumC6957r.BYTE_SEGMENTS);
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

    /* renamed from: D */
    private void m19451D() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("MISSING_CAMERA_PERMISSION", true);
        this.f14756a.setResult(0, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m19462n() {
        this.f14756a.finish();
    }

    /* renamed from: o */
    private String m19463o(C7985b c7985b) {
        if (this.f14759d) {
            Bitmap m24530b = c7985b.m24530b();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.f14756a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                m24530b.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException e10) {
                Log.w(f14754o, "Unable to create temporary file and store bitmap! " + e10);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m19464q(DialogInterface dialogInterface, int i10) {
        m19462n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m19465r(DialogInterface dialogInterface) {
        m19462n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m19466s() {
        Log.d(f14754o, "Finishing due to inactivity");
        m19462n();
    }

    /* renamed from: z */
    private void m19467z() {
        if (C0854a.checkSelfPermission(this.f14756a, "android.permission.CAMERA") == 0) {
            this.f14757b.m19407g();
        } else {
            if (this.f14769n) {
                return;
            }
            C0777b.m3916g(this.f14756a, new String[]{"android.permission.CAMERA"}, f14755p);
            this.f14769n = true;
        }
    }

    /* renamed from: B */
    protected void m19468B(C7985b c7985b) {
        this.f14756a.setResult(-1, m19450A(c7985b, m19463o(c7985b)));
        m19471k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C */
    public void m19469C() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f14756a.setResult(0, intent);
        m19471k();
    }

    /* renamed from: E */
    public void m19470E(boolean z10, String str) {
        this.f14760e = z10;
        if (str == null) {
            str = "";
        }
        this.f14761f = str;
    }

    /* renamed from: k */
    protected void m19471k() {
        if (this.f14757b.getBarcodeView().m19443s()) {
            m19462n();
        } else {
            this.f14766k = true;
        }
        this.f14757b.m19405e();
        this.f14763h.m24524d();
    }

    /* renamed from: l */
    public void m19472l() {
        this.f14757b.m19403b(this.f14767l);
    }

    /* renamed from: m */
    protected void m19473m(String str) {
        if (this.f14756a.isFinishing() || this.f14762g || this.f14766k) {
            return;
        }
        if (str.isEmpty()) {
            str = this.f14756a.getString(C7982n.f19410c);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f14756a);
        builder.setTitle(this.f14756a.getString(C7982n.f19408a));
        builder.setMessage(str);
        builder.setPositiveButton(C7982n.f19409b, new DialogInterface.OnClickListener() { // from class: ih.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                C6659e.this.m19464q(dialogInterface, i10);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ih.e
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C6659e.this.m19465r(dialogInterface);
            }
        });
        builder.show();
    }

    /* renamed from: p */
    public void m19474p(Intent intent, Bundle bundle) {
        this.f14756a.getWindow().addFlags(RecognitionOptions.ITF);
        if (bundle != null) {
            this.f14758c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                m19475t();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f14757b.m19404d(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f14764i.m24513g(false);
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                m19470E(intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true), intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE"));
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.f14765j.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6659e.this.m19469C();
                    }
                }, intent.getLongExtra("TIMEOUT", 0L));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                this.f14759d = true;
            }
        }
    }

    /* renamed from: t */
    protected void m19475t() {
        if (this.f14758c == -1) {
            int rotation = this.f14756a.getWindowManager().getDefaultDisplay().getRotation();
            int i10 = this.f14756a.getResources().getConfiguration().orientation;
            int i11 = 0;
            if (i10 == 2) {
                if (rotation != 0 && rotation != 1) {
                    i11 = 8;
                }
            } else if (i10 == 1) {
                i11 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f14758c = i11;
        }
        this.f14756a.setRequestedOrientation(this.f14758c);
    }

    /* renamed from: u */
    public void m19476u() {
        this.f14762g = true;
        this.f14763h.m24524d();
        this.f14765j.removeCallbacksAndMessages(null);
    }

    /* renamed from: v */
    public void m19477v() {
        this.f14763h.m24524d();
        this.f14757b.m19406f();
    }

    /* renamed from: w */
    public void m19478w(int i10, String[] strArr, int[] iArr) {
        if (i10 == f14755p) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f14757b.m19407g();
                return;
            }
            m19451D();
            if (this.f14760e) {
                m19473m(this.f14761f);
            } else {
                m19471k();
            }
        }
    }

    /* renamed from: x */
    public void m19479x() {
        m19467z();
        this.f14763h.m24525h();
    }

    /* renamed from: y */
    public void m19480y(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f14758c);
    }
}
