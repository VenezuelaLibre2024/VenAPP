.class Lsd/b$d;
.super Lud/e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsd/b;->w(Landroid/app/Activity;Lvd/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lvd/c;

.field final synthetic f:Landroid/app/Activity;

.field final synthetic r:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field final synthetic s:Lsd/b;


# direct methods
.method constructor <init>(Lsd/b;Lvd/c;Landroid/app/Activity;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    .locals 0

    iput-object p1, p0, Lsd/b$d;->s:Lsd/b;

    iput-object p2, p0, Lsd/b$d;->e:Lvd/c;

    iput-object p3, p0, Lsd/b$d;->f:Landroid/app/Activity;

    iput-object p4, p0, Lsd/b$d;->r:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-direct {p0}, Lud/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Exception;)V
    .locals 1

    const-string p1, "Image download failure "

    invoke-static {p1}, Lud/m;->e(Ljava/lang/String;)V

    iget-object p1, p0, Lsd/b$d;->r:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lsd/b$d;->e:Lvd/c;

    invoke-virtual {p1}, Lvd/c;->e()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object v0, p0, Lsd/b$d;->r:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    iget-object p1, p0, Lsd/b$d;->s:Lsd/b;

    invoke-static {p1}, Lsd/b;->g(Lsd/b;)V

    iget-object p1, p0, Lsd/b$d;->s:Lsd/b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lsd/b;->m(Lsd/b;Lde/i;)Lde/i;

    iget-object p1, p0, Lsd/b$d;->s:Lsd/b;

    invoke-static {p1, v0}, Lsd/b;->e(Lsd/b;Lqd/t;)Lqd/t;

    return-void
.end method

.method public k()V
    .locals 7

    iget-object v0, p0, Lsd/b$d;->e:Lvd/c;

    invoke-virtual {v0}, Lvd/c;->b()Lud/l;

    move-result-object v0

    invoke-virtual {v0}, Lud/l;->p()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lsd/b$d;->e:Lvd/c;

    invoke-virtual {v0}, Lvd/c;->f()Landroid/view/ViewGroup;

    move-result-object v0

    new-instance v1, Lsd/b$d$a;

    invoke-direct {v1, p0}, Lsd/b$d$a;-><init>(Lsd/b$d;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_0
    iget-object v0, p0, Lsd/b$d;->s:Lsd/b;

    invoke-static {v0}, Lsd/b;->n(Lsd/b;)Lud/n;

    move-result-object v1

    new-instance v2, Lsd/b$d$b;

    invoke-direct {v2, p0}, Lsd/b$d$b;-><init>(Lsd/b$d;)V

    const-wide/16 v3, 0x1388

    const-wide/16 v5, 0x3e8

    invoke-virtual/range {v1 .. v6}, Lud/n;->b(Lud/n$b;JJ)V

    iget-object v0, p0, Lsd/b$d;->e:Lvd/c;

    invoke-virtual {v0}, Lvd/c;->b()Lud/l;

    move-result-object v0

    invoke-virtual {v0}, Lud/l;->o()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lsd/b$d;->s:Lsd/b;

    invoke-static {v0}, Lsd/b;->o(Lsd/b;)Lud/n;

    move-result-object v1

    new-instance v2, Lsd/b$d$c;

    invoke-direct {v2, p0}, Lsd/b$d$c;-><init>(Lsd/b$d;)V

    const-wide/16 v3, 0x4e20

    const-wide/16 v5, 0x3e8

    invoke-virtual/range {v1 .. v6}, Lud/n;->b(Lud/n$b;JJ)V

    :cond_1
    iget-object v0, p0, Lsd/b$d;->f:Landroid/app/Activity;

    new-instance v1, Lsd/b$d$d;

    invoke-direct {v1, p0}, Lsd/b$d$d;-><init>(Lsd/b$d;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
