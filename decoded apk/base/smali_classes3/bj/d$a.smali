.class Lbj/d$a;
.super Lvi/p0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbj/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lbj/d;


# direct methods
.method constructor <init>(Lbj/d;)V
    .locals 0

    iput-object p1, p0, Lbj/d$a;->c:Lbj/d;

    invoke-direct {p0}, Lvi/p0;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lvi/g1;)V
    .locals 3

    iget-object v0, p0, Lbj/d$a;->c:Lbj/d;

    invoke-static {v0}, Lbj/d;->g(Lbj/d;)Lvi/p0$d;

    move-result-object v0

    sget-object v1, Lvi/p;->TRANSIENT_FAILURE:Lvi/p;

    new-instance v2, Lbj/d$a$a;

    invoke-direct {v2, p0, p1}, Lbj/d$a$a;-><init>(Lbj/d$a;Lvi/g1;)V

    invoke-virtual {v0, v1, v2}, Lvi/p0$d;->f(Lvi/p;Lvi/p0$i;)V

    return-void
.end method

.method public d(Lvi/p0$g;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e()V
    .locals 0

    return-void
.end method
