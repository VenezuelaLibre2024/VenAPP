.class Lb2/c$j;
.super Lb2/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb2/c;->p(Landroid/view/ViewGroup;Lb2/s;Lb2/s;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Landroid/view/ViewGroup;

.field final synthetic c:Lb2/c;


# direct methods
.method constructor <init>(Lb2/c;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, Lb2/c$j;->c:Lb2/c;

    iput-object p2, p0, Lb2/c$j;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Lb2/m;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lb2/c$j;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lb2/l;)V
    .locals 1

    iget-object p1, p0, Lb2/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lb2/x;->c(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public b(Lb2/l;)V
    .locals 1

    iget-object p1, p0, Lb2/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lb2/x;->c(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public d(Lb2/l;)V
    .locals 1

    iget-object p1, p0, Lb2/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lb2/x;->c(Landroid/view/ViewGroup;Z)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lb2/c$j;->a:Z

    return-void
.end method

.method public e(Lb2/l;)V
    .locals 2

    iget-boolean v0, p0, Lb2/c$j;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lb2/c$j;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lb2/x;->c(Landroid/view/ViewGroup;Z)V

    :cond_0
    invoke-virtual {p1, p0}, Lb2/l;->T(Lb2/l$f;)Lb2/l;

    return-void
.end method
