.class final Lpj/c$e;
.super Lpj/c$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lpj/c$h<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x4b43427a9c2e580L


# direct methods
.method constructor <init>(Lim/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpj/c$h;-><init>(Lim/b;)V

    return-void
.end method


# virtual methods
.method j()V
    .locals 2

    new-instance v0, Lhj/c;

    const-string v1, "create: could not emit value due to lack of requests"

    invoke-direct {v0, v1}, Lhj/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lpj/c$b;->e(Ljava/lang/Throwable;)V

    return-void
.end method
