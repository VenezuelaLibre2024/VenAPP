.class public abstract Lvi/y$a;
.super Lvi/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Lvi/y<",
        "TReqT;TRespT;>;"
    }
.end annotation


# instance fields
.field private final a:Lvi/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lvi/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/g<",
            "TReqT;TRespT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lvi/y;-><init>()V

    iput-object p1, p0, Lvi/y$a;->a:Lvi/g;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lvi/y;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic b()V
    .locals 0

    invoke-super {p0}, Lvi/y;->b()V

    return-void
.end method

.method public bridge synthetic c(I)V
    .locals 0

    invoke-super {p0, p1}, Lvi/y;->c(I)V

    return-void
.end method

.method protected f()Lvi/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvi/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iget-object v0, p0, Lvi/y$a;->a:Lvi/g;

    return-object v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lvi/y;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
