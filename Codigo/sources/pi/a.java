package pi;

import com.google.android.libraries.barhopper.RecognitionOptions;
import kotlin.jvm.internal.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ ik.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final C0382a Companion;
    private final int intValue;
    public static final a UNKNOWN = new a("UNKNOWN", 0, -1);
    public static final a ALL_FORMATS = new a("ALL_FORMATS", 1, 0);
    public static final a CODE_128 = new a("CODE_128", 2, 1);
    public static final a CODE_39 = new a("CODE_39", 3, 2);
    public static final a CODE_93 = new a("CODE_93", 4, 4);
    public static final a CODABAR = new a("CODABAR", 5, 8);
    public static final a DATA_MATRIX = new a("DATA_MATRIX", 6, 16);
    public static final a EAN_13 = new a("EAN_13", 7, 32);
    public static final a EAN_8 = new a("EAN_8", 8, 64);
    public static final a ITF = new a("ITF", 9, RecognitionOptions.ITF);
    public static final a QR_CODE = new a("QR_CODE", 10, RecognitionOptions.QR_CODE);
    public static final a UPC_A = new a("UPC_A", 11, RecognitionOptions.UPC_A);
    public static final a UPC_E = new a("UPC_E", 12, RecognitionOptions.UPC_E);
    public static final a PDF417 = new a("PDF417", 13, RecognitionOptions.PDF417);
    public static final a AZTEC = new a("AZTEC", 14, RecognitionOptions.AZTEC);

    /* renamed from: pi.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0382a {
        private C0382a() {
        }

        public /* synthetic */ C0382a(g gVar) {
            this();
        }

        public final a a(int i10) {
            if (i10 != -1) {
                if (i10 == 0) {
                    return a.ALL_FORMATS;
                }
                if (i10 == 1) {
                    return a.CODE_128;
                }
                if (i10 == 2) {
                    return a.CODE_39;
                }
                switch (i10) {
                    case 4:
                        return a.CODE_93;
                    case 8:
                        return a.CODABAR;
                    case 16:
                        return a.DATA_MATRIX;
                    case 32:
                        return a.EAN_13;
                    case 64:
                        return a.EAN_8;
                    case RecognitionOptions.ITF /* 128 */:
                        return a.ITF;
                    case RecognitionOptions.QR_CODE /* 256 */:
                        return a.QR_CODE;
                    case RecognitionOptions.UPC_A /* 512 */:
                        return a.UPC_A;
                    case RecognitionOptions.UPC_E /* 1024 */:
                        return a.UPC_E;
                    case RecognitionOptions.PDF417 /* 2048 */:
                        return a.PDF417;
                    case RecognitionOptions.AZTEC /* 4096 */:
                        return a.AZTEC;
                }
            }
            return a.UNKNOWN;
        }
    }

    static {
        a[] b10 = b();
        $VALUES = b10;
        $ENTRIES = ik.b.a(b10);
        Companion = new C0382a(null);
    }

    private a(String str, int i10, int i11) {
        this.intValue = i11;
    }

    private static final /* synthetic */ a[] b() {
        return new a[]{UNKNOWN, ALL_FORMATS, CODE_128, CODE_39, CODE_93, CODABAR, DATA_MATRIX, EAN_13, EAN_8, ITF, QR_CODE, UPC_A, UPC_E, PDF417, AZTEC};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int h() {
        return this.intValue;
    }
}
