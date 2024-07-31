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
import androidx.appcompat.app.DialogInterfaceC0220c;
import androidx.appcompat.view.menu.InterfaceC0269p;
import androidx.core.util.C0979c;
import androidx.core.view.C1116x0;
import p111g.C7377a;
import p125h.C7605a;

/* renamed from: androidx.appcompat.widget.y */
/* loaded from: classes.dex */
public class C0386y extends Spinner {

    /* renamed from: t */
    private static final int[] f1997t = {R.attr.spinnerMode};

    /* renamed from: a */
    private final C0326e f1998a;

    /* renamed from: b */
    private final Context f1999b;

    /* renamed from: c */
    private AbstractViewOnTouchListenerC0369s0 f2000c;

    /* renamed from: d */
    private SpinnerAdapter f2001d;

    /* renamed from: e */
    private final boolean f2002e;

    /* renamed from: f */
    private j f2003f;

    /* renamed from: r */
    int f2004r;

    /* renamed from: s */
    final Rect f2005s;

    /* renamed from: androidx.appcompat.widget.y$a */
    /* loaded from: classes.dex */
    class a extends AbstractViewOnTouchListenerC0369s0 {

        /* renamed from: u */
        final /* synthetic */ h f2006u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, h hVar) {
            super(view);
            this.f2006u = hVar;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0369s0
        /* renamed from: b */
        public InterfaceC0269p mo1224b() {
            return this.f2006u;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0369s0
        /* renamed from: c */
        public boolean mo1225c() {
            if (C0386y.this.getInternalPopup().mo2057a()) {
                return true;
            }
            C0386y.this.m2050b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.y$b */
    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C0386y.this.getInternalPopup().mo2057a()) {
                C0386y.this.m2050b();
            }
            ViewTreeObserver viewTreeObserver = C0386y.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.m2051a(viewTreeObserver, this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.y$c */
    /* loaded from: classes.dex */
    private static final class c {
        /* renamed from: a */
        static void m2051a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.y$d */
    /* loaded from: classes.dex */
    public static final class d {
        /* renamed from: a */
        static int m2052a(View view) {
            return view.getTextAlignment();
        }

        /* renamed from: b */
        static int m2053b(View view) {
            return view.getTextDirection();
        }

        /* renamed from: c */
        static void m2054c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        /* renamed from: d */
        static void m2055d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* renamed from: androidx.appcompat.widget.y$e */
    /* loaded from: classes.dex */
    private static final class e {
        /* renamed from: a */
        static void m2056a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (C0979c.m4812a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* renamed from: androidx.appcompat.widget.y$f */
    /* loaded from: classes.dex */
    class f implements j, DialogInterface.OnClickListener {

        /* renamed from: a */
        DialogInterfaceC0220c f2009a;

        /* renamed from: b */
        private ListAdapter f2010b;

        /* renamed from: c */
        private CharSequence f2011c;

        f() {
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: a */
        public boolean mo2057a() {
            DialogInterfaceC0220c dialogInterfaceC0220c = this.f2009a;
            if (dialogInterfaceC0220c != null) {
                return dialogInterfaceC0220c.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.C0386y.j
        public void dismiss() {
            DialogInterfaceC0220c dialogInterfaceC0220c = this.f2009a;
            if (dialogInterfaceC0220c != null) {
                dialogInterfaceC0220c.dismiss();
                this.f2009a = null;
            }
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: g */
        public void mo2058g(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: h */
        public int mo2059h() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: i */
        public void mo2060i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: j */
        public CharSequence mo2061j() {
            return this.f2011c;
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: k */
        public Drawable mo2062k() {
            return null;
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: l */
        public void mo2063l(CharSequence charSequence) {
            this.f2011c = charSequence;
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: m */
        public void mo2064m(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: n */
        public void mo2065n(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: o */
        public void mo2066o(int i10, int i11) {
            if (this.f2010b == null) {
                return;
            }
            DialogInterfaceC0220c.a aVar = new DialogInterfaceC0220c.a(C0386y.this.getPopupContext());
            CharSequence charSequence = this.f2011c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            DialogInterfaceC0220c create = aVar.m915i(this.f2010b, C0386y.this.getSelectedItemPosition(), this).create();
            this.f2009a = create;
            ListView m905h = create.m905h();
            d.m2055d(m905h, i10);
            d.m2054c(m905h, i11);
            this.f2009a.show();
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C0386y.this.setSelection(i10);
            if (C0386y.this.getOnItemClickListener() != null) {
                C0386y.this.performItemClick(null, i10, this.f2010b.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: p */
        public int mo2067p() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: q */
        public void mo2006q(ListAdapter listAdapter) {
            this.f2010b = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.y$g */
    /* loaded from: classes.dex */
    public static class g implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f2013a;

        /* renamed from: b */
        private ListAdapter f2014b;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f2013a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2014b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    e.m2056a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof InterfaceC0337h1) {
                    InterfaceC0337h1 interfaceC0337h1 = (InterfaceC0337h1) spinnerAdapter;
                    if (interfaceC0337h1.getDropDownViewTheme() == null) {
                        interfaceC0337h1.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2014b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2013a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2013a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f2013a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f2013a;
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
            SpinnerAdapter spinnerAdapter = this.f2013a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f2014b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2013a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2013a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.y$h */
    /* loaded from: classes.dex */
    class h extends C0375u0 implements j {

        /* renamed from: T */
        private CharSequence f2015T;

        /* renamed from: U */
        ListAdapter f2016U;

        /* renamed from: V */
        private final Rect f2017V;

        /* renamed from: W */
        private int f2018W;

        /* renamed from: androidx.appcompat.widget.y$h$a */
        /* loaded from: classes.dex */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ C0386y f2020a;

            a(C0386y c0386y) {
                this.f2020a = c0386y;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                C0386y.this.setSelection(i10);
                if (C0386y.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    C0386y.this.performItemClick(view, i10, hVar.f2016U.getItemId(i10));
                }
                h.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.y$h$b */
        /* loaded from: classes.dex */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.m2071P(C0386y.this)) {
                    h.this.dismiss();
                } else {
                    h.this.m2069N();
                    h.super.show();
                }
            }
        }

        /* renamed from: androidx.appcompat.widget.y$h$c */
        /* loaded from: classes.dex */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2023a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f2023a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0386y.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f2023a);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f2017V = new Rect();
            m2011y(C0386y.this);
            m1991E(true);
            m1995J(0);
            m1993G(new a(C0386y.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
        /* renamed from: N */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m2069N() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.m2003k()
                if (r0 == 0) goto L24
                androidx.appcompat.widget.y r1 = androidx.appcompat.widget.C0386y.this
                android.graphics.Rect r1 = r1.f2005s
                r0.getPadding(r1)
                androidx.appcompat.widget.y r0 = androidx.appcompat.widget.C0386y.this
                boolean r0 = androidx.appcompat.widget.C0385x1.m2047b(r0)
                if (r0 == 0) goto L1c
                androidx.appcompat.widget.y r0 = androidx.appcompat.widget.C0386y.this
                android.graphics.Rect r0 = r0.f2005s
                int r0 = r0.right
                goto L2e
            L1c:
                androidx.appcompat.widget.y r0 = androidx.appcompat.widget.C0386y.this
                android.graphics.Rect r0 = r0.f2005s
                int r0 = r0.left
                int r0 = -r0
                goto L2e
            L24:
                androidx.appcompat.widget.y r0 = androidx.appcompat.widget.C0386y.this
                android.graphics.Rect r0 = r0.f2005s
                r1 = 0
                r0.right = r1
                r0.left = r1
                r0 = r1
            L2e:
                androidx.appcompat.widget.y r1 = androidx.appcompat.widget.C0386y.this
                int r1 = r1.getPaddingLeft()
                androidx.appcompat.widget.y r2 = androidx.appcompat.widget.C0386y.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.y r3 = androidx.appcompat.widget.C0386y.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.y r4 = androidx.appcompat.widget.C0386y.this
                int r5 = r4.f2004r
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.f2016U
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.m2003k()
                int r4 = r4.m2049a(r5, r6)
                androidx.appcompat.widget.y r5 = androidx.appcompat.widget.C0386y.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.y r6 = androidx.appcompat.widget.C0386y.this
                android.graphics.Rect r6 = r6.f2005s
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
                r8.m1987A(r4)
                goto L85
            L82:
                r8.m1987A(r5)
            L85:
                androidx.appcompat.widget.y r4 = androidx.appcompat.widget.C0386y.this
                boolean r4 = androidx.appcompat.widget.C0385x1.m2047b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r1 = r8.m2008u()
                int r3 = r3 - r1
                int r1 = r8.m2070O()
                int r3 = r3 - r1
                int r0 = r0 + r3
                goto La0
            L9a:
                int r2 = r8.m2070O()
                int r1 = r1 + r2
                int r0 = r0 + r1
            La0:
                r8.m2002i(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0386y.h.m2069N():void");
        }

        /* renamed from: O */
        public int m2070O() {
            return this.f2018W;
        }

        /* renamed from: P */
        boolean m2071P(View view) {
            return C1116x0.m5242G(view) && view.getGlobalVisibleRect(this.f2017V);
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: j */
        public CharSequence mo2061j() {
            return this.f2015T;
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: l */
        public void mo2063l(CharSequence charSequence) {
            this.f2015T = charSequence;
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: n */
        public void mo2065n(int i10) {
            this.f2018W = i10;
        }

        @Override // androidx.appcompat.widget.C0386y.j
        /* renamed from: o */
        public void mo2066o(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean mo1269a = mo1269a();
            m2069N();
            m1990D(2);
            super.show();
            ListView mo1276r = mo1276r();
            mo1276r.setChoiceMode(1);
            d.m2055d(mo1276r, i10);
            d.m2054c(mo1276r, i11);
            m1996K(C0386y.this.getSelectedItemPosition());
            if (mo1269a || (viewTreeObserver = C0386y.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            m1992F(new c(bVar));
        }

        @Override // androidx.appcompat.widget.C0375u0, androidx.appcompat.widget.C0386y.j
        /* renamed from: q */
        public void mo2006q(ListAdapter listAdapter) {
            super.mo2006q(listAdapter);
            this.f2016U = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.y$i */
    /* loaded from: classes.dex */
    public static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: a */
        boolean f2025a;

        /* renamed from: androidx.appcompat.widget.y$i$a */
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
            this.f2025a = parcel.readByte() != 0;
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f2025a ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.y$j */
    /* loaded from: classes.dex */
    public interface j {
        /* renamed from: a */
        boolean mo2057a();

        void dismiss();

        /* renamed from: g */
        void mo2058g(Drawable drawable);

        /* renamed from: h */
        int mo2059h();

        /* renamed from: i */
        void mo2060i(int i10);

        /* renamed from: j */
        CharSequence mo2061j();

        /* renamed from: k */
        Drawable mo2062k();

        /* renamed from: l */
        void mo2063l(CharSequence charSequence);

        /* renamed from: m */
        void mo2064m(int i10);

        /* renamed from: n */
        void mo2065n(int i10);

        /* renamed from: o */
        void mo2066o(int i10, int i11);

        /* renamed from: p */
        int mo2067p();

        /* renamed from: q */
        void mo2006q(ListAdapter listAdapter);
    }

    public C0386y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7377a.f16693J);
    }

    public C0386y(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public C0386y(Context context, AttributeSet attributeSet, int i10, int i11) {
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
    public C0386y(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f2005s = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.C0334g1.m1731a(r6, r0)
            int[] r0 = p111g.C7386j.f17097x2
            r1 = 0
            androidx.appcompat.widget.l1 r0 = androidx.appcompat.widget.C0349l1.m1845u(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1998a = r2
            if (r11 == 0) goto L29
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>(r7, r11)
        L26:
            r6.f1999b = r2
            goto L39
        L29:
            int r11 = p111g.C7386j.f16885C2
            int r11 = r0.m1858m(r11, r1)
            if (r11 == 0) goto L37
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>(r7, r11)
            goto L26
        L37:
            r6.f1999b = r7
        L39:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L69
            int[] r11 = androidx.appcompat.widget.C0386y.f1997t     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
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
            android.content.Context r3 = r6.f1999b
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1999b
            int[] r4 = p111g.C7386j.f17097x2
            androidx.appcompat.widget.l1 r1 = androidx.appcompat.widget.C0349l1.m1845u(r3, r8, r4, r9, r1)
            int r3 = p111g.C7386j.f16880B2
            r4 = -2
            int r3 = r1.m1857l(r3, r4)
            r6.f2004r = r3
            int r3 = p111g.C7386j.f17107z2
            android.graphics.drawable.Drawable r3 = r1.m1851f(r3)
            r10.m2000g(r3)
            int r3 = p111g.C7386j.f16875A2
            java.lang.String r3 = r0.m1859n(r3)
            r10.mo2063l(r3)
            r1.m1864v()
            r6.f2003f = r10
            androidx.appcompat.widget.y$a r1 = new androidx.appcompat.widget.y$a
            r1.<init>(r6, r10)
            r6.f2000c = r1
            goto Lb6
        La6:
            androidx.appcompat.widget.y$f r10 = new androidx.appcompat.widget.y$f
            r10.<init>()
            r6.f2003f = r10
            int r1 = p111g.C7386j.f16875A2
            java.lang.String r1 = r0.m1859n(r1)
            r10.mo2063l(r1)
        Lb6:
            int r10 = p111g.C7386j.f17102y2
            java.lang.CharSequence[] r10 = r0.m1861p(r10)
            if (r10 == 0) goto Lce
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p111g.C7383g.f16854t
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        Lce:
            r0.m1864v()
            r6.f2002e = r11
            android.widget.SpinnerAdapter r7 = r6.f2001d
            if (r7 == 0) goto Ldc
            r6.setAdapter(r7)
            r6.f2001d = r2
        Ldc:
            androidx.appcompat.widget.e r7 = r6.f1998a
            r7.m1699e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0386y.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: a */
    int m2049a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
        drawable.getPadding(this.f2005s);
        Rect rect = this.f2005s;
        return i11 + rect.left + rect.right;
    }

    /* renamed from: b */
    void m2050b() {
        this.f2003f.mo2066o(d.m2053b(this), d.m2052a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0326e c0326e = this.f1998a;
        if (c0326e != null) {
            c0326e.m1696b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j jVar = this.f2003f;
        return jVar != null ? jVar.mo2059h() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j jVar = this.f2003f;
        return jVar != null ? jVar.mo2067p() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2003f != null ? this.f2004r : super.getDropDownWidth();
    }

    final j getInternalPopup() {
        return this.f2003f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j jVar = this.f2003f;
        return jVar != null ? jVar.mo2062k() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1999b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j jVar = this.f2003f;
        return jVar != null ? jVar.mo2061j() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1998a;
        if (c0326e != null) {
            return c0326e.m1697c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1998a;
        if (c0326e != null) {
            return c0326e.m1698d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f2003f;
        if (jVar == null || !jVar.mo2057a()) {
            return;
        }
        this.f2003f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2003f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2049a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (!iVar.f2025a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f2003f;
        iVar.f2025a = jVar != null && jVar.mo2057a();
        return iVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0369s0 abstractViewOnTouchListenerC0369s0 = this.f2000c;
        if (abstractViewOnTouchListenerC0369s0 == null || !abstractViewOnTouchListenerC0369s0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        j jVar = this.f2003f;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.mo2057a()) {
            return true;
        }
        m2050b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2002e) {
            this.f2001d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2003f != null) {
            Context context = this.f1999b;
            if (context == null) {
                context = getContext();
            }
            this.f2003f.mo2006q(new g(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1998a;
        if (c0326e != null) {
            c0326e.m1700f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0326e c0326e = this.f1998a;
        if (c0326e != null) {
            c0326e.m1701g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        j jVar = this.f2003f;
        if (jVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            jVar.mo2065n(i10);
            this.f2003f.mo2060i(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        j jVar = this.f2003f;
        if (jVar != null) {
            jVar.mo2064m(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f2003f != null) {
            this.f2004r = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f2003f;
        if (jVar != null) {
            jVar.mo2058g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(C7605a.m23112b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f2003f;
        if (jVar != null) {
            jVar.mo2063l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0326e c0326e = this.f1998a;
        if (c0326e != null) {
            c0326e.m1703i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0326e c0326e = this.f1998a;
        if (c0326e != null) {
            c0326e.m1704j(mode);
        }
    }
}
