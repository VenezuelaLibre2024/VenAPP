.class Lio/grpc/internal/f1$p$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$p$e;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lio/grpc/internal/f1$p$e;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$p$e;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$p$e$a;->b:Lio/grpc/internal/f1$p$e;

    iput-object p2, p0, Lio/grpc/internal/f1$p$e$a;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/f1$p$e$a;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    iget-object v0, p0, Lio/grpc/internal/f1$p$e$a;->b:Lio/grpc/internal/f1$p$e;

    iget-object v1, v0, Lio/grpc/internal/f1$p$e;->o:Lio/grpc/internal/f1$p;

    iget-object v1, v1, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    iget-object v1, v1, Lio/grpc/internal/f1;->s:Lvi/k1;

    new-instance v2, Lio/grpc/internal/f1$p$e$b;

    invoke-direct {v2, v0}, Lio/grpc/internal/f1$p$e$b;-><init>(Lio/grpc/internal/f1$p$e;)V

    invoke-virtual {v1, v2}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
