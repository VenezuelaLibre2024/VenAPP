.class public Landroidx/core/view/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/x0$q;,
        Landroidx/core/view/x0$o;,
        Landroidx/core/view/x0$h;,
        Landroidx/core/view/x0$m;,
        Landroidx/core/view/x0$f;,
        Landroidx/core/view/x0$i;,
        Landroidx/core/view/x0$p;,
        Landroidx/core/view/x0$k;,
        Landroidx/core/view/x0$l;,
        Landroidx/core/view/x0$n;,
        Landroidx/core/view/x0$r;,
        Landroidx/core/view/x0$s;,
        Landroidx/core/view/x0$j;,
        Landroidx/core/view/x0$g;,
        Landroidx/core/view/x0$u;,
        Landroidx/core/view/x0$v;,
        Landroidx/core/view/x0$e;,
        Landroidx/core/view/x0$t;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static b:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/view/View;",
            "Landroidx/core/view/n2;",
            ">;"
        }
    .end annotation
.end field

.field private static c:Ljava/lang/reflect/Field;

.field private static d:Z

.field private static final e:[I

.field private static final f:Landroidx/core/view/u0;

.field private static final g:Landroidx/core/view/x0$e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Landroidx/core/view/x0;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    sput-object v0, Landroidx/core/view/x0;->b:Ljava/util/WeakHashMap;

    const/4 v0, 0x0

    sput-boolean v0, Landroidx/core/view/x0;->d:Z

    const/16 v2, 0x20

    new-array v2, v2, [I

    sget v3, Lq0/e;->b:I

    aput v3, v2, v0

    sget v0, Lq0/e;->c:I

    aput v0, v2, v1

    const/4 v0, 0x2

    sget v1, Lq0/e;->n:I

    aput v1, v2, v0

    const/4 v0, 0x3

    sget v1, Lq0/e;->y:I

    aput v1, v2, v0

    const/4 v0, 0x4

    sget v1, Lq0/e;->B:I

    aput v1, v2, v0

    const/4 v0, 0x5

    sget v1, Lq0/e;->C:I

    aput v1, v2, v0

    const/4 v0, 0x6

    sget v1, Lq0/e;->D:I

    aput v1, v2, v0

    const/4 v0, 0x7

    sget v1, Lq0/e;->E:I

    aput v1, v2, v0

    const/16 v0, 0x8

    sget v1, Lq0/e;->F:I

    aput v1, v2, v0

    const/16 v0, 0x9

    sget v1, Lq0/e;->G:I

    aput v1, v2, v0

    const/16 v0, 0xa

    sget v1, Lq0/e;->d:I

    aput v1, v2, v0

    const/16 v0, 0xb

    sget v1, Lq0/e;->e:I

    aput v1, v2, v0

    const/16 v0, 0xc

    sget v1, Lq0/e;->f:I

    aput v1, v2, v0

    const/16 v0, 0xd

    sget v1, Lq0/e;->g:I

    aput v1, v2, v0

    const/16 v0, 0xe

    sget v1, Lq0/e;->h:I

    aput v1, v2, v0

    const/16 v0, 0xf

    sget v1, Lq0/e;->i:I

    aput v1, v2, v0

    const/16 v0, 0x10

    sget v1, Lq0/e;->j:I

    aput v1, v2, v0

    const/16 v0, 0x11

    sget v1, Lq0/e;->k:I

    aput v1, v2, v0

    const/16 v0, 0x12

    sget v1, Lq0/e;->l:I

    aput v1, v2, v0

    const/16 v0, 0x13

    sget v1, Lq0/e;->m:I

    aput v1, v2, v0

    const/16 v0, 0x14

    sget v1, Lq0/e;->o:I

    aput v1, v2, v0

    const/16 v0, 0x15

    sget v1, Lq0/e;->p:I

    aput v1, v2, v0

    const/16 v0, 0x16

    sget v1, Lq0/e;->q:I

    aput v1, v2, v0

    const/16 v0, 0x17

    sget v1, Lq0/e;->r:I

    aput v1, v2, v0

    const/16 v0, 0x18

    sget v1, Lq0/e;->s:I

    aput v1, v2, v0

    const/16 v0, 0x19

    sget v1, Lq0/e;->t:I

    aput v1, v2, v0

    const/16 v0, 0x1a

    sget v1, Lq0/e;->u:I

    aput v1, v2, v0

    const/16 v0, 0x1b

    sget v1, Lq0/e;->v:I

    aput v1, v2, v0

    const/16 v0, 0x1c

    sget v1, Lq0/e;->w:I

    aput v1, v2, v0

    const/16 v0, 0x1d

    sget v1, Lq0/e;->x:I

    aput v1, v2, v0

    const/16 v0, 0x1e

    sget v1, Lq0/e;->z:I

    aput v1, v2, v0

    const/16 v0, 0x1f

    sget v1, Lq0/e;->A:I

    aput v1, v2, v0

    sput-object v2, Landroidx/core/view/x0;->e:[I

    new-instance v0, Landroidx/core/view/w0;

    invoke-direct {v0}, Landroidx/core/view/w0;-><init>()V

    sput-object v0, Landroidx/core/view/x0;->f:Landroidx/core/view/u0;

    new-instance v0, Landroidx/core/view/x0$e;

    invoke-direct {v0}, Landroidx/core/view/x0$e;-><init>()V

    sput-object v0, Landroidx/core/view/x0;->g:Landroidx/core/view/x0$e;

    return-void
.end method

.method public static A(Landroid/view/View;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$m;->k(Landroid/view/View;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static B(Landroid/view/View;)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Landroidx/core/view/x0$h;->g(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public static C(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$g;->a(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static D(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$h;->h(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static E(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$h;->i(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static F(Landroid/view/View;)Z
    .locals 1

    invoke-static {}, Landroidx/core/view/x0;->b()Landroidx/core/view/x0$f;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/core/view/x0$f;->f(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static G(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$k;->b(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static H(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$k;->c(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static I(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$m;->p(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static J(Landroid/view/View;)Z
    .locals 1

    invoke-static {}, Landroidx/core/view/x0;->V()Landroidx/core/view/x0$f;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/core/view/x0$f;->f(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static synthetic K(Landroidx/core/view/c;)Landroidx/core/view/c;
    .locals 0

    return-object p0
.end method

.method static L(Landroid/view/View;I)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Landroidx/core/view/x0;->m(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {p0}, Landroidx/core/view/x0;->l(Landroid/view/View;)I

    move-result v2

    const/16 v3, 0x20

    if-nez v2, :cond_4

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    if-ne p1, v3, :cond_3

    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {v1, v3}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    invoke-static {v1, p1}, Landroidx/core/view/x0$k;->g(Landroid/view/accessibility/AccessibilityEvent;I)V

    invoke-virtual {v1, p0}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;)V

    invoke-virtual {p0, v1}, Landroid/view/View;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object p1

    invoke-static {p0}, Landroidx/core/view/x0;->m(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :try_start_0
    invoke-static {v0, p0, p0, p1}, Landroidx/core/view/x0$k;->e(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " does not fully implement ViewParent"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "ViewCompat"

    invoke-static {v0, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_3

    :cond_4
    :goto_1
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    if-eqz v1, :cond_5

    goto :goto_2

    :cond_5
    const/16 v3, 0x800

    :goto_2
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    invoke-static {v0, p1}, Landroidx/core/view/x0$k;->g(Landroid/view/accessibility/AccessibilityEvent;I)V

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object p1

    invoke-static {p0}, Landroidx/core/view/x0;->m(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p0}, Landroidx/core/view/x0;->l0(Landroid/view/View;)V

    :cond_6
    invoke-virtual {p0, v0}, Landroid/view/View;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_7
    :goto_3
    return-void
.end method

.method public static M(Landroid/view/View;I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    return-void
.end method

.method public static N(Landroid/view/View;Landroidx/core/view/r2;)Landroidx/core/view/r2;
    .locals 2

    invoke-virtual {p1}, Landroidx/core/view/r2;->t()Landroid/view/WindowInsets;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0, v0}, Landroidx/core/view/x0$l;->b(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v1, p0}, Landroidx/core/view/r2;->v(Landroid/view/WindowInsets;Landroid/view/View;)Landroidx/core/view/r2;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method private static O()Landroidx/core/view/x0$f;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/core/view/x0$f<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/core/view/x0$b;

    sget v1, Lq0/e;->K:I

    const/16 v2, 0x8

    const/16 v3, 0x1c

    const-class v4, Ljava/lang/CharSequence;

    invoke-direct {v0, v1, v4, v2, v3}, Landroidx/core/view/x0$b;-><init>(ILjava/lang/Class;II)V

    return-object v0
.end method

.method public static P(Landroid/view/View;Landroidx/core/view/c;)Landroidx/core/view/c;
    .locals 3

    const/4 v0, 0x3

    const-string v1, "ViewCompat"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "performReceiveContent: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", view="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1}, Landroidx/core/view/x0$s;->b(Landroid/view/View;Landroidx/core/view/c;)Landroidx/core/view/c;

    move-result-object p0

    return-object p0

    :cond_1
    sget v0, Lq0/e;->M:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/view/t0;

    if-eqz v0, :cond_3

    invoke-interface {v0, p0, p1}, Landroidx/core/view/t0;->a(Landroid/view/View;Landroidx/core/view/c;)Landroidx/core/view/c;

    move-result-object p1

    if-nez p1, :cond_2

    const/4 p0, 0x0

    goto :goto_0

    :cond_2
    invoke-static {p0}, Landroidx/core/view/x0;->r(Landroid/view/View;)Landroidx/core/view/u0;

    move-result-object p0

    invoke-interface {p0, p1}, Landroidx/core/view/u0;->a(Landroidx/core/view/c;)Landroidx/core/view/c;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_3
    invoke-static {p0}, Landroidx/core/view/x0;->r(Landroid/view/View;)Landroidx/core/view/u0;

    move-result-object p0

    invoke-interface {p0, p1}, Landroidx/core/view/u0;->a(Landroidx/core/view/c;)Landroidx/core/view/c;

    move-result-object p0

    return-object p0
.end method

.method public static Q(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$h;->k(Landroid/view/View;)V

    return-void
.end method

.method public static R(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/view/x0$h;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static S(Landroid/view/View;Ljava/lang/Runnable;J)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/core/view/x0$h;->n(Landroid/view/View;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static T(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$l;->c(Landroid/view/View;)V

    return-void
.end method

.method public static U(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static/range {p0 .. p6}, Landroidx/core/view/x0$q;->c(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    :cond_0
    return-void
.end method

.method private static V()Landroidx/core/view/x0$f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/core/view/x0$f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/core/view/x0$a;

    sget v1, Lq0/e;->O:I

    const-class v2, Ljava/lang/Boolean;

    const/16 v3, 0x1c

    invoke-direct {v0, v1, v2, v3}, Landroidx/core/view/x0$a;-><init>(ILjava/lang/Class;I)V

    return-object v0
.end method

.method public static W(Landroid/view/View;Landroidx/core/view/a;)V
    .locals 1

    if-nez p1, :cond_0

    invoke-static {p0}, Landroidx/core/view/x0;->j(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object v0

    instance-of v0, v0, Landroidx/core/view/a$a;

    if-eqz v0, :cond_0

    new-instance p1, Landroidx/core/view/a;

    invoke-direct {p1}, Landroidx/core/view/a;-><init>()V

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroidx/core/view/a;->d()Landroid/view/View$AccessibilityDelegate;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    return-void
.end method

.method public static X(Landroid/view/View;Z)V
    .locals 1

    invoke-static {}, Landroidx/core/view/x0;->b()Landroidx/core/view/x0$f;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroidx/core/view/x0$f;->g(Landroid/view/View;Ljava/lang/Object;)V

    return-void
.end method

.method public static Y(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 1

    invoke-static {}, Landroidx/core/view/x0;->O()Landroidx/core/view/x0$f;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Landroidx/core/view/x0$f;->g(Landroid/view/View;Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    sget-object p1, Landroidx/core/view/x0;->g:Landroidx/core/view/x0$e;

    invoke-virtual {p1, p0}, Landroidx/core/view/x0$e;->a(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/core/view/x0;->g:Landroidx/core/view/x0$e;

    invoke-virtual {p1, p0}, Landroidx/core/view/x0$e;->d(Landroid/view/View;)V

    :goto_0
    return-void
.end method

.method public static Z(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/view/x0$h;->q(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static synthetic a(Landroidx/core/view/c;)Landroidx/core/view/c;
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0;->K(Landroidx/core/view/c;)Landroidx/core/view/c;

    move-result-object p0

    return-object p0
.end method

.method public static a0(Landroid/view/View;Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/view/x0$m;->q(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method private static b()Landroidx/core/view/x0$f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/core/view/x0$f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/core/view/x0$d;

    sget v1, Lq0/e;->J:I

    const-class v2, Ljava/lang/Boolean;

    const/16 v3, 0x1c

    invoke-direct {v0, v1, v2, v3}, Landroidx/core/view/x0$d;-><init>(ILjava/lang/Class;I)V

    return-object v0
.end method

.method public static b0(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/view/x0$m;->r(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public static c(Landroid/view/View;)Landroidx/core/view/n2;
    .locals 2

    sget-object v0, Landroidx/core/view/x0;->b:Ljava/util/WeakHashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Landroidx/core/view/x0;->b:Ljava/util/WeakHashMap;

    :cond_0
    sget-object v0, Landroidx/core/view/x0;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/view/n2;

    if-nez v0, :cond_1

    new-instance v0, Landroidx/core/view/n2;

    invoke-direct {v0, p0}, Landroidx/core/view/n2;-><init>(Landroid/view/View;)V

    sget-object v1, Landroidx/core/view/x0;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public static c0(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/view/x0$j;->c(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method

.method public static d(Landroid/view/View;Landroidx/core/view/r2;Landroid/graphics/Rect;)Landroidx/core/view/r2;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/core/view/x0$m;->b(Landroid/view/View;Landroidx/core/view/r2;Landroid/graphics/Rect;)Landroidx/core/view/r2;

    move-result-object p0

    return-object p0
.end method

.method public static d0(Landroid/view/View;F)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/view/x0$m;->s(Landroid/view/View;F)V

    return-void
.end method

.method public static e(Landroid/view/View;Landroidx/core/view/r2;)Landroidx/core/view/r2;
    .locals 2

    invoke-virtual {p1}, Landroidx/core/view/r2;->t()Landroid/view/WindowInsets;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0, v0}, Landroidx/core/view/x0$l;->a(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v1, p0}, Landroidx/core/view/r2;->v(Landroid/view/WindowInsets;Landroid/view/View;)Landroidx/core/view/r2;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static e0(Landroid/view/View;Z)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/view/x0$h;->r(Landroid/view/View;Z)V

    return-void
.end method

.method static f(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p0}, Landroidx/core/view/x0$v;->a(Landroid/view/View;)Landroidx/core/view/x0$v;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Landroidx/core/view/x0$v;->b(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static f0(Landroid/view/View;I)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/view/x0$h;->s(Landroid/view/View;I)V

    return-void
.end method

.method static g(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p0}, Landroidx/core/view/x0$v;->a(Landroid/view/View;)Landroidx/core/view/x0$v;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/core/view/x0$v;->f(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static g0(Landroid/view/View;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Landroidx/core/view/x0$o;->l(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method static h(Landroid/view/View;)V
    .locals 1

    invoke-static {p0}, Landroidx/core/view/x0;->i(Landroid/view/View;)Landroidx/core/view/a;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/core/view/a;

    invoke-direct {v0}, Landroidx/core/view/a;-><init>()V

    :cond_0
    invoke-static {p0, v0}, Landroidx/core/view/x0;->W(Landroid/view/View;Landroidx/core/view/a;)V

    return-void
.end method

.method public static h0(Landroid/view/View;Landroidx/core/view/s0;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/view/x0$m;->u(Landroid/view/View;Landroidx/core/view/s0;)V

    return-void
.end method

.method public static i(Landroid/view/View;)Landroidx/core/view/a;
    .locals 1

    invoke-static {p0}, Landroidx/core/view/x0;->j(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Landroidx/core/view/a$a;

    if-eqz v0, :cond_1

    check-cast p0, Landroidx/core/view/a$a;

    iget-object p0, p0, Landroidx/core/view/a$a;->a:Landroidx/core/view/a;

    return-object p0

    :cond_1
    new-instance v0, Landroidx/core/view/a;

    invoke-direct {v0, p0}, Landroidx/core/view/a;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    return-object v0
.end method

.method public static i0(Landroid/view/View;Z)V
    .locals 1

    invoke-static {}, Landroidx/core/view/x0;->V()Landroidx/core/view/x0$f;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroidx/core/view/x0$f;->g(Landroid/view/View;Ljava/lang/Object;)V

    return-void
.end method

.method private static j(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Landroidx/core/view/x0$q;->a(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Landroidx/core/view/x0;->k(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object p0

    return-object p0
.end method

.method public static j0(Landroid/view/View;II)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/core/view/x0$n;->d(Landroid/view/View;II)V

    return-void
.end method

.method private static k(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;
    .locals 4

    sget-boolean v0, Landroidx/core/view/x0;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Landroidx/core/view/x0;->c:Ljava/lang/reflect/Field;

    const/4 v2, 0x1

    if-nez v0, :cond_1

    :try_start_0
    const-class v0, Landroid/view/View;

    const-string v3, "mAccessibilityDelegate"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Landroidx/core/view/x0;->c:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    sput-boolean v2, Landroidx/core/view/x0;->d:Z

    return-object v1

    :cond_1
    :goto_0
    :try_start_1
    sget-object v0, Landroidx/core/view/x0;->c:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroid/view/View$AccessibilityDelegate;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/view/View$AccessibilityDelegate;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-object p0

    :cond_2
    return-object v1

    :catchall_1
    sput-boolean v2, Landroidx/core/view/x0;->d:Z

    return-object v1
.end method

.method public static k0(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/view/x0$m;->v(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method public static l(Landroid/view/View;)I
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$k;->a(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method private static l0(Landroid/view/View;)V
    .locals 3

    invoke-static {p0}, Landroidx/core/view/x0;->s(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Landroidx/core/view/x0;->f0(Landroid/view/View;I)V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    invoke-static {v1}, Landroidx/core/view/x0;->s(Landroid/view/View;)I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_1

    const/4 v0, 0x2

    invoke-static {p0, v0}, Landroidx/core/view/x0;->f0(Landroid/view/View;I)V

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static m(Landroid/view/View;)Ljava/lang/CharSequence;
    .locals 1

    invoke-static {}, Landroidx/core/view/x0;->O()Landroidx/core/view/x0$f;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/core/view/x0$f;->f(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    return-object p0
.end method

.method private static m0()Landroidx/core/view/x0$f;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/core/view/x0$f<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/core/view/x0$c;

    sget v1, Lq0/e;->P:I

    const/16 v2, 0x40

    const/16 v3, 0x1e

    const-class v4, Ljava/lang/CharSequence;

    invoke-direct {v0, v1, v4, v2, v3}, Landroidx/core/view/x0$c;-><init>(ILjava/lang/Class;II)V

    return-object v0
.end method

.method public static n(Landroid/view/View;)Landroid/content/res/ColorStateList;
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$m;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public static n0(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$m;->z(Landroid/view/View;)V

    return-void
.end method

.method public static o(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$m;->h(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    return-object p0
.end method

.method public static p(Landroid/view/View;)Landroid/graphics/Rect;
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$j;->a(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method public static q(Landroid/view/View;)Landroid/view/Display;
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$i;->b(Landroid/view/View;)Landroid/view/Display;

    move-result-object p0

    return-object p0
.end method

.method private static r(Landroid/view/View;)Landroidx/core/view/u0;
    .locals 1

    instance-of v0, p0, Landroidx/core/view/u0;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/core/view/u0;

    return-object p0

    :cond_0
    sget-object p0, Landroidx/core/view/x0;->f:Landroidx/core/view/u0;

    return-object p0
.end method

.method public static s(Landroid/view/View;)I
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$h;->c(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public static t(Landroid/view/View;)I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Landroidx/core/view/x0$o;->b(Landroid/view/View;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static u(Landroid/view/View;)I
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$i;->d(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public static v(Landroid/view/View;)I
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$h;->d(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public static w(Landroid/view/View;)I
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$h;->e(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method public static x(Landroid/view/View;)[Ljava/lang/String;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Landroidx/core/view/x0$s;->a(Landroid/view/View;)[Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    sget v0, Lq0/e;->N:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method public static y(Landroid/view/View;)Landroidx/core/view/r2;
    .locals 0

    invoke-static {p0}, Landroidx/core/view/x0$n;->a(Landroid/view/View;)Landroidx/core/view/r2;

    move-result-object p0

    return-object p0
.end method

.method public static z(Landroid/view/View;)Ljava/lang/CharSequence;
    .locals 1

    invoke-static {}, Landroidx/core/view/x0;->m0()Landroidx/core/view/x0$f;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/core/view/x0$f;->f(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    return-object p0
.end method
