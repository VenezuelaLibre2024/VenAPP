.class public final Landroidx/camera/camera2/internal/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/l2;


# instance fields
.field final b:Landroidx/camera/camera2/internal/c2;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroidx/camera/camera2/internal/c2;->c(Landroid/content/Context;)Landroidx/camera/camera2/internal/c2;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/k1;->b:Landroidx/camera/camera2/internal/c2;

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/impl/l2$b;I)Landroidx/camera/core/impl/n0;
    .locals 3

    invoke-static {}, Landroidx/camera/core/impl/m1;->a0()Landroidx/camera/core/impl/m1;

    move-result-object v0

    new-instance v1, Landroidx/camera/core/impl/y1$b;

    invoke-direct {v1}, Landroidx/camera/core/impl/y1$b;-><init>()V

    invoke-static {p1, p2}, Landroidx/camera/camera2/internal/l3;->b(Landroidx/camera/core/impl/l2$b;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/y1$b;->t(I)Landroidx/camera/core/impl/y1$b;

    sget-object v2, Landroidx/camera/core/impl/k2;->r:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1$b;->o()Landroidx/camera/core/impl/y1;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    sget-object v1, Landroidx/camera/core/impl/k2;->t:Landroidx/camera/core/impl/n0$a;

    sget-object v2, Landroidx/camera/camera2/internal/j1;->a:Landroidx/camera/camera2/internal/j1;

    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    new-instance v1, Landroidx/camera/core/impl/l0$a;

    invoke-direct {v1}, Landroidx/camera/core/impl/l0$a;-><init>()V

    invoke-static {p1, p2}, Landroidx/camera/camera2/internal/l3;->a(Landroidx/camera/core/impl/l2$b;I)I

    move-result p2

    invoke-virtual {v1, p2}, Landroidx/camera/core/impl/l0$a;->r(I)V

    sget-object p2, Landroidx/camera/core/impl/k2;->s:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v1}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    sget-object p2, Landroidx/camera/core/impl/k2;->u:Landroidx/camera/core/impl/n0$a;

    sget-object v1, Landroidx/camera/core/impl/l2$b;->IMAGE_CAPTURE:Landroidx/camera/core/impl/l2$b;

    if-ne p1, v1, :cond_0

    sget-object v1, Landroidx/camera/camera2/internal/j2;->c:Landroidx/camera/camera2/internal/j2;

    goto :goto_0

    :cond_0
    sget-object v1, Landroidx/camera/camera2/internal/p0;->a:Landroidx/camera/camera2/internal/p0;

    :goto_0
    invoke-virtual {v0, p2, v1}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    sget-object p2, Landroidx/camera/core/impl/l2$b;->PREVIEW:Landroidx/camera/core/impl/l2$b;

    if-ne p1, p2, :cond_1

    iget-object p2, p0, Landroidx/camera/camera2/internal/k1;->b:Landroidx/camera/camera2/internal/c2;

    invoke-virtual {p2}, Landroidx/camera/camera2/internal/c2;->f()Landroid/util/Size;

    move-result-object p2

    sget-object v1, Landroidx/camera/core/impl/f1;->n:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v0, v1, p2}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    :cond_1
    iget-object p2, p0, Landroidx/camera/camera2/internal/k1;->b:Landroidx/camera/camera2/internal/c2;

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Landroidx/camera/camera2/internal/c2;->d(Z)Landroid/view/Display;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Display;->getRotation()I

    move-result p2

    sget-object v1, Landroidx/camera/core/impl/f1;->i:Landroidx/camera/core/impl/n0$a;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    sget-object p2, Landroidx/camera/core/impl/l2$b;->VIDEO_CAPTURE:Landroidx/camera/core/impl/l2$b;

    if-eq p1, p2, :cond_2

    sget-object p2, Landroidx/camera/core/impl/l2$b;->STREAM_SHARING:Landroidx/camera/core/impl/l2$b;

    if-ne p1, p2, :cond_3

    :cond_2
    sget-object p1, Landroidx/camera/core/impl/k2;->y:Landroidx/camera/core/impl/n0$a;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    :cond_3
    invoke-static {v0}, Landroidx/camera/core/impl/p1;->Y(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/p1;

    move-result-object p1

    return-object p1
.end method
