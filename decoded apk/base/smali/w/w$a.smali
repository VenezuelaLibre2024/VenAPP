.class public final Lw/w$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroidx/camera/core/impl/m1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/m1;->a0()Landroidx/camera/core/impl/m1;

    move-result-object v0

    invoke-direct {p0, v0}, Lw/w$a;-><init>(Landroidx/camera/core/impl/m1;)V

    return-void
.end method

.method private constructor <init>(Landroidx/camera/core/impl/m1;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/w$a;->a:Landroidx/camera/core/impl/m1;

    sget-object v0, Lb0/j;->D:Landroidx/camera/core/impl/n0$a;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/camera/core/impl/p1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    const-class v0, Lw/v;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid target class configuration for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Lw/w$a;->e(Ljava/lang/Class;)Lw/w$a;

    return-void
.end method

.method private b()Landroidx/camera/core/impl/l1;
    .locals 1

    iget-object v0, p0, Lw/w$a;->a:Landroidx/camera/core/impl/m1;

    return-object v0
.end method


# virtual methods
.method public a()Lw/w;
    .locals 2

    new-instance v0, Lw/w;

    iget-object v1, p0, Lw/w$a;->a:Landroidx/camera/core/impl/m1;

    invoke-static {v1}, Landroidx/camera/core/impl/p1;->Y(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/p1;

    move-result-object v1

    invoke-direct {v0, v1}, Lw/w;-><init>(Landroidx/camera/core/impl/p1;)V

    return-object v0
.end method

.method public c(Landroidx/camera/core/impl/a0$a;)Lw/w$a;
    .locals 2

    invoke-direct {p0}, Lw/w$a;->b()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Lw/w;->H:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public d(Landroidx/camera/core/impl/z$a;)Lw/w$a;
    .locals 2

    invoke-direct {p0}, Lw/w$a;->b()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Lw/w;->I:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public e(Ljava/lang/Class;)Lw/w$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Lw/v;",
            ">;)",
            "Lw/w$a;"
        }
    .end annotation

    invoke-direct {p0}, Lw/w$a;->b()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Lb0/j;->D:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    invoke-direct {p0}, Lw/w$a;->b()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Lb0/j;->C:Landroidx/camera/core/impl/n0$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw/w$a;->f(Ljava/lang/String;)Lw/w$a;

    :cond_0
    return-object p0
.end method

.method public f(Ljava/lang/String;)Lw/w$a;
    .locals 2

    invoke-direct {p0}, Lw/w$a;->b()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Lb0/j;->C:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public g(Landroidx/camera/core/impl/l2$c;)Lw/w$a;
    .locals 2

    invoke-direct {p0}, Lw/w$a;->b()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Lw/w;->J:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    return-object p0
.end method