.class final Laj/d$a$a;
.super Lvi/y$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laj/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Lvi/y$a<",
        "TReqT;TRespT;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Laj/d$a;


# direct methods
.method constructor <init>(Laj/d$a;Lvi/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/g<",
            "TReqT;TRespT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Laj/d$a$a;->b:Laj/d$a;

    invoke-direct {p0, p2}, Lvi/y$a;-><init>(Lvi/g;)V

    return-void
.end method


# virtual methods
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

    iget-object v0, p0, Laj/d$a$a;->b:Laj/d$a;

    invoke-static {v0}, Laj/d$a;->b(Laj/d$a;)Lvi/w0;

    move-result-object v0

    invoke-virtual {p2, v0}, Lvi/w0;->l(Lvi/w0;)V

    invoke-super {p0, p1, p2}, Lvi/y;->e(Lvi/g$a;Lvi/w0;)V

    return-void
.end method
