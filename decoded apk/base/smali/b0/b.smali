.class public final Lb0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/h0;


# instance fields
.field private final a:Landroidx/camera/core/impl/s;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb0/b;->a:Landroidx/camera/core/impl/s;

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/impl/utils/j$b;)V
    .locals 1

    iget-object v0, p0, Lb0/b;->a:Landroidx/camera/core/impl/s;

    invoke-interface {v0, p1}, Landroidx/camera/core/impl/s;->a(Landroidx/camera/core/impl/utils/j$b;)V

    return-void
.end method

.method public b()Landroidx/camera/core/impl/f2;
    .locals 1

    iget-object v0, p0, Lb0/b;->a:Landroidx/camera/core/impl/s;

    invoke-interface {v0}, Landroidx/camera/core/impl/s;->b()Landroidx/camera/core/impl/f2;

    move-result-object v0

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Lb0/b;->a:Landroidx/camera/core/impl/s;

    invoke-interface {v0}, Landroidx/camera/core/impl/s;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Landroidx/camera/core/impl/s;
    .locals 1

    iget-object v0, p0, Lb0/b;->a:Landroidx/camera/core/impl/s;

    return-object v0
.end method
