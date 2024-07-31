package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C1227e;
import androidx.emoji2.text.C1235m;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.emoji2.text.h */
/* loaded from: classes.dex */
public final class C1230h {

    /* renamed from: a */
    private final C1227e.i f5093a;

    /* renamed from: b */
    private final C1235m f5094b;

    /* renamed from: c */
    private C1227e.d f5095c;

    /* renamed from: d */
    private final boolean f5096d;

    /* renamed from: e */
    private final int[] f5097e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.h$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        static int m6670a(CharSequence charSequence, int i10, int i11) {
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

        /* renamed from: b */
        static int m6671b(CharSequence charSequence, int i10, int i11) {
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
    /* renamed from: androidx.emoji2.text.h$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private int f5098a = 1;

        /* renamed from: b */
        private final C1235m.a f5099b;

        /* renamed from: c */
        private C1235m.a f5100c;

        /* renamed from: d */
        private C1235m.a f5101d;

        /* renamed from: e */
        private int f5102e;

        /* renamed from: f */
        private int f5103f;

        /* renamed from: g */
        private final boolean f5104g;

        /* renamed from: h */
        private final int[] f5105h;

        b(C1235m.a aVar, boolean z10, int[] iArr) {
            this.f5099b = aVar;
            this.f5100c = aVar;
            this.f5104g = z10;
            this.f5105h = iArr;
        }

        /* renamed from: d */
        private static boolean m6672d(int i10) {
            return i10 == 65039;
        }

        /* renamed from: f */
        private static boolean m6673f(int i10) {
            return i10 == 65038;
        }

        /* renamed from: g */
        private int m6674g() {
            this.f5098a = 1;
            this.f5100c = this.f5099b;
            this.f5103f = 0;
            return 1;
        }

        /* renamed from: h */
        private boolean m6675h() {
            if (this.f5100c.m6708b().m6660j() || m6672d(this.f5102e)) {
                return true;
            }
            if (this.f5104g) {
                if (this.f5105h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f5105h, this.f5100c.m6708b().m6653b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        int m6676a(int i10) {
            C1235m.a m6707a = this.f5100c.m6707a(i10);
            int i11 = 2;
            if (this.f5098a != 2) {
                if (m6707a != null) {
                    this.f5098a = 2;
                    this.f5100c = m6707a;
                    this.f5103f = 1;
                }
                i11 = m6674g();
            } else if (m6707a != null) {
                this.f5100c = m6707a;
                this.f5103f++;
            } else {
                if (!m6673f(i10)) {
                    if (!m6672d(i10)) {
                        if (this.f5100c.m6708b() != null) {
                            i11 = 3;
                            if (this.f5103f != 1 || m6675h()) {
                                this.f5101d = this.f5100c;
                                m6674g();
                            }
                        }
                    }
                }
                i11 = m6674g();
            }
            this.f5102e = i10;
            return i11;
        }

        /* renamed from: b */
        C1229g m6677b() {
            return this.f5100c.m6708b();
        }

        /* renamed from: c */
        C1229g m6678c() {
            return this.f5101d.m6708b();
        }

        /* renamed from: e */
        boolean m6679e() {
            return this.f5098a == 2 && this.f5100c.m6708b() != null && (this.f5103f > 1 || m6675h());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1230h(C1235m c1235m, C1227e.i iVar, C1227e.d dVar, boolean z10, int[] iArr) {
        this.f5093a = iVar;
        this.f5094b = c1235m;
        this.f5095c = dVar;
        this.f5096d = z10;
        this.f5097e = iArr;
    }

    /* renamed from: a */
    private void m6662a(Spannable spannable, C1229g c1229g, int i10, int i11) {
        spannable.setSpan(this.f5093a.m6650a(c1229g), i10, i11, 33);
    }

    /* renamed from: b */
    private static boolean m6663b(Editable editable, KeyEvent keyEvent, boolean z10) {
        AbstractC1231i[] abstractC1231iArr;
        if (m6668g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m6667f(selectionStart, selectionEnd) && (abstractC1231iArr = (AbstractC1231i[]) editable.getSpans(selectionStart, selectionEnd, AbstractC1231i.class)) != null && abstractC1231iArr.length > 0) {
            for (AbstractC1231i abstractC1231i : abstractC1231iArr) {
                int spanStart = editable.getSpanStart(abstractC1231i);
                int spanEnd = editable.getSpanEnd(abstractC1231i);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m6664c(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m6667f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                max = a.m6670a(editable, selectionStart, Math.max(i10, 0));
                min = a.m6671b(editable, selectionEnd, Math.max(i11, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i10, 0);
                min = Math.min(selectionEnd + i11, editable.length());
            }
            AbstractC1231i[] abstractC1231iArr = (AbstractC1231i[]) editable.getSpans(max, min, AbstractC1231i.class);
            if (abstractC1231iArr != null && abstractC1231iArr.length > 0) {
                for (AbstractC1231i abstractC1231i : abstractC1231iArr) {
                    int spanStart = editable.getSpanStart(abstractC1231i);
                    int spanEnd = editable.getSpanEnd(abstractC1231i);
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
    /* renamed from: d */
    public static boolean m6665d(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : m6663b(editable, keyEvent, true) : m6663b(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: e */
    private boolean m6666e(CharSequence charSequence, int i10, int i11, C1229g c1229g) {
        if (c1229g.m6655d() == 0) {
            c1229g.m6661k(this.f5095c.mo6620a(charSequence, i10, i11, c1229g.m6658h()));
        }
        return c1229g.m6655d() == 2;
    }

    /* renamed from: f */
    private static boolean m6667f(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    /* renamed from: g */
    private static boolean m6668g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0122, code lost:
    
        ((androidx.emoji2.text.C1236n) r11).m6718d();
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:99:0x000e, B:102:0x0013, B:104:0x0017, B:106:0x0024, B:9:0x0037, B:11:0x003f, B:13:0x0042, B:15:0x0046, B:17:0x0052, B:19:0x0055, B:23:0x0062, B:29:0x0071, B:30:0x007d, B:34:0x0098, B:60:0x00a8, B:64:0x00b4, B:65:0x00be, B:47:0x00c8, B:50:0x00cf, B:37:0x00d4, B:39:0x00df, B:71:0x00e6, B:75:0x00f0, B:78:0x00fc, B:79:0x0102, B:81:0x010b, B:6:0x002c), top: B:98:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:99:0x000e, B:102:0x0013, B:104:0x0017, B:106:0x0024, B:9:0x0037, B:11:0x003f, B:13:0x0042, B:15:0x0046, B:17:0x0052, B:19:0x0055, B:23:0x0062, B:29:0x0071, B:30:0x007d, B:34:0x0098, B:60:0x00a8, B:64:0x00b4, B:65:0x00be, B:47:0x00c8, B:50:0x00cf, B:37:0x00d4, B:39:0x00df, B:71:0x00e6, B:75:0x00f0, B:78:0x00fc, B:79:0x0102, B:81:0x010b, B:6:0x002c), top: B:98:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010b A[Catch: all -> 0x0129, TRY_LEAVE, TryCatch #0 {all -> 0x0129, blocks: (B:99:0x000e, B:102:0x0013, B:104:0x0017, B:106:0x0024, B:9:0x0037, B:11:0x003f, B:13:0x0042, B:15:0x0046, B:17:0x0052, B:19:0x0055, B:23:0x0062, B:29:0x0071, B:30:0x007d, B:34:0x0098, B:60:0x00a8, B:64:0x00b4, B:65:0x00be, B:47:0x00c8, B:50:0x00cf, B:37:0x00d4, B:39:0x00df, B:71:0x00e6, B:75:0x00f0, B:78:0x00fc, B:79:0x0102, B:81:0x010b, B:6:0x002c), top: B:98:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence m6669h(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C1230h.m6669h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
