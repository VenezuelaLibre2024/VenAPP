.class final Landroidx/camera/core/impl/j2$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/j2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Landroidx/camera/core/impl/y1;

.field private final b:Landroidx/camera/core/impl/k2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation
.end field

.field private c:Z

.field private d:Z


# direct methods
.method constructor <init>(Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/k2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/y1;",
            "Landroidx/camera/core/impl/k2<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/core/impl/j2$b;->c:Z

    iput-boolean v0, p0, Landroidx/camera/core/impl/j2$b;->d:Z

    iput-object p1, p0, Landroidx/camera/core/impl/j2$b;->a:Landroidx/camera/core/impl/y1;

    iput-object p2, p0, Landroidx/camera/core/impl/j2$b;->b:Landroidx/camera/core/impl/k2;

    return-void
.end method


# virtual methods
.method a()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/core/impl/j2$b;->d:Z

    return v0
.end method

.method b()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/core/impl/j2$b;->c:Z

    return v0
.end method

.method c()Landroidx/camera/core/impl/y1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/j2$b;->a:Landroidx/camera/core/impl/y1;

    return-object v0
.end method

.method d()Landroidx/camera/core/impl/k2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/j2$b;->b:Landroidx/camera/core/impl/k2;

    return-object v0
.end method

.method e(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/camera/core/impl/j2$b;->d:Z

    return-void
.end method

.method f(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/camera/core/impl/j2$b;->c:Z

    return-void
.end method
