.class public Lud/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lvd/c;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Landroid/app/Activity;)Landroid/graphics/Point;
    .locals 1

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    invoke-direct {p0, p1}, Lud/g;->g(Landroid/app/Activity;)Landroid/view/WindowManager;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    return-object v0
.end method

.method private c(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 4

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-direct {p0, p1}, Lud/g;->f(Landroid/app/Activity;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-direct {p0, p1}, Lud/g;->b(Landroid/app/Activity;)Landroid/graphics/Point;

    move-result-object p1

    iget v2, v1, Landroid/graphics/Rect;->top:I

    iput v2, v0, Landroid/graphics/Rect;->top:I

    iget v2, v1, Landroid/graphics/Rect;->left:I

    iput v2, v0, Landroid/graphics/Rect;->left:I

    iget v2, p1, Landroid/graphics/Point;->x:I

    iget v3, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v3

    iput v2, v0, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p1, v1

    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    return-object v0
.end method

.method private d(Lud/l;Landroid/app/Activity;)Landroid/view/WindowManager$LayoutParams;
    .locals 7

    new-instance v6, Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {p1}, Lud/l;->A()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1}, Lud/l;->z()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x3eb

    invoke-virtual {p1}, Lud/l;->y()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, -0x3

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    invoke-direct {p0, p2}, Lud/g;->c(Landroid/app/Activity;)Landroid/graphics/Rect;

    move-result-object p2

    invoke-virtual {p1}, Lud/l;->x()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x30

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget p2, p2, Landroid/graphics/Rect;->top:I

    iput p2, v6, Landroid/view/WindowManager$LayoutParams;->y:I

    :cond_0
    const p2, 0x3e99999a    # 0.3f

    iput p2, v6, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    invoke-virtual {p1}, Lud/l;->x()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v6, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const/4 p1, 0x0

    iput p1, v6, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    return-object v6
.end method

.method private e(Lud/l;Lvd/c;Landroid/view/WindowManager;Landroid/view/WindowManager$LayoutParams;)Lud/p;
    .locals 8

    new-instance v4, Lud/g$a;

    invoke-direct {v4, p0, p2}, Lud/g$a;-><init>(Lud/g;Lvd/c;)V

    invoke-virtual {p1}, Lud/l;->A()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    new-instance p1, Lud/p;

    invoke-virtual {p2}, Lvd/c;->c()Landroid/view/View;

    move-result-object p2

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3, v4}, Lud/p;-><init>(Landroid/view/View;Ljava/lang/Object;Lud/p$e;)V

    return-object p1

    :cond_0
    new-instance p1, Lud/g$b;

    invoke-virtual {p2}, Lvd/c;->c()Landroid/view/View;

    move-result-object v2

    const/4 v3, 0x0

    move-object v0, p1

    move-object v1, p0

    move-object v5, p4

    move-object v6, p3

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lud/g$b;-><init>(Lud/g;Landroid/view/View;Ljava/lang/Object;Lud/p$e;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;Lvd/c;)V

    return-object p1
.end method

.method private f(Landroid/app/Activity;)Landroid/graphics/Rect;
    .locals 1

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    return-object v0
.end method

.method private g(Landroid/app/Activity;)Landroid/view/WindowManager;
    .locals 1

    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    return-object p1
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 1

    invoke-virtual {p0}, Lud/g;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lud/g;->g(Landroid/app/Activity;)Landroid/view/WindowManager;

    move-result-object p1

    iget-object v0, p0, Lud/g;->a:Lvd/c;

    invoke-virtual {v0}, Lvd/c;->f()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lud/g;->a:Lvd/c;

    :cond_0
    return-void
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lud/g;->a:Lvd/c;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lvd/c;->f()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    return v0
.end method

.method public i(Lvd/c;Landroid/app/Activity;)V
    .locals 6

    invoke-virtual {p0}, Lud/g;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Fiam already active. Cannot show new Fiam."

    :goto_0
    invoke-static {p1}, Lud/m;->e(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "Activity is finishing or does not have valid window token. Cannot show FIAM."

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lvd/c;->b()Lud/l;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lud/g;->d(Lud/l;Landroid/app/Activity;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    invoke-direct {p0, p2}, Lud/g;->g(Landroid/app/Activity;)Landroid/view/WindowManager;

    move-result-object v2

    invoke-virtual {p1}, Lvd/c;->f()Landroid/view/ViewGroup;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-direct {p0, p2}, Lud/g;->c(Landroid/app/Activity;)Landroid/graphics/Rect;

    move-result-object p2

    iget v3, p2, Landroid/graphics/Rect;->top:I

    int-to-float v3, v3

    iget v4, p2, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    const-string v5, "Inset (top, bottom)"

    invoke-static {v5, v3, v4}, Lud/m;->d(Ljava/lang/String;FF)V

    iget v3, p2, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    iget p2, p2, Landroid/graphics/Rect;->right:I

    int-to-float p2, p2

    const-string v4, "Inset (left, right)"

    invoke-static {v4, v3, p2}, Lud/m;->d(Ljava/lang/String;FF)V

    invoke-virtual {p1}, Lvd/c;->a()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-direct {p0, v0, p1, v2, v1}, Lud/g;->e(Lud/l;Lvd/c;Landroid/view/WindowManager;Landroid/view/WindowManager$LayoutParams;)Lud/p;

    move-result-object p2

    invoke-virtual {p1}, Lvd/c;->c()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_2
    iput-object p1, p0, Lud/g;->a:Lvd/c;

    return-void
.end method
