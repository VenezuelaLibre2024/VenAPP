.class final Landroidx/camera/core/impl/h$b;
.super Landroidx/camera/core/impl/b2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/util/Size;

.field private b:Lw/y;

.field private c:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroidx/camera/core/impl/n0;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/impl/b2$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Landroidx/camera/core/impl/b2;)V
    .locals 1

    invoke-direct {p0}, Landroidx/camera/core/impl/b2$a;-><init>()V

    invoke-virtual {p1}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/impl/h$b;->a:Landroid/util/Size;

    invoke-virtual {p1}, Landroidx/camera/core/impl/b2;->b()Lw/y;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/impl/h$b;->b:Lw/y;

    invoke-virtual {p1}, Landroidx/camera/core/impl/b2;->c()Landroid/util/Range;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/impl/h$b;->c:Landroid/util/Range;

    invoke-virtual {p1}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/impl/h$b;->d:Landroidx/camera/core/impl/n0;

    return-void
.end method

.method synthetic constructor <init>(Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/impl/h$b;-><init>(Landroidx/camera/core/impl/b2;)V

    return-void
.end method


# virtual methods
.method public a()Landroidx/camera/core/impl/b2;
    .locals 8

    iget-object v0, p0, Landroidx/camera/core/impl/h$b;->a:Landroid/util/Size;

    const-string v1, ""

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " resolution"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/h$b;->b:Lw/y;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " dynamicRange"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    iget-object v0, p0, Landroidx/camera/core/impl/h$b;->c:Landroid/util/Range;

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " expectedFrameRateRange"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Landroidx/camera/core/impl/h;

    iget-object v3, p0, Landroidx/camera/core/impl/h$b;->a:Landroid/util/Size;

    iget-object v4, p0, Landroidx/camera/core/impl/h$b;->b:Lw/y;

    iget-object v5, p0, Landroidx/camera/core/impl/h$b;->c:Landroid/util/Range;

    iget-object v6, p0, Landroidx/camera/core/impl/h$b;->d:Landroidx/camera/core/impl/n0;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Landroidx/camera/core/impl/h;-><init>(Landroid/util/Size;Lw/y;Landroid/util/Range;Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/h$a;)V

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lw/y;)Landroidx/camera/core/impl/b2$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Landroidx/camera/core/impl/h$b;->b:Lw/y;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null dynamicRange"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Landroid/util/Range;)Landroidx/camera/core/impl/b2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroidx/camera/core/impl/b2$a;"
        }
    .end annotation

    if-eqz p1, :cond_0

    iput-object p1, p0, Landroidx/camera/core/impl/h$b;->c:Landroid/util/Range;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null expectedFrameRateRange"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2$a;
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/impl/h$b;->d:Landroidx/camera/core/impl/n0;

    return-object p0
.end method

.method public e(Landroid/util/Size;)Landroidx/camera/core/impl/b2$a;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Landroidx/camera/core/impl/h$b;->a:Landroid/util/Size;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null resolution"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
