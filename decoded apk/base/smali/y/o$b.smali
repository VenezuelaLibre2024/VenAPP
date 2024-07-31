.class abstract Ly/o$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation


# instance fields
.field private a:Landroidx/camera/core/impl/k;

.field private b:Landroidx/camera/core/impl/r0;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ly/o$b$a;

    invoke-direct {v0, p0}, Ly/o$b$a;-><init>(Ly/o$b;)V

    iput-object v0, p0, Ly/o$b;->a:Landroidx/camera/core/impl/k;

    return-void
.end method

.method static j(Landroid/util/Size;IIZLw/l0;)Ly/o$b;
    .locals 9

    new-instance v8, Ly/b;

    new-instance v6, Lg0/v;

    invoke-direct {v6}, Lg0/v;-><init>()V

    new-instance v7, Lg0/v;

    invoke-direct {v7}, Lg0/v;-><init>()V

    move-object v0, v8

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v7}, Ly/b;-><init>(Landroid/util/Size;IIZLw/l0;Lg0/v;Lg0/v;)V

    return-object v8
.end method


# virtual methods
.method a()Landroidx/camera/core/impl/k;
    .locals 1

    iget-object v0, p0, Ly/o$b;->a:Landroidx/camera/core/impl/k;

    return-object v0
.end method

.method abstract b()Lg0/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg0/v<",
            "Lw/g0;",
            ">;"
        }
    .end annotation
.end method

.method abstract c()Lw/l0;
.end method

.method abstract d()I
.end method

.method abstract e()I
.end method

.method abstract f()Lg0/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg0/v<",
            "Ly/f0;",
            ">;"
        }
    .end annotation
.end method

.method abstract g()Landroid/util/Size;
.end method

.method h()Landroidx/camera/core/impl/r0;
    .locals 1

    iget-object v0, p0, Ly/o$b;->b:Landroidx/camera/core/impl/r0;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method abstract i()Z
.end method

.method k(Landroidx/camera/core/impl/k;)V
    .locals 0

    iput-object p1, p0, Ly/o$b;->a:Landroidx/camera/core/impl/k;

    return-void
.end method

.method l(Landroid/view/Surface;)V
    .locals 3

    iget-object v0, p0, Ly/o$b;->b:Landroidx/camera/core/impl/r0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The surface is already set."

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    new-instance v0, Landroidx/camera/core/impl/h1;

    invoke-virtual {p0}, Ly/o$b;->g()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {p0}, Ly/o$b;->d()I

    move-result v2

    invoke-direct {v0, p1, v1, v2}, Landroidx/camera/core/impl/h1;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    iput-object v0, p0, Ly/o$b;->b:Landroidx/camera/core/impl/r0;

    return-void
.end method
