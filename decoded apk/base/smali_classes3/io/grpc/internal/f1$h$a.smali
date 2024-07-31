.class Lio/grpc/internal/f1$h$a;
.super Lio/grpc/internal/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$h;->h(Lvi/g$a;Lvi/g1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic b:Lvi/g$a;

.field final synthetic c:Lvi/g1;

.field final synthetic d:Lio/grpc/internal/f1$h;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$h;Lvi/g$a;Lvi/g1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$h$a;->d:Lio/grpc/internal/f1$h;

    iput-object p2, p0, Lio/grpc/internal/f1$h$a;->b:Lvi/g$a;

    iput-object p3, p0, Lio/grpc/internal/f1$h$a;->c:Lvi/g1;

    invoke-static {p1}, Lio/grpc/internal/f1$h;->g(Lio/grpc/internal/f1$h;)Lvi/r;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/grpc/internal/x;-><init>(Lvi/r;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/f1$h$a;->b:Lvi/g$a;

    iget-object v1, p0, Lio/grpc/internal/f1$h$a;->c:Lvi/g1;

    new-instance v2, Lvi/w0;

    invoke-direct {v2}, Lvi/w0;-><init>()V

    invoke-virtual {v0, v1, v2}, Lvi/g$a;->a(Lvi/g1;Lvi/w0;)V

    return-void
.end method
