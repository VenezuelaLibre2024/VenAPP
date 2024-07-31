.class final Lio/grpc/internal/z$j;
.super Lio/grpc/internal/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "j"
.end annotation


# instance fields
.field final b:Lvi/g$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/g$a<",
            "TRespT;>;"
        }
    .end annotation
.end field

.field final c:Lvi/g1;

.field final synthetic d:Lio/grpc/internal/z;


# direct methods
.method constructor <init>(Lio/grpc/internal/z;Lvi/g$a;Lvi/g1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/g$a<",
            "TRespT;>;",
            "Lvi/g1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/z$j;->d:Lio/grpc/internal/z;

    invoke-static {p1}, Lio/grpc/internal/z;->i(Lio/grpc/internal/z;)Lvi/r;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/grpc/internal/x;-><init>(Lvi/r;)V

    iput-object p2, p0, Lio/grpc/internal/z$j;->b:Lvi/g$a;

    iput-object p3, p0, Lio/grpc/internal/z$j;->c:Lvi/g1;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/z$j;->b:Lvi/g$a;

    iget-object v1, p0, Lio/grpc/internal/z$j;->c:Lvi/g1;

    new-instance v2, Lvi/w0;

    invoke-direct {v2}, Lvi/w0;-><init>()V

    invoke-virtual {v0, v1, v2}, Lvi/g$a;->a(Lvi/g1;Lvi/w0;)V

    return-void
.end method
