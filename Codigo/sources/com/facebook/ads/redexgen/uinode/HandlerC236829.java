package com.facebook.ads.redexgen.uinode;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.29 */
/* loaded from: assets/audience_network.dex */
public final class HandlerC236829 extends Handler {
    public static byte[] A0A;
    public static String[] A0B = {"gcJlMo3lQ2pvKCdW2p1sJtuziP4vmf3g", "UeVkxUw", "", "mK9oSbAokt8TQ0dXUmD3wWyanMNanYZS", "2sppJEO", "qJx5aWB0ThxzYc01mDGkt7c3QG7aYNlh", "VEMLINTEzdP6zY82lzj", "ayakGQouLRgcgrHEvJCPTB1FEKY99m"};
    public Messenger A00;
    public boolean A01;
    public boolean A02;
    public final ServiceConnection A03;
    public final Handler A04;
    public final Messenger A05;
    public final AbstractC4445aa A06;
    public final C4337Yn A07;
    public final C4336Ym A08;
    public final AbstractRunnableC3455KT A09;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{106, 109, 119, 124, 113, 117, 124, 98, 115, 115, 124, 108, 113, 106, 102, 109, 119, 98, 119, 106, 108, 109, 124, 104, 102, 122, 124, 75, 67, 65, 90, 75, 14, 93, 75, 92, 88, 71, 77, 75, 14, 75, 92, 92, 65, 92, 0, 1, 6, 0, 13, 19, 22, 13, 27, 22, 13, 25, 23, 11, 0, 31, 19, 1, 34, 15, 6, 19};
    }

    static {
        A07();
    }

    public HandlerC236829(C4337Yn c4337Yn, AbstractC4445aa abstractC4445aa) {
        super(Looper.getMainLooper());
        this.A04 = new Handler(Looper.getMainLooper());
        this.A03 = new ServiceConnection() { // from class: com.facebook.ads.redexgen.X.28
            public static String[] A01 = {"ngGkpjAbiDqI5fNUZWfzpCs8", "ylP2urmrE90IxK0i7RWiCIXAIvzpBsdL", "aCR9COQiNO48m8MJLWSqKzp9WCyMnAsM", "D6rFEeRczM8yhG0IGlJtc", "Gyb732F4U9eQ07zP9Trhv", "a9bhlsDHuS7BulfVZwvbOQGE", "j3d2vbC0NzSo803R6jxXYJhh", "6nNXm2ki7xJE9GeftnLn59FQ"};

            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                C4337Yn c4337Yn2;
                Handler handler;
                AbstractRunnableC3455KT abstractRunnableC3455KT;
                AbstractC4445aa abstractC4445aa2;
                C4337Yn c4337Yn3;
                c4337Yn2 = HandlerC236829.this.A07;
                c4337Yn2.A0E().AEv();
                handler = HandlerC236829.this.A04;
                abstractRunnableC3455KT = HandlerC236829.this.A09;
                handler.removeCallbacks(abstractRunnableC3455KT);
                if (iBinder != null) {
                    HandlerC236829.this.A00 = new Messenger(iBinder);
                    if (HandlerC236829.this.A02) {
                        HandlerC236829.this.A02 = false;
                        String[] strArr = A01;
                        if (strArr[2].charAt(5) == strArr[1].charAt(5)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A01;
                        strArr2[6] = "V9K6AFDlQ4uBqxixw85LWbfF";
                        strArr2[0] = "hRlL1oGWdG4Ka1T6AUojuR5g";
                        abstractC4445aa2 = HandlerC236829.this.A06;
                        abstractC4445aa2.A06();
                        return;
                    }
                    return;
                }
                c4337Yn3 = HandlerC236829.this.A07;
                c4337Yn3.A0E().AEx();
                HandlerC236829.this.A06();
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                C4337Yn c4337Yn2;
                c4337Yn2 = HandlerC236829.this.A07;
                c4337Yn2.A0E().AEw();
                if (!HandlerC236829.this.A01) {
                    return;
                }
                HandlerC236829.this.A06();
            }
        };
        this.A07 = c4337Yn;
        this.A08 = c4337Yn.A01();
        this.A05 = new Messenger(this);
        this.A06 = abstractC4445aa;
        this.A09 = new C4431aM(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A01) {
            A0C();
            if (A0B[0].charAt(10) != 'p') {
                throw new RuntimeException();
            }
            A0B[0] = "nLMfglhqWUp8cQyLFKCyrpcnfEaexaDa";
            this.A00 = null;
        }
        this.A06.A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        this.A00 = null;
        A0C();
        if (this.A06.A03().A5v() == EnumC235920.A07 || this.A06.A03().A5w() == EnumC235920.A08) {
            this.A07.A0E().AEm();
            this.A06.A0B(10, AdErrorType.INTERNAL_ERROR, null);
        } else {
            if (this.A06.A03().A5v() != EnumC235920.A06) {
                return;
            }
            this.A07.A0E().AEs();
            this.A06.A03().AG0(new AdError(AdError.REMOTE_ADS_SERVICE_ERROR, A04(26, 21, 94)));
        }
    }

    private void A08(Messenger messenger, int i10, Bundle bundle) throws RemoteException {
        Message obtain = Message.obtain((Handler) null, i10);
        obtain.replyTo = this.A05;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        obtain.getData().putString(A04(47, 13, 34), this.A06.A04());
        messenger.send(obtain);
    }

    public static void A0B(C4337Yn c4337Yn) {
        c4337Yn.A0E().AEg();
        C23742F adModel = (C23742F) c4337Yn.A0G();
        if (adModel != null) {
            Object adModelObj = adModel.A01();
            if (adModelObj != null) {
                Object adModelObj2 = adModel.A00();
                if (adModelObj2 != null) {
                    adModel.A01().onError(adModel.A00(), AdError.AD_PRESENTATION_ERROR);
                }
            }
        }
    }

    public final void A0C() {
        if (this.A01) {
            this.A07.A0E().AF3();
            this.A01 = false;
            this.A08.unbindService(this.A03);
        }
    }

    public final void A0D(C4337Yn c4337Yn, int i10) {
        this.A07.A0E().AF2();
        AdActivityIntent A04 = C3471Kj.A04(c4337Yn);
        A04.putExtra(A04(60, 8, 6), EnumC3438KB.A0E);
        A04.putExtra(A04(47, 13, 34), this.A06.A04());
        A04.putExtra(A04(0, 26, 83), i10);
        try {
            if (!C3471Kj.A0E(c4337Yn, A04)) {
                A0B(c4337Yn);
            }
        } catch (C3469Kh unused) {
            A0B(c4337Yn);
        }
    }

    public final void A0E(boolean z10) {
        boolean A04 = AbstractC23692A.A04(this.A08, z10, this.A03);
        this.A01 = A04;
        if (A04) {
            this.A07.A0E().AEi();
            this.A04.postDelayed(this.A09, AbstractC3351Ik.A00(this.A08));
        } else {
            this.A07.A0E().AEq();
            this.A02 = false;
            this.A06.A09();
        }
    }

    public final boolean A0F(int i10, Bundle bundle) {
        try {
            Messenger service = this.A00;
            if (service != null) {
                A08(service, i10, bundle);
                return true;
            }
            return false;
        } catch (RemoteException e10) {
            A0C();
            this.A07.A0E().AEl(e10);
            return false;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            if (message.what == 3) {
                return;
            }
            if (message.what == 20 || message.what == 30 || message.what == 40) {
                if (message.what == 20) {
                    this.A07.A0E().AEz();
                    AbstractC3351Ik.A06(this.A08);
                } else {
                    this.A07.A0E().AEy();
                }
                A05();
                return;
            }
            String adId = message.getData().getString(A04(47, 13, 34));
            if (!this.A06.A04().equals(adId)) {
                this.A07.A0E().AF4();
                return;
            }
            if (message.what != 2001) {
                int i10 = message.what;
                if (A0B[7].length() == 29) {
                    throw new RuntimeException();
                }
                A0B[6] = "2Ci3XLBIg3EoaCOidfd";
                if (i10 != 1011) {
                    this.A07.A0E().AEr(message.what);
                    this.A06.A0C(message);
                    return;
                }
            }
            AbstractC23692A.A02(this.A08, message);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
