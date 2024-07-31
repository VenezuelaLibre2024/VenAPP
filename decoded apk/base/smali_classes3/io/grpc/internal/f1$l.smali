.class final Lio/grpc/internal/f1$l;
.super Lio/grpc/internal/v0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/grpc/internal/v0<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lio/grpc/internal/f1;


# direct methods
.method private constructor <init>(Lio/grpc/internal/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$l;->b:Lio/grpc/internal/f1;

    invoke-direct {p0}, Lio/grpc/internal/v0;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/f1;Lio/grpc/internal/f1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/f1$l;-><init>(Lio/grpc/internal/f1;)V

    return-void
.end method


# virtual methods
.method protected b()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$l;->b:Lio/grpc/internal/f1;

    invoke-virtual {v0}, Lio/grpc/internal/f1;->u0()V

    return-void
.end method

.method protected c()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$l;->b:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->n(Lio/grpc/internal/f1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$l;->b:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->p0(Lio/grpc/internal/f1;)V

    return-void
.end method
