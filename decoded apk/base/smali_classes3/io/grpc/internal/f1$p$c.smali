.class Lio/grpc/internal/f1$p$c;
.super Lvi/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$p;->h(Lvi/x0;Lvi/c;)Lvi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lvi/g<",
        "TReqT;TRespT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/f1$p;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$p;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$p$c;->a:Lio/grpc/internal/f1$p;

    invoke-direct {p0}, Lvi/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(I)V
    .locals 0

    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TReqT;)V"
        }
    .end annotation

    return-void
.end method

.method public e(Lvi/g$a;Lvi/w0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/g$a<",
            "TRespT;>;",
            "Lvi/w0;",
            ")V"
        }
    .end annotation

    sget-object p2, Lio/grpc/internal/f1;->q0:Lvi/g1;

    new-instance v0, Lvi/w0;

    invoke-direct {v0}, Lvi/w0;-><init>()V

    invoke-virtual {p1, p2, v0}, Lvi/g$a;->a(Lvi/g1;Lvi/w0;)V

    return-void
.end method
