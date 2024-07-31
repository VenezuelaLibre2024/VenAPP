.class public final synthetic Landroidx/camera/core/impl/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/common/util/concurrent/f;

.field public final synthetic b:Landroidx/concurrent/futures/c$a;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/common/util/concurrent/f;Landroidx/concurrent/futures/c$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/s0;->a:Lcom/google/common/util/concurrent/f;

    iput-object p2, p0, Landroidx/camera/core/impl/s0;->b:Landroidx/concurrent/futures/c$a;

    iput-wide p3, p0, Landroidx/camera/core/impl/s0;->c:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/core/impl/s0;->a:Lcom/google/common/util/concurrent/f;

    iget-object v1, p0, Landroidx/camera/core/impl/s0;->b:Landroidx/concurrent/futures/c$a;

    iget-wide v2, p0, Landroidx/camera/core/impl/s0;->c:J

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/core/impl/w0;->b(Lcom/google/common/util/concurrent/f;Landroidx/concurrent/futures/c$a;J)V

    return-void
.end method
