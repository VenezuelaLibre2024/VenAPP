package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import androidx.emoji2.text.m;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final e.i f4382a;

    /* renamed from: b, reason: collision with root package name */
    private final m f4383b;

    /* renamed from: c, reason: collision with root package name */
    private e.d f4384c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4385d;

    /* renamed from: e, reason: collision with root package name */
    private final int[] f4386e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f4387a = 1;

        /* renamed from: b, reason: collision with root package name */
        private final m.a f4388b;

        /* renamed from: c, reason: collision with root package name */
        private m.a f4389c;

        /* renamed from: d, reason: collision with root package name */
        private m.a f4390d;

        /* renamed from: e, reason: collision with root package name */
        private int f4391e;

        /* renamed from: f, reason: collision with root package name */
        private int f4392f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f4393g;

        /* renamed from: h, reason: collision with root package name */
        private final int[] f4394h;

        b(m.a aVar, boolean z10, int[] iArr) {
            this.f4388b = aVar;
            this.f4389c = aVar;
            this.f4393g = z10;
            this.f4394h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f4387a = 1;
            this.f4389c = this.f4388b;
            this.f4392f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f4389c.b().j() || d(this.f4391e)) {
                return true;
            }
            if (this.f4393g) {
                if (this.f4394h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f4394h, this.f4389c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i10) {
            m.a a10 = this.f4389c.a(i10);
            int i11 = 2;
            if (this.f4387a != 2) {
                if (a10 != null) {
                    this.f4387a = 2;
                    this.f4389c = a10;
                    this.f4392f = 1;
                }
                i11 = g();
            } else if (a10 != null) {
                this.f4389c = a10;
                this.f4392f++;
            } else {
                if (!f(i10)) {
                    if (!d(i10)) {
                        if (this.f4389c.b() != null) {
                            i11 = 3;
                            if (this.f4392f != 1 || h()) {
                                this.f4390d = this.f4389c;
                                g();
                            }
                        }
                    }
                }
                i11 = g();
            }
            this.f4391e = i10;
            return i11;
        }

        g b() {
            return this.f4389c.b();
        }

        g c() {
            return this.f4390d.b();
        }

        boolean e() {
            return this.f4387a == 2 && this.f4389c.b() != null && (this.f4392f > 1 || h());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(m mVar, e.i iVar, e.d dVar, boolean z10, int[] iArr) {
        this.f4382a = iVar;
        this.f4383b = mVar;
        this.f4384c = dVar;
        this.f4385d = z10;
        this.f4386e = iArr;
    }

    private void a(Spannable spannable, g gVar, int i10, int i11) {
        spannable.setSpan(this.f4382a.a(gVar), i10, i11, 33);
    }

    private static boolean b(Editable editable, KeyEvent keyEvent, boolean z10) {
        i[] iVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (iVarArr = (i[]) editable.getSpans(selectionStart, selectionEnd, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                max = a.a(editable, selectionStart, Math.max(i10, 0));
                min = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i10, 0);
                min = Math.min(selectionEnd + i11, editable.length());
            }
            i[] iVarArr = (i[]) editable.getSpans(max, min, i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                for (i iVar : iVarArr) {
                    int spanStart = editable.getSpanStart(iVar);
                    int spanEnd = editable.getSpanEnd(iVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : b(editable, keyEvent, true) : b(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean e(CharSequence charSequence, int i10, int i11, g gVar) {
        if (gVar.d() == 0) {
            gVar.k(this.f4384c.a(charSequence, i10, i11, gVar.h()));
        }
        return gVar.d() == 2;
    }

    private static boolean f(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0122, code lost:
    
        ((androidx.emoji2.text.n) r11).d();
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:99:0x000e, B:102:0x0013, B:104:0x0017, B:106:0x0024, B:9:0x0037, B:11:0x003f, B:13:0x0042, B:15:0x0046, B:17:0x0052, B:19:0x0055, B:23:0x0062, B:29:0x0071, B:30:0x007d, B:34:0x0098, B:60:0x00a8, B:64:0x00b4, B:65:0x00be, B:47:0x00c8, B:50:0x00cf, B:37:0x00d4, B:39:0x00df, B:71:0x00e6, B:75:0x00f0, B:78:0x00fc, B:79:0x0102, B:81:0x010b, B:6:0x002c), top: B:98:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:99:0x000e, B:102:0x0013, B:104:0x0017, B:106:0x0024, B:9:0x0037, B:11:0x003f, B:13:0x0042, B:15:0x0046, B:17:0x0052, B:19:0x0055, B:23:0x0062, B:29:0x0071, B:30:0x007d, B:34:0x0098, B:60:0x00a8, B:64:0x00b4, B:65:0x00be, B:47:0x00c8, B:50:0x00cf, B:37:0x00d4, B:39:0x00df, B:71:0x00e6, B:75:0x00f0, B:78:0x00fc, B:79:0x0102, B:81:0x010b, B:6:0x002c), top: B:98:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010b A[Catch: all -> 0x0129, TRY_LEAVE, TryCatch #0 {all -> 0x0129, blocks: (B:99:0x000e, B:102:0x0013, B:104:0x0017, B:106:0x0024, B:9:0x0037, B:11:0x003f, B:13:0x0042, B:15:0x0046, B:17:0x0052, B:19:0x0055, B:23:0x0062, B:29:0x0071, B:30:0x007d, B:34:0x0098, B:60:0x00a8, B:64:0x00b4, B:65:0x00be, B:47:0x00c8, B:50:0x00cf, B:37:0x00d4, B:39:0x00df, B:71:0x00e6, B:75:0x00f0, B:78:0x00fc, B:79:0x0102, B:81:0x010b, B:6:0x002c), top: B:98:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence h(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.h.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
