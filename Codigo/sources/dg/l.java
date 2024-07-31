package dg;

import java.util.Map;
import tg.b0;

/* loaded from: classes2.dex */
public final class l implements u {

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14139a;

        static {
            int[] iArr = new int[dg.a.values().length];
            f14139a = iArr;
            try {
                iArr[dg.a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14139a[dg.a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14139a[dg.a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14139a[dg.a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14139a[dg.a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14139a[dg.a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14139a[dg.a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14139a[dg.a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14139a[dg.a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14139a[dg.a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14139a[dg.a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14139a[dg.a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14139a[dg.a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // dg.u
    public kg.b a(String str, dg.a aVar, int i10, int i11, Map<g, ?> map) {
        u lVar;
        switch (a.f14139a[aVar.ordinal()]) {
            case 1:
                lVar = new tg.l();
                break;
            case 2:
                lVar = new b0();
                break;
            case 3:
                lVar = new tg.j();
                break;
            case 4:
                lVar = new tg.u();
                break;
            case 5:
                lVar = new ch.b();
                break;
            case 6:
                lVar = new tg.f();
                break;
            case 7:
                lVar = new tg.h();
                break;
            case 8:
                lVar = new tg.d();
                break;
            case 9:
                lVar = new tg.o();
                break;
            case 10:
                lVar = new xg.d();
                break;
            case 11:
                lVar = new tg.b();
                break;
            case 12:
                lVar = new ng.b();
                break;
            case 13:
                lVar = new eg.c();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format " + aVar);
        }
        return lVar.a(str, aVar, i10, i11, map);
    }
}
