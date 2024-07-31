.class Lio/grpc/internal/y1$a0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/y1$a0;->d(Lvi/g1;Lio/grpc/internal/r$a;Lvi/w0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/y1$b0;

.field final synthetic b:Lio/grpc/internal/y1$a0;


# direct methods
.method constructor <init>(Lio/grpc/internal/y1$a0;Lio/grpc/internal/y1$b0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/y1$a0$b;->b:Lio/grpc/internal/y1$a0;

    iput-object p2, p0, Lio/grpc/internal/y1$a0$b;->a:Lio/grpc/internal/y1$b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/y1$a0$b;->b:Lio/grpc/internal/y1$a0;

    iget-object v0, v0, Lio/grpc/internal/y1$a0;->b:Lio/grpc/internal/y1;

    invoke-static {v0}, Lio/grpc/internal/y1;->u(Lio/grpc/internal/y1;)Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lio/grpc/internal/y1$a0$b$a;

    invoke-direct {v1, p0}, Lio/grpc/internal/y1$a0$b$a;-><init>(Lio/grpc/internal/y1$a0$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
