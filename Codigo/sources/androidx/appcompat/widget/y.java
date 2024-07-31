package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.c;

/* loaded from: classes.dex */
public class y extends Spinner {

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f1703t = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.widget.e f1704a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f1705b;

    /* renamed from: c, reason: collision with root package name */
    private s0 f1706c;

    /* renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f1707d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1708e;

    /* renamed from: f, reason: collision with root package name */
    private j f1709f;

    /* renamed from: r, reason: collision with root package name */
    int f1710r;

    /* renamed from: s, reason: collision with root package name */
    final Rect f1711s;

    /* loaded from: classes.dex */
    class a extends s0 {

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ h f1712u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, h hVar) {
            super(view);
            this.f1712u = hVar;
        }

        @Override // androidx.appcompat.widget.s0
        public androidx.appcompat.view.menu.p b() {
            return this.f1712u;
        }

        @Override // androidx.appcompat.widget.s0
        public boolean c() {
            if (y.this.getInternalPopup().a()) {
                return true;
            }
            y.this.b();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!y.this.getInternalPopup().a()) {
                y.this.b();
            }
            ViewTreeObserver viewTreeObserver = y.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class c {
        static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {
        static int a(View view) {
            return view.getTextAlignment();
        }

        static int b(View view) {
            return view.getTextDirection();
        }

        static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* loaded from: classes.dex */
    private static final class e {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (androidx.core.util.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* loaded from: classes.dex */
    class f implements j, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        androidx.appcompat.app.c f1715a;

        /* renamed from: b, reason: collision with root package name */
        private ListAdapter f1716b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f1717c;

        f() {
        }

        @Override // androidx.appcompat.widget.y.j
        public boolean a() {
            androidx.appcompat.app.c cVar = this.f1715a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.y.j
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f1715a;
            if (cVar != null) {
                cVar.dismiss();
                this.f1715a = null;
            }
        }

        @Override // androidx.appcompat.widget.y.j
        public void g(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.y.j
        public int h() {
            return 0;
        }

        @Override // androidx.appcompat.widget.y.j
        public void i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.y.j
        public CharSequence j() {
            return this.f1717c;
        }

        @Override // androidx.appcompat.widget.y.j
        public Drawable k() {
            return null;
        }

        @Override // androidx.appcompat.widget.y.j
        public void l(CharSequence charSequence) {
            this.f1717c = charSequence;
        }

        @Override // androidx.appcompat.widget.y.j
        public void m(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.y.j
        public void n(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.y.j
        public void o(int i10, int i11) {
            if (this.f1716b == null) {
                return;
            }
            c.a aVar = new c.a(y.this.getPopupContext());
            CharSequence charSequence = this.f1717c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.c create = aVar.i(this.f1716b, y.this.getSelectedItemPosition(), this).create();
            this.f1715a = create;
            ListView h10 = create.h();
            d.d(h10, i10);
            d.c(h10, i11);
            this.f1715a.show();
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            y.this.setSelection(i10);
            if (y.this.getOnItemClickListener() != null) {
                y.this.performItemClick(null, i10, this.f1716b.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.y.j
        public int p() {
            return 0;
        }

        @Override // androidx.appcompat.widget.y.j
        public void q(ListAdapter listAdapter) {
            this.f1716b = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g implements ListAdapter, SpinnerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f1719a;

        /* renamed from: b, reason: collision with root package name */
        private ListAdapter f1720b;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1719a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1720b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof h1) {
                    h1 h1Var = (h1) spinnerAdapter;
                    if (h1Var.getDropDownViewTheme() == null) {
                        h1Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1720b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1719a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1719a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1719a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1719a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1719a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1720b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1719a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1719a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    class h extends u0 implements j {
        private CharSequence T;
        ListAdapter U;
        private final Rect V;
        private int W;

        /* loaded from: classes.dex */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y f1721a;

            a(y yVar) {
                this.f1721a = yVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                y.this.setSelection(i10);
                if (y.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    y.this.performItemClick(view, i10, hVar.U.getItemId(i10));
                }
                h.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.P(y.this)) {
                    h.this.dismiss();
                } else {
                    h.this.N();
                    h.super.show();
                }
            }
        }

        /* loaded from: classes.dex */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1724a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1724a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = y.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1724a);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.V = new Rect();
            y(y.this);
            E(true);
            J(0);
            G(new a(y.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void N() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.k()
                if (r0 == 0) goto L24
                androidx.appcompat.widget.y r1 = androidx.appcompat.widget.y.this
                android.graphics.Rect r1 = r1.f1711s
                r0.getPadding(r1)
                androidx.appcompat.widget.y r0 = androidx.appcompat.widget.y.this
                boolean r0 = androidx.appcompat.widget.x1.b(r0)
                if (r0 == 0) goto L1c
                androidx.appcompat.widget.y r0 = androidx.appcompat.widget.y.this
                android.graphics.Rect r0 = r0.f1711s
                int r0 = r0.right
                goto L2e
            L1c:
                androidx.appcompat.widget.y r0 = androidx.appcompat.widget.y.this
                android.graphics.Rect r0 = r0.f1711s
                int r0 = r0.left
                int r0 = -r0
                goto L2e
            L24:
                androidx.appcompat.widget.y r0 = androidx.appcompat.widget.y.this
                android.graphics.Rect r0 = r0.f1711s
                r1 = 0
                r0.right = r1
                r0.left = r1
                r0 = r1
            L2e:
                androidx.appcompat.widget.y r1 = androidx.appcompat.widget.y.this
                int r1 = r1.getPaddingLeft()
                androidx.appcompat.widget.y r2 = androidx.appcompat.widget.y.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.y r3 = androidx.appcompat.widget.y.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.y r4 = androidx.appcompat.widget.y.this
                int r5 = r4.f1710r
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.U
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.k()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.y r5 = androidx.appcompat.widget.y.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.y r6 = androidx.appcompat.widget.y.this
                android.graphics.Rect r6 = r6.f1711s
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r1
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r1
                int r4 = r4 - r2
            L7e:
                r8.A(r4)
                goto L85
            L82:
                r8.A(r5)
            L85:
                androidx.appcompat.widget.y r4 = androidx.appcompat.widget.y.this
                boolean r4 = androidx.appcompat.widget.x1.b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r1 = r8.u()
                int r3 = r3 - r1
                int r1 = r8.O()
                int r3 = r3 - r1
                int r0 = r0 + r3
                goto La0
            L9a:
                int r2 = r8.O()
                int r1 = r1 + r2
                int r0 = r0 + r1
            La0:
                r8.i(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.h.N():void");
        }

        public int O() {
            return this.W;
        }

        boolean P(View view) {
            return androidx.core.view.x0.G(view) && view.getGlobalVisibleRect(this.V);
        }

        @Override // androidx.appcompat.widget.y.j
        public CharSequence j() {
            return this.T;
        }

        @Override // androidx.appcompat.widget.y.j
        public void l(CharSequence charSequence) {
            this.T = charSequence;
        }

        @Override // androidx.appcompat.widget.y.j
        public void n(int i10) {
            this.W = i10;
        }

        @Override // androidx.appcompat.widget.y.j
        public void o(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean a10 = a();
            N();
            D(2);
            super.show();
            ListView r10 = r();
            r10.setChoiceMode(1);
            d.d(r10, i10);
            d.c(r10, i11);
            K(y.this.getSelectedItemPosition());
            if (a10 || (viewTreeObserver = y.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            F(new c(bVar));
        }

        @Override // androidx.appcompat.widget.u0, androidx.appcompat.widget.y.j
        public void q(ListAdapter listAdapter) {
            super.q(listAdapter);
            this.U = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        boolean f1726a;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<i> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        i(Parcel parcel) {
            super(parcel);
            this.f1726a = parcel.readByte() != 0;
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1726a ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface j {
        boolean a();

        void dismiss();

        void g(Drawable drawable);

        int h();

        void i(int i10);

        CharSequence j();

        Drawable k();

        void l(CharSequence charSequence);

        void m(int i10);

        void n(int i10);

        void o(int i10, int i11);

        int p();

        void q(ListAdapter listAdapter);
    }

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.J);
    }

    public y(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public y(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1711s = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.g1.a(r6, r0)
            int[] r0 = g.j.f15519x2
            r1 = 0
            androidx.appcompat.widget.l1 r0 = androidx.appcompat.widget.l1.u(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1704a = r2
            if (r11 == 0) goto L29
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>(r7, r11)
        L26:
            r6.f1705b = r2
            goto L39
        L29:
            int r11 = g.j.C2
            int r11 = r0.m(r11, r1)
            if (r11 == 0) goto L37
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>(r7, r11)
            goto L26
        L37:
            r6.f1705b = r7
        L39:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L69
            int[] r11 = androidx.appcompat.widget.y.f1703t     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            boolean r3 = r11.hasValue(r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L61
            if (r3 == 0) goto L4d
            int r10 = r11.getInt(r1, r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L61
        L4d:
            r11.recycle()
            goto L69
        L51:
            r3 = move-exception
            goto L57
        L53:
            r7 = move-exception
            goto L63
        L55:
            r3 = move-exception
            r11 = r2
        L57:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L69
            goto L4d
        L61:
            r7 = move-exception
            r2 = r11
        L63:
            if (r2 == 0) goto L68
            r2.recycle()
        L68:
            throw r7
        L69:
            r11 = 1
            if (r10 == 0) goto La6
            if (r10 == r11) goto L6f
            goto Lb6
        L6f:
            androidx.appcompat.widget.y$h r10 = new androidx.appcompat.widget.y$h
            android.content.Context r3 = r6.f1705b
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1705b
            int[] r4 = g.j.f15519x2
            androidx.appcompat.widget.l1 r1 = androidx.appcompat.widget.l1.u(r3, r8, r4, r9, r1)
            int r3 = g.j.B2
            r4 = -2
            int r3 = r1.l(r3, r4)
            r6.f1710r = r3
            int r3 = g.j.f15529z2
            android.graphics.drawable.Drawable r3 = r1.f(r3)
            r10.g(r3)
            int r3 = g.j.A2
            java.lang.String r3 = r0.n(r3)
            r10.l(r3)
            r1.v()
            r6.f1709f = r10
            androidx.appcompat.widget.y$a r1 = new androidx.appcompat.widget.y$a
            r1.<init>(r6, r10)
            r6.f1706c = r1
            goto Lb6
        La6:
            androidx.appcompat.widget.y$f r10 = new androidx.appcompat.widget.y$f
            r10.<init>()
            r6.f1709f = r10
            int r1 = g.j.A2
            java.lang.String r1 = r0.n(r1)
            r10.l(r1)
        Lb6:
            int r10 = g.j.f15524y2
            java.lang.CharSequence[] r10 = r0.p(r10)
            if (r10 == 0) goto Lce
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = g.g.f15383t
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        Lce:
            r0.v()
            r6.f1708e = r11
            android.widget.SpinnerAdapter r7 = r6.f1707d
            if (r7 == 0) goto Ldc
            r6.setAdapter(r7)
            r6.f1707d = r2
        Ldc:
            androidx.appcompat.widget.e r7 = r6.f1704a
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f1711s);
        Rect rect = this.f1711s;
        return i11 + rect.left + rect.right;
    }

    void b() {
        this.f1709f.o(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1704a;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j jVar = this.f1709f;
        return jVar != null ? jVar.h() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j jVar = this.f1709f;
        return jVar != null ? jVar.p() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1709f != null ? this.f1710r : super.getDropDownWidth();
    }

    final j getInternalPopup() {
        return this.f1709f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j jVar = this.f1709f;
        return jVar != null ? jVar.k() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1705b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j jVar = this.f1709f;
        return jVar != null ? jVar.j() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1704a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1704a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f1709f;
        if (jVar == null || !jVar.a()) {
            return;
        }
        this.f1709f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1709f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (!iVar.f1726a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f1709f;
        iVar.f1726a = jVar != null && jVar.a();
        return iVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        s0 s0Var = this.f1706c;
        if (s0Var == null || !s0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        j jVar = this.f1709f;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1708e) {
            this.f1707d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1709f != null) {
            Context context = this.f1705b;
            if (context == null) {
                context = getContext();
            }
            this.f1709f.q(new g(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1704a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.e eVar = this.f1704a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        j jVar = this.f1709f;
        if (jVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            jVar.n(i10);
            this.f1709f.i(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        j jVar = this.f1709f;
        if (jVar != null) {
            jVar.m(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1709f != null) {
            this.f1710r = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f1709f;
        if (jVar != null) {
            jVar.g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(h.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f1709f;
        if (jVar != null) {
            jVar.l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1704a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1704a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
