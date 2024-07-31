package p066dg;

import ch.C2007b;
import eg.C7188c;
import java.util.Map;
import kg.C9264b;
import ng.C9717b;
import p446xg.C12486d;
import tg.C11257b;
import tg.C11258b0;
import tg.C11260d;
import tg.C11262f;
import tg.C11264h;
import tg.C11266j;
import tg.C11268l;
import tg.C11271o;
import tg.C11277u;

/* renamed from: dg.l */
/* loaded from: classes2.dex */
public final class C6951l implements InterfaceC6960u {

    /* renamed from: dg.l$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15493a;

        static {
            int[] iArr = new int[EnumC6940a.values().length];
            f15493a = iArr;
            try {
                iArr[EnumC6940a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15493a[EnumC6940a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15493a[EnumC6940a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15493a[EnumC6940a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15493a[EnumC6940a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15493a[EnumC6940a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15493a[EnumC6940a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15493a[EnumC6940a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15493a[EnumC6940a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15493a[EnumC6940a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15493a[EnumC6940a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15493a[EnumC6940a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15493a[EnumC6940a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // p066dg.InterfaceC6960u
    /* renamed from: a */
    public C9264b mo10303a(String str, EnumC6940a enumC6940a, int i10, int i11, Map<EnumC6946g, ?> map) {
        InterfaceC6960u c11268l;
        switch (a.f15493a[enumC6940a.ordinal()]) {
            case 1:
                c11268l = new C11268l();
                break;
            case 2:
                c11268l = new C11258b0();
                break;
            case 3:
                c11268l = new C11266j();
                break;
            case 4:
                c11268l = new C11277u();
                break;
            case 5:
                c11268l = new C2007b();
                break;
            case 6:
                c11268l = new C11262f();
                break;
            case 7:
                c11268l = new C11264h();
                break;
            case 8:
                c11268l = new C11260d();
                break;
            case 9:
                c11268l = new C11271o();
                break;
            case 10:
                c11268l = new C12486d();
                break;
            case 11:
                c11268l = new C11257b();
                break;
            case 12:
                c11268l = new C9717b();
                break;
            case 13:
                c11268l = new C7188c();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format " + enumC6940a);
        }
        return c11268l.mo10303a(str, enumC6940a, i10, i11, map);
    }
}
