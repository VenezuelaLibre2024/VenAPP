.class Lio/grpc/internal/z$k$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/z$k;->a(Lvi/g1;Lvi/w0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvi/g1;

.field final synthetic b:Lvi/w0;

.field final synthetic c:Lio/grpc/internal/z$k;


# direct methods
.method constructor <init>(Lio/grpc/internal/z$k;Lvi/g1;Lvi/w0;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/z$k$c;->c:Lio/grpc/internal/z$k;

    iput-object p2, p0, Lio/grpc/internal/z$k$c;->a:Lvi/g1;

    iput-object p3, p0, Lio/grpc/internal/z$k$c;->b:Lvi/w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/z$k$c;->c:Lio/grpc/internal/z$k;

    invoke-static {v0}, Lio/grpc/internal/z$k;->e(Lio/grpc/internal/z$k;)Lvi/g$a;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/z$k$c;->a:Lvi/g1;

    iget-object v2, p0, Lio/grpc/internal/z$k$c;->b:Lvi/w0;

    invoke-virtual {v0, v1, v2}, Lvi/g$a;->a(Lvi/g1;Lvi/w0;)V

    return-void
.end method
