package com.facebook.ads.redexgen.uinode;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2C */
/* loaded from: assets/audience_network.dex */
public final class HandlerC23712C extends Handler {
    public static byte[] A07;
    public static String[] A08 = {"7XGwSkVk3T00tnH9cVPKelrEGcawiCjw", "CQOuonMXQSYezZedNwAjlRkGSLi3aOjj", "mesEj11OvP9", "VZOpRMX1bgsh5uSD6zrhQF9CMqqU", "qOEuTvvHdf1ojQl77Cm2nWjluxHjpHjj", "MJ8oyn1cMPaioU5SW8VDhXvuoMQhG6hY", "cRCjMWliQ8bJ7V8UELoizUhtI", "6BrNpk2twP0gV2txjXjpJVsF16rKzLtO"};
    public Messenger A00;
    public boolean A01;
    public final ServiceConnection A02;
    public final Handler A03;
    public final Messenger A04;
    public final C4336Ym A05;
    public final AbstractRunnableC3455KT A06;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A07 = new byte[]{-121, -102, -104, -102, -98, -85, -102, -103, 85, -99, -106, -93, -103, -88, -99, -106, -96, -102, 85, -101, -106, -98, -95, -102, -103, 97, 85, -104, -92, -103, -102, 111, 85};
        if (A08[7].length() != 32) {
            throw new RuntimeException();
        }
        A08[2] = "iPGKfbxDLhp";
    }

    static {
        A06();
    }

    public HandlerC23712C(C4336Ym c4336Ym) {
        super(Looper.getMainLooper());
        this.A03 = new Handler(Looper.getMainLooper());
        this.A02 = new ServiceConnection() { // from class: com.facebook.ads.redexgen.X.2B
            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Handler handler;
                AbstractRunnableC3455KT abstractRunnableC3455KT;
                Messenger messenger;
                handler = HandlerC23712C.this.A03;
                abstractRunnableC3455KT = HandlerC23712C.this.A06;
                handler.removeCallbacks(abstractRunnableC3455KT);
                HandlerC23712C.this.A00 = new Messenger(iBinder);
                try {
                    HandlerC23712C handlerC23712C = HandlerC23712C.this;
                    messenger = handlerC23712C.A00;
                    handlerC23712C.A07(messenger);
                } catch (RemoteException unused) {
                }
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                HandlerC23712C.this.A09();
            }
        };
        this.A05 = c4336Ym;
        this.A04 = new Messenger(this);
        this.A06 = new C4429aK(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(Messenger messenger) throws RemoteException {
        Message obtain = Message.obtain((Handler) null, 1);
        obtain.replyTo = this.A04;
        obtain.setData(AbstractC23802L.A00(this.A05));
        messenger.send(obtain);
    }

    public final void A09() {
        if (this.A01) {
            this.A01 = false;
            this.A05.unbindService(this.A02);
            this.A00 = null;
        }
    }

    public final void A0A(boolean z10) {
        boolean A04 = AbstractC23692A.A04(this.A05, z10, this.A02);
        this.A01 = A04;
        if (A04) {
            this.A03.postDelayed(this.A06, AbstractC3351Ik.A01(this.A05));
        } else {
            AbstractC27508b.A04(this.A05);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            if (message.what == 2) {
                AbstractC23692A.A02(this.A05, message);
                return;
            }
            if (message.what != 20 && message.what != 40) {
                int i10 = message.what;
                String[] strArr = A08;
                if (strArr[3].length() == strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[0] = "5lsY8x9xkiXLhEKEYZZQTOwXL0bMYXCm";
                strArr2[4] = "auOM5sEdxjbOnZ2p0JjStgKAzUZMZJar";
                if (i10 != 30) {
                    return;
                }
            }
            if (message.what == 20) {
                AbstractC3351Ik.A06(this.A05);
            }
            String str = A05(0, 33, 36) + message.what;
            AbstractC27508b.A04(this.A05);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
