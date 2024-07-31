.class Landroidx/camera/core/q$a;
.super Landroidx/camera/core/impl/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/camera/core/q;


# direct methods
.method constructor <init>(Landroidx/camera/core/q;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/q$a;->a:Landroidx/camera/core/q;

    invoke-direct {p0}, Landroidx/camera/core/impl/k;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroidx/camera/core/impl/s;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/camera/core/impl/k;->b(Landroidx/camera/core/impl/s;)V

    iget-object v0, p0, Landroidx/camera/core/q$a;->a:Landroidx/camera/core/q;

    invoke-virtual {v0, p1}, Landroidx/camera/core/q;->s(Landroidx/camera/core/impl/s;)V

    return-void
.end method
