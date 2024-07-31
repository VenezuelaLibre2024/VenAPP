package com.facebook.ads.redexgen.uinode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tq */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC4034Tq extends AsyncTask<String, Void, Bitmap[]> implements InterfaceC26897b {
    public static byte[] A0A;
    public static String[] A0B = {"Y", "r8ye64eLoQHeOJVpmB1uxWw1zCCHhuzX", "pvZIfONmKv3cVbimQPa9", "RLgA2SApOIsDDawooMs2KL5D8ZiCWoW1", "kM6akDIqkvY", "0vJdyNO9qrz2JF8Kt31GcmRDql8haFQB", "b8N1ZLVb0I2QrMIKflin5UtA7D7V4D", "X"};
    public int A00;
    public int A01;
    public InterfaceC3653Nh A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final WeakReference<C3651Nf> A06;
    public final WeakReference<C4337Yn> A07;
    public final WeakReference<ImageView> A08;
    public final WeakReference<ViewGroup> A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-89, -91, -82, -91, -78, -87, -93};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final Bitmap[] A03(String... strArr) {
        if (AbstractC3447KL.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            Bitmap bitmap = null;
            Bitmap bitmap2 = null;
            C4337Yn c4337Yn = this.A07.get();
            if (c4337Yn == null) {
                return new Bitmap[]{null, null};
            }
            try {
                bitmap = new C26416c(c4337Yn).A0N(str, this.A00, this.A01);
                if (bitmap != null && !this.A03) {
                    bitmap2 = AbstractC3543Lv.A01(c4337Yn, bitmap, this.A04, this.A05);
                }
            } catch (Throwable th2) {
                c4337Yn.A07().A9a(A00(0, 7, 16), AbstractC27248A.A1V, new C27258B(th2));
            }
            return new Bitmap[]{bitmap, bitmap2};
        } catch (Throwable th3) {
            AbstractC3447KL.A00(th3, this);
            return null;
        }
    }

    static {
        A01();
    }

    public AsyncTaskC4034Tq(ViewGroup viewGroup, int i10, int i11, C4337Yn c4337Yn) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c4337Yn);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new WeakReference<>(viewGroup);
        this.A04 = i10;
        this.A05 = i11;
    }

    public AsyncTaskC4034Tq(ViewGroup viewGroup, C4337Yn c4337Yn) {
        this(viewGroup, 12, 16, c4337Yn);
    }

    public AsyncTaskC4034Tq(ImageView imageView, C4337Yn c4337Yn) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c4337Yn);
        this.A06 = null;
        this.A08 = new WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public AsyncTaskC4034Tq(C3651Nf c3651Nf, C4337Yn c4337Yn) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c4337Yn);
        this.A06 = new WeakReference<>(c3651Nf);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A02(Bitmap[] result) {
        C3651Nf c3651Nf;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            WeakReference<ImageView> weakReference = this.A08;
            if (weakReference != null) {
                ImageView imageView = weakReference.get();
                if (result[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(result[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(result[0]);
                }
            }
            WeakReference<C3651Nf> weakReference2 = this.A06;
            if (weakReference2 != null && (c3651Nf = weakReference2.get()) != null) {
                c3651Nf.setImage(result[0], result[1]);
            }
            WeakReference<ViewGroup> weakReference3 = this.A09;
            if (weakReference3 != null && weakReference3.get() != null && result[1] != null) {
                AbstractC3536Lo.A0S(this.A09.get(), new BitmapDrawable(this.A07.get().getResources(), result[1]));
            }
            InterfaceC3653Nh interfaceC3653Nh = this.A02;
            if (interfaceC3653Nh != null) {
                interfaceC3653Nh.ABh(result[0] != null);
            }
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }

    public final AsyncTaskC4034Tq A04() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final AsyncTaskC4034Tq A05(int i10, int i11) {
        this.A00 = i10;
        this.A01 = i11;
        return this;
    }

    public final AsyncTaskC4034Tq A06(InterfaceC3653Nh interfaceC3653Nh) {
        this.A02 = interfaceC3653Nh;
        return this;
    }

    public final void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            InterfaceC3653Nh interfaceC3653Nh = this.A02;
            if (interfaceC3653Nh != null) {
                interfaceC3653Nh.ABh(false);
                return;
            }
            return;
        }
        executeOnExecutor(ExecutorC3541Lt.A06, str);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26897b
    public final C4337Yn A5t() {
        return this.A07.get();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap[] doInBackground(String[] strArr) {
        if (AbstractC3447KL.A02(this)) {
            return null;
        }
        try {
            return A03(strArr);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            A02(bitmapArr);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[0] = "X";
            strArr2[7] = "y";
        }
    }
}
