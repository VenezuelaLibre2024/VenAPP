.class public Lt/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ls/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-class v0, Ls/o;

    invoke-static {v0}, Ls/l;->a(Ljava/lang/Class;)Landroidx/camera/core/impl/s1;

    move-result-object v0

    check-cast v0, Ls/o;

    invoke-direct {p0, v0}, Lt/l;-><init>(Ls/o;)V

    return-void
.end method

.method constructor <init>(Ls/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt/l;->a:Ls/o;

    return-void
.end method


# virtual methods
.method public a(Landroid/util/Size;)Landroid/util/Size;
    .locals 4

    iget-object v0, p0, Lt/l;->a:Ls/o;

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    sget-object v1, Landroidx/camera/core/impl/d2$b;->PRIV:Landroidx/camera/core/impl/d2$b;

    invoke-virtual {v0, v1}, Ls/o;->a(Landroidx/camera/core/impl/d2$b;)Landroid/util/Size;

    move-result-object v0

    if-nez v0, :cond_1

    return-object p1

    :cond_1
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v2

    mul-int/2addr v1, v2

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v3

    mul-int/2addr v2, v3

    if-le v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    move-object p1, v0

    :cond_3
    return-object p1
.end method
